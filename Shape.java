/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public abstract class Shape implements Locatable
{
   private int side1;
   private int side2;
   private int side3;
   private int radius;
   protected int xLoc;
   protected int yLoc;
   
   
   public Shape( int a , int b , int c ) {
      side1=a;
      side2=b;
      side3=c;
      xLoc=0;
      yLoc=0;
   }
   
   public Shape( int k, int l ) {
      side1=k;
      side2=l;
      xLoc=0;
      yLoc=0;
   }
   public Shape( int r ) {
      radius = r;
      xLoc=0;
      yLoc=0;
   }
   
   public abstract double getArea();
   
   public abstract double getPerimeter();
   
   public int getSide1(){
      return side1;
   }
   public int getSide2(){
      return side2;
   }
   public int getSide3(){
      return side3;
   }
   public int getRadius(){
      return radius;
   }
   public int getX() {
      return xLoc;
   }
   public int getY() {
      return yLoc;
   }
   
   public void setLocation( int x, int y ){
      xLoc = x;
      yLoc = y;
   }
   
   public abstract String toString();
}