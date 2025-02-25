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
	
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Staff staff1 = new Staff ("Fred", "Bora bora", "Etablissement de technologie", 3000);
		Student student1 = new Student ("Alexis", "Vietnam","Info",3, 250);
		
		System.out.println(staff1);
		System.out.println(student1);
		
	}
}