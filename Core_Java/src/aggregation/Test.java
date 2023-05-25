package aggregation;

public class Test {
	
	public static void main(String[] args) {
	
		Car c =new Car();
		c.setColor("Blue");
		c.setCompany("Tesla");
		c.setModel("SUV900");
		c.setPrice(4000000);
		
		Employee e = new Employee();
		
		e.setId(123);
		e.setName("Nil Prasad");
		e.setId(320000);
		e.setCar(c);
		
		System.out.println("Id : "+e.getId());
		System.out.println("Name : "+e.getName());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("----- Car Info -----");
		System.out.println("Color : "+ e.getCar().getColor());
		System.out.println("Company : "+e.getCar().getCompany());
		System.out.println("Model : "+e.getCar().getModel());
		System.out.println("Price : "+e.getCar().getPrice());
		
	}
}
