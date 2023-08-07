package practice;

public class MethodOverloading {
	// WAP to show method overloading   
	    void printSum(int a, int b){
	        int  sum = a + b;
	        System.out.println(" sum is : " + sum);
	    }

	    void printSum(String a, String b){
	        
	        System.out.println("the total sum is : " + a + " " + b);
	    }
	    public static void main(String[] args) {
	        MethodOverloading m =  new MethodOverloading();
	        System.out.println("@@@@@@@@@@@@@@@@@@@@@2222");
	        m.printSum(20, 30);
	        m.printSum("Himanshu", "Pyakurel");
	        

	    }
	}
