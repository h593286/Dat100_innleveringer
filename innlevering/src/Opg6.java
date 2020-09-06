
import static javax.swing.JOptionPane.*;


public class Opg6 {

	public static void main(String[] args) {
		String brukerinput = showInputDialog("Skriv inn din bruttoinntekt: ");
		double inntekt = Double.parseDouble(brukerinput);
		double trinnskatt= 0; 
		
		//Trinn 0
		if (inntekt <= 164100) {
			showMessageDialog(null,"Din inntekt er " + inntekt + " kroner og du har en trinnskatt på "
					+ trinnskatt + " kroner, er i skattetrinn 0 og har en sats på 0,00%");
			
		//Trinn 1
		} else if (inntekt > 164101 && inntekt < 230950) { 
			trinnskatt = 0.0093 * inntekt;
			showMessageDialog(null,"Din inntekt er " + inntekt + " kroner og du har en trinnskatt på "
					+ trinnskatt + " kroner, er i skattetrinn 1 og har en sats på 0,93%");

		//Trinn 2
		} else if (inntekt > 230951 && inntekt < 580650) {
			trinnskatt = 0.0241 * inntekt;
			showMessageDialog(null,"Din inntekt er " + inntekt + " kroner og du har en trinnskatt på "
					+ trinnskatt + " kroner, er i skattetrinn 2 og har en sats på 2,41%");
			
		//Trinn 3	
		} else if (inntekt > 580650 && inntekt < 934050) {
			trinnskatt = 0.1152 * inntekt;
			showMessageDialog(null,"Din inntekt er " + inntekt + " kroner og du har en trinnskatt på "
					+ trinnskatt + " kroner, er i skattetrinn 3 og har en sats på 11,52%");
			
		//Trinn 4	
		} else if (inntekt > 934051) {
			trinnskatt = 0.1452 * inntekt;
			showMessageDialog(null,"Din inntekt er " + inntekt + " kroner og du har en trinnskatt på "
				+ trinnskatt + " kroner, er i skattetrinn 4 og har en sats på 14,52%");
		}

	}

}
