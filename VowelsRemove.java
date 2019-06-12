import java.util.Scanner;

public class VowelsRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str="";
		System.out.println("Enter the String");
		 str=scan.next();
		 String small="",cap="", alphabets="",invalid="",alphabets1="";
		for(int i=0;i<str.length();i++){
			int temp=str.charAt(i);
			if( 97 == temp || 101 == temp || 105 == temp || 111 == temp || 117 == temp){
				 small += str.charAt(i);
				
			}else{
				if((Character.isAlphabetic(str.charAt(i))&&( 97 != temp || 101 != temp || 105 != temp || 111 != temp || 117 != temp))){
					alphabets += str.charAt(i);
				}else{
					if(!(Character.isAlphabetic(str.charAt(i)))){
						invalid +=str.charAt(i);
					}
				}
				}
			
			if( 65 == temp || 69 == temp || 73 == temp || 79 == temp || 85 == temp){
				 cap += str.charAt(i);
				
			}else{
				if((Character.isAlphabetic(str.charAt(i))&&( 65 == temp || 69 == temp || 73 == temp || 79 == temp || 85 == temp))){
					alphabets1 += str.charAt(i);
				}else{
					if(!(Character.isAlphabetic(str.charAt(i)))){
						invalid +=str.charAt(i);
					}
				}
				}
	}
		System.out.println("small vowel="+small);
		System.out.println("cap vowel="+cap);
		System.out.println("alphabets="+alphabets);
		System.out.println("invalid="+invalid);
		System.out.println("1.ToUpper");
		System.out.println("2.ToLower");
		System.out.println("enter the value");
		int n=scan.nextInt();
		switch(n){
		case 1:
			System.out.println("Upper="+alphabets.toUpperCase());
			System.out.println();
			break;
		case 2:
			alphabets.toLowerCase();
			System.out.println("Lower="+alphabets.toLowerCase());
			break;
			default:
				System.out.println("Invalid number");
				break;
		}
		

	}
	}
