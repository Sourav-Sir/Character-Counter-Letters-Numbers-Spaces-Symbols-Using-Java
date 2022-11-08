
// import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class Jframe implements ActionListener {
	JTextArea t1 = new JTextArea();
	JScrollPane scrollV = new JScrollPane(t1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JLabel l10 = new JLabel();
	JLabel l11 = new JLabel();

	Jframe() {
		// Creating the JFrame
		JFrame f = new JFrame("CHARACTERS COUNTER");

		// creating the Labels
		JLabel l1 = new JLabel("Characters Counter");
		JLabel l2 = new JLabel("Enter you Characters (Sentence): ");
		JLabel l3 = new JLabel("RESULTS");
		JLabel l4 = new JLabel("Letters: ");
		JLabel l5 = new JLabel("Numbers: ");
		JLabel l6 = new JLabel("Spaces: ");
		JLabel l7 = new JLabel("Symbols: ");

		// Creating the TextFields

		// Creating the buttons
		JButton b1 = new JButton("Count");

		// Setting the bounds
		l2.setBounds(20, 40, 250, 25);
		l3.setBounds(20, 160, 250, 25);
		l4.setBounds(20, 200, 60, 25);
		l5.setBounds(20, 240, 60, 25);
		l6.setBounds(20, 280, 60, 25);
		l7.setBounds(20, 320, 60, 25);
		l8.setBounds(120, 200, 60, 25);
		l9.setBounds(120, 240, 60, 25);
		l10.setBounds(120, 280, 60, 25);
		l11.setBounds(120, 320, 60, 25);
		scrollV.setBounds(220, 45, 200, 100);
		b1.setBounds(220, 150, 80, 25);

		b1.addActionListener(this);

		// // Adding the JFrames
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		t1.setLineWrap(true);
		f.add(scrollV);
		f.add(b1);
		f.setLayout(null);
		f.setSize(500, 400);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String x = t1.getText();
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		l8.setText(Integer.toString(letter));
		l9.setText(Integer.toString(num));
		l10.setText(Integer.toString(space));
		l11.setText(Integer.toString(other));
	}

}

public class CharCounter {

	public static void main(String[] args) {
		new Jframe();
	}

}
