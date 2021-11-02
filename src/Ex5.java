import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=input.nextInt();
        if(num>9)
            if(num<100)
            System.out.println("Two digits");
            else
                System.out.println("More then two digits");
            else
                System.out.println("Only one digit");
    }
}
