package termometros2;

public class Start {

	public static void main(String[] args) {

		Termometro t = new Termometro();
		t.add(5);
		t.add(22);
		t.add(66);
		t.add(99);
		t.add(5);
		t.add(22);
		t.add(22);
		
		System.out.println(t);
		System.out.println(t.buscarPrimero(22));
		System.out.println(t.buscarUltimo(22));
		System.out.println(t.buscarPrimero(100));

	}

}
