package OBLIGATORISK9922;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB5 {

	public static void main(String[] args) {
		for(int j=0; j<10; j++) {
		String poengTxt = showInputDialog("Angi poengsum");
		int poeng = parseInt(poengTxt);
			
				
				if (0>poeng || 101<=poeng) {
			
					System.out.println("Feilmelding " + poeng + " er en ugyldig poengsum");
					j--;
				}
				if (0<=poeng&&poeng<=39) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren F");
					
				}if(40<=poeng&&poeng<=49) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren E");
					
					
				}if(50<=poeng&&poeng<=59) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren D");
					
				}if(60<=poeng&&poeng<=79) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren C");
					
				}if(80<=poeng&&poeng<=89) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren B");
					
				}if(90<=poeng&&poeng<=100) {
					System.out.println("Du har fått " + poeng + ", som gir karakteren A");
					
				}

		}
	}
}

