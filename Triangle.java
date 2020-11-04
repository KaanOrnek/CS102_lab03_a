/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public class Triangle extends Shape {
   
   public Triangle( int a, int b, int c ){
      super( a,b,c );
   }
   
   public double getArea(){
      double s = this.getPerimeter()/2;
      return Math.sqrt( s * (s - this.getSide1()) * (s - this.getSide2() ) * (s - this.getSide3() ) );
   }
   
   public double getPerimeter(){
      return this.getSide1() + this.getSide2() + this.getSide3();
   }
   
   public String toString(){
      return "Triangle with sides: " +getSide1()+" "+getSide2()+" "+getSide3() + " area: " + getArea() + " perimeter: " + getPerimeter() + "\n";
   }
}