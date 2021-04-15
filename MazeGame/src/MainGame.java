import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;




public class MainGame {

	static JButton[] buttons = new JButton[150];
	static JButton plrobj;
	static int levelnum = 1;
	static JButton winbtn;
	static boolean isDevMode,isMazeCreation;
	static Point[] L1Points = {new Point(0,0), new Point(50,0), new Point(100,0), new Point(150,0), new Point(200,0), new Point(250,0), new Point(300,0), new Point(350,0), new Point(400,0), new Point(450,0), new Point(0,0), new Point(0,50), new Point(0,100), new Point(0,150), new Point(0,200), new Point(0,250), new Point(0,300), new Point(0,350), new Point(0,400), new Point(0,450), new Point(450,0), new Point(450,50), new Point(450,100), new Point(450,150), new Point(450,200), new Point(450,250), new Point(450,300), new Point(450,350), new Point(450,400), new Point(450,450), new Point(0,450), new Point(50,450), new Point(100,450), new Point(150,450), new Point(200,450), new Point(250,450), new Point(300,450), new Point(350,450), new Point(400,450), new Point(450,450), new Point(150,50), new Point(150,150), new Point(100,150), new Point(200,250), new Point(250,250), new Point(300,250), new Point(250,400), new Point(200,350), new Point(250,350), new Point(400,50), new Point(400,100), new Point(300,50)};
	static Point[] L2Points = {new Point(0,0), new Point(50,0), new Point(100,0), new Point(150,0), new Point(200,0), new Point(250,0), new Point(300,0), new Point(350,0), new Point(400,0), new Point(450,0), new Point(0,0), new Point(0,50), new Point(0,100), new Point(0,150), new Point(0,200), new Point(0,250), new Point(0,300), new Point(0,350), new Point(0,400), new Point(0,450), new Point(450,0), new Point(450,50), new Point(450,100), new Point(450,150), new Point(450,200), new Point(450,250), new Point(450,300), new Point(450,350), new Point(450,400), new Point(450,450), new Point(0,450), new Point(50,450), new Point(100,450), new Point(150,450), new Point(200,450), new Point(250,450), new Point(300,450), new Point(350,450), new Point(400,450), new Point(450,450), new Point(150,50), new Point(150,100), new Point(150,150), new Point(100,150), new Point(50,250), new Point(100,250), new Point(150,250), new Point(150,300), new Point(250,350), new Point(250,300), new Point(250,250), new Point(300,250), new Point(350,150), new Point(300,150), new Point(250,150), new Point(250,100), new Point(250,50), new Point(200,50), new Point(350,350), new Point(350,400), new Point(50,350), new Point(100,400), new Point(50,400), new Point(400,50)};
	static Point[] L3Points = {new Point(0,0), new Point(50,0), new Point(100,0), new Point(150,0), new Point(200,0), new Point(250,0), new Point(300,0), new Point(350,0), new Point(400,0), new Point(450,0), new Point(0,0), new Point(0,50), new Point(0,100), new Point(0,150), new Point(0,200), new Point(0,250), new Point(0,300), new Point(0,350), new Point(0,400), new Point(0,450), new Point(450,0), new Point(450,50), new Point(450,100), new Point(450,150), new Point(450,200), new Point(450,250), new Point(450,300), new Point(450,350), new Point(450,400), new Point(450,450), new Point(0,450), new Point(50,450), new Point(100,450), new Point(150,450), new Point(200,450), new Point(250,450), new Point(300,450), new Point(350,450), new Point(400,450), new Point(450,450), new Point(50,150), new Point(100,150), new Point(150,150), new Point(150,100), new Point(100,100), new Point(250,50), new Point(250,100), new Point(250,150), new Point(250,200), new Point(250,250), new Point(200,250), new Point(150,250), new Point(100,250), new Point(100,300), new Point(100,350), new Point(200,350), new Point(250,350), new Point(300,350), new Point(350,300), new Point(350,250), new Point(350,150), new Point(350,100), new Point(350,50), new Point(400,100), new Point(400,50), new Point(400,150)};
	static Point[] L4Points = {new Point(0,0), new Point(50,0), new Point(100,0), new Point(150,0), new Point(200,0), new Point(250,0), new Point(300,0), new Point(350,0), new Point(400,0), new Point(450,0), new Point(0,0), new Point(0,50), new Point(0,100), new Point(0,150), new Point(0,200), new Point(0,250), new Point(0,300), new Point(0,350), new Point(0,400), new Point(0,450), new Point(450,0), new Point(450,50), new Point(450,100), new Point(450,150), new Point(450,200), new Point(450,250), new Point(450,300), new Point(450,350), new Point(450,400), new Point(450,450), new Point(0,450), new Point(50,450), new Point(100,450), new Point(150,450), new Point(200,450), new Point(250,450), new Point(300,450), new Point(350,450), new Point(400,450), new Point(450,450), new Point(50,150), new Point(100,150), new Point(150,150), new Point(150,100), new Point(300,50), new Point(250,50), new Point(250,150), new Point(250,100), new Point(250,250), new Point(300,150), new Point(50,350), new Point(100,350), new Point(150,350), new Point(100,300), new Point(50,300), new Point(50,250), new Point(300,350), new Point(350,300), new Point(400,300), new Point(400,250), new Point(300,250), new Point(300,300), new Point(350,250), new Point(400,150), new Point(400,100), new Point(350,50), new Point(400,50), new Point(400,200), new Point(50,400), new Point(100,400), new Point(200,400), new Point(150,400)};
	static Point[] L5Points = {new Point(0,0), new Point(50,0), new Point(100,0), new Point(150,0), new Point(200,0), new Point(250,0), new Point(300,0), new Point(350,0), new Point(400,0), new Point(450,0), new Point(0,0), new Point(0,50), new Point(0,100), new Point(0,150), new Point(0,200), new Point(0,250), new Point(0,300), new Point(0,350), new Point(0,400), new Point(0,450), new Point(450,0), new Point(450,50), new Point(450,100), new Point(450,150), new Point(450,200), new Point(450,250), new Point(450,300), new Point(450,350), new Point(450,400), new Point(450,450), new Point(0,450), new Point(50,450), new Point(100,450), new Point(150,450), new Point(200,450), new Point(250,450), new Point(300,450), new Point(350,450), new Point(400,450), new Point(450,450), new Point(50,100), new Point(100,150), new Point(150,200), new Point(200,250), new Point(250,300), new Point(300,350), new Point(350,400), new Point(400,300), new Point(350,250), new Point(300,200), new Point(250,150), new Point(200,100), new Point(150,50), new Point(400,200), new Point(350,150), new Point(300,100), new Point(250,50), new Point(350,50), new Point(400,100), new Point(250,400), new Point(200,350), new Point(150,300), new Point(50,200), new Point(100,250), new Point(50,300), new Point(100,350), new Point(150,400), new Point(50,400)};
	static JFrame frame = new JFrame("Maze Game");
	
	public static boolean isColliding(int x, int y) {
		
		for(int i = 0; i < 150 ; i++) {
			if(buttons[i] != null) {
				JButton thisbtn = buttons[i];
				if(thisbtn.getLocation().x == x && thisbtn.getLocation().y == y) {
					return true;
				}
			}
			
		}
		return false;
		
	}
	
	public static boolean isWinning(int x, int y) {
		
		if(winbtn.getLocation().x == x && winbtn.getLocation().y == y) {
			return true;
		}
		return false;
		
	}
	
	public static void createPlr(JFrame frame) {
	   JButton button = new JButton("");
 	   button.setBounds(50, 50, 50, 50);
	   button.setBackground(Color.green);
	   frame.getContentPane().add(button); // Adds Button to content pane of frame
	   
	   plrobj = button;
		
	}
	
	public static void clearBtns() {
		for(int i = 0; i < buttons.length; i++) {
			if(buttons[i] != null) {
				JButton thisbtn = buttons[i];
				frame.remove(thisbtn);
				buttons[i] = null;
				
			}
		}
		
		for (int i = 50; i <= 400; i = i + 50) {
			int b = 50;
			plrobj.setBounds(i, b, 50, 50);
			b = b + 50;
			
		}
		plrobj.setBounds(50,50,50,50);
	}
	
	public static void win() {
		System.out.println("Winner");
		clearBtns();
		if (levelnum == 1) {
			L2();
		}else if(levelnum == 2) {
			L3();
		}else if(levelnum == 3){
			L4();
		}else if(levelnum == 4){
			L5();
		}else {
			L5();
		}
		
		
	}
	
	public static void moveUp() {
		if(isColliding(plrobj.getBounds().x, plrobj.getBounds().y-50) == false) {
			
			if(isWinning(plrobj.getBounds().x, plrobj.getBounds().y-50) == false){
				plrobj.setBounds(plrobj.getBounds().x, plrobj.getBounds().y-50, 50, 50);
			}else {
				plrobj.setBounds(plrobj.getBounds().x, plrobj.getBounds().y-50, 50, 50);
				win();
			}
			
		}
		
	}
	public static void moveDown() {
		if(isColliding(plrobj.getBounds().x, plrobj.getBounds().y+50) == false) {
			if(isWinning(plrobj.getBounds().x, plrobj.getBounds().y+50) == false){
				plrobj.setBounds(plrobj.getBounds().x, plrobj.getBounds().y+50, 50, 50);
			}else {
				plrobj.setBounds(plrobj.getBounds().x, plrobj.getBounds().y+50, 50, 50);
				win();
			}
			
		}
		
	}
	public static void moveLeft() {
		if(isColliding(plrobj.getBounds().x-50, plrobj.getBounds().y) == false) {
			if(isWinning(plrobj.getBounds().x-50, plrobj.getBounds().y) == false){
				plrobj.setBounds(plrobj.getBounds().x-50, plrobj.getBounds().y, 50, 50);
			}else {
				plrobj.setBounds(plrobj.getBounds().x-50, plrobj.getBounds().y, 50, 50);
				win();
			}
		}
		
	}
	public static void moveRight() {
		if(isColliding(plrobj.getBounds().x+50, plrobj.getBounds().y) == false) {
			if(isWinning(plrobj.getBounds().x+50, plrobj.getBounds().y) == false){
				plrobj.setBounds(plrobj.getBounds().x+50, plrobj.getBounds().y, 50, 50);
			}else {
				plrobj.setBounds(plrobj.getBounds().x+50, plrobj.getBounds().y, 50, 50);
				win();
			}
		}
		
	}
	
	public static void L3() {
		 int curIndex = 0;
		 levelnum = 3;
		 for (int i = 0; i < L3Points.length; i++) {
			 if (L3Points[i] != null) {
				 int x = L3Points[i].x;
				 int y = L3Points[i].y;
				 JButton button = new JButton("");
		    	  button.setBounds(x,y, 50, 50);
			      button.setBackground(Color.darkGray);
			      frame.getContentPane().add(button); // Adds Button to content pane of frame
			      buttons[curIndex] = button;
			      curIndex++;
			 }
		 }
	      
	     
	       
	       
	}
	public static void L4() {
		 int curIndex = 0;
		 levelnum = 4;
		 for (int i = 0; i < L4Points.length; i++) {
			 if (L4Points[i] != null) {
				 int x = L4Points[i].x;
				 int y = L4Points[i].y;
				 JButton button = new JButton("");
		    	  button.setBounds(x,y, 50, 50);
			      button.setBackground(Color.darkGray);
			      frame.getContentPane().add(button); // Adds Button to content pane of frame
			      buttons[curIndex] = button;
			      curIndex++;
			 }
		 }
	      
	     
	       
	       
	}
	public static void L5() {
		 int curIndex = 0;
		 levelnum = 5;
		 for (int i = 0; i < L5Points.length; i++) {
			 if (L5Points[i] != null) {
				 int x = L5Points[i].x;
				 int y = L5Points[i].y;
				 JButton button = new JButton("");
		    	  button.setBounds(x,y, 50, 50);
			      button.setBackground(Color.darkGray);
			      frame.getContentPane().add(button); // Adds Button to content pane of frame
			      buttons[curIndex] = button;
			      curIndex++;
			 }
		 }
	      
	     
	       
	       
	}
	public static void L2() {
		 int curIndex = 0;
		 levelnum = 2;
		 for (int i = 0; i < L2Points.length; i++) {
			 if (L2Points[i] != null) {
				 int x = L2Points[i].x;
				 int y = L2Points[i].y;
				 JButton button = new JButton("");
		    	  button.setBounds(x,y, 50, 50);
			      button.setBackground(Color.darkGray);
			      frame.getContentPane().add(button); // Adds Button to content pane of frame
			      buttons[curIndex] = button;
			      curIndex++;
			 }
		 }
	      
	     
	       
	       
	}
	
	
	
	public static void L1(){
		 int curIndex = 0;
		 	levelnum = 1;
		 	
	      
	       //Win Point
	       JButton button2 = new JButton("");
	       button2.setBounds(400, 400, 50, 50);
	       button2.setBackground(Color.red);
	       frame.getContentPane().add(button2); // Adds Button to content pane of frame
	       winbtn = button2;
	       
	       for (int i = 0; i < L1Points.length; i++) {
				 if (L1Points[i] != null) {
					 int x = L1Points[i].x;
					 int y = L1Points[i].y;
					 JButton button = new JButton("");
			    	  button.setBounds(x,y, 50, 50);
				      button.setBackground(Color.darkGray);
				      frame.getContentPane().add(button); // Adds Button to content pane of frame
				      buttons[curIndex] = button;
				      curIndex++;
				 }
			 }
	       
	       
	       
	       
	       createPlr(frame);
	       
	       frame.setVisible(true);
	}
	
	public static void ui() {
		
		 
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(800,540);
	       
	       frame.setLayout(null);
	       frame.setResizable(false);
	       
	       JButton upBtn = new JButton();
	       upBtn.setText("^");
	       upBtn.setBounds(600, 80, 50, 50);
	       frame.getContentPane().add(upBtn);
	       upBtn.addActionListener(new ActionListener() {
	    	   @Override
	            public void actionPerformed(ActionEvent e) {
	               moveUp();
	            }
	       });
	       JButton downBtn = new JButton();
	       downBtn.setText("v");
	       downBtn.setBounds(600, 160, 50, 50);
	       frame.getContentPane().add(downBtn);
	       downBtn.addActionListener(new ActionListener() {
	    	   @Override
	            public void actionPerformed(ActionEvent e) {
	               moveDown();
	            }
	       });
	       JButton leftBtn = new JButton();
	       leftBtn.setText("<");
	       leftBtn.setBounds(530, 120, 50, 50);
	       frame.getContentPane().add(leftBtn);
	       leftBtn.addActionListener(new ActionListener() {
	    	   @Override
	            public void actionPerformed(ActionEvent e) {
	               moveLeft();
	            }
	       });
	       JButton rightBtn = new JButton();
	       rightBtn.setText(">");
	       rightBtn.setBounds(670, 120, 50, 50);
	       frame.getContentPane().add(rightBtn);
	       rightBtn.addActionListener(new ActionListener() {
	    	   @Override
	            public void actionPerformed(ActionEvent e) {
	               moveRight();
	            }
	       });
	       
	       L1();
	      
	}

	public static void makeMenu() {
		JFrame f = new JFrame("Maze Game | Main Menu");
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(800,540);
		f.setResizable(false);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setLocation(((int)d.getWidth()-800)/2, ((int)d.getHeight()-540)/2);
		
		JLabel l = new JLabel("Welcome to my Maze Game");
		int width = (int)f.getWidth();
		l.setBounds(0, 0, width-10, 50);
		l.setFont(new Font("Calibri",Font.PLAIN,24));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		f.add(l);
		
		JButton b = new JButton("Start");
		b.setBounds((width-210)/2,150, 200, 50);
		f.add(b);
		JButton b2 = new JButton("Create Maze");
		b2.setBounds((width-210)/2,220, 200, 50);
		f.add(b2);
		JButton b3 = new JButton("Exit");
		b3.setBounds((width-210)/2,290, 200, 50);
		f.add(b3);
		
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				ui();
			}
		});
		
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				MazeCreatorDev mc = new MazeCreatorDev();
				mc.mazeCreatorInit();
			}
		});
		
		b3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
			}
		});
		
	}
	
	public static void splash() {
		/* JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(400,250);
	       
	       frame.setLayout(null);
	       frame.setResizable(false);
	       
	       JLabel lbl = new JLabel("Maze Game");
	       lbl.setBounds(0, 0, 400, 200);
	       lbl.setFont(new Font("Calibri",Font.BOLD,50));
	       lbl.setVerticalTextPosition(SwingConstants.CENTER);
	       lbl.setHorizontalTextPosition(SwingConstants.CENTER);
	       lbl.setHorizontalAlignment(SwingConstants.CENTER);
	       lbl.setVerticalAlignment(SwingConstants.CENTER);
	       frame.getContentPane().add(lbl);
	       frame.setVisible(true);
		 */
		 JWindow j=new JWindow();

	     Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	     j.setLayout(null);
	     j.setBounds(((int)d.getWidth()-722)/2,((int)d.getHeight()-401)/2,722,401);
	     JLabel label = new JLabel();
	     label.setSize(200,250);
	     label.setText("Maze Game");
	     label.setFont(new Font("Calibri",Font.BOLD,50));
	     label.setHorizontalAlignment(SwingConstants.CENTER);
	     label.setBounds(0, 0, j.getWidth(), label.getHeight());
	     JLabel label2 = new JLabel();
	     label2.setHorizontalAlignment(SwingConstants.CENTER);
	     label2.setSize(j.getWidth() ,150);
	     label2.setBounds(0, 100, j.getWidth(), label.getHeight());
	     label2.setText("Joshua Roberts Endersby");
	     label2.setFont(new Font("Calibri",Font.BOLD,20));
	     j.getContentPane().add(label2);
	     JProgressBar progressBar = new JProgressBar();
	     progressBar.setVisible(true);
	    
	     j.getContentPane().add(progressBar);
	     
	     j.getContentPane().add(label);
	     
	     progressBar.setBounds(0, j.getBounds().height-50, j.getBounds().width, 20);
	     
	    
	     
	     j.setVisible(true);
	     for (int i = 0; i <= 100; i++) {
	    	 progressBar.setValue(i);
	    	 try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	     
	     j.setVisible(false);
	     makeMenu();
	}
	
	
	
	public static void main(String[] args) {
		isMazeCreation = false;
		isDevMode = true;
		if (isDevMode == false) {
			splash();
		}else if (isDevMode == true && isMazeCreation == false) {
			
			makeMenu();
		}else {
			MazeCreatorDev mc = new MazeCreatorDev();
			mc.mazeCreatorInit();
		}
		
		

	}
	
}





//Programmed by Joshua Roberts Endersby