package termometros2;

public class Start {

	public static void main(String[] args) {

		Termometro t = new Termometro();
		t.add(5);
		t.add(15);
		t.add(25);
		t.add(35);
		t.add(45);
		t.add(55);
		t.add(65);
		t.add(0);
		
		System.out.println(t);

	}

}
