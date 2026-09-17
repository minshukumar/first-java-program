
class Bankaccount {

    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("INVALID AMOUNT");
        }
    }
        double getbalance(){
            return balance;
        }
    

    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();

        account.deposit(5000);
        System.out.println(account.getbalance());
    }
}