class Elf extends Foe {
    public Elf(int hp, int mp, int level, int armor, String name, String race, Weapon weapon, String status) {
        super(100, 100, 1, 20, "Elf", race,  new Gloves(), status);
    }

    public void attack(Foe foe) {
        System.out.println(this.getName() + " menyerang dengan ketepatan sebagai Elf!");
        foe.setHp(foe.getHP() - (this.getWeapon().getAttackPoints() + 3)); 
        System.out.println(foe.getName() + " HP saat ini: " + foe.getHP());
    }

    public void heal(Character character, int healAmount) {
        System.out.println(this.getName() + " menggunakan skill heal pada " + character.getName() + "!");
        character.setHp(character.getHP() + healAmount);
        System.out.println(character.getName() + " HP bertambah menjadi " + character.getHP());
    }

    public void recover(Character character, int recoverAmount) {
        System.out.println(this.getName() + " menggunakan skill recover pada " + character.getName() + "!");
        character.setMp(character.getMp() + recoverAmount);
        System.out.println(character.getName() + " MP bertambah menjadi " + character.getMp());
    }

    public void useLullaby(Foe foe) {
        System.out.println(this.getName() + " menggunakan skill lullaby pada " + foe.getName() + "!");
        foe.addStatus(new Status("Sleep", 3)); 
        System.out.println(foe.getName() + " terkena status Sleep!");
    }
}
