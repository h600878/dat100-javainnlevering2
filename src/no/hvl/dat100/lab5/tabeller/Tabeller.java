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
		for (int i : tabell) {
			sum += i;
		}
		// TODO, while

		// TODO, do while
		return sum;
	}

	// d)  Erik
	public static boolean finnesTall(int[] tabell, int tall) {


				boolean b = false;
				int i = 0;

				while (i<tabell.length) {

					if (tabell[i]==tall) {
						b = true;
					}
				}
	    		i++;

				return b ;
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

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}

	public static void main(String[] args) {
		//tester
		int [] tabell ={1,2,3,4,5};
	//	skrivUt(tabell);

		int input = parseInt(showInputDialog("Finnes tall?"));
		System.out.println(finnesTall(tabell, input));
	}

}
