public class Circle {
    private double radius;
    private double area;
    private double circumference;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public double getArea() {return area;}
    public void setArea(double area) {this.area = area;}
    public double getCircumference() {return circumference;}
    public void setCircumference(double circumference) {this.circumference = circumference;}


    public static void main(String[] args) {
        Circle c1= new Circle(3);
        CircleCalculator.CalculateCircle(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }


}
