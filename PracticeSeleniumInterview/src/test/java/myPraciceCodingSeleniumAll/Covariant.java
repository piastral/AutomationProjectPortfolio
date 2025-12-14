package myPraciceCodingSeleniumAll;

public class Covariant {
	// Covariant Return type vImp interview question

	public static void main(String[] args) {
		Addition add = new Addition();
		System.out.println(add.getAdd());
		Additon1 add1 = new Additon1();
		System.out.println(add1.getAdd());

	}

}
// instance method // should not have parmater techincally you can re use this avoid casting problem 

class Addition { // parent 
	public int getAdd() { // my refrence type or return type
		System.out.println("This is addition method ");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c; // c will actuall will return getAdd()
	}

}

class Additon1 extends Addition { //child 
	@Override
	public int getAdd() {
		System.out.println("This is addition1 method ");
		int a = 50;
		int b = 70;
		int c = a + b;
		return c; // c will actuall will return getAdd()
	}
}
