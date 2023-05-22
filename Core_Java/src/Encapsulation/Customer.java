package Encapsulation;

public class Customer {
	
	private int id;
	private String name;
	private String city;
	private int age;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setId(3435); 
		c.setAge(33);
		c.setName("Okay");
		c.setCity("Ktm");
		c.setPhone("98634312343");
		
//		System.out.println("Id = "+c.getId());
//		System.out.println("Name = "+c.getName());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("City = "+c.getCity());
//		System.out.println("Phone = "+c.getPhone());
		
		System.out.println(c);
		
	}
	
	

}
