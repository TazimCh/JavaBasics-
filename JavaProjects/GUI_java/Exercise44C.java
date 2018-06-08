import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise44C {

	JRadioButton RedBotton;
	JRadioButton GreenBotton;
	JRadioButton BlueBotton;
	JFrame frame; 
	JPanel panel; 

	public void Implementation(){


		frame = new JFrame("Press the botton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		panel = new JPanel();
	 
	// creation of object buttons	
		RedBotton = new JRadioButton("Red");
		GreenBotton = new JRadioButton("Green");
		BlueBotton = new JRadioButton("Blue");

	// sync them togheter 
		ButtonGroup group = new ButtonGroup(); 
		group.add(RedBotton); 
		group.add(GreenBotton); 
		group.add(BlueBotton);

	
	// adding bottoms to panel 
	
		panel.add(RedBotton);
		panel.add(GreenBotton);
		panel.add(BlueBotton);

	// set frame 
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.add(panel);
	
		RedBotton.addActionListener(new ActionListener(){
		
			public void actionPerformed (ActionEvent e){

			panel.setBackground(Color.RED);
				}
			});

		GreenBotton.addActionListener(new ActionListener(){
		
			public void actionPerformed (ActionEvent e){

			panel.setBackground(Color.GREEN);
				}
			});


		BlueBotton.addActionListener(new ActionListener(){
		
			public void actionPerformed (ActionEvent e){

			panel.setBackground(Color.BLUE);
				}
			});



		}


	

	public static void main(String[] args ){

	Exercise44C obj = new Exercise44C();
        obj.Implementation();
	}  



}
