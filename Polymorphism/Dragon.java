class Dragon extends Foe {
    public Dragon(int hp, int mp, int level, int armor, String name, Weapon weapon, String status) {
        super(hp, mp, level, armor, "Dragon", "Dragon", weapon, status);
    }

    public void useSkill(Hero hero, int skillLevel) {
        System.out.println(this.getName() + " menggunakan skill fire pada " + hero.getName() + "!");
        hero.setHp(hero.getHP() - (this.getWeapon().getAttackPoints() * skillLevel));
        System.out.println(hero.getName() + " HP saat ini: " + hero.getHP());
        hero.addStatus(new Status("Weak", 3)); 
        System.out.println(hero.getName() + " terkena status Weak!");
    }
}
