interface Shape2D {
    double calculateArea();
    double calculatePerimeter();
}

interface Shape3D {
    double calculateVolume();
    double calculateSurfaceArea();
}

class Circle implements Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape2D {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Sphere implements Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cuboid implements Shape3D {
    private double width, height, depth;

    public Cuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }
}

class GeometryCalculator {
    public void printShape2DProperties(Shape2D shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimetro: " + shape.calculatePerimeter());
    }

    public void printShape3DProperties(Shape3D shape) {
        System.out.println("Volume: " + shape.calculateVolume());
        System.out.println("Superficie: " + shape.calculateSurfaceArea());
    }
}

public class GeometryApp {
    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();

        Shape2D circle = new Circle(5);
        Shape2D rectangle = new Rectangle(4, 6);
        Shape3D sphere = new Sphere(3);
        Shape3D cuboid = new Cuboid(4, 5, 6);

        System.out.println("Proprietà del Cerchio:");
        calculator.printShape2DProperties(circle);

        System.out.println("\nProprietà del Rettangolo:");
        calculator.printShape2DProperties(rectangle);

        System.out.println("\nProprietà della Sfera:");
        calculator.printShape3DProperties(sphere);

        System.out.println("\nProprietà del Cuboide:");
        calculator.printShape3DProperties(cuboid);
    }
}
