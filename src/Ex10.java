import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the sides of triangle");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        if(a+b>c)
            if(a+c>b)
                if(b+c>a)
                    System.out.println("This triangle exists");
                else
                    System.out.println("This triangle doesn't exist");
                else
                    System.out.println("This triangle doesn't exist");
                else
                    System.out.println("This triangle doesn't exist");
    }
}
