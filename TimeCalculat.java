import java.util.Arrays;
import java.util.Scanner;

public class TimeCalculat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Four Value");
		int array[] = new int[4];
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		int arr3[]=new int[4];
		int arr4[]=new int[4];
		for (int i = 0; i <array.length; i++) {
			array[i]=scan.nextInt();
			
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
			if(array[i]<=2){
				arr1[0]=i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] <=3){
				arr2[0]=i;
			}
		}for (int i = 0; i < array.length; i++) {
			if(array[i]<=5){
				arr3[0]=i;
			}
		}for (int i = 0; i < array.length; i++) {
			if(array[i] <=9){
				arr4[0]=i;
			}
		}
		System.out.println(arr1[0]+""+arr2[0]+":"+arr3[0]+""+arr4[0]);
		

	}

}
