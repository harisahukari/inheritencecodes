package inheritence;

public class Childclass extends Parentclass {

	public static void main(String[] args) {
		 Childclass cc = new  Childclass();
		   cc.cm();
		   cc.pm();
		   cc.student();
		   cc.teacher();

	}
	public void cm() {
		 System.out.println(" state responsibilies");
	  }
	  public void pm() {
		  System.out.println(" contry responsibilies");
	  }

}
