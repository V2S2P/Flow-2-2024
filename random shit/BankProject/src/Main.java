public class Main{
    public static void main(String[] args){

        //instantiate objects
        Account acct1 = new Account("Karl Bob", 123, 1500.00);
        Account acct2 = new Account("Sab Sab", 1251, 5500.00);

        System.out.println(acct1.toString());
        acct1.deposit(500);
        System.out.println(acct1.toString());

        acct1.withdraw(750, 1);
        System.out.println(acct1.toString());

    }
}