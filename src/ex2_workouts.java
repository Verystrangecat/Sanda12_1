import java.util.Scanner;

public class ex2_workouts {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of hours the player works out every week:");
        int h=input.nextInt();
        int nh=30-h; //How many hours he needs to practice to get to 30
        if (h<30) {
            System.out.println("The player is going to get kicked out of the team");
            System.out.println("He needs to practice " + nh + " more hours");
        }
        System.out.println("Everything is okay.");
    }
}
