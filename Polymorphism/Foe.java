public class Foe extends Character {
    private String name;
    private Weapon weapon;
    private String race;
    private String status;

    public Foe(int hp, int mp, int level, int armor, String name, String race, Weapon weapon, String status) {
        super(hp, mp, level, armor, name);
        this.name = name;
        this.race = race;
        this.weapon = weapon;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Hero hero) {
        if (this.hasStatus("Sleep")) {
            System.out.println(this.name + " sedang tidur dan tidak bisa menyerang!");
            return;
        }
        System.out.println(this.name + " menyerang " + hero.getName() + " dengan senjata " + this.weapon.getName() + "!");
        int damage = this.weapon.getAttackPoints();
        if (hero.hasStatus("Weak")) {
            damage += 5; 
        }
        hero.setHp(hero.getHP() - damage);
        System.out.println(hero.getName() + " HP saat ini: " + hero.getHP());
    }

    public void useSkill2(Hero hero, int skillLevel) {
        System.out.println(this.getName() + " menggunakan skill gigit pada " + hero.getName() + "!");
        hero.setHp(hero.getHP() - (this.getWeapon().getAttackPoints() * skillLevel));
        System.out.println(hero.getName() + " HP saat ini: " + hero.getHP());
        hero.addStatus(new Status("Poison", 3));
        System.out.println(hero.getName() + " terkena status Racun!");
    }

    class Orc extends Foe {
        public Orc(int hp, int mp, int level, int armor, String race, Weapon weapon) {
            super(hp, mp, level, armor, "Orc", race, weapon, status);
        }
    }

    class Dwarf extends Foe {
        public Dwarf(int hp, int mp, int level, int armor, String race, Weapon weapon) {
            super(hp, mp, level, armor, "Dwarf", race,  weapon, status);
        }
    }

    class Skeleton extends Foe {
        public Skeleton(int hp, int mp, int level, int armor, String race, Weapon weapon) {
            super(hp, mp, level, armor, "Skeleton", race,  weapon, status);
        }
    }


    class Goblin extends Foe {
        public Goblin(int hp, int mp, int level, int armor, String name, String race) {
            super(150, 70, 1, 30, "Goblin", race,  new Bow(), status);
        }
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void displayStatus() {
        System.out.println("Nama: " + this.name);
        System.out.println("Ras: " + this.race);
        System.out.println("Senjata: " + this.weapon.getName());
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("Level: " + this.level);
        System.out.println("Armor: " + this.armor);
        System.out.println("Status: " + this.status);
    }
}
