package loops;

import javax.swing.JOptionPane;

public class Ex45 {

	public static void main(String[] args) {

		Double base, exponent, result;

		String userAnswer;

		do {

			base = Double.parseDouble(JOptionPane.showInputDialog(null, "Input base: "));

			exponent = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Exponent: "));

			if (base <= 0 || exponent <= 0) {

				JOptionPane.showMessageDialog(null, "Base or exponent must be greater than zero!!!");
			}

			else {

				result = Math.pow(base, exponent);

				JOptionPane.showMessageDialog(null,
						"Power: " + base + "\nRaised to: " + exponent + "\nequals: " + result);
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue??");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
