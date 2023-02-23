package week3day1.assignment;

public class Automation extends MultilpleLanguage  implements TestTool {

	public static void main(String[] args) {
		Automation google =new Automation();
		google.python();
		google.selenium();
		google.ruby();
		google.java();

	}

	public void java() {
	    System.out.println("java is a motherhood language");
		
	}

	public void selenium() {
		System.out.println("Selenium is a emerging automation tool");
		
	}

	@Override
	public void ruby() {
	   System.out.println("ruby a programming language");
		
	}

}
