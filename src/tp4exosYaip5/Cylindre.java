package tp4exosYaip5;

public class Cylindre {
    private Circle base;   
    private double height;

    public Cylindre(double radius, double height) {
        this.base = new Circle(radius); 
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseArea() {
        return base.getArea();  
    }


    public static void main(String[] args) {
        Cylindre cylindre1 = new Cylindre(10.6, 12.3);

        System.out.println("Rayon de la base du cylindre : " + cylindre1.base.getRadius());
        System.out.println("Aire de la base du cylindre : " + cylindre1.getBaseArea());
        System.out.println("Hauteur du cylindre : " + cylindre1.getHeight());
        System.out.println("Volume du cylindre : " + cylindre1.getVolume());
    }
}