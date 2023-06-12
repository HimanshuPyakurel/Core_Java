package Constructor;

public class Main {

		  String language;

		  // default constructor
		  Main() {
		    this.language = "Java";
		  }

		  // constructor with a single parameter
		  Main(String language) {
		    this.language = language;
		  }

		  public void getName() {
		    System.out.println("Programming Langauage: " + this.language);
		  }

		  public static void main(String[] args) {

		    // call constructor with no parameter
		    Main obj1 = new Main();

		    // call constructor with a single parameter
		    Main obj2 = new Main("Python");

		    obj1.getName();
		    obj2.getName();
		  }
}
