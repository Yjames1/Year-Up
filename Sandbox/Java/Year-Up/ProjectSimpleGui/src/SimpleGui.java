import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SimpleGui {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private static String s_whoAreYou;
	private static String s_clearMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGui window = new SimpleGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("My name is");
		nameLabel.setBounds(34, 40, 64, 28);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(119, 44, 134, 20);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel ageLabel = new JLabel("I am");
		ageLabel.setBounds(78, 108, 46, 14);
		frame.getContentPane().add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(119, 105, 134, 20);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel studentLabel = new JLabel("I am a student of Year-Up!");
		studentLabel.setBounds(119, 178, 140, 14);
		frame.getContentPane().add(studentLabel);
		
		JButton buttonOfWho = new JButton("Who are you?");
		buttonOfWho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(buttonOfWho.getText().equals(s_whoAreYou))
				{
					nameTextField.setText("Yoshua James");
					ageTextField.setText("20");
					buttonOfWho.setText(s_clearMe);
				}
				else if(buttonOfWho.getText().equals(s_clearMe))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					buttonOfWho.setText("Who are you?");	
				}
			}
		});
		buttonOfWho.setBounds(92, 198, 200, 50);
		frame.getContentPane().add(buttonOfWho);
	}
}
