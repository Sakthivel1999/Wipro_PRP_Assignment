import java.util.Scanner;
class F{
	void output(int num){
		System.out.println("Output");
		for (int i = 0; i <num*2-1; i++) {
			for (int j = 0; j < num*2-1; j++) {
				System.out.print(1+Math.max(Math.abs(num-i-1),Math.abs(num-j-1)));
			}
			System.out.println();
		}
	}
}
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number Of N:");
		int num=scan.nextInt();
		F obj=new F();
		obj.output(num);
	}

}
