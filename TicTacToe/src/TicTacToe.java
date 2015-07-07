import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe {

	private JFrame frame;
	private String m_previousMove = null;
	private JButton[][] m_allButtons= new JButton[3][3];
	private static String s_x ="X";
	private static String s_o="O";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
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
		
		JButton btnNewButton1 = new JButton("");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton1.setBounds(55, 0, 99, 72);
		frame.getContentPane().add(btnNewButton1);
		m_allButtons[0][0]=btnNewButton1;
		
		
		JButton btnNewButton2 = new JButton("");
		btnNewButton2.setBounds(164, 0, 89, 72);
		frame.getContentPane().add(btnNewButton2);
		m_allButtons[0][1]=btnNewButton2;
		
		JButton btnNewButton3 = new JButton("");
		btnNewButton3.setBounds(263, 0, 89, 72);
		frame.getContentPane().add(btnNewButton3);
		m_allButtons[0][2]=btnNewButton3;
		
		JButton btnNewButton4 = new JButton("");
		btnNewButton4.setBounds(55, 72, 99, 90);
		frame.getContentPane().add(btnNewButton4);
		m_allButtons[1][0]=btnNewButton4;
		
		JButton btnNewButton5 = new JButton("");
		btnNewButton5.setBounds(164, 72, 89, 90);
		frame.getContentPane().add(btnNewButton5);
		m_allButtons[1][1]=btnNewButton5;
		
		JButton btnNewButton6 = new JButton("");
		btnNewButton6.setBounds(263, 72, 89, 90);
		frame.getContentPane().add(btnNewButton6);
		m_allButtons[1][2]=btnNewButton6;
		
		JButton btnNewButton7 = new JButton("");
		btnNewButton7.setBounds(55, 160, 99, 90);
		frame.getContentPane().add(btnNewButton7);
		m_allButtons[2][0]=btnNewButton7;
		
		JButton btnNewButton8 = new JButton("");
		btnNewButton8.setBounds(164, 160, 89, 90);
		frame.getContentPane().add(btnNewButton8);
		m_allButtons[2][1]=btnNewButton8;
		
		JButton btnNewButton9 = new JButton("");
		btnNewButton9.setBounds(263, 160, 89, 90);
		frame.getContentPane().add(btnNewButton9);
		m_allButtons[2][2]=btnNewButton9;
		AddAllEventHandlers();
	}
	private void ChangeButtonText(JButton button)
	{
		if (m_previousMove != null)
		{
			if(m_previousMove.equals(s_o))
			{
				button.setText(s_x);
				button.setEnabled(false);
				m_previousMove = s_x;
			}
			else if (m_previousMove.equals(s_x))
			{
				button.setText(s_o);
				button.setEnabled(false);
				m_previousMove = s_o;
			}
		}
		else
		{
			button.setText(s_x);
			button.setEnabled(false);
			m_previousMove = s_x;
		}
	}
private void DisableAllButtons()
{
	if(m_allButtons !=null)
	{
		for (int i= 0; i<3; i++)
		{
			for(int j =0; j <3; j++)
			{
				m_allButtons[i][j].setEnabled(false);
			}
		}
	}
}
private void CheckGameWinner()
{
	if(m_allButtons != null)
	{
		for(int i=0; i<3; i++)
		{
			String one = m_allButtons[i][0].getText();
			String two = m_allButtons[i][1].getText();
			String three = m_allButtons[i][2].getText();
			
			boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
			
			if(! empty)
			{
				boolean same = (one==two) && (two==three);
				
				if(same)
				{
					m_allButtons[i][0].setBackground(Color.WHITE);
					m_allButtons[i][1].setBackground(Color.WHITE);
					m_allButtons[i][2].setBackground(Color.WHITE);
					DisableAllButtons();
				}
			}
			
		}
		for(int i=0; i<3; i++)
		{
			String one = m_allButtons[0][i].getText();
			String two = m_allButtons[1][i].getText();
			String three = m_allButtons[2][i].getText();
			
			boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();
			
			if(! empty)
			{
				boolean same = (one==two) && (two==three);
				
				if(same)
				{
					m_allButtons[0][i].setBackground(Color.WHITE);
					m_allButtons[1][i].setBackground(Color.WHITE);
					m_allButtons[2][i].setBackground(Color.WHITE);
					DisableAllButtons();
				}
			}
			
		}
	String one = m_allButtons[0][0].getText();
	String two = m_allButtons[1][1].getText();
	String three = m_allButtons[2][2].getText();
	
	boolean diagonalOneEmpty =  one.isEmpty() || two.isEmpty() || three.isEmpty();
	
	if(! diagonalOneEmpty)
	{

		boolean diagonalOneSame = (one==two) && (two==three);
		
		if(diagonalOneSame)
		{
			m_allButtons[0][0].setBackground(Color.WHITE);
			m_allButtons[1][1].setBackground(Color.WHITE);
			m_allButtons[2][2].setBackground(Color.WHITE);
			DisableAllButtons();
		}
	}
	
	}
	String four = m_allButtons[2][0].getText();
	String five = m_allButtons[1][0].getText();
	String six = m_allButtons[0][2].getText();

boolean diagonalTwoEmpty =  four.isEmpty() || five.isEmpty() || six.isEmpty();

if(! diagonalTwoEmpty)
{

	boolean diagonalOneSame = (four==five) && (five==six);
	
	if(diagonalOneSame)
	{
		m_allButtons[0][0].setBackground(Color.WHITE);
		m_allButtons[1][1].setBackground(Color.WHITE);
		m_allButtons[2][2].setBackground(Color.WHITE);
		DisableAllButtons();
	}
}
}

private void AddAllEventHandlers()
{
	for(int i =0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			JButton currentButton = m_allButtons[i][j];
			m_allButtons [i][j].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					ChangeButtonText(currentButton);
					currentButton.setEnabled(false);
					CheckGameWinner();
				}

			});
		}
	}
}
}