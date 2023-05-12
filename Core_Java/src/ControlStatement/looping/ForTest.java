package ControlStatement.looping;

import java.util.Scanner;

public class ForTest {
	
	public static void main(String[] args) {
		
		//print 1 to 100 and sum
		
		int es=0,a,b;
		int os=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range:");
		a = sc.nextInt();
		b= sc.nextInt();
		
		
		for(int i=a; i<=b; i++){
//			System.out.println(i);
//			s=s+i;
		
			if(i%2==0) {
				
				es=es+i;
			}else {
				os=os+i;
			}
			
		}
		
		System.out.println("Sum of even:"+es);
		System.out.println("Sum of odd:"+os);
		System.out.println("Total:"+(es+os));
		
		
		
		
	}

}
