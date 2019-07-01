import java.util.*;
class Working{
	String str;
	int input1[]=new int[27];
	int sum=1;
	Working(String str , int input1[]){
		this.str=str;
		for (int i = 1; i <= 26; i++) {
			this.input1[i]=input1[i];
		}
	}
	void process() {
		String words[]=str.split("\\s");
		int wc[]=new int[words.length];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				wc[i]+= input1[(((int)(words[i].charAt(j)))-96)]; 
			}
			
			if(input1[(((int)(words[i].charAt(0)))-96)]<0) {
				wc[i]+= ((int)(words[i].charAt(0)))-96;
			}
			if(input1[(((int)(words[i].charAt(words[i].length()-1)))-96)]<0) {
				wc[i]+= ((int)(words[i].charAt(words[i].length()-1)))-96;
			}
		}
		for (int i : wc) {
			sum *= i;
		}
		System.out.println("Weight of the String : "+sum);
	}
}
public class WeightOfString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.print("Enter the alphabets individual weight : ");
		int input1[]= new int[27];
		for (int i = 1; i <= 26; i++) {
			input1[i]=scan.nextInt();
		}
		System.out.print("Enter a String : ");
		String str= scan1.nextLine();
		Working obj=new Working((str.toLowerCase()), input1);
		obj.process();
		scan.close();
		scan1.close();
	}

}
