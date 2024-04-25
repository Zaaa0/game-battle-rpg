public class Foe extends Character {
    private String race;
    private Weapon weapon;

    public Foe(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor);
        this.race = race;
        this.weapon = weapon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

class Orc extends Foe {
    public Orc(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Orc", weapon);
    }
}

class Elf extends Foe {
    public Elf(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Elf", weapon);
    }
}

class Dwarf extends Foe {
    public Dwarf(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Dwarf", weapon);
    }
}

class Skeleton extends Foe {
    public Skeleton(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Skeleton", weapon);
    }
}

class Goblin extends Foe {
    public Goblin(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Goblin", weapon);
    }
}

class Dragon extends Foe {
    public Dragon(int hp, int mp, int level, int armor, String race, Weapon weapon) {
        super(hp, mp, level, armor, "Dragon", weapon);
    }
}