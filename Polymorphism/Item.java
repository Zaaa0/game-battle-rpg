public abstract class Item {
    private String name;
    private int recoveryAmount;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    public int getRecoveryAmount() {
        return recoveryAmount;
    }

    public void setRecoveryAmount(int recoveryAmount) {
        this.recoveryAmount = recoveryAmount;
    }

    public abstract void apply(Character character);
}

class Potion extends Item {
    public Potion() {
        super("Potion");
    }

    public void apply(Character character) {
        character.setHp(character.getHP() + 100);
        System.out.println(character.getName() + " menggunakan Potion dan mendapatkan 100 HP!");
    }
}

class Elixir extends Item {
    public Elixir(int recoveryAmount) {
        super(recoveryAmount);
    }

    public void apply(Character character) {
        character.setHp(character.getHP() + 150);
        character.setMp(character.getMp() + 100);
        System.out.println(character.getName() + " menggunakan Elixir dan mendapatkan 150 HP dan 100 MP!");
    }
}

class Ether extends Item {
    public Ether() {
        super("Ether");
    }

    public void apply(Character character) {
        character.setMp(character.getMp() + 100);
        System.out.println(character.getName() + " menggunakan Ether dan mendapatkan 100 MP!");
    }
}

class Remedy extends Item {
    public Remedy() {
        super("Remedy");
    }

    public void apply(Character character) {
        character.removeAllStatuses();
        System.out.println("Semua status pada " + character.getClass().getSimpleName() + " dihilangkan!");
    }
}

class Antidote extends Item {
    public Antidote() {
        super("Antidote");
    }

    public void apply(Character character) {
        character.removeStatus("Poison");
        System.out.println("Status Poison pada " + character.getClass().getSimpleName() + " dihilangkan!");
    }
}
