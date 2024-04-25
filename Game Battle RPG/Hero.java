public class Hero extends Character {
    private String name;
    private String race;
    private Weapon weapon;

    public Hero(int hp, int mp, int level, int armor, String name, String race, Weapon weapon) {
        super(hp, mp, level, armor);
        this.name = name;
        this.race = race;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    class Archer extends Hero {
        public Archer(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new Panah());
        }
    }

    class Knight extends Hero {
        public Knight(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new Pedang());
        }
    }

    class Fighter extends Hero {
        public Fighter(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new SarungTangan());
        }
    }

    class Fairy extends Hero {
        public Fairy(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new MagicWand());
        }
    }

}