package inheritence;

public class Parentclass {

	public static void main(String[] args) {
		Parentclass pc = new Parentclass();
		pc.teacher();
		pc.student();

	}
  public void teacher() {
	 System.out.println(" knowledge person");
  }
  public void student() {
	  System.out.println(" learning");
  }
}
