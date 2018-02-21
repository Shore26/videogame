package prVideoGame;

public class Item extends ElementoJuego{
	

	

	private String nombre;
	public Item() {
		super();
		this.nombre="";
	}
	public Item(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Item(char codigo) {
		super(codigo);
		
	}
	public Item(int coordenadaX, int coordenadaY, char codigo,String nombre) {
		super(coordenadaX, coordenadaY, codigo);
		this.nombre=nombre;
		
	}
	public Item(int coordenadaX, int coordenadaY,String nombre) {
		super(coordenadaX, coordenadaY);
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
