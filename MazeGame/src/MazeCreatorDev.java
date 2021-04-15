import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MazeCreatorDev {
	private static Canvas myCanvas;
	static JButton[] buttons = new JButton[150];
	static JButton plrobj;
	static JButton winbtn;
	static boolean isDevMode = true;
	static JFrame frame = new JFrame("Maze Creator");
	int curIndex = 0;
	
	public void mazeCreatorInit() {
		curIndex = 0;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    int width = (int)d.getWidth(), height = (int)d.getHeight();
	    frame.setLayout(null);
	    frame.setResizable(false);
	    
	    frame.setVisible(true);
	    frame.setBounds((width-800)/2, (height-540)/2, 800, 540);
	    
	    JTextField arraylog = new JTextField(20);
	    arraylog.setBounds(550, 200, 150, 50);
	    frame.getContentPane().add(arraylog);
	    
	    JButton generatebtn = new JButton("Generate");
	    generatebtn.setBounds(550, 255, 150, 20);
	    frame.getContentPane().add(generatebtn);
	    generatebtn.addActionListener(new ActionListener() {
	    	   @Override
	            public void actionPerformed(ActionEvent e) {
	               
	               String str = "{";
	               
	               for (int i = 0; i < buttons.length; i++) {
	            	   if (buttons[i] != null) {
	            		   if (str == "{") {
	            			   // No data
	            			   str = str + buttons[i].getLocation();
	            			   
	            		   }else {
	            			   str = str + ", " + buttons[i].getLocation();
	            		   }
	            	   }
	               }
	               
	               
	    		   
	               str = str + "}";
	               
	               str = str.replace("java.awt.Point[", "new Point(");
	               str = str.replace("]", ")");
	               str = str.replace("x=", "");
	               str = str.replace("y=", "");
	               System.out.println("New Maze Generated:\n");
	               System.out.println(str);	
	               
	               arraylog.setText(str);
	    	   }
		   });
	    
	    for(int i = 0; i < 10; i++) {
	    	   
	    	   JButton button = new JButton("");
	    	   button.setBounds(i*50, 0, 50, 50);
		       button.setBackground(Color.darkGray);
		       frame.getContentPane().add(button); // Adds Button to content pane of frame
		       buttons[curIndex] = button;
		       curIndex++;
	       }
	       for(int i = 0; i < 10; i++) {
	    	   
	    	   JButton button = new JButton("");
	    	   button.setBounds(0, i*50, 50, 50);
		       button.setBackground(Color.darkGray);
		       frame.getContentPane().add(button); // Adds Button to content pane of frame
		       buttons[curIndex] = button;
		       curIndex++;
	       }
	       for(int i = 0; i < 10; i++) {
	    	   
	    	   JButton button = new JButton("");
	    	   button.setBounds(450, i*50, 50, 50);
		       button.setBackground(Color.darkGray);
		       frame.getContentPane().add(button); // Adds Button to content pane of frame
		       buttons[curIndex] = button;
		       curIndex++;
	       }
	       for(int i = 0; i < 10; i++) {
	    	   
	    	   JButton button = new JButton("");
	    	   button.setBounds(i*50, 450, 50, 50);
		       button.setBackground(Color.darkGray);
		       frame.getContentPane().add(button); // Adds Button to content pane of frame
		       buttons[curIndex] = button;
		       curIndex++;
	       }
	       JButton winbtn = new JButton();
	       winbtn.setBounds(400, 400, 50, 50);
	       winbtn.setBackground(Color.red);
	       
	       JButton plrbtn = new JButton();
	       plrbtn.setBounds(50, 50, 50, 50);
	       plrbtn.setBackground(Color.green);
	       
	       frame.getContentPane().add(plrbtn);
	       frame.getContentPane().add(winbtn);
	       
	       
	       
	       for (int x = 50; x <= 400; x = x +50) {
	    	   for (int y = 50; y <= 400; y = y +50) {
		    	   
	    		   
	    				   JButton button = new JButton("");
	    		    	   button.setBounds(x, y, 50, 50);
	    		    	  
	    			       button.setBackground(Color.gray);
	    			       frame.getContentPane().add(button); // Adds Button to content pane of frame
	    	    		   button.addActionListener(new ActionListener() {
	    	    	    	   @Override
	    		   	            public void actionPerformed(ActionEvent e) {
	    		   	               if (button.getBackground() == Color.gray) {
	    		   	            	   // Not a boundary
	    		   	            	   button.setBackground(Color.DARK_GRAY);
	    		   	            	   curIndex++;
	    		   	            	   buttons[curIndex] = button;
	    		   	            	  
	    		   	               }else {
	    		   	            	   // Is a boundary
	    		   	            	   System.out.println("Ok");
	    		   	            	   for (int index = 0; index < buttons.length; index++) {
	    		   	            		   if (buttons[index] != null) {
	    		   	            			System.out.println("Deleting 1");
	    		   	            			   if (buttons[index] == button) {
	    		   	            				   System.out.println("Deleting");
	    		   	            				   buttons[index] = null;
	    		   	            				   button.setBackground(Color.gray);
	    		   	            				   curIndex--;
	    		   	            			   }
	    		   	            		   }
	    		   	            	   }
	    		   	               }
	    		   	            }
	    	    		   });
	    			
	    	    		   if (button.getLocation() == winbtn.getLocation() || button.getLocation() == plrbtn.getLocation()) {
	    		    		   frame.remove(button);
	    		    	   }
		       } 
	       }
	       
	       for (int x = 0; x <= 800; x = x +50) {
	    	   for (int y = 0; y <= 800; y = y +50) {
	    		   
	    		   plrbtn.setBounds(x, y, 50, 50);
	    		   
	    	   }
	       }
		
	       plrbtn.setBounds(50, 50, 50, 50);
		
	}
	
}
