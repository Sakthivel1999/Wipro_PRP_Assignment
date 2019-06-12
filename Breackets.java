import java.util.Scanner;

public class Breackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char str2=0;
		//int count=0;
		//char c=0;
		String s="",a="";
		System.out.println("Enter the value");
		String str=scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='{' ){
				str2=str.charAt(i);
				 s+=Character.toString(str2);
			}
		}//System.out.println(s);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='}' ){
				str2=str.charAt(i);
				 a+=Character.toString(str2);
			}
		}String q=a.replace('}', '{');
		//System.out.println(q);
		if(s.equals(q)){
			System.out.println("true");
		}else{
			System.out.println("no");
		}
	}

}
