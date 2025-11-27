package exemplo7;

public class ManipulacaoDeString {

	public static void main(String[] args) {
		
		String original = "abcdef ABCDEF ABC abc DEFG  "; 
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original: -" + original + "- ");
		System.out.println("Lower: -" + s01 + "- ");
		System.out.println("Upper: -" + s02 + "- ");
		System.out.println("trim: -" + s03 + "- ");
		System.out.println("sub(2): -" + s04 + "- ");
		System.out.println("sub(2, 9): -" + s05 + "- ");
		System.out.println("replace(a, x): -" + s06 + "- ");
		System.out.println("Indexof (bc): " + i + "- ");
		System.out.println("LastIndexof (bc): " + j + "- ");
	}

}
