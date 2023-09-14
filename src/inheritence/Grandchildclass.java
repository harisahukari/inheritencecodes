package inheritence;

public class Grandchildclass extends Childclass{

	public static void main(String[] args) {
   Grandchildclass gc = new Grandchildclass();
   gc.cm();
   gc.pm();
   gc.student();
   gc.teacher();
   gc.layer();
   gc.doctor();
	}
	public void layer() {
		 System.out.println(" judgement");
	  }
	  public void doctor() {
		  System.out.println(" treatment");
	  }
}
