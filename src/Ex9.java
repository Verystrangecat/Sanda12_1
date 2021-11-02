import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the speed of driver:");
        int v = input.nextInt();
        if (v > 90)
            if ((v - 90) > 6)
                System.out.println("The driver needs to pay the fine" + "\nThe driver must attend the course");
            else
                System.out.println("The driver needs to pay the fine");
        else
            System.out.println("The driver is traveling at a permitted speed");
    }
}
