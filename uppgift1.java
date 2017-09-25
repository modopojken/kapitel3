import javax.swing.*;

public class uppgift1{
	public static void main(String[]args){

	/*	byte b;
		int i;
		double s; 
		
		b = 50;
		i = 500;
		s = 3.1415926536;
		double Area;
		

		String rs = JOptionPane.showInputDialog(null, "Radien?");
		double r = Double.parseDouble(rs);
		Area = r * r * s;
		double omkrets = r*2*s;
		JOptionPane.showMessageDialog(null, omkrets + "\n" + Area );


*/


		String s = JOptionPane.showInputDialog(null, "Antal minuter per månad?");
		double svar = Double.parseDouble(s);
		String k = JOptionPane.showInputDialog(null, "Pris per minut?");
		double kostnad = Double.parseDouble(k);
		JOptionPane.showMessageDialog(null, svar * kostnad);


	}
}