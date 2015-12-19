package lessons;

public class BankAccount {

    private String userName;
    private String pass;
    private long cash;

    public BankAccount(){

    }

    public BankAccount(String userName, String pass, long cash){

        this.userName = userName;
        this.pass = pass;
        this.cash = cash;

    }

    public BankAccount(String userName, long cash){

        this.userName = userName;
        this.cash = cash;

    }

    public long getCash(){
        return cash;
    }
//    public long checkAccount(){
//
//        return cash;
//
//    }

    public void setCash(long newSum){

        cash += newSum;
        System.out.println("success");

    }
//    public void putMoney(long newSum){
//
//        cash += newSum;
//        System.out.println("success");
//
//    }

    public long takeMoney(long newSum, String pass){

        if(this.pass.equals(pass)){

            if (newSum > cash){
                System.err.println("Not enough money");
                return 0;
            }

            cash -= newSum;
            return newSum;

        }
        else{

            System.err.println("Wrong pass");
            return 0;

        }

    }

}
