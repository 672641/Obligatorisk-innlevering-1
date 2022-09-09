package OBLIGATORISK9922;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class OppgaveB4Trinnskatt {
	
	public static void main(String[] args) {
		String inntektTxt = showInputDialog("Skriv inn din årslønn");
			double inntekt = parseDouble(inntektTxt);
			double trinnskatt;
			
			if(inntekt<=190349) {
				trinnskatt = 0;
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
			
			}
			if (inntekt>=190350 && 267899>=inntekt) {
				trinnskatt = inntekt*0.017;
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
	
			}
			if (inntekt>=267900 && 643799 >=inntekt) {
				trinnskatt = inntekt*0.04;
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
			}
			if (inntekt>=643800  && 969199>=inntekt)
			
			/*Troms og finmark har egen en egen trinnskattprosent på dette trinnet har 
			 * derfor lagt inn mogligheit til å svare ja eller nei om man er derifra eller
			 * ei. Ved svar "ja" med små bokstaver får en troms og finnmark sin trinnskatt, ved "nei"
			 * får ein vanleg trinnskatt.
			 */
				
				{
				String togfTxt = showInputDialog("Er du busett i Troms og Finnmark? Skriv ja eller nei");
				String togfj = "ja";
				String togfJ = "JA";
				String TogFj = "Ja";
					if (togfj == togfTxt || togfJ == togfTxt || TogFj == togfTxt) {trinnskatt = inntekt*0.114;
					} else { trinnskatt = inntekt*0.134/1;
				}
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
			}
			if (inntekt>=969200 && 1999999>=inntekt) {
				trinnskatt = inntekt*0.164;
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
			}	
			if (inntekt>=2000000) {
				trinnskatt = inntekt*0.174;
				System.out.println("Trinnskatten når inntekten din er " + inntekt + " er " + trinnskatt);
			}
	}
}
