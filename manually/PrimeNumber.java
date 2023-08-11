import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(isPrime(sc.nextLong()));




    }
    static boolean isPrime(long n){
        if(n<=1){return false;}
        int divisible=2;
        while(divisible*divisible<n){
            if(n%divisible==0){
                return false;
            }
        }
        return true;
    }
}

