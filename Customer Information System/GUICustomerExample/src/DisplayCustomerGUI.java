

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;



public class DisplayCustomerGUI extends JFrame {
	JPanel pnl;
	JLabel lblCustomers;
	JComboBox comboBoxCustomer;
	JButton btnHome;
	
	ArrayList<Customer> cust;
	
	public DisplayCustomerGUI(ArrayList<Customer> refCustList)
	{	cust = refCustList;
		createGUI();
	}
	
	public String[] gatherCustDetails()
	{
		String[] customerNames = new String [cust.size()];
		
			for(int i = 0; i < cust.size(); i++)
			{
				String allCust = "";
				Customer customer = cust.get(i);
				String name = customer.toString();
				customerNames[i] = name;
			}
		return customerNames;
	}
	
    public void createGUI() {

    	pnl = new JPanel();
    	lblCustomers = new JLabel("List of Customers");
    	//comboBoxCustomer = new JComboBox(gatherCustDetails());
    	comboBoxCustomer = new JComboBox(cust.toArray());
    	btnHome = new JButton("Return");
    	pnl.add(lblCustomers);
    	pnl.add(comboBoxCustomer);
    	pnl.add(btnHome);
		add(pnl, BorderLayout.CENTER);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
	}


	public static void main(String[] args) {
		DisplayCustomerGUI displayGUI = new DisplayCustomerGUI(new ArrayList());
		displayGUI.setTitle("Display Customers");
		displayGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayGUI.setSize(300, 300);
		displayGUI.setVisible(true);

	}

}
