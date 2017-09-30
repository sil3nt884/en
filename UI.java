import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings({ "serial", "unused" })
public class UI extends JFrame {

	public UI () {
		JFrame frame=new JFrame();
		frame.setSize(400,250);
		frame.setVisible(true);
		frame.setTitle("Mans not hot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton a=new JButton("Encrypt");
		JButton b=new JButton("Decrypt");
		a.setBounds(50,50,90, 50);
		b.setBounds(50,50,90, 50); 
		frame.add(a);
		frame.add(b);
		
	}
	
	public static void main(String[] args) {
	new UI();
	

}
}
