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
   
   
   /*
    * adds the given Shape s to the container ArrayList.
    */
   public void add( Shape s ){
      container.add( s );
   }
   
   /*
    * @return double sum - sum of the areas of all the shapes in the container.
    */
   public double getArea() {
      double sum=0;
      for( int i = 0; i < container.size(); i++ ){
         sum += container.get(i).getArea();
      }
      return sum;
   }
   
   /*
    * @return double sum - sum of the perimeters of all the shapes in the container.
    */
   public double getPerimeter() {
      double sum=0;
      for( int i = 0; i < container.size(); i++ ){
         sum += container.get(i).getPerimeter();
      }
      return sum;
   }
   
   /*
    * @param int x, int y - gives the coordinates of the desired location to check if there is a shape.
    * if there is any shape, shape gets selected
    */
   public void selection( int x, int y ){
      int check = 0;
      for( int i = 0; i < container.size(); i++ ){
         if( container.get(i).contains( x,y ) != null ){
            check++;
            container.get(i).setSelected();
            System.out.println( container.get(i) );
         }
      }
      if( check == 0 )
         System.out.println( "No shape is located in the given coordinates." );
   }
   
   /*
    * removes all the selected shapes from the container.
    */
   public void removeSelecteds() {
      
      for( int i = 0; i< container.size(); i++ ){
         if( container.get(i).getSelected() ){
            container.remove(i);
            i--;
         }
      }
   }
   
   public String toString(){
      String representation=" ";
      for( int i = 0; i < container.size(); i++ ){
         representation += container.get(i).toString() + " ";
      }
      return representation;
   }
}