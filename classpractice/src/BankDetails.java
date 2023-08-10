public class BankDetails {
    //static variables ony has one place in memory they don't pass everywhere like instance variables
    //static variables are known as class variables

    private static String bankName="Latur Urban Bank";
    private static String branch="Udgir";
    private String firstName;
    private String lastName;
    private int age ;
    private long bankAcc;
    private String date;


    //constructor overloading
    BankDetails(String fname,String lname,int ageF,long bankNo,String dte){
        firstName=fname;
        lastName=lname;
        age=ageF;
        bankAcc=bankNo;
        date=dte;
    }
    BankDetails(String fname,String lname,int ageF,long bankNo){
        firstName=fname;
        lastName=lname;
        age=ageF;
        bankAcc=bankNo;

    }
    BankDetails(String fname,String lname,byte ageF,int bankNo,String dte){
        firstName=fname;
        lastName=lname;
        age=ageF;
        bankAcc=bankNo;
    }

    public void printStatement(){
        System.out.println(bankName+" \n"+"Your Name is "+firstName+" "+lastName+"\nYour bank account is  : "+bankAcc+" \n Branch: "+branch);
    }

    public String getBankName(){
        return bankName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getBranch(){
        return branch;
    }
    public String getLastName(){
        return lastName;
    }
    public long getBankAcc(){
        return bankAcc;
    }
    public int  getAge(){
        return age;
    }
    public void createBankAcc(){
        //create a bank account by storing account details
    }

}
