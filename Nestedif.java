import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(" Enter Your Age : ");
        int age = in.nextInt();

        if (age < 12) {
            System.out.print(" You are a Child");
        }

       else if(age < 18) {
            System.out.print(" You are a Teenager ");
        }

        if (age > 18) {
            System.out.print(" You are a Adult ");
        }

    else if(age > 60) {
            System.out.print(" You are a Senior-Citizen");
        }
    }
}