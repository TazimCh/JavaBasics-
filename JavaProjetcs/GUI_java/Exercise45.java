import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercise45 {
	
	JButton Botton0;
	JButton Botton1;
	JButton Botton2;
	JButton Botton3;
	JButton Botton4;
	JButton Botton5;
	JButton Botton6;
	JButton Botton7;
	JButton Botton8;
	JButton Botton9;
	JButton BottonDot;
	JButton Clear;
	JTextField typefield;
	String numbers = "";

	JFrame frame; 
	JPanel panel; 
	JPanel panel2;
	

public void Implementation(){


	frame = new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel = new JPanel();
 
// creation of object buttons	
	Botton0 = new JButton("0");
	Botton1 = new JButton("1");
	Botton2 = new JButton("2");
	Botton3 = new JButton("3");
	Botton4 = new JButton("4");
	Botton5 = new JButton("5");
	Botton6 = new JButton("6");
	Botton7 = new JButton("7");
	Botton8 = new JButton("8");
	Botton9 = new JButton("9");
	BottonDot = new JButton(".");
	Clear = new JButton("CE"); 

	
// adding bottoms to panel 
	panel = new JPanel(new GridLayout (4,3)); 
	panel.setSize(200,200);
	panel.add(Botton0);
	panel.add(Botton1);
	panel.add(Botton2);
	panel.add(Botton3);
	panel.add(Botton4);
	panel.add(Botton5);
	panel.add(Botton6);
	panel.add(Botton7);
	panel.add(Botton8);
	panel.add(Botton9);
	panel.add(BottonDot);
	panel.add(Clear);
	
	frame.add(panel);

// panal2 for the text box
	panel2 = new JPanel();
	panel2.setSize(30,30);	
	typefield = new JTextField(20);
	panel2.add(typefield ); //adding text field
	frame.getContentPane().add(BorderLayout.NORTH,panel2); //it adds the panel 2 to the frame 
	
// set frame 
	frame.setSize(300,300);
	frame.setVisible(true);
	


	Botton0.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"0";
		typefield.setText(numbers);
			}
		});

	Botton1.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"1";
		typefield.setText(numbers);
			}
		});
	Botton2.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"2";
		typefield.setText(numbers);
			}
		});
	Botton3.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"3";
		typefield.setText(numbers);
			}
		});
	Botton4.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"4";
		typefield.setText(numbers);
			}
		});
	Botton5.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"5";
		typefield.setText(numbers);
			}
		});
	Botton6.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"6";
		typefield.setText(numbers);
			}
		});
	Botton7.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"7";
		typefield.setText(numbers);
			}
		});
	Botton8.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"8";
		typefield.setText(numbers);
			}
		});
	Botton9.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = numbers +"9";
		typefield.setText(numbers);
			}
		});
	BottonDot.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){
		if (numbers.indexOf(".")==-1){
			numbers = numbers +".";
			typefield.setText(numbers);}
			}
		});
	Clear.addActionListener(new ActionListener(){
		
		public void actionPerformed (ActionEvent e){

		numbers = "";
		typefield.setText(numbers);
			}
		});
	



	}




public static void main(String[] args ){

	Exercise45 obj = new Exercise45();
        obj.Implementation();
	}  


}
