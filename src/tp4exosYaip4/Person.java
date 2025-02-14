package tp4exosYaip4;

public class Person {
	private String name;
	private String address;
	
	public Person (String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person ("Alexis", "Vietnam");
		
		System.out.println(p1);
		
		System.out.println("Name:" + p1.name);
		System.out.println("Address:" + p1.address);
	}
}