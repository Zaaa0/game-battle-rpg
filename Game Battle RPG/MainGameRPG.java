public class MainGameRPG {
    public static void main(String[] args) {
        Weapon wp = new Weapon();

        Hero hero = new Hero(100, 50, 1, 20, "Hero", "Race", wp);
        Foe foe = new Foe(150, 70, 1, 30, "Race", wp);

        // menggunakan potion, elixir, dan ether pada hero
        hero.usePotion();
        hero.useElixir();
        hero.useEther();

        // menggunakan potion, elixir, dan ether pada foe
        foe.usePotion();
        foe.useElixir();
        foe.useEther();

        // menampilkan HP hero dan foe setelah penggunaan item
        System.out.println("Hero HP : " + hero.getHP());
        System.out.println("Foe HP : " + foe.getHP());
    }
}
