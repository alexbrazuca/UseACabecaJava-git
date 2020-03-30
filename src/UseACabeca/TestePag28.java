package UseACabeca;

public class TestePag28 {

	public static void main(String[] args) {
		
		//instanciado objeto
		Dog mel = new Dog();
		
		mel.size = 40;
		mel.breed = "vira lata";
		mel.name = "Bob";
		System.out.println("O nome do cachorro é "+mel.name+" a raça é "+mel.breed+" o peso em kg é: "+mel.size) ;
		mel.bark();

	}

}
