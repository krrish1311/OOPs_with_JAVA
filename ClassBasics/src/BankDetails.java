public class BankDetails {

        //the access modifiers public ,private controls the access who can use it
 //private variables can't be accessed ,bydefault the access is public

         private long bankAcc;
         private String first;
         private String last;
         private int age;

//constructor runs as object creates
         BankDetails(long bankAcc_,String first_,String last_,int age_){
             if (age_>0) {
                age=age_;
                first=first_;
                last=last_;
                bankAcc=bankAcc_;
            }
            else System.out.println("Write proper age");


             }


//         public void setBankAcc(long bankAcc_){
//             bankAcc=bankAcc_;
//         }
//        public void setAge( int age_){
//            if (age_>0) {
//                age=age_;
//            }
//            else System.out.println("Write proper age");
//        }
//        public void setName( String first_,String last_){
//            first=first_;
//            last=last_;
//        }

         public void printStatement(){
             System.out.println("Latur Urban Bank \n"+"Your Name is "+first+" "+last+"\nYour bank account is  : "+bankAcc+" \n Branch Latur ");
         }


         public void createAcc(){
             //save this data into databases
             System.out.println("ur acc has been successfully created ");
         }


}
