import java.util.Scanner;

public class RepeateNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = input.nextInt();

		int[] crr_array = new int[size];
		int[] new_array= new int[size];
		int[] times = new int[size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < crr_array.length; i++) {
		    crr_array[i] = input.nextInt();
		    times[i] = 1;
		}

		for (int j = 0; j < crr_array.length; j++) {
		    for (int i = j; i < crr_array.length; i++) {
		        if (crr_array[j] == crr_array[i] && j != i) {
		            new_array[i] = crr_array[i];
		            times[i]++;
		        }
		    }
		}
		for (int i = 0; i <  new_array.length; i++) {
		    System.out.println("\t" + crr_array[i]  + "\t" + times[i]+" Time");

		}

	}

}
