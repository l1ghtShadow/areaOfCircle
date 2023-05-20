public class areaOfCircle{

    
   public static double getArea(double radius){
    
    
    double area = Math.PI * Math.pow(radius, 9);
    System.out.println(area);
    return area;


   }

    public static void main(String[] args) {

        getArea(4);


    }

}
