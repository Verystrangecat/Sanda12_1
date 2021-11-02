import java.util.Scanner;

public class Art {


    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int used,sum = 0, sumhelp = 0;
            System.out.println("enter how much used");
            used = input.nextInt();
            if (used<180)
                sum = used*70;
            else if (1000>used && used>180) {
                sumhelp = used - 180;
                sum = sumhelp * 90 + 180 * 70;
            }
            else if (used>1000) {
                sumhelp = used - 180;
                sum = sumhelp * 90 + 180 * 70;
                sum = sum + sum / 100 * 10;
            }
            sum = sum + sum/100*17;
            System.out.println("your amount that u have to pay is " + sum/100 + "." + sum%100 + "dollars");
        }
    }

