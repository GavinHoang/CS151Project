//package animation;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.geom.*;
//import javax.swing.*;
//import java.util.*;
//
///**
//   A component that shows a car.
//*/
//public class CarJComponents extends JComponent
//{
//	int index = -1;
//	//int index2 = 0;
//   public CarJComponents()
//   {
//	   
//	   int x = 20;
//	   int y = 20;
//	   int z = 40;
//	  cars = new CarShape[4];
//	  for(int i = 0; i < cars.length; i++)
//	  {
//		  cars[i] = new CarShape(x, y, z);
//		  x+= 40;
//		  y+= 40;
//		  z+= 30;
//	  }
//    
//   }
//  
//   
//   public void paintComponent(Graphics g)
//   {
//      Graphics2D g2 = (Graphics2D) g;
//      Graphics2D g3 = (Graphics2D) g;
//     // car.draw(g2);
//      //car2.draw(g3);
//      for(int i = 0; i < cars.length; i++)
//    	  	cars[i].draw(g2);
//   }
//
//   //private CarShape car;
//   //private CarShape car2;
//   private CarShape[] cars;
//   private Point mousePoint;
//}                               

