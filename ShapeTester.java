/*
 * CS102 Lab03-A
 * Mehmet Kaan �rnek 21901637
 * 04.11.2020
 */
import java.util.Scanner;
public class ShapeTester {
   public static void main( String[] args ) {
      
      final String MENU = "0-Exit the tester \n1-Create an empty ShapeContainer \n2-Add shape to the container \n3-Show the total area of the container \n4-Show the total perimeter of the container \n5-Show the container as a String \n6-Select a shape with x,y coordinates \n7-Remove all the selected shapes from the container";
      
      Scanner scan = new Scanner(System.in);
      ShapeContainer a = new ShapeContainer();
      int input = -1;
      int shapeSelection = -1;
      int givenX =0;
      int givenY =0;
      int side1=0;
      int side2=0;
      int side3=0;
      int radius=0;
      
      do {
         System.out.println( MENU );
         input = scan.nextInt();
         
         if( input == 1 )
            a = new ShapeContainer();
         
         else if( input == 2 ) {
            System.out.print( "1-Circle\n2-Rectangle\n3-Square\n4-Triangle" );
            shapeSelection = scan.nextInt();
            if( shapeSelection == 1 ){
               System.out.print( "Desired radius: " );
               radius = scan.nextInt();
               a.add( new Circle( radius ) );
            }
            else if( shapeSelection == 2 ){
               System.out.print( "Desired two side: " );
               side1 = scan.nextInt();
               side2 = scan.nextInt();
               a.add( new Rectangle( side1,side2 ) );
            }
            else if( shapeSelection == 3 ){
               System.out.print( "Desired side: " );
               side1 = scan.nextInt();
               a.add( new Square( side1 ) );
            }
            else if( shapeSelection == 4 ){
               System.out.print( "Desired three side: " );
               side1 = scan.nextInt();
               side2 = scan.nextInt();
               side3 = scan.nextInt();
               a.add( new Triangle( side1,side2,side3 ) );
            }
            
         }
         else if( input == 3 )
            System.out.println( a.getArea() + "is the total area." );
         
         else if( input == 4 )
            System.out.println( a.getPerimeter() + "is the sum of the perimeters." );
         
         else if( input == 5 )
            System.out.println( a.toString() );
         else if( input == 6 ){
            System.out.println( "Enter the x and y of the point you wanted to select if there is any shape" );
            givenX = scan.nextInt();
            givenY = scan.nextInt();
            a.selection( givenX, givenY );
         }
         else if( input == 7 )
            a.removeSelecteds();
         
      } while( input != 0 );
   }
}