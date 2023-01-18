package park1;

public class AutoCloseTest {

	public static void main(String[] args) {
		try (AutoClosealeOdj odj = new AutoClosealeOdj()){
			throw new Exceprion();
			
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("continue;");
	}

}
