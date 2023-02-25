package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado ) {
		this.marca= marca;
		this.estado=estado;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca (Marca marca) {
		this.marca=marca;
	}
	
	
	public Control getControl() {
		return this.control;
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
		this.volumen = volumen;
		}
		
	
	public int getCanal() {
		return this.canal;
	}
	public void setCanal (int canal) {
		if (this.estado && canal >= 1 && this.canal <= 120) {
		this.canal=canal;
		}
	}
	
	
	public boolean getEstado () {
		return estado;
	}
	
	public void canalUp () {
		if (this.estado && this.canal < 120) {
			canal++;
		}	
	}
	public void canalDown () {
		if (this.estado && this.canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp () {
		if (this.estado && this.volumen < 7) {
			volumen++;
		}
		
	}
	public void volumenDown () {
		if (estado==true && this.volumen >0) {
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

