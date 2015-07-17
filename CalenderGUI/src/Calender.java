import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.GregorianCalendar;


public class Calender 
{

	private DefaultTableModel m_defTblModel = new DefaultTableModel();
	private int m_realMonth = -1;
	private int m_realYear = -1;
	private int m_realDay = -1;
	private int m_currentMonth = -1;
	private int m_currentYear = -1;
	
	//UI components
	private JButton btnPrevButton = null;
	private JButton btnNextButton = null;
	private JFrame frame;
	private JTable tableOfDay;
	private JLabel lblMONTH = null;
	private JLabel lblChangeYear = null;
	private JComboBox comboYear = null;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Calender window = new Calender();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calender() 
	{
//no need for logic to figure out day, import already knows this. this object taps into the import to get the info
		/*setting real date and making it display as the current date in the GUI. Current may display a separate date on calendar
		 * but the real date will remain the same. Current is just what is displayed on the GUI
		 */
		GregorianCalendar cal = new GregorianCalendar(); //Create calendar
		m_realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
		m_realMonth = cal.get(GregorianCalendar.MONTH); //Get month
		m_realYear = cal.get(GregorianCalendar.YEAR); //Get year
		m_currentMonth = m_realMonth; //Match month and year
		m_currentYear = m_realYear;

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 472, 415);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnPrevButton = new JButton("Previous");
		btnPrevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if (m_currentMonth == 0)
					{ //Back one year
						m_currentMonth = 11;
						m_currentYear -= 1;
					}
					else
					{ //Back one month
						m_currentMonth -= 1;
					}

					refreshCalendar(m_currentMonth, m_currentYear);
				}

			
		});
		btnPrevButton.setBounds(10, 29, 73, 23);
		panel.add(btnPrevButton);
	
		lblMONTH = new JLabel("");
		lblMONTH.setBounds(93, 21, 66, 38);
		panel.add(lblMONTH);
		lblMONTH.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNextButton = new JButton("Next");
		btnNextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						if (m_currentMonth == 0)
						{ //Back one year
							m_currentMonth = 11;
							m_currentYear -= 1;
						}
						else
						{ //Back one month
							m_currentMonth -= 1;
						}

						refreshCalendar(m_currentMonth, m_currentYear);
					}

		});
		btnNextButton.setBounds(169, 29, 66, 23);
		panel.add(btnNextButton);
		
		
		
		lblChangeYear = new JLabel("Change Year:");
		lblChangeYear.setBounds(313, 29, 73, 23);
		lblChangeYear.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblChangeYear);
		
		comboYear = new JComboBox();
		for (int i = m_realYear - 100; i <= m_realYear +  100; i++)
		{
			   comboYear.addItem(String.valueOf(i));
		}	
		comboYear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					if (m_currentMonth == 0)
					{ //Back one year
						m_currentMonth = 11;
						m_currentYear -= 1;
					}
					else
					{ //Back one month
						m_currentMonth -= 1;
					}

					refreshCalendar(m_currentMonth, m_currentYear);
				}

		});
		comboYear.setBounds(396, 30, 66, 20);
		panel.add(comboYear);
		
		
		
		//loops dates 100 years before and after the set current year, which is 2015 and displays into the drop box on the GUI
		

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 452, 325);
		panel.add(scrollPane);
		
		tableOfDay = new JTable(m_defTblModel);
		scrollPane.setViewportView(tableOfDay);
		
		String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
		
		for (int i=0; i<7; i++)
		{
		   m_defTblModel.addColumn(headers[i]);
		}
		
		tableOfDay.setColumnSelectionAllowed(true);
		tableOfDay.setRowSelectionAllowed(true);
		tableOfDay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		//Set row/column count
		tableOfDay.setRowHeight(38);
		m_defTblModel.setColumnCount(7);
		m_defTblModel.setRowCount(6);

		tableOfDay.getParent().setBackground(tableOfDay.getBackground());
		
		

		//automatically sets the month label to the current month of the year
		refreshCalendar(m_realMonth, m_realYear);

	}
	
	public void refreshCalendar(int monthIndex, int year)
	{
		String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int numberOfDays= -1;  //Number Of Days
		int startOfMonth = -1; //Start Of Month

		btnPrevButton.setEnabled(true); //Enable buttons at first
		btnNextButton.setEnabled(true);

	
		if ((monthIndex == 0) && (year <= m_realYear - 100))
		{
			//A month before January 1915 cannot be reached
			btnPrevButton.setEnabled(false);
		}

		if ((monthIndex == 11) && (year >= m_realYear + 100))
		{
			//A month after December 2115 cannot be reached
			btnNextButton.setEnabled(false);
		}
		//these set the month from the list that corresponds with the array index that the month list is in
		lblMONTH.setText(monthsList[monthIndex]); //Refresh the month label (at the top)
		comboYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box,
	

		GregorianCalendar cal = new GregorianCalendar(year, monthIndex, 1);
		numberOfDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		startOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);

		//Clear table
		for (int i=0; i<6; i++)
		{
			for (int j=0; j<7; j++)
			{
				m_defTblModel.setValueAt(null, i, j);
			}
		}

		for (int i=1; i<=numberOfDays; i++)
		{
			int row = new Integer((i+startOfMonth-2)/7);
			int column  =  (i+startOfMonth-2)%7;
			m_defTblModel.setValueAt(i, row, column);
		}

	}


		
}
