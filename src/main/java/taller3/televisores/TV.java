package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV (Marca marca, boolean estado ) {
		this.marca= marca;
		this.estado=estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca (Marca marca) {
		this.marca=marca;
	}
	
	
	public Control getControl() {
		return control;
	}
	public void setControl (Control control) {
		this.control=control;
	}
	
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio (int precio) {
		this.precio= precio;
	}
	
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen (int volumen) {
		if(estado==true && volumen >=0 && volumen <=7) {
		this.volumen=volumen;
		}
		
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal (int canal) {
		if (estado==true && canal >= 1 && canal <= 120) {
		this.canal=canal;
		}
	}
	
	
	public boolean getEstado () {
		return estado;
	}
	
	public void canalUp () {
		if (estado==true && canal < 120) {
			canal++;
		}	
	}
	public void canalDown () {
		if (estado==true && canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp () {
		if (estado==true && volumen < 7) {
			volumen++;
		}
		
	}
	public void volumenDown () {
		if (estado==true && volumen >0) {
			volumen--;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado= true;
		
	}
	public void turnOff() {
		estado= false;
	}
	
	
	
}

