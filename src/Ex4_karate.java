import java.util.Scanner;

public class Ex4_karate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of children signed to the club karate:");
        int s= input.nextInt();
        if(s>=15)
        {
            System.out.println("The club is open");
            System.out.println("There are " + s + " students");
        }
        else {
            System.out.println("Not enough students to start the lessons");
            System.out.println("The club needs " + (15 - s) + " more students");
        }
    }
}
