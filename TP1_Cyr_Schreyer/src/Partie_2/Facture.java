//Programmation: Nathan Cyr et Michel Schreyer
package Partie_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Facture extends Commandes {

	public static void main(String[] args) {

		PrintWriter writer;
		try {
			writer = new PrintWriter("Facture.txt", "UTF-8");
			writer.println("Bienvenue chez Barette!");
			writer.println("Factures:");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
