import javax.swing.*;

public class uppgift5{
	public static void main(String[]args){




		String s = JOptionPane.showInputDialog(null, "pris?");
		double kostnad = Double.parseDouble(s);
		double moms = kostnad/5;
		double utanmoms = kostnad*0.80;
		JOptionPane.showMessageDialog(null, "moms: " + moms + "\nutan moms: " + utanmoms);


	}
}