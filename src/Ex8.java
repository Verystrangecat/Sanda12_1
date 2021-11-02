import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of kWh used:");
        double am=input.nextDouble();
        if(am<=180)
        {
            double sum = am * 0.7;
            double vat = sum * 17 / 100;
            System.out.println("The person is going to pay " + (sum + vat) + " dollars");
        }
        else
            if(am>180 && am<=1000)
            {
                double sum = 180 * 0.7 + (am - 180) * 0.9;
                double vat = sum * 17 / 100;
                System.out.println("The person is going to pay " + (sum + vat) + " dollars");
            }
            else
                if(am>1000)
                {
                    double sum = 180 * 0.7 + (am - 180) * 0.9;
                    sum=sum+sum*10/100;
                    sum =sum+ sum*17/100;
                    System.out.println("The person is going to pay " + sum + " dollars");
                }
    }
}
