import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double num;
        System.out.println("enter number");
        num=input.nextDouble();
        if(num>=0)
            System.out.println("good number");
        else
        {
            System.out.println("enter other number");
            num=input.nextDouble();
            System.out.println("new number="+num);
        }

    }
}
