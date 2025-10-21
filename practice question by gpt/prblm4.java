/*Encapsulation
Problem:
Create a class BankAccount with private variables accountNumber and balance.
Use getters and setters to safely access and modify these variables.
Create an object, set account number and balance, and then display them using getters.
*/

class BankAccount {
    private int accountNumber;
    private int balance;

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    int getBalance() {
        return balance;
    }
}

class prblm4 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber(123456);
        obj.setBalance(5000);

        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Balance: " + obj.getBalance());
    }
}
