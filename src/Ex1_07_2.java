
public class Ex1_07_2 {

	public static void main(String[] args) {
		int a = 100;
		double b = 1.5;
		String c = "7";
		double d = 1.2;

		//   ( 101 + "7" ) = 1017  + 1.2 = 1018.2
		System.out.println(Integer.parseInt((int) (a + b) + c) + d);

	}

}
