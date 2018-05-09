import javax.swing.JOptionPane;

public class YoyHaveReachedYourPrime {
	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("Jerabadinka: Give me a number between 1-10.");
		int numb = Integer.parseInt(number);
		if (numb == 1) {
			JOptionPane.showMessageDialog(null, "Jerabadinka: " + number + " is not prime! YOU SHALL PERISH!!");
			return;
		}
		if (numb == 2) {
			JOptionPane.showMessageDialog(null, "Jerabadinka: " + number + " is prime You may continue");
			return;
		}
		for (int i = 2; i < numb; i ++) {
			if (numb % i == 0) {
				JOptionPane.showMessageDialog(null, "Jerabadinka: " + number + " is not prime! YOU SHALL PERISH!!");
				return;
			}

		}
		JOptionPane.showMessageDialog(null, "Jerabadinka: " + number + " is prime You may continue");
	}
}
 

// 27-9-3-20-15-18-9-1 7-1-20-6-5-9-12-4
