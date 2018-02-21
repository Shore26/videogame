package prVideoGame;

public class Pocion extends Potenciador{
	private int tamanyo;

	/*
	 * Drimi, pequeño padawan, aqui la lie con el tamaño, que puse nivel, por eso en los constructores pone NIVEL, aunque por dentro estan bien
	 * Viva la semana santa
	 */
	
	public Pocion(int tamanyo) {
		super();
		this.tamanyo = tamanyo;
	}

	public Pocion() {
		super();
		
	}

	public Pocion(char codigo, int nivel) {
		super(codigo);
		this.tamanyo = nivel;
	}

	public Pocion(int coordenadaX, int coordenadaY, char codigo, String nombre,int nivel) {
		super(coordenadaX, coordenadaY, codigo, nombre);
		this.tamanyo = nivel;
	}

	public Pocion(int coordenadaX, int coordenadaY, String nombre,int nivel) {
		super(coordenadaX, coordenadaY, nombre);
		this.tamanyo = nivel;
	}

	public Pocion(String nombre,int nivel) {
		super(nombre);
		this.tamanyo = nivel;
	}

	public int getNivel() {
		return tamanyo;
	}

	public void setNivel(int nivel) {
		this.tamanyo = nivel;
	}
	
	public void aplicarPocion() {
		int suma=0;
		if(this.getNivel()==1) {
			suma=25;
		} else if (this.getNivel()==2) {
			suma=50;
		}
		Protagonista.setVida(Protagonista.getvida()+suma);
	}
	
	
}
