import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    protected int hp;
    protected int mp;
    protected int level;
    protected int armor;
    protected List<Status> statuses;
    private String name;

    public Character(int hp, int mp, int level, int armor, String name) {
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.armor = armor;
        this.name = name;
        this.statuses = new ArrayList<>();
    }

    public void Antidote(Item Antidote) {
        this.hp += Antidote.getRecoveryAmount();
        System.out.println("Status racun dihilangkan sebanyak " + Antidote.getRecoveryAmount() + ". HP saat ini: " + this.hp);
    }

    public void useElixir(Item elixir) {
        this.hp += elixir.getRecoveryAmount();
        this.mp += elixir.getRecoveryAmount();
        System.out.println("HP ditambahkan sebanyak " + elixir.getRecoveryAmount() + " dan MP ditambahkan sebanyak "
        + elixir.getRecoveryAmount() + ". HP saat ini: " + this.hp + ", MP saat ini: " + this.mp);
    }

    public int getHP() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void addStatus(Status status) {
        this.statuses.add(status);
    }

    public void removeStatus(String statusName) {
        statuses.removeIf(status -> status.getName().equals(statusName));
    }

    public boolean hasStatus(String statusName) {
        for (Status status : statuses) {
            if (status.getName().equals(statusName)) {
                return true;
            }
        }
        return false;
    }

    public void processStatuses() {
        for (Status status : statuses) {
            if (status.getName().equals("Poison")) {
                setHp(getHP() - 5); 
                System.out.println("Terkena Poison! HP berkurang 5.");
            }
            status.decreaseDuration();
        }
        statuses.removeIf(status -> status.getDuration() == 0);
    }

    public void removeAllStatuses() {
        statuses.clear();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
