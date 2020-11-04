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
      return "Triangle with sides: " +getSide1()+" "+getSide2()+" "+getSide3() + " area: " + getArea() + " perimeter: " + getPerimeter() + " selected: " + getSelected() + "\n";
   }
   
   public Shape contains( int x, int y ){
      
      double distanceOfPoint = Math.sqrt( ( (y-this.getY() )*( y-this.getY() ) )+((x-this.getX())*(x-this.getX()) ));
      double radius = (this.getSide1()*this.getSide2()*this.getSide3()) / (4*this.getArea() );
      
      if( distanceOfPoint <= radius )
         return this;
      return null;
   }
}