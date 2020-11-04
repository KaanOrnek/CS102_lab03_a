/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public class Rectangle extends Shape
{
   public Rectangle( int width, int height ) {
      super( width, height );
   }
   public double getArea(){
      return this.getSide1() * this.getSide2();
   }
   public double getPerimeter(){
      return 2*(this.getSide1() + this.getSide2());
   }
   
   public String toString(){
      return "Rectangle with sides: " + getSide1()+" "+getSide2() + " area: " + getArea() + " perimeter: " + getPerimeter()+ " selected: " + getSelected() + "\n";
   }
   
   public Shape contains( int x, int y ){
      
      double distanceOfPoint = Math.sqrt( ( (y-this.getY() )*( y-this.getY() ) )+((x-this.getX())*(x-this.getX()) ));
      double radius = Math.sqrt( ( this.getSide1() * this.getSide1() ) +( this.getSide2() * this.getSide2() ) );
      
      if( distanceOfPoint <= radius )
         return this;
      return null;
   }
  
}