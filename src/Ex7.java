import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of times the guy visited a club");
        int t= input.nextInt();
        if(t<4)
            System.out.println("Not enough");
        else
            if(t>7)
                System.out.println("Overdone");
            else
                System.out.println("Good");
    }
}
