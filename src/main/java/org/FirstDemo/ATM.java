package org.FirstDemo;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ATM implements ActionListener{
	
	JButton depositBtn, withdrawBtn, transferBtn;
	private JFrame frame;	
	private JTextField customerNameValue,accountBalanceValue;
	private JTextField depositAmt, withdrawAmt, transferAmt;

	public static void main(String[] args) {
		new ATM().displayATMWindow();
	}
	
	public void displayATMWindow() {
		
		frame = new JFrame("Children Bank of Jammu");
		JLabel customerName = new JLabel("Customer Name: ");
		JLabel balance = new JLabel("Account Balance: ");
		
		customerNameValue = new JTextField();
		accountBalanceValue = new JTextField();
		depositAmt = new JTextField();
		withdrawAmt = new JTextField();
		transferAmt = new JTextField();
		
		depositBtn = new JButton("Deposit");
		withdrawBtn = new JButton("Withdraw");
		transferBtn = new JButton("Transfer");

		customerName.setBounds(40, 40, 380, 30);
		customerNameValue.setBounds(190, 40, 200, 30);
		balance.setBounds(40, 100, 380, 30);
		accountBalanceValue.setBounds(190, 100, 200, 30);
		
		depositBtn.setBounds(40, 170, 100, 40);
		withdrawBtn.setBounds(190, 170, 100, 40);
		transferBtn.setBounds(340, 170, 100, 40);
		
		depositAmt.setBounds(40, 230, 100, 40);
		withdrawAmt.setBounds(190, 230, 100, 40);
		transferAmt.setBounds(340, 230, 100, 40);

		
		frame.add(customerName);
		frame.add(customerNameValue);
		frame.add(balance);
		frame.add(accountBalanceValue);
		frame.add(depositBtn);
		frame.add(withdrawBtn);
		frame.add(transferBtn);
		frame.add(depositAmt);
		frame.add(withdrawAmt);
		frame.add(transferAmt);
		

		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		depositBtn.addActionListener(this);
		withdrawBtn.addActionListener(this);
		transferBtn.addActionListener(this);
		
	}


//	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(accountBalanceValue.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(new Frame(),"Bhai kuch to izzat rakh !!!");
			accountBalanceValue.setText("");
		}
		else
		{
			double accountBalance = 0.0;
			
			try
			{
				accountBalance = Double.parseDouble(accountBalanceValue.getText());
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(new Frame(),"Mujhe gussa na chadha !!!");
				accountBalanceValue.setText("");
			}
			
			if (e.getActionCommand() == "Deposit") {
				
				depositFuncationality(accountBalance);
			}
			else if (e.getActionCommand() == "Withdraw") {
				withdrawFuncationality(accountBalance);
				
			}
			else if (e.getActionCommand() == "Transfer") {
				transferFunctionality(accountBalance);
			}
			else
			{
				// no implementation
			}
		}
		
	}

	private void transferFunctionality(double accountBalance) {
		// TODO Auto-generated method stub
		
	}

	private void withdrawFuncationality(double accountBalance) {
		// TODO Auto-generated method stub
		
	}

	private void depositFuncationality(double accountBalance) {
		// TODO Auto-generated method stub
		
	}
}
