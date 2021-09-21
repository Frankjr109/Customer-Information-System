

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class CreateCustomerGUI extends JFrame {

	private JPanel pnlMain, pnlInput, pnlBtns;
	private JLabel lblFirstname, lblSurname, lblDOB;
	private JTextField txtFirstname, txtSurname, txtDOB;
	private JButton btnSubmit, btnCancel;
	ArrayList<Customer> cust;



	/**
	 * Create the frame.
	 */
	public CreateCustomerGUI( ArrayList<Customer> refCust) {
		cust = refCust;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        lblFirstname = new JLabel("First name:");
        lblSurname = new JLabel("Surname:");
        lblDOB = new JLabel("DOB:");
        
		txtFirstname = new JTextField();
		txtFirstname.setColumns(10);
		txtSurname  = new JTextField();
		txtSurname.setColumns(10);
		txtDOB = new JTextField();
		txtDOB.setColumns(10);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");
		
		pnlMain = new JPanel(new GridLayout(2,1));

		pnlInput = new JPanel(new GridLayout(3,1));
		pnlBtns = new JPanel();
		pnlInput.add(lblFirstname);
		pnlInput.add(txtFirstname);
		pnlInput.add(lblSurname);
		pnlInput.add(txtSurname);
		pnlInput.add(lblDOB);
		pnlInput.add(txtDOB);
		pnlBtns.add(btnSubmit);
		pnlBtns.add(btnCancel);

		pnlMain.add(pnlInput);
		pnlMain.add(pnlBtns);
		add(pnlMain);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Read the data from the text fields
				String name = txtFirstname.getText();
				String surname = txtSurname.getText();
				String dob = txtDOB.getText();
				// Create a customer object using the data
				Customer customer = new Customer(name, surname, dob);
				cust.add(customer);
				dispose();
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstname.setText("");
				txtSurname.setText("");
				txtDOB.setText("");
			}
		});
	}

}
