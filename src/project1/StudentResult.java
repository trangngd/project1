package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentResult {

	private JFrame frame;
	private JPanel panelWelcome;
	private JPanel panelMenu;
	
	private TeacherUser user1;
	private TeacherUser user2;
	private TeacherUser user3;

	
	private JTextField jtxtSID;
	private JTextField jtxtName;
	private JTextField jxtLn;
	private JTextField jtxtRn;
	private JTextField jtxtWn;
	private JTextField jtxtSn;
	private JTextField jtxtTotal;
	private JTextField jtxtAve;
	private JTextField jtxtEva;
	private JTable table_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResult window = new StudentResult();
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
	public StudentResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Create some users
		 
		user1 = new TeacherUser(123, "Sebastian", "King");
		user2 = new TeacherUser(345, "Ilona", "Ronka");
		user3 = new TeacherUser(567, "Tina", "Majuri");
		
				
		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		//First Panel - adding elements, their values and functions
		JPanel panelWelcome = new JPanel();
		frame.getContentPane().add(panelWelcome, "name_23905255523783");
		panelWelcome.setLayout(null);
		panelWelcome.setVisible(true);

		JLabel lblWelcomeToThe = new JLabel("Welcome to the system!");
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Open Sans Light", Font.PLAIN, 32));
		lblWelcomeToThe.setBounds(111, 32, 728, 74);
		panelWelcome.add(lblWelcomeToThe);
		
		//Second panel
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_25215411239751");
		panelMenu.setVisible(false);

		JLabel lblSelectUser = new JLabel("Select your Teacher ID below");
		lblSelectUser.setFont(new Font("Open Sans Light", Font.PLAIN, 14));
		lblSelectUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectUser.setBounds(622, 158, 188, 16);
		panelWelcome.add(lblSelectUser);
		
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		comboBox.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		comboBox.addItem(user1.getUserId());
		comboBox.addItem(user2.getUserId());
		comboBox.addItem(user3.getUserId());
		comboBox.setSelectedItem(null);
		comboBox.setBounds(622, 199, 188, 41);
		panelWelcome.add(comboBox);
		panelMenu.setLayout(null);
		
		//Label Welcome at the top of the new panel
		JLabel lblWelcome = new JLabel("");
		lblWelcome.setBounds(422, 11, 211, 29);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		panelMenu.add(lblWelcome);
		
		//The first panel inside Panel Menu - create elements, adding values
		JPanel panel = new JPanel();
		panel.setBounds(38, 47, 465, 256);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 5), "English Test Record System", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(38, 25, 76, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblStudentName.setBounds(38, 68, 97, 21);
		panel.add(lblStudentName);
		
		JLabel lblClassCode = new JLabel("Class Code");
		lblClassCode.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblClassCode.setBounds(38, 110, 76, 21);
		panel.add(lblClassCode);
		
		JLabel lblListening = new JLabel("Listening");
		lblListening.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblListening.setBounds(252, 25, 76, 21);
		panel.add(lblListening);
		
		JLabel lblReading = new JLabel("Reading");
		lblReading.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblReading.setBounds(252, 68, 76, 21);
		panel.add(lblReading);
		
		JLabel lblWriting = new JLabel("Writing");
		lblWriting.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblWriting.setBounds(252, 110, 76, 21);
		panel.add(lblWriting);
		
		JLabel lblSpeaking = new JLabel("Speaking");
		lblSpeaking.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblSpeaking.setBounds(252, 153, 76, 21);
		panel.add(lblSpeaking);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblTotalScore.setBounds(59, 189, 76, 21);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblAverage.setBounds(220, 189, 76, 21);
		panel.add(lblAverage);
		
		JLabel lblEvaluation = new JLabel("Evaluation");
		lblEvaluation.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		lblEvaluation.setBounds(334, 189, 76, 21);
		panel.add(lblEvaluation);
		
		//Add text field to the record system
		jtxtSID = new JTextField();
		jtxtSID.setBounds(143, 27, 86, 20);
		panel.add(jtxtSID);
		jtxtSID.setColumns(10);
		
		jtxtName = new JTextField();
		jtxtName.setColumns(10);
		jtxtName.setBounds(145, 70, 86, 20);
		panel.add(jtxtName);
		
		//Set value for the scores: only numbers are allowed while typing
		jxtLn = new JTextField();
		jxtLn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}
		});
		jxtLn.setColumns(10);
		jxtLn.setBounds(324, 27, 86, 20);
		panel.add(jxtLn);
		
		jtxtRn = new JTextField();
		jtxtRn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}
		});
		jtxtRn.setColumns(10);
		jtxtRn.setBounds(324, 70, 86, 20);
		panel.add(jtxtRn);
		
		jtxtWn = new JTextField();
		jtxtWn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}
		});
		jtxtWn.setColumns(10);
		jtxtWn.setBounds(324, 112, 86, 20);
		panel.add(jtxtWn);
		
		jtxtSn = new JTextField();
		jtxtSn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}
		});
		jtxtSn.setColumns(10);
		jtxtSn.setBounds(324, 155, 86, 20);
		panel.add(jtxtSn);
		
		//Total Score, Average and Evaluation are calculated automatically while clicking the buttons, which will be shown below
		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(49, 213, 86, 20);
		panel.add(jtxtTotal);
		
		jtxtAve = new JTextField();
		jtxtAve.setColumns(10);
		jtxtAve.setBounds(199, 213, 86, 20);
		panel.add(jtxtAve);
		
		jtxtEva = new JTextField();
		jtxtEva.setColumns(10);
		jtxtEva.setBounds(334, 213, 86, 20);
		panel.add(jtxtEva);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"NIA216SN", "HBA216SN", "HCA216SN", "MEA216SN"}));
		comboBox_1.setBounds(143, 112, 86, 20);
		panel.add(comboBox_1);
		
		//Another Panel inside panel Menu
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(513, 48, 465, 255);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 5), "Student Transcript", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelMenu.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(30, 21, 407, 211);
		panel_1.add(textArea);
		
		//Adding new Scroll Pane and then add a table inside
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 324, 783, 162);
		panelMenu.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"StudentID", "Student Name", "Class Code", "Listening", "Reading", "Writing", "Speaking", "Total Score", "Average", "Evaluation"
			} //create header for each column
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(109);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(57);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(55);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(56);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(59);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(66);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(58);
		scrollPane.setViewportView(table_1);
		
		//Set function for button Add Results
		JButton btnNewButton = new JButton("Add Results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R = new double[10];
				R[0] = Double.parseDouble(jxtLn.getText());
				R[1] = Double.parseDouble(jtxtRn.getText());
				R[2] = Double.parseDouble(jtxtWn.getText());
				R[3] = Double.parseDouble(jtxtSn.getText());
				
				R[4] = R[0] + R[1] + R[2] + R[3]; //calculate Total Score
				R[5] = (R[0] + R[1] + R[2] + R[3])/4; //calculate Average
				
				String TotalScore = String.format("%.0f", R[4]);
				jtxtTotal.setText(TotalScore); //value for Total Score
				
				String Average = String.format("%.0f", R[5]);
				jtxtAve.setText(Average); //value for Average
				
				//how to evaluate each student
				if (R[5] <= 100 && R[5] > 80)
				{ 
					jtxtEva.setText("Excellent");
				}
				else if (R[5] <= 80 && R[5] > 65)
				{
					jtxtEva.setText("Good");
				}
				else if (R[5] <= 65 && R[5] > 50)
				{
					jtxtEva.setText("Satisfactory");
				}
				else if (R[5] <= 50)
				{
					jtxtEva.setText("Fail");
				}
				//Adding the figures in the form to the table
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				 model.addRow(new Object []{
						 jtxtSID.getText(),
						 jtxtName.getText(),
						 comboBox_1.getSelectedItem(),
						 jxtLn.getText(),
						 jtxtRn.getText(),
						 jtxtWn.getText(),
						 jtxtSn.getText(),
						 jtxtTotal.getText(),
						 jtxtAve.getText(),
						 jtxtEva.getText(),
				 });
			}
			
		});
		btnNewButton.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		btnNewButton.setBounds(861, 327, 117, 23);
		panelMenu.add(btnNewButton);
		
		//set function for button Transcript
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//======================
				textArea.append("Student Transcript\n"
						+ "-----------------------\n"
						+ "Student ID:\t\t"+ jtxtSID.getText()
						+ "\nStudent Name:\t\t"+ jtxtName.getText()
						+ "\nClass:\t\t" + comboBox_1.getSelectedItem()
						+ "\n-----------------------"
						+ "\nListening:\t\t" + jxtLn.getText()
						+ "\nReading:\t\t" + jtxtRn.getText()
						+ "\nWriting:\t\t" + jtxtWn.getText()
						+ "\nSpeaking:\t\t" + jtxtSn.getText()
						+ "\n----------------------"
						+ "\nTotalScore:\t\t" + jtxtTotal.getText()
						+ "\nAverage:\t\t" + jtxtAve.getText()
						+ "\nEvaluation:\t\t" + jtxtEva.getText() + "\n"
						);	//putting the figures filled in to the transcript part	
			}
		});
		btnTranscript.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		btnTranscript.setBounds(861, 361, 117, 23);
		panelMenu.add(btnTranscript);
		
		//Set function for button Delete
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//when you clicked on a row and delete, the message dialog will be shown
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
					if(table_1.getSelectedRow()==-1){
						if(table_1.getRowCount()==0){
							JOptionPane.showMessageDialog(null, "No data to delete", "English Test Record System", JOptionPane.OK_OPTION);
						
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "English Test Record System", JOptionPane.OK_OPTION );
					}
			}else{
				model.removeRow(table_1.getSelectedRow());
				
			}
				}
		});
		btnDelete.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		btnDelete.setBounds(861, 395, 117, 23);
		panelMenu.add(btnDelete);
		
		//Set function for button Reset
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()){
					if(c.getClass().toString().contains("javax.swing.JTextField")){
						temp=(JTextField)c;
						temp.setText(null);
					} //all the text field will be set to null
				}
			}
		});
		btnReset.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		btnReset.setBounds(861, 432, 117, 23);
		panelMenu.add(btnReset);
		
		//set function for button Exit
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
					});
		btnExit.setFont(new Font("Open Sans Light", Font.PLAIN, 15));
		btnExit.setBounds(861, 463, 117, 23);
		panelMenu.add(btnExit);
		
		//Adding picture to the Panel Welcome
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/score.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(198, 158, 201, 186);
		panelWelcome.add(lblNewLabel);
		
		//Changing to the panel Menu
		JButton btnClickHereTo = new JButton("Click here to the system");
		btnClickHereTo.setFont(new Font("Open Sans Light", Font.PLAIN, 11));
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelWelcome.setVisible(false);
				panelMenu.setVisible(true);
				int value = (int)comboBox.getSelectedItem();
				switch(value) {
					case 123: 
						lblWelcome.setText("Welcome, " + user1.getFirstname() + " " + user1.getLastname());
						break;
					case 345: 
						lblWelcome.setText("Welcome, " + user2.getFirstname() + " " + user2.getLastname());
						break;
					case 567: 
						lblWelcome.setText("Welcome, " + user3.getFirstname() + " " + user3.getLastname());
						break;
				}//for each user ID, there will be a different label showing at the top of the page
			}
		});
		btnClickHereTo.setBounds(641, 303, 163, 41);
		panelWelcome.add(btnClickHereTo);
		
		

	}
}