import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame extends JFrame{
	JPanel input;
	JPanel output;
	JPanel inputButtonPanel;
	JPanel outputButtonPanel;
	
	ButtonGroup inputButtons;
	ButtonGroup outputButtons;
	
	JRadioButton englishInp;
	JRadioButton spanishInp;
	JRadioButton frenchInp;
	JRadioButton germanInp;
	JRadioButton russianInp;
	
	JRadioButton englishOut;
	JRadioButton spanishOut;
	JRadioButton frenchOut;
	JRadioButton germanOut;
	JRadioButton russianOut;
	
	JButton translate;
	
	JTextField inputText;
	JTextField outputText;
	public Frame() {
		// TODO Auto-generated constructor stus
		input = new JPanel();
		output = new JPanel();
		inputButtonPanel = new JPanel();
		outputButtonPanel = new JPanel();
		inputText = new JTextField(10);
		outputText = new JTextField(10);
		inputButtons = new ButtonGroup();
		outputButtons = new ButtonGroup();
		englishInp = new JRadioButton("English");
		spanishInp = new JRadioButton("Spanish");
		frenchInp = new JRadioButton("French");
		germanInp = new JRadioButton("German");
		russianInp = new JRadioButton("Russian");
		
		englishOut = new JRadioButton("English");
		spanishOut = new JRadioButton("Spanish");
		frenchOut = new JRadioButton("French");
		germanOut = new JRadioButton("German");
		russianOut = new JRadioButton("Russian");
		
		translate = new JButton("Translate");
		
		
		inputButtons.add(englishInp);
		inputButtons.add(spanishInp);
		inputButtons.add(frenchInp);
		inputButtons.add(germanInp);
		inputButtons.add(russianInp);
		
		outputButtons.add(englishOut);
		outputButtons.add(spanishOut);
		outputButtons.add(frenchOut);
		outputButtons.add(germanOut);
		outputButtons.add(russianOut);
		
		outputText.setEditable(false);
		
		GridLayout myLayout = new GridLayout(1,2);
		
		inputButtonPanel.setLayout(new GridLayout(1,4));
		outputButtonPanel.setLayout(new GridLayout(1,4));
		
		inputButtonPanel.add(englishInp);
		inputButtonPanel.add(spanishInp);
		inputButtonPanel.add(frenchInp);
		inputButtonPanel.add(germanInp);
		inputButtonPanel.add(russianInp);
		
		outputButtonPanel.add(englishOut);
		outputButtonPanel.add(spanishOut);
		outputButtonPanel.add(frenchOut);
		outputButtonPanel.add(germanOut);
		outputButtonPanel.add(russianOut);
		
		input.add(inputButtonPanel);
		input.add(inputText);
		
		output.add(outputButtonPanel);
		output.add(outputText);
		
		input.setLayout(new GridLayout(4,1));
		output.setLayout(new GridLayout(4,1));
		this.setLayout(myLayout);
		this.add(input);
		this.add(output);
		this.add(translate, BorderLayout.CENTER);
		
		pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
