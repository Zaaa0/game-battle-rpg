public class Character {
    private int hp;
    private int mp;
    private int level;
    private int armor;

    public Character(int hp, int mp, int level, int armor) {
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.armor = armor;
    }

    public void usePotion() {

    }

    public void useElixir() {

    }

    public void useEther() {

    }

    // method getter dan setter
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
