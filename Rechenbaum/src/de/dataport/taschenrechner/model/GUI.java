package de.dataport.taschenrechner.model;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI implements ActionListener {
	private JFrame mainFrame = new JFrame();
	private JPanel rechner = new JPanel();
	
	private static StringBuilder sb = new StringBuilder();
	
	private JButton eins = new JButton("1");
	private JButton zwei = new JButton("2");
	private JButton drei = new JButton("3");
	private JButton vier = new JButton("4");
	private JButton fuenf = new JButton("5");
	private JButton sechs = new JButton("6");
	private JButton sieben = new JButton("7");
	private JButton acht = new JButton("8");
	private JButton neun = new JButton("9");
	private JButton zahlNull = new JButton("0");
	private JButton add = new JButton("+");
	private JButton sub = new JButton("-");
	private JButton mult = new JButton("*");
	private JButton div = new JButton("/");
	private JButton erg = new JButton("=");
	
	private JTextField rechnungFeld = new JTextField();

	public GUI() {
		rechner.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		rechner.setLayout(new GridLayout(0,1));
		eins.addActionListener(this);
		zwei.addActionListener(this);
		drei.addActionListener(this);
		vier.addActionListener(this);
		fuenf.addActionListener(this);
		sechs.addActionListener(this);
		sieben.addActionListener(this);
		acht.addActionListener(this);
		neun.addActionListener(this);
		zahlNull.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		erg.addActionListener(this);
		
		rechner.add(rechnungFeld);
		rechner.add(eins);
		rechner.add(zwei);
		rechner.add(drei);
		rechner.add(vier);
		rechner.add(fuenf);
		rechner.add(sechs);
		rechner.add(sieben);
		rechner.add(acht);
		rechner.add(neun);
		rechner.add(zahlNull);
		rechner.add(add);
		rechner.add(sub);
		rechner.add(mult);
		rechner.add(div);
		rechner.add(erg);
		
		
		
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.add(rechner);
		mainFrame.setTitle("Rechenbaum");
		mainFrame.pack();
		mainFrame.setVisible(true);
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new GUI();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource() == eins) {
			sb.append(1);
			
		}
		if(e.getSource() == zwei) {
			sb.append(2);
			
		}
		if(e.getSource() == drei) {
			sb.append(3);
			
		}
		if(e.getSource() == vier) {
			sb.append(4);
			
		}
		if(e.getSource() == fuenf) {
			sb.append(5);
			
		}
		if(e.getSource() == sechs) {
			sb.append(6);
			
		}
		if(e.getSource() == sieben) {
			sb.append(7);
			
		}
		if(e.getSource() == acht) {
			sb.append(8);
			
		}
		if(e.getSource() == neun) {
			sb.append(9);
			
		}
		if(e.getSource() == zahlNull) {
			sb.append(0);
			
		}
		if(e.getSource() == add) {
			sb.append("+");
			
		}
		if(e.getSource() == sub) {
			sb.append("-");
			
		}
		if(e.getSource() == mult) {
			sb.append("*");
			
		}
		if(e.getSource() == div) {
			sb.append("/");
			
		}
		if(e.getSource() == erg) {
			
		} else {
			rechnungFeld.setText(sb.toString());
		}
		
		
	}

}
