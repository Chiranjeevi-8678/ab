package w6.d1.assignment;

public class Automation extends MultipleLanguage{

	public void java() {
		System.out.println("Print:JAVA");
		// TODO Auto-generated method stub
		
	}

	public void Selenium() {
		System.out.println("Print:SELENIUM");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ruby() {
		System.out.println("Print:RUBY CRYSTAL");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Automation Lang=new Automation();
		Lang.java();
		Lang.Selenium();
		Lang.ruby();
	}

}
