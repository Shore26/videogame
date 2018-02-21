package prVideoGame;

public class ElementoJuego {

	
	
	private int coordenadaX;
	private int coordenadaY;
	private char codigo;
	
	public ElementoJuego() {
	
		this.coordenadaX = 0;
		this.coordenadaY = 0;
		this.codigo=' ';
		
	}
	public ElementoJuego(int coordenadaX, int coordenadaY, char codigo) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.codigo = codigo;
	}
	public ElementoJuego(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.codigo=' ';
	}
	public ElementoJuego(char codigo) {
		super();
		this.codigo = codigo;
	}
	
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}
	
	
	
}
