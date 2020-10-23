import java.util.Random;

public class letsLotto {

	public static void main(String[] args) {
		System.out.println("Today's let's Lotto is");
		Random lL = new Random();
		
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+":"+(lL.nextInt(45)+1));
		}
	}
}
