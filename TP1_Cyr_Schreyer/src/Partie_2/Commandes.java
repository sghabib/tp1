//Programmation: Nathan Cyr et Michel Schreyer
package Partie_2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Commandes {

	private static final String fichier = "listeCommandes.txt";
	public static String[][] tabFactures;

	public static void main(String[] args) {

		BufferedReader BufferFic = null;
		FileReader LectureFic = null;
		String tabClients[] = new String[15];
		String tabPlats[] = new String[15];
		String tabCommandes[] = new String[15];
		int compteurClient = 0;
		int compteurPlats = 0;
		int compteurCommandes = 0;

		boolean debutClient = false;
		boolean debutPlats = false;
		boolean debutCommandes = false;

		try {

			LectureFic = new FileReader(fichier);
			BufferFic = new BufferedReader(LectureFic);

			String sCurrentLine;

			while ((sCurrentLine = BufferFic.readLine()) != null) {
				if (sCurrentLine.contains("Clients")) {
					debutClient = true;
				} else if (sCurrentLine.contains("Plats")) {
					debutClient = false;
					debutPlats = true;
				} else if (sCurrentLine.contains("Commandes")) {
					debutPlats = false;
					debutCommandes = true;
				}
				if (debutClient) {
					tabClients[compteurClient] = sCurrentLine;
					compteurClient++;
				}
				
				if(debutPlats && !sCurrentLine.contains("Plats")) {
					tabPlats[compteurPlats] = sCurrentLine;
					compteurPlats++;
				}
				
				if(debutCommandes && sCurrentLine.contains("Commanmdes")) {
					tabCommandes[compteurCommandes] = sCurrentLine;
					compteurCommandes++;
				}
					
			}
			for(int i = 0; i < tabClients.length; i++) {
				System.out.println(tabClients[i]);
			}
			

		} catch (IOException e) {

			System.out.println("Fichier inexistant");

		} finally {

			try {

				if (BufferFic != null)
					BufferFic.close();

				if (LectureFic != null)
					LectureFic.close();

			} catch (IOException ex) {

				System.out.println("Fichier inexistant");
			}
		}

	}
}
