package org.FirstDemo;
import javax.swing.*;

import java.awt.event.*;

public class Calc implements ActionListener {
	JFrame frame, frame1;
	JTextField answerField;

	JButton button1, button2, button3, button4, button5, button6, button7,
			button8, button9, button0, buttonDivide, buttonMultiply,
			buttonSubtract, buttonAdd, buttonDecimal, buttonEquals,
			buttonDelete, buttonClear;
	
	static double a, b, result;

	static int operator = 0;

	public Calc() {
		frame = new JFrame("Calculator");
		answerField = new JTextField();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonDivide = new JButton("/");
		buttonMultiply = new JButton("*");
		buttonSubtract = new JButton("-");
		buttonAdd = new JButton("+");
		buttonDecimal = new JButton(".");
		buttonEquals = new JButton("=");
		buttonDelete = new JButton("Delete");
		buttonClear = new JButton("Clear");

		answerField.setBounds(30, 40, 280, 30);
		button7.setBounds(40, 100, 50, 40);
		button8.setBounds(110, 100, 50, 40);
		button9.setBounds(180, 100, 50, 40);
		buttonDivide.setBounds(250, 100, 50, 40);

		button4.setBounds(40, 170, 50, 40);
		button5.setBounds(110, 170, 50, 40);
		button6.setBounds(180, 170, 50, 40);
		buttonMultiply.setBounds(250, 170, 50, 40);

		button1.setBounds(40, 240, 50, 40);
		button2.setBounds(110, 240, 50, 40);
		button3.setBounds(180, 240, 50, 40);
		buttonSubtract.setBounds(250, 240, 50, 40);

		buttonDecimal.setBounds(40, 310, 50, 40);
		button0.setBounds(110, 310, 50, 40);
		buttonEquals.setBounds(180, 310, 50, 40);
		buttonAdd.setBounds(250, 310, 50, 40);

		buttonDelete.setBounds(60, 380, 100, 40);
		buttonClear.setBounds(180, 380, 100, 40);

		frame.add(answerField);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(buttonDivide);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(buttonMultiply);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(buttonSubtract);
		frame.add(buttonDecimal);
		frame.add(button0);
		frame.add(buttonEquals);
		frame.add(buttonAdd);
		frame.add(buttonDelete);
		frame.add(buttonClear);

		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonMultiply.addActionListener(this);
		buttonSubtract.addActionListener(this);
		buttonDecimal.addActionListener(this);
		buttonEquals.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonClear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (frame1 != null) {
			frame1.invalidate();
			frame1.dispose();
			frame1 = null;
			answerField.setText("");
		}
		if (e.getSource() == button1)
			answerField.setText(answerField.getText().concat("1"));

		if (e.getSource() == button2)
			answerField.setText(answerField.getText().concat("2"));

		if (e.getSource() == button3)
			answerField.setText(answerField.getText().concat("3"));

		if (e.getSource() == button4)
			answerField.setText(answerField.getText().concat("4"));

		if (e.getSource() == button5)
			answerField.setText(answerField.getText().concat("5"));

		if (e.getSource() == button6)
			answerField.setText(answerField.getText().concat("6"));

		if (e.getSource() == button7)
			answerField.setText(answerField.getText().concat("7"));

		if (e.getSource() == button8)
			answerField.setText(answerField.getText().concat("8"));

		if (e.getSource() == button9)
			answerField.setText(answerField.getText().concat("9"));

		if (e.getSource() == button0)
			answerField.setText(answerField.getText().concat("0"));

		if (e.getSource() == buttonDecimal)
			answerField.setText(answerField.getText().concat("."));

		if (e.getSource() == buttonAdd && !(answerField.getText().isEmpty())) {
			a = Double.parseDouble(answerField.getText());
			operator = 1;
			answerField.setText("");
		}

		if (e.getSource() == buttonSubtract
				&& !(answerField.getText().isEmpty())) {
			a = Double.parseDouble(answerField.getText());
			operator = 2;
			answerField.setText("");
		}

		if (e.getSource() == buttonMultiply
				&& !(answerField.getText().isEmpty())) {
			a = Double.parseDouble(answerField.getText());
			operator = 3;
			answerField.setText("");
		}

		if (e.getSource() == buttonDivide && !(answerField.getText().isEmpty())) {
			a = Double.parseDouble(answerField.getText());
			operator = 4;
			answerField.setText("");
		}

		if (e.getSource() == buttonEquals) 
		{
			if (!(answerField.getText().isEmpty())) 
			{
				b = Double.parseDouble(answerField.getText());
				performCalculation(a, b);
				ImageIcon icon = createImageIcon("./images/happy.jpeg", "");
				
				resultFrame(icon);
				a = 0;
				b = 0;
			} 
			else 
			{
				answerField.setText("Are you drunk ?");
				ImageIcon icon = createImageIcon("./images/sad.png", "");

				resultFrame(icon);
			}
		}

		if (e.getSource() == buttonClear) {
			answerField.setText("");
		}

		if (e.getSource() == buttonDelete) {
			String s = answerField.getText();
			answerField.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				answerField.setText(answerField.getText() + s.charAt(i));
		}
	}

	void resultFrame(ImageIcon icon) {
		JLabel label = new JLabel(icon);
		label.setLayout(answerField.getLayout());

		frame1 = new JFrame();
		frame1.setSize(icon.getIconHeight(), icon.getIconWidth());
		frame1.setResizable(false);
		frame1.getContentPane().add(label);
		frame1.setLocation(frame.getLocationOnScreen().x + -250,
				frame.getLocationOnScreen().y);
		frame1.setVisible(true);
	}

	void performCalculation(double a, double b) {
		switch (operator) {
		case 1:
			result = a + b;
			break;

		case 2:
			result = a - b;
			break;

		case 3:
			result = a * b;
			break;

		case 4:
			result = a / b;
			break;

		default:
			result = 0;
		}

		answerField.setText("" + result);
	}

	private ImageIcon createImageIcon(String path, String description) {
		/** Returns an ImageIcon, or null if the path was invalid. */
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	public static void main(String... s) {
		new Calc();
	}
}