public class Rectangle implements Shape {

    private double  length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
   @Override
   public double calculateArea(){
        return length * width;
   }
}
