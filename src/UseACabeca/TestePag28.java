package UseACabeca;

public class TestePag28 {

	public static void main(String[] args) {
		
		//instanciado objeto
		Dog mel = new Dog();
		
		mel.size = 40;
		mel.breed = "vira lata";
		mel.name = "Bob";
		System.out.println("O nome do cachorro � "+mel.name+" a ra�a � "+mel.breed+" o peso em kg �: "+mel.size) ;
		mel.bark();

	}

}
