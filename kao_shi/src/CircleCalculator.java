public class CircleCalculator {
    public static void CalculateCircle(Circle circle){
        circle.setArea(Math.PI*Math.pow(circle.getRadius(),2));
        circle.setCircumference(2*Math.PI*circle.getRadius());
    }
}
