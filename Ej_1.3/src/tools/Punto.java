package tools;

public class Punto {

	public int coordenadaX;
	public int coordenadaY;
	public int coordenadaZ;
	
	public Punto(int coordenadaX, int coordenadaY, int coordenadaZ) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.coordenadaZ = coordenadaZ;
	}
	
	public float moduloPuntos(){
		float modulo = 0;
		modulo= (float) Math.pow(coordenadaX, 2)+ (float)Math.pow(coordenadaY, 2)+ (float)Math.pow(coordenadaZ, 2);
		modulo=(float) Math.sqrt(modulo);
		return modulo;
	}
	
	public float puntoMedio() {
		
	}
	}
