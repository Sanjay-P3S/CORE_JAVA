public class InnerClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit();

        Bank.Gpay obj= bank.new Gpay();
        obj.trans();


    }
}

class Bank{
    private int balance=10000;

    void deposit(){
        balance+=100;
        System.out.println("Deposited "+balance);
    }

    class Gpay{
        void trans(){
            int transferamount = 1000;
            balance-=transferamount;
            System.out.println("Gpay transited "+transferamount);
            System.out.println("Available Balance "+balance);
        }
    }
}


