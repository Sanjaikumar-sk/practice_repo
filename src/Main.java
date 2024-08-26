interface shape
{
    double area();
}

class circle implements shape
{
    private double radius;

    public circle(float radius)
    {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius *radius;
    }
}


class rectangle implements shape
{
    private float length;
    private float breath;

    public rectangle(float length, float breath)
    {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double area() {
        return length*breath;
    }
}

public class Main {
    public static void main(String[] args) {
       shape circle = new circle(10);
       shape rectangle = new rectangle(10,15);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of rectangle " + rectangle.area());
    }
}