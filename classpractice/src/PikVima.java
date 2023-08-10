public class PikVima {
    public static void main(String[] args) {

        //let's fill pik vima

        FarmDetails aajobaVima =new FarmDetails("Nivritti","Digole",72,231234568,2.3f,"Soyabean");
        FarmDetails papaVima =new FarmDetails("Balaji","Digole",41,231234568,1.2,"Tur");

        aajobaVima.printStatement();
        papaVima.printStatement();

//        BankDB testAbstract=new BankDB();//'BankDB' is abstract; cannot be instantiated

        BankAccounts testAbstract =new BankAccounts();
        testAbstract.connectDB();

        //I want an Illegal data which has in the Private Bank but not in public/Gov bank but my acc is in public

        BankAccounts illegal=new PrivateBank();

        illegal.IllegalData();



    }
}
