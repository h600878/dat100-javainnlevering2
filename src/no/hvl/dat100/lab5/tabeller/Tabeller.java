package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	// a) Martin (Ferdig)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i < tabell.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	// b) Martin (Ferdig)
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

	// c) Martin (Ferdig)
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

		for (int i = 0; i < tabell.length; i++){

					if (tabell[i]==tall) {
						return true;
					}
				}
				return false ;
	}

	// e) Martin (Ferdig)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int r = 0; r < tabell.length; r++) {
			if (tabell[r] == tall) {
				return r;
			}
		}
		return -1;
	}

	// f) Sigve (ferdig)
	public static int[] reverser(int[] tabell) {

		int[]nyTabell = new int [tabell.length];
		
		int pos = nyTabell.length-1;
		for (int i = 0; i<tabell.length; i++) {
			nyTabell[pos] = tabell[i];
			pos--;
		}
		
		return nyTabell;
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

	// h) Sigve (ferdig)
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



	
}
