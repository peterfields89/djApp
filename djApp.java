package djApp;

public class djApp {
	static public void main(String [] args) {
		System.out.println("Let the music start");
		DJ d = new DJ();
		d.plaatInLaden();
		Koptelefoon k = new Koptelefoon();
		k.koptelefoonmusic();
	}
}
