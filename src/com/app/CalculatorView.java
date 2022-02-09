package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	enum Operation {
		ADD,MULTIPLY,DIVIDE,SUBTRACT
	}
	private JPanel contentPane;
	private JTextField textField;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton buttonSeven_2_1;
	private JButton subtractButton;
	private JButton equalsButton;
	private JButton divisionButton;
	private JButton multiplicationButton;
	private JButton buttonZero;
	private JButton btnClear;
	protected Double previousNumber=null;
	private JTextField answerField;
	protected Operation operation=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorView frame = new CalculatorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getButtonSeven());
		contentPane.add(getButtonEight());
		contentPane.add(getButtonNine());
		contentPane.add(getButtonFour());
		contentPane.add(getButtonFive());
		contentPane.add(getButtonSix());
		contentPane.add(getButtonOne());
		contentPane.add(getButtonTwo());
		contentPane.add(getButtonThree());
		contentPane.add(getButtonSeven_2_1());
		contentPane.add(getSubtractButton());
		contentPane.add(getEqualsButton());
		contentPane.add(getDivisionButton());
		contentPane.add(getMultiplicationButton());
		contentPane.add(getButtonZero());
		contentPane.add(getBtnClear());
		contentPane.add(getAnswerField());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setBounds(81, 0, 315, 50);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getButtonSeven() {
		if (buttonSeven == null) {
			buttonSeven = new JButton("7");
			buttonSeven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonSeven.getText();
					textField.setText(value);
				}
			});
			buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonSeven.setBounds(0, 68, 70, 70);
		}
		return buttonSeven;
	}
	private JButton getButtonEight() {
		if (buttonEight == null) {
			buttonEight = new JButton("8");
			buttonEight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonEight.getText();
					textField.setText(value);
				}
			});
			buttonEight.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonEight.setBounds(101, 68, 70, 70);
		}
		return buttonEight;
	}
	private JButton getButtonNine() {
		if (buttonNine == null) {
			buttonNine = new JButton("9");
			buttonNine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonNine.getText();
					textField.setText(value);
				}
			});
			buttonNine.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonNine.setBounds(199, 68, 70, 70);
		}
		return buttonNine;
	}
	private JButton getButtonFour() {
		if (buttonFour == null) {
			buttonFour = new JButton("4");
			buttonFour.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonFour.getText();
					textField.setText(value);
				}
			});
			buttonFour.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonFour.setBounds(0, 160, 70, 70);
		}
		return buttonFour;
	}
	private JButton getButtonFive() {
		if (buttonFive == null) {
			buttonFive = new JButton("5");
			buttonFive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonFive.getText();
					textField.setText(value);
				}
			});
			buttonFive.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonFive.setBounds(101, 160, 70, 70);
		}
		return buttonFive;
	}
	private JButton getButtonSix() {
		if (buttonSix == null) {
			buttonSix = new JButton("6");
			buttonSix.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonSix.getText();
					textField.setText(value);
				}
			});
			buttonSix.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonSix.setBounds(199, 160, 70, 70);
		}
		return buttonSix;
	}
	private JButton getButtonOne() {
		if (buttonOne == null) {
			buttonOne = new JButton("1");
			buttonOne.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonOne.getText();
					textField.setText(value);
				}
			});
			buttonOne.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonOne.setBounds(0, 252, 70, 70);
		}
		return buttonOne;
	}
	private JButton getButtonTwo() {
		if (buttonTwo == null) {
			buttonTwo = new JButton("2");
			buttonTwo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonTwo.getText();
					textField.setText(value);
				}
			});
			buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonTwo.setBounds(101, 252, 70, 70);
		}
		return buttonTwo;
	}
	private JButton getButtonThree() {
		if (buttonThree == null) {
			buttonThree = new JButton("3");
			buttonThree.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonThree.getText();
					textField.setText(value);
				}
			});
			buttonThree.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonThree.setBounds(199, 252, 70, 70);
		}
		return buttonThree;
	}
	private JButton getButtonSeven_2_1() {
		if (buttonSeven_2_1 == null) {
			buttonSeven_2_1 = new JButton("+");
			buttonSeven_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double number;
					if(operation == null && previousNumber != null) {
						number = previousNumber;
						previousNumber = null;
					}
					else
						number = Double.parseDouble(textField.getText());
					calculation(number,Operation.ADD);
				}
			});
			buttonSeven_2_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
			buttonSeven_2_1.setBounds(293, 68, 40, 40);
		}
		return buttonSeven_2_1;
	}
	private JButton getSubtractButton() {
		if (subtractButton == null) {
			subtractButton = new JButton("-");
			subtractButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double number;
					if(operation == null && previousNumber != null) {
						number = previousNumber;
						previousNumber = null;
					}
					else
						number = Double.parseDouble(textField.getText());
					calculation(number,Operation.SUBTRACT);
				}
			});
			subtractButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			subtractButton.setBounds(356, 68, 40, 40);
		}
		return subtractButton;
	}
	private JButton getEqualsButton() {
		if (equalsButton == null) {
			equalsButton = new JButton("=");
			equalsButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation();
				}
			});
			equalsButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
			equalsButton.setBounds(356, 190, 40, 40);
		}
		return equalsButton;
	}
	private JButton getDivisionButton() {
		if (divisionButton == null) {
			divisionButton = new JButton("/");
			divisionButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double number;
					if(operation == null && previousNumber != null) {
						number = previousNumber;
						previousNumber = null;
					}
					else
						number = Double.parseDouble(textField.getText());
					calculation(number,Operation.DIVIDE);
				}
			});
			divisionButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			divisionButton.setBounds(293, 127, 40, 40);
		}
		return divisionButton;
	}
	private JButton getMultiplicationButton() {
		if (multiplicationButton == null) {
			multiplicationButton = new JButton("x");
			multiplicationButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double number;
					if(operation == null && previousNumber != null) {
						number = previousNumber;
						previousNumber = null;
					}
					else
						number = Double.parseDouble(textField.getText());
					calculation(number,Operation.MULTIPLY);
				}
			});
			multiplicationButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
			multiplicationButton.setBounds(356, 127, 40, 40);
		}
		return multiplicationButton;
	}
	private JButton getButtonZero() {
		if (buttonZero == null) {
			buttonZero = new JButton("0");
			buttonZero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(operation == null)
						previousNumber = null;
					String value = textField.getText();
					value += buttonZero.getText();
					textField.setText(value);
				}
			});
			buttonZero.setFont(new Font("Tahoma", Font.BOLD, 22));
			buttonZero.setBounds(305, 252, 70, 70);
		}
		return buttonZero;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText("");
					answerField.setText("");
					previousNumber = null;
				}
			});
			btnClear.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnClear.setBounds(293, 189, 40, 40);
		}
		return btnClear;
	}
	private JTextField getAnswerField() {
		if (answerField == null) {
			answerField = new JTextField();
			answerField.setHorizontalAlignment(SwingConstants.RIGHT);
			answerField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			
			answerField.setEnabled(false);
			answerField.setBounds(0, 0, 82, 50);
			answerField.setColumns(10);
		}
		return answerField;
	}
	private void calculation(double number,Operation operation) {
		CalculatorService cs = new CalculatorServiceImpl();
		if(previousNumber == null && this.operation == null){
			previousNumber = number ;
		}
		else {
			switch(this.operation) {
			case ADD:
				previousNumber = cs.add(previousNumber, number);
				break;
			case DIVIDE:
				previousNumber = cs.division(previousNumber, number);
				break;
			case MULTIPLY:
				previousNumber = cs.multiplication(previousNumber, number);
				break;
			case SUBTRACT:
				previousNumber = cs.subtract(previousNumber, number);
				break;
			default:
				break;
				
			}
		}
		this.operation = operation;
		textField.setText("");
		answerField.setText(previousNumber.toString());
	}
	private void calculation() {
		calculation(Double.parseDouble(textField.getText()),null);
		textField.setText(previousNumber.toString());
	}
	
}
