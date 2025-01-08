package JAVA101;
import java.util.Scanner;
public class otuzbesinci_ornek {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.print("sayı giriniz: ");
       int number = input.nextInt();
        if (isPrime(number, 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

    public static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false;
        }
        if (divisor > Math.sqrt(number)) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }
}
