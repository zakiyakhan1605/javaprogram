package in.Challenges;

public class Testclass {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("001","zakiyaKhan");
        account.depositeMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositeMoney(-40);
        account.withdrawMoney(0);
    }

}
