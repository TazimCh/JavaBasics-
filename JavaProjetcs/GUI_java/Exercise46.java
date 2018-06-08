import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Exercise46 extends JFrame implements MouseListener {
	
	private JPanel Panel;
	private JButton button; 
	
	ArrayList<JButton> buttons = new ArrayList<>();
	

	
	public  Exercise46(){

		this.setTitle("Catching game"); 
		Panel = new JPanel();
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		
		//create layout 
		Panel.setLayout(new GridLayout (3,3));
		Panel.setPreferredSize(new Dimension(300,300));


		for (int i=0; i<9; i++){

			button = new JButton();
			button.addMouseListener(this);
			Panel.add(button);
			buttons.add(button);
		}

		Container p= this.getContentPane();
		p.add(Panel);
		this.pack();
		this.setVisible(true);
		buttons.get(random()).setText("Click Me");
	}


	 int random(){

		return (int)(Math.random()*9);

	}
	
	public static void main (String[] args){


		new Exercise46(); 

	}



	public void mouseEntered(MouseEvent e){


	button =(JButton) e.getSource();

		while (button.getText()== "Click Me"){

		button.setText("");
		buttons.get(random()).setText("Click Me");

		}

	}

 	





	public void mouseClicked(MouseEvent e){

	}	

	public void mousePressed(MouseEvent e){

	}

	public void mouseReleased(MouseEvent e){

	}

	public void mouseExited(MouseEvent e){

	}
}




















	
		

