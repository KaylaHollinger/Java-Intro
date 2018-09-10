// This application program solves for x in the function x = (ed - bf) / (ad - bc), and for y in the function y = (af - ec) / (ad - bc).
class ProgrammingExercise13 {
	public static void main(String[] args) {
		System.out.println("a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9");
		System.out.println("x = ");
    		System.out.println(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		System.out.println("y = ");
		System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
	}
}
