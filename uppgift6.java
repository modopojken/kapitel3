import javax.swing.*;

public class uppgift6{
	public static void main(String[]args){

		



		String svarS = JOptionPane.showInputDialog(null, "Hur många sekunder tog beräkningen?");
		int svar = Integer.parseInt(svarS);
		int tim = svar / 3600;
		int min = (svar-tim*3600) / 60;
		int sek = svar-tim*3600-min*60;
		JOptionPane.showMessageDialog(null, tim + "\n" + min + "\n" + sek);

	}
}