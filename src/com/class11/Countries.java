package com.class11;

public class Countries {

	public static void main(String[] args) {
		/*Create an array of countries: north america countries, south america countries, 
		 * europe countries, asian countries, african countries. Then print all values from that array.
		 * */
		
		String [][]countries= {
				
				{"USA", "Canada", "Mexico"},
				{"Brazil", "Columbia", "Argentina", "Chille"},
				{"Spain", "France", "Germany", "Italy", "Netherlands"},
				{"South Korea", "Singapore","Malaysia", "Indonesia", "China" },
				{"Egypt", "Tunisia", "Algeria","Morocco", "Kenya", "Ethiopia", "Mali"},
				
					};
		
		for (int i=0; i<countries.length; i++) {
			for (int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+" ");
			}
			System.out.println();

	}

}
}