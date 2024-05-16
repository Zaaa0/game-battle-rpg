public class Hero extends Character {
    private String name;
    private String race;
    private Weapon weapon;
    private String status;

    public Hero(int hp, int mp, int level, int armor, String name, String race, Weapon weapon, String status) {
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
            super(hp, mp, level, armor, name, race, new Bow(), status);
        }

        public void attack(Foe foe) {
            System.out.println(this.getName() + " menyerang dari jarak jauh sebagai Archer!");
            foe.setHp(foe.getHP() - (this.getWeapon().getAttackPoints() + 3)); 
            System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
        }
    }

    class Knight extends Hero {
        public Knight(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new Sword(), status);
        }

        public void attack(Foe foe) {
            System.out.println(this.getName() + " menyerang dengan kekuatan penuh sebagai Knight!");
            foe.setHp(foe.getHP() - (this.getWeapon().getAttackPoints() + 5)); 
            System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
        }
    }

    class Fighter extends Hero {
        public Fighter(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new Gloves(), status);
        }

        public void attack(Foe foe) {
            System.out.println(this.getName() + " menyerang dengan kecepatan tinggi sebagai Fighter!");
            foe.setHp(foe.getHP() - (this.getWeapon().getAttackPoints() + 4)); 
            System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
        }
    }

    class Fairy extends Hero {
        public Fairy(int hp, int mp, int level, int armor, String name, String race) {
            super(hp, mp, level, armor, name, race, new MagicWand(), status);
        }
        
        public void attack(Foe foe) {
            System.out.println(this.getName() + " menyerang dengan sihir sebagai Fairy!");
            foe.setHp(foe.getHP() - (this.getWeapon().getAttackPoints() + 2)); 
            System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
        }
    
        public void heal(Character character, int healAmount) {
            System.out.println(this.getName() + " menggunakan skill heal pada " + character.getName() + "!");
            character.setHp(character.getHP() + healAmount);
            System.out.println(character.getName() + " HP bertambah menjadi " + character.getHP());
        }
    }

    public void attack(Foe foe) {
        System.out.println(this.name + " menyerang " + foe.getName() + " dengan senjata " + this.weapon.getName() + "!");
        foe.setHp(foe.getHP() - this.weapon.getAttackPoints());
        System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
    }

    public void useSkill(Foe foe, int skillLevel) {
        System.out.println(this.name + " menggunakan skill " + this.getClass().getSimpleName() + " level " + skillLevel + " pada " + foe.getName() + "!");
        foe.setHp(foe.getHP() - (this.weapon.getAttackPoints() * skillLevel));
        System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
    }

    public void useItem(Item item) {
        if (item instanceof Antidote) {
            Antidote(item);
        } else if (item instanceof Elixir) {
            useElixir(item);
        }
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

    public void setStatus(String status) {
        this.addStatus(new Status(status, 3)); 
    }
}
