package Filmes;

public class MovieTest {

	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "Jason";
		one.genre = "Horror";
		one.rating = 6;
		Movie two = new Movie();
		two.title = "A história de um casamento";
		two.genre = "Drama";
		two.rating = 2;
		Movie three = new Movie();
		three.title = "Moonlight";
		three.genre = "Drama";
		three.rating = 1;
		one.playlist();

	}

}
