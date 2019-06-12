import java.util.Scanner;

public class RepeateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int[] input=new int[size];
		int[] output=new int[size];
		int [] time=new int[size];
		
		System.out.println("Enter the array element");
		for(int i=0;i<input.length;i++){
			input[i]=scan.nextInt();
			time[i]=1;
		}
		for(int j=0;j<input.length;j++){
			for(int i=j;i<input.length;i++){
				if(input[j] == input[i] && j != i){
					output[i] = input[i];
					time[i]++;
				}
			}
		}
		for(int i=0;i<output.length;i++){
			System.out.println(input[i] +"----->"+ time[i] +"Time");
		}
		for(int i=1;i<time.length;i++){
			int max = time[i];
			if(time[i]>max ){
				max=time[i];
				System.out.println(max);
			}
		}
		
	}

}
