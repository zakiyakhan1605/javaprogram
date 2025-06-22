package in.Challenges;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    private double Balance;

    public void depositeMoney(double money){
        if (money<=0){
            System.out.println("invalid withdraw");
        }else{
            Balance+=money;
        }

    }
    public double withdrawMoney(double money){
        if(money<=0){
            System.out.println("invalid entry");
        }else if (Balance>=money){
        Balance-=money;
        }else {
            money=Balance;
            Balance=0;
        }

        return money;
    }

}
