public abstract class Weapon {
    private String name;
    private int attackPoints;

    public Weapon(String name, int attackPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
}

class Sword extends Weapon {
    public Sword() {
        super("Pedang", 15);
    }
}

class Bow extends Weapon {
    public Bow() {
        super("Panah", 10);
    }
}

class Gloves extends Weapon {
    public Gloves() {
        super("Sarung Tangan", 5);
    }
}

 class MagicWand extends Weapon {
    public MagicWand() {
        super("Tongkat Sihir", 8);
    }
}
