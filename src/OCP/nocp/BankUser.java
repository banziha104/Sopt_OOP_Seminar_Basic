package OCP.nocp;


public class BankUser {
    // 예금
    int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean canVIP(){
        if(balance > 8){
            return true;
        }else{
            return false;
        }
    }


}
