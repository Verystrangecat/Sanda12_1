import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of kWh used:");
        double am=input.nextDouble();
        if(am<=180)
        {
            double sum = am * 70;
            sum =(sum+ sum * 17 / 100);
            int d= (int) sum/100;
            int c= (int) (sum%100);
            System.out.println("The person is going to pay " +d+"."+c+ " dollars");
        }
        else
            if(am>180 && am<1000)
            {
                double sum = 180 * 70 + (am - 180) * 90;
                sum =(sum+ sum * 17 / 100);
                int d= (int) sum/100;
                int c= (int) (sum%100);
                System.out.println("The person is going to pay " +d+"."+c+ " dollars");
            }
            else
                if(am>=1000)
                {
                    double sum = 180 * 70 + (am - 180) * 90;
                    sum=sum+sum*10/100;
                    sum =(sum+ sum*17/100);
                    int d= (int) sum/100;
                    int c= (int) (sum%100);
                    System.out.println("The person is going to pay " +d+"."+c+ " dollars");
                }
    }
}
