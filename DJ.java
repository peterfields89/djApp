package djApp;

class DJ {
	void plaatInLaden(){
		System.out.println("plaatje is ingeladen");
	}
}
class TranceDj extends DJ {
	void plaatInLaden() {
		System.out.println("plaatje is ingeleden in TranceDj");
	}
	void TranceDraaien(){
		System.out.println("Draait trance");
	}
}
