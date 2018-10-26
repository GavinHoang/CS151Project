package animation;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import carMove.CarComponent;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      //frame.add(new CarJComponents());//  add those four cars into frame  
      Random rand = new Random(); 
      //int n = rand.nextInt(550) + 1;
      int n = (int)(Math.random() * 250 + 1);
      int n2 = (int)(Math.random() * 300 + 1);
      
       MoveableShape shape
            = new CarShape(800, n, CAR_WIDTH);
       
       MoveableShape shape2
       = new CarShape(800, n2, CAR_WIDTH);
      
      
      //frame.setSize(400, 100);
      Random rand2 = new Random(); 
      int numOfPlanes = rand2.nextInt(4) + 1;
      
      
      //ArrayList<MoveableShape> cars = new ArrayList<>();
      //for(int i = 0; i < numOfPlanes; i++)
     // { 	
    	  //	cars.add(shape);
    	    //n = (int)(Math.random() * 550 + 1);
    	   // shape  = new CarShape(800, n, CAR_WIDTH);
      
    	    
    	   
      //}
      

     
     
      
      ShapeIcon icon = new ShapeIcon(shape,
	            ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon icon2 = new ShapeIcon(shape2,
	            ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      final JLabel label2 = new JLabel(icon2);
      
      frame.setLayout(new FlowLayout());
      //frame.setLayout(null);
      frame.add(label);
      frame.add(label2);

      frame.setSize(800, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.pack()
      frame.setVisible(true);
      
      /*JButton pause = new JButton("Click to pause the car");
      frame.add(pause, BorderLayout.SOUTH);
      
      pause.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == pause)
				try {
					Thread.sleep(4);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
    	  
      });*/
      
      final int DELAY = 1;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, event ->
         {
        	 	//for (int i = 0; i < cars.size(); i++) {
        	 		 shape.move(); 
        	 		 shape2.move();
        	         label.repaint();
        	         label2.repaint();
				//}
           
          
         });
      t.start();
   }

   private static final int ICON_WIDTH = 800;
   private static final int ICON_HEIGHT = 600;
   private static final int CAR_WIDTH = 100;
}

