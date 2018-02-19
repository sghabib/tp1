package Partie_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Factures {
	public static void main(String[] args) {

		for (int i = 1; i < Main.compteurClient; i++) {

			double prix = 0;

			for (int j = 0; j < Main.compteurCommandes; j++) {

				if (Main.tabClients[i].equals(Main.tabCommandes[j].getClient())) {

					boolean trouve = false;

					for (int k = 0; k <= Main.compteurPlats && !trouve; k++) {

						if (Main.tabPlats[k].getClientCommande().equals(Main.tabCommandes[j].getPlat())) {

							prix += Main.tabPlats[k].getPrixCommande() * Main.tabCommandes[j].getQte();
							trouve = true;

						} else {

							prix += 0;

						}
					}

				}

			}

			System.out.println(Main.tabClients[i] + " " + prix + "$");

			/*
			 * PrintWriter writer;
			 * 
			 * 
			 * 
			 * try { writer = new PrintWriter("Facture.txt", "UTF-8");
			 * writer.println("Bienvenue chez Barette!"); writer.println("Factures:");
			 * writer.close(); } catch (FileNotFoundException e) { e.printStackTrace(); }
			 * catch (UnsupportedEncodingException e) { e.printStackTrace(); }
			 */

		}
	}
}
