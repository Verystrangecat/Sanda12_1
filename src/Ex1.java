import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double num;
        System.out.println("enter number");
        num=input.nextDouble();
        if(num<0)
        {
            System.out.println("negative number");
            num=-num;
        }
        System.out.println("absolute="+num);

    }
}
