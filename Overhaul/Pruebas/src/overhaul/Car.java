package overhaul;

public class Car {
	
	private String nombre;
	private int number;
	
	Car(String nombre, int number){
		
		this.nombre=nombre;
		this.number=number;	
	}
	
	@Override
	public String toString() {
        return "El carro "+nombre+ ", número " + number;
    }

}
