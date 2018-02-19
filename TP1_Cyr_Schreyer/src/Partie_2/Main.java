//Programmation: Nathan Cyr et Michel Schreyer
package Partie_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	private static final String fichier = "listeCommandes.txt";
	public static int compteurClient = 0;
	public static int compteurPlats = 0;
	public static int compteurCommandes = 0;

	public static boolean debutClient = false;
	public static boolean debutPlats = false;
	public static boolean debutCommandes = false;

	public static String tabClients[] = new String[20];
	public static Plats tabPlats[] = new Plats[20];
	public static Commandes tabCommandes[] = new Commandes[20];

	public static void main(String[] args) {

		BufferedReader BufferFic = null;
		FileReader LectureFic = null;

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

				if (debutPlats && !sCurrentLine.contains("Plats")) {
					String[] plats = sCurrentLine.split(" ");
					Plats platTemporaire = new Plats(Double.parseDouble(plats[1]), plats[0]);
					tabPlats[compteurPlats] = platTemporaire;
					compteurPlats++;
				}

				if (debutCommandes && sCurrentLine.contains("Commandes") && !sCurrentLine.contains("Fin")) {
					try {
						String[] commandes = sCurrentLine.split(" ");
						Commandes commandeTemporaire = new Commandes(commandes[0], commandes[1],
								Integer.parseInt(commandes[2]));
						tabCommandes[compteurCommandes] = commandeTemporaire;
						compteurCommandes++;
					} catch (Exception formatInvalide) {

						System.out.println("Le fichier ne respecte pas le format demandé!");

					}

				}
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
