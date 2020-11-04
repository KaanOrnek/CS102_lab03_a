/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public class Circle extends Shape {
   
   public Circle( int radius ){
      super( radius );
   }
   
   public double getArea(){
      return Math.PI * this.getRadius() * this.getRadius();
   }
   
   public double getPerimeter(){
      return Math.PI * this.getRadius() * 2;
   }
   
   public String toString(){
      return "Circle with radius: " + super.getRadius() + " area: " + getArea() + " perimeter: " + getPerimeter() + "selected: " + getSelected() + "\n";
   }
   
   public Shape contains( int x, int y ){
      double distanceOfPoint = Math.sqrt( ( (y-this.getY() )*( y-this.getY() ) )+((x-this.getX())*(x-this.getX()) ));
      if( distanceOfPoint <= getRadius() )
         return this;
      return null;
   }
}