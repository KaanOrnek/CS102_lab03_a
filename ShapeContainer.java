/*
 * CS102 Lab03-A
 * Mehmet Kaan Örnek 21901637
 * 04.11.2020
 */
import java.util.ArrayList;
public class ShapeContainer {
   
   private ArrayList<Shape> container;
   
   public ShapeContainer(){
      container = new ArrayList<Shape>();
   }
   public void add( Shape s ){
      container.add( s );
   }
   
   public double getArea() {
      double sum=0;
      for( int i = 0; i < container.size(); i++ ){
         sum += container.get(i).getArea();
      }
      return sum;
   }
   
   public double getPerimeter() {
      double sum=0;
      for( int i = 0; i < container.size(); i++ ){
         sum += container.get(i).getPerimeter();
      }
      return sum;
   }
   
   public String toString(){
      String representation=" ";
      for( int i = 0; i < container.size(); i++ ){
         representation += container.get(i).toString() + " ";
      }
      return representation;
   }
}