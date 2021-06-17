package sample;

public class Account  {


        private static String id = "Jan Kowalski";
        public static int balance = 2000;



    public Account() {
        this.id = "Jan Kowalski";
        this.balance = 2000;

    }

    public float GetBalance() {
            return this.balance;
        }

        public String GetId() {
            return this.id;
        }

        public boolean withdraw(float amount) {
            if (this.balance - amount < 0) return false;
            balance -= amount;
            return true;
        }

        public void deposit(float amount) {
            this.balance += amount;
        }

        @Override
        public String toString() {
            return this.id + " : " + this.balance;
        }

    }




