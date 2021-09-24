package no.hvl.dat100.lab5.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Tabeller {
	// a) Martin
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	// b) Martin
	public static String tilStreng(int[] tabell) {
		String s = "[";
		for (int i = 0; i < tabell.length; i++) {
			s += tabell[i];
			if (i < tabell.length-1) {
				s += ",";
			}
		}
		s += "]";
		return s;
	}

	// c) Martin
	public static int summer(int[] tabell) {
		int sum = 0;

		// 1) for-løkke
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}/*
		// 2) Utvidet for-løkke
		for (int i : tabell) {
			sum += i;
		}

		// 3) while-løkke
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}*/
		return sum;
	}

	// d)  Erik (Ferdig)
	public static boolean finnesTall(int[] tabell, int tall) {


				boolean b = false;


		for (int i = 0; i < tabell.length; i++){

					if (tabell[i]==tall) {
						return true;
					}
				}
				return false ;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f) 
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g) Erik (Ferdig)
	public static boolean erSortert(int[] tabell) {


		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}


	// h) Sigve
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[]tabell3 = new int [tabell1.length + tabell2.length];
		
		int pos = 0;
		
		for (int i = 0; i < tabell1.length; i++) {
			
			tabell3[pos] = tabell1[i];	
			
			pos++;
			
		}
		
		for (int v = 0; v < tabell2.length; v++) {
			
			tabell3[pos] = tabell2[v];
			
			pos++;
		}
		
		return tabell3;

	}

	public static void main(String[] args) {
		//tester
		int [] tabell ={1,2,3,4,5};
		int [] tabell2 = {6,7,8,9,10,19,26,2};
//		skrivUt(tabell);

		System.out.println(erSortert(tabell2));
		              
//		int input = parseInt(showInputDialog("Finnes tall?"));
//		System.out.println(finnesTall(tabell, input));
		
//		int[]tabell3 = settSammen(tabell, tabell2); // Testutskrift settSammen
//		skrivUt(tabell3);							//   -------- " ----------
	}

}
