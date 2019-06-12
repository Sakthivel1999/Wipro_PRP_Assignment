import java.util.Scanner;
class Name{
	String Name="";
	long Acc_Num;
	String s="",q,Total,e,Total2="";
	String q1="";
	Scanner scan=new Scanner(System.in);
	void name(){
		System.out.println("Enter the Acoound holder");
		 Name=scan.nextLine();
			if(Name.length() >2){
				
			}else{
				System.out.println("Enter the correct lenth");
				name();
			}
		
	}
	void Acc_Num(){
		System.out.println("Enter the accound Number");
		 Acc_Num = scan.nextLong();
		 s=String.valueOf(Acc_Num);
		if(s.length()==11){
		}else{
			System.out.println("Enter the Correct Accound Number");
			Acc_Num();
		}
		
	}
	void Type(){
		System.out.println("Type of the Account");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("3.Loan");
		System.out.println("Enter the accout type 1,2,3");
		int a,total=0,total1=0,total2=0,total3=0;
		a=scan.nextInt();
		switch(a){
		case 1:{
			
		
			String res="";
			 q=String.valueOf(s.charAt(0));
			 /*-------------------------------------------------------------------------*/
			 Total=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4));
			 for (int i = 0; i < Total.length(); i++) {
				total += Integer.parseInt(String.valueOf(Total.charAt(i)));
				while((String.valueOf(total)).length()!=1) {
					 total = ((total/10)+(total%10));
					 }
				
			}
			
			 String r=String.valueOf(total);
			 for (int i = 0; i < r.length(); i++) {
				total1+=Integer.parseInt(String.valueOf(r.charAt(i)));
				 
			}
			 /*------------------------------------------------------------------*/
			 e=String.valueOf(Name.charAt(0));
			 /*------------------------------------------------------------------*/
			 Total2=String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7))+String.valueOf(s.charAt(8))+String.valueOf(s.charAt(9));
			 for (int i = 0; i < Total2.length(); i++) {
				// System.out.println(Total2.charAt(i));
				 total2 +=Integer.parseInt(String.valueOf(Total2.charAt(i)));
				 
				// System.out.println(total2);
				
			}
			 String t=String.valueOf(total2);
			 for (int i = 0; i < t.length(); i++) {
				 total3+=Integer.parseInt(String.valueOf(t.charAt(i)));
				 
				
			}
			 res="sa"+String.valueOf(q)+total1+e+total3+Name.charAt(Name.length()-1)+s.charAt(s.length()-1);
			 
			 System.out.println(res);
			 break;
			 }
		case 2:{
			String res="";
			 q=String.valueOf(s.charAt(0));
			 Total=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4));
			 for (int i = 0; i < Total.length(); i++) {
				total += Integer.parseInt(String.valueOf(Total.charAt(i)));
				while((String.valueOf(total)).length()!=1) {
					 total = ((total/10)+(total%10));
					 }
			}
			 String r=String.valueOf(total);
			 for (int i = 0; i < r.length(); i++) {
				total1+=Integer.parseInt(String.valueOf(r.charAt(i)));
				
			}
			 e=String.valueOf(Name.charAt(0));
			 Total2=String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7))+String.valueOf(s.charAt(8))+String.valueOf(s.charAt(9));
			 for (int i = 0; i < Total2.length(); i++) {
				 total2 +=Integer.parseInt(String.valueOf(Total2.charAt(i)));
				
			}
			 String t=String.valueOf(total2);
			 for (int i = 0; i < t.length(); i++) {
				 total3+=Integer.parseInt(String.valueOf(t.charAt(i)));
				 
			}
			 res="cu"+String.valueOf(q)+total1+e+total3+Name.charAt(Name.length()-1)+s.charAt(s.length()-1);
			 
			 System.out.println(res);
			 break;
		}
		case 3:{
			String res="";
			 q=String.valueOf(s.charAt(0));
			 Total=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4));
			 for (int i = 0; i < Total.length(); i++) {
				total += Integer.parseInt(String.valueOf(Total.charAt(i)));
				while((String.valueOf(total)).length()!=1) {
					 total = ((total/10)+(total%10));
					 }
			}
			 String r=String.valueOf(total);
			 for (int i = 0; i < r.length(); i++) {
				total1+=Integer.parseInt(String.valueOf(r.charAt(i)));
				
			}
			 e=String.valueOf(Name.charAt(0));
			 Total2=String.valueOf(s.charAt(5))+String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7))+String.valueOf(s.charAt(8))+String.valueOf(s.charAt(9));
			 for (int i = 0; i < Total2.length(); i++) {
				 total2 +=Integer.parseInt(String.valueOf(Total2.charAt(i)));
				
			}
			 String t=String.valueOf(total2);
			 for (int i = 0; i < t.length(); i++) {
				 total3+=Integer.parseInt(String.valueOf(t.charAt(i)));
				
			}
			 res="Lo"+String.valueOf(q)+total1+e+total3+Name.charAt(Name.length()-1)+s.charAt(s.length()-1);
			 
			 System.out.println(res);
			 break;
		}
			default:{
				System.out.println("Enter Currect Value");
				Type();
			}
			
		}
	}
}
public class OneTimePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Name obj=new Name();
		obj.name();
		obj.Acc_Num();
		obj.Type();
	scan.close();	
	}

}
