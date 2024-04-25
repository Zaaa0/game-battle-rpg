public class Item {
    private int recoveryAmount;
    
        public Item(int recoveryAmount) {
            this.recoveryAmount = recoveryAmount;
        }
    
        public int getRecoveryAmount() {
            return recoveryAmount;
        }
    
        public void setRecoveryAmount(int recoveryAmount) {
            this.recoveryAmount = recoveryAmount;
        }
    }
    
    class Elixir extends Item {
        public Elixir(int recoveryAmount) {
            super(recoveryAmount);
        }
    }
    
    class Ether extends Item {
        public Ether(int recoveryAmount) {
            super(recoveryAmount);
        }
    }
    
    class Potion extends Item {
        public Potion(int recoveryAmount) {
            super(recoveryAmount);
        }
    }