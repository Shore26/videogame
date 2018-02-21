package prVideoGame;

public class Potenciador extends Item{

	public Potenciador() {
		super();
	}

	public Potenciador(char codigo) {
		super(codigo);
	}

	public Potenciador(int coordenadaX, int coordenadaY, char codigo, String nombre) {
		super(coordenadaX, coordenadaY, codigo, nombre);
	}

	public Potenciador(int coordenadaX, int coordenadaY, String nombre) {
		super(coordenadaX, coordenadaY, nombre);
	}

	public Potenciador(String nombre) {
		super(nombre);
	}
	
	
}
