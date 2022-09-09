package OBLIGATORISK9922;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class OppgaveO3 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn eit tal for å finne fakultet");
		int n = parseInt(tallTxt);
		int prntn = n;
		int j = 1; 
		while(n>1){
			j*=n;
			n--;
			
		}System.out.print(prntn + "! = " + j);
	}
}
