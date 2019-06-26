package languageBasics;

public class ass17 {
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int r, result=0;
		while(num!=0){
		r= num%10;
		result=result*10+r;
		num=num/10;
		}
		System.out.println("Reverse is : "+result);
		}
		}

