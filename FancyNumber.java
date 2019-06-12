import java.util.Arrays;
import java.util.Scanner;
public class FancyNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String num="";																									
		String a="";
		System.out.println("Enter The Mobile Number");
		num=scan.nextLine();
		String b="99999999999";
		String c="9999999999";
		if(num.length() < b.length() && num.length() >= c.length()){	
		for (int i = 0; i <= num.length()-3; i++) {
			if(48<num.charAt(i) || 57>num.charAt(i)){
				//System.out.println(!Character.isDigit(num.charAt(i)));
			if((num.charAt(i)) == num.charAt(i+1)){
				if(num.charAt(i+1) == num.charAt(i+2)){
					System.out.println("Given Number Is Fancy");
					break;
				}
				}
				
			else{				
					if(num.charAt(i) < num.charAt(i+1)  && num.charAt(i)-num.charAt(i+1) ==-1){
						if(num.charAt(i+1) < num.charAt(i+2) && num.charAt(i+1)-num.charAt(i+2) ==-1){
								System.out.println("Given Number Is Fancy");
								break;			
						}
					}else{
						if(num.charAt(i) > num.charAt(i+1) && num.charAt(i)-num.charAt(i+1) ==1 ){
							if(num.charAt(i+1) > num.charAt(i+2) && num.charAt(i+1)-num.charAt(i+2) ==1){
									System.out.println("Given Number Is Fancy");
									break;	
							}
					}else{
						char ch[]=num.toCharArray();
						Arrays.sort(ch);
						a=new String(ch);
						if(a.charAt(i) == a.charAt(i+1)){
							
							if(a.charAt(i+1) == a.charAt(i+2)){
								System.out.println("Given Number Is Fancy");
								break;
							}	
						}
					}System.out.println("Given Number Is Not Fancy");
					break;
				}
		}
				
		}	}
		}else{
			System.out.println("Enter Only 10 Digit Number");
		}scan.close();
}
	}
