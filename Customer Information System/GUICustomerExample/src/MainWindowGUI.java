

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class MainWindowGUI extends JFrame {
	JPanel pnlCustomers;
	JButton btnCreateCustomer;
	JButton btnShowCustomers;
	ArrayList<Customer> custList;
	
	public MainWindowGUI()
	{	
		createGUI();
	}
	
	
	
    public void createGUI() {
    	custList = new ArrayList<Customer>();
    	pnlCustomers = new JPanel();
    	btnCreateCustomer = new JButton("Create");
    	btnShowCustomers = new JButton("Display All");

    	pnlCustomers.add(btnCreateCustomer);
    	pnlCustomers.add(btnShowCustomers);
		add(pnlCustomers, BorderLayout.CENTER);
		
		btnCreateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateCustomerGUI custframe = new CreateCustomerGUI(custList);
				custframe.setTitle("Customer Details");
				custframe.setSize(400, 300);
				custframe.setVisible(true);
			}
		});
		
		btnShowCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayCustomerGUI custDisplayframe = new DisplayCustomerGUI(custList);
				custDisplayframe.setTitle("Show Customers");
				custDisplayframe.setSize(400, 300);
				custDisplayframe.setVisible(true);
			}
		});
		
		
	}


	public static void main(String[] args) {
		MainWindowGUI mainGUI = new MainWindowGUI();
		mainGUI.setTitle("Main Windiow");
		mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGUI.setSize(400, 300);
		mainGUI.setVisible(true);

	}

}
