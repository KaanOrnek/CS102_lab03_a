/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
public abstract class Shape
{
   private int side1;
   private int side2;
   private int side3;
   private int radius;
   
   
   public Shape( int a , int b , int c ) {
      side1=a;
      side2=b;
      side3=c;
   }
   
   public Shape( int k, int l ) {
      side1=k;
      side2=l;
   }
   public Shape( int r ) {
      radius = r;
   }
   
   public abstract double getArea();
   
   public abstract double getPerimeter();
   
   public abstract String toString();
   
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
}