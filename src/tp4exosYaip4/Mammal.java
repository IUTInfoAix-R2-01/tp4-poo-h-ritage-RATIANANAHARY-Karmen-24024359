package tp4exosYaip4;

public class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}

	    @Override
	    public String toString() {
	        return "Mammal: Mammal [" + super.toString() + "]";
	    }
	    
	    public static void main(String[] args) {
	        Mammal mammal = new Mammal("elephant");
	        System.out.println(mammal.toString());
	    }
	    
}