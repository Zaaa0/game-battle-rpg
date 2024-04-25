public class Weapon {
    private int atkPoint;

    public Weapon() {

    }

    public Weapon(int atkPoint) {
        this.atkPoint = atkPoint;
    }

    public int getAtkPoint() {
        return atkPoint;
    }

    public void setAtkPoint(int atkPoint) {
        this.atkPoint = atkPoint;
    }
}

class Pedang extends Weapon {
    public Pedang() {
    }
}

class Panah extends Weapon {
    public Panah() {
    }
}

class SarungTangan extends Weapon {
    public SarungTangan() {
    }
}

class MagicWand extends Weapon {
    public MagicWand() {
    }
}
