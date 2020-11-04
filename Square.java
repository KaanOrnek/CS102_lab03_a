/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public class Square extends Rectangle {
   
   public Square( int side ){
      super( side,side );
   }
   
   public double getArea(){
      return super.getArea();
   }
   
   public double getPerimeter(){
      return super.getPerimeter();
   }
   
   public String toString(){
      return "Square with side: " + getSide1() + " area: " + getArea() + " perimeter: " + getPerimeter() + "\n";
   }
}