public class BasicClass {

    public static void main(String[] args) {
        //long back ago pikvima
        long bankAcc=145245245;
        String fullName="Nivritti Digole";
        //another record has different
        long bankacc2=154256324;
        String first="Balaji";
        String last="Digole";

        //so here we can see we don't have any proper datatype to manage this info where primitive data types will not be enough to store it
        //,so we need something custom dtype which has capability work as per our wish
        //here we need to create different dtypes , need to remember that many variables names which will becomes a way hectic

//        we can create our own dtype by using classes

        BankDetails nivritti=new BankDetails(145223645,"Nivritti","Digole",72);
//        nivritti.bankAcc=145245245;
//        nivritti.first="Nivritti";
//        nivritti.last="Digole";
//        nivritti.age=73;
//        nivritti.age=-73;//to resolve th eissue we need to validate is the age correct not negative
        //we will use a function which can set our values in a classes setter |mutator
//
//        nivritti.setAge(72);
//        nivritti.setName("Nivritti","Digole");
//        nivritti.setBankAcc();
        nivritti.printStatement();




    }

}
