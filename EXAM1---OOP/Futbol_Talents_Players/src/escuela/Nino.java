package escuela;

public class Nino extends Deportista {
	
    public Nino(String identificacion) {
		super(identificacion);
		// TODO Auto-generated constructor stub
	}

	@Override
    public double cuotaAPagar() {
        return ValorCuota.TIPOA.getValor();
    }
}

