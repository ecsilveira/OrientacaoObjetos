package br.edu.uniritter.exercicioFazenda;

public class Coordenada {

	private int latitude;
	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	private int longitude;
	
	public Coordenada(int lat, int lon) {
		this.latitude = lat;
		this.longitude = lon;
	}
	

}
