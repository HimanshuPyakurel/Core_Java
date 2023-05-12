package ControlStatement.looping;

public class DoWhileTest {

	/*
	 * 	do{
	 * 		//statements
	 * 	}while(condition);
	 * 
	 * 	Ek choti free tespaxi paisa
	 * 
	 */
	
	public static void main(String[] args) {
	
		/*
		 * 9*1=9
		 * 9*2=18
		 * ......
		 * ......
		 * ......
		 * 9*10=90
		 * 
		 */
		
		int n=9;
		int i=1;
		
		do {
			System.out.println(n +"*" +i +"="+ (n*i));
			
			i++;
		}while(i <=10);
		
		
	}
}
