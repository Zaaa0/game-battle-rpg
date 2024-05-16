public class MainGameRPG {
    public static void main(String[] args) {
        Weapon pedang = new Sword();
        Weapon panah = new Bow();
       
        Hero hero = new Hero(100, 50, 1, 20, "Mark", "Knight", pedang, "Poisoned");
        Foe foe = new Foe(200, 200, 2, 20, "Drako", "Elf", panah, "satisfied");

        // menampilkan HP hero dan foe setelah penggunaan item
        System.out.println("Hero HP : " + hero.getHP());
        System.out.println("Foe HP : " + foe.getHP());

        hero.useItem(new Remedy());
        System.out.println(hero.getName() + " memiliki status Weak: " + hero.hasStatus("Weak"));
        hero.setStatus("Poison");
        System.out.println(hero.getName() + " memiliki status Poison: " + hero.hasStatus("Poison"));
        
        // hero menyerang foe
        hero.attack(foe);

        // foe menyerang hero
        foe.attack(hero);

        // hero menggunakan skill pada foe
        hero.useSkill(foe, 2);
        // foe menggunakan skill pada hero
        foe.useSkill2(hero, 1);

        hero.useItem(new Antidote());

        Item potion = new Potion();
        Item elixir = new Elixir(100);
        Item ether = new Ether();

        // menggunakan potion, elixir, dan ether pada hero
        hero.useItem(potion);
        hero.useItem(elixir);
        hero.useItem(ether);

        // hero menampilkan status
        hero.displayStatus();

        // foe menampilkan status
        foe.displayStatus();
    }
}
