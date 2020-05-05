package day33_CustomClass;
/*

practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
 */
public class bankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingbalance(){
        System.out.println("Available balance:"+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawin $"+amount);
        balance -= amount;
    }
    public void deposit (double amount){
        System.out.println("Depositing $"+amount);
        balance +=amount;
    }

    public String  toString(){
        String result = "Account Holder"+accountHolder+"\nAccount Number:"+accountNumber+"\nAvaible Balance";
        return result;

    }

}
