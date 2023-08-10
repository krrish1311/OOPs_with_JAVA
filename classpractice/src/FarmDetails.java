//public class FarmDetails extends BankDetails,privateBank{
public class FarmDetails extends BankDetails{
    private float farmArea;
    private String cropName;
    FarmDetails(String fname, String lname, int ageF, long bankNo,float fArea,String crpName) {
        super(fname, lname, ageF, bankNo);
        farmArea=fArea;
        cropName=crpName;
    }

    FarmDetails(String fname, String lname, int ageF, long bankNo,double fArea,String crpName) {
        super(fname, lname, ageF, bankNo);
        farmArea=(float)fArea;
        cropName=crpName;

    }

    public void printStatement(){
        String bankDetails=super.getBankName()+" \n"+"Your Name is "+getFirstName()+" "+getLastName()+"\nYour bank account is  : "+getBankAcc()+" \n Branch: "+getBankName();
        String farmDetails="\nYour Farm Area is : "+farmArea+"\n You have a crop: "+cropName;

        String finalStatement=bankDetails+farmDetails;
        System.out.println(finalStatement);

    }




}
