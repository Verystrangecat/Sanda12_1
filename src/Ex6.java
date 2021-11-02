import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int psycho;
        System.out.println("enter psychometri grade");
        psycho= input.nextInt();
        if(psycho>730)
            System.out.println("accepted");
        else
            if(psycho>600)
        System.out.println("accepted on condition");
		else
                System.out.println("You failed");

    }
}
