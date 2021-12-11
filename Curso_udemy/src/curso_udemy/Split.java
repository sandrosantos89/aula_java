package curso_udemy;

public class Split {

	public static void main(String[] args) {
		String s = "potato aple lemon";

		String[] vect = s.split(" ");// escolhe qual é o sepadador - / * ""

		System.out.println("Vetor [0]: " + vect[0]);
		System.out.println("Vetor [1]: " + vect[1]);
		System.out.println("Vetor [2]: " + vect[2]);

	}

}
