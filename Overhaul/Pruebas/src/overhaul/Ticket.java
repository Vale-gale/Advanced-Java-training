package overhaul;

public class Ticket {
	
	private int numero;
	private String fechaTicket;
	private String DNIpersona;
	
	public Ticket(int numero, String fechaTicket, String DNIpersona) {
		this.numero = numero;
		this.fechaTicket = fechaTicket;
		DNIpersona = DNIpersona;
	}
	
	@Override
	public String toString(){
		return "Ticket{Número "+numero+", con fecha de compra "+fechaTicket+", por "+DNIpersona;
	}
	
	

}
