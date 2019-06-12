import java.util.Arrays;
import java.util.Scanner;

public class PrimeAdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int abc = in.nextInt();
        int num[] = new int[abc];
        int a = 0, sum = 0;

        for (int k = 0; k < num.length; k++) {
            System.out.println("enter the value" + (k + 1));
            num[k] = in.nextInt();
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 2; j < i; j++) {
                if (num[i] % i == 0) {
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                sum = sum + i;
            }
        }in.close();
        System.out.println("number is prime" + sum);
			
			}
	}


