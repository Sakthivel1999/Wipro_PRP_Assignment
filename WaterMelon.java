import java.util.Scanner;

public class WaterMelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Weight");
		int a = scan.nextInt();
		if(a>100){
			System.out.println("Invalid");
		}
		else{	
			int c;
			c = (a/2);
			//System.out.println(c);
			if(c%2==0){
				System.out.println(c+""+c);
			}else{
				if(c%2 ==1){

				}
				
			}System.out.println(c-1 +"-"+(c+1));
			
			if(c%2==0)
			{
				System.out.println("Output="+"yes");
			}

			else{
				System.out.println("Output="+"no");
			}

		}

	}
	
}
