import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str="abcdefghijklmnopqrstuvwxyz";
		String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//String str=str.toUpperCase();
		System.out.println("Enter the char");
		char res=scan.nextLine().charAt(0);
		//char res1=scan.nextLine().charAt(0);
		int re=str.indexOf(res);
		//int re1=str1.indexOf(res);
		int result=25-re;
		//int result1=25-re1;
		char result2=str.charAt(result);
		//char result3=str1.charAt(result1);
		System.out.println("Replace\n"+result2);
		//System.out.println("Replace\n"+result3);
			
		
	}

}
