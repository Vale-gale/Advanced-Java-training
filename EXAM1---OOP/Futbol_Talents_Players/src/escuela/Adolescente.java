package escuela;

public class Adolescente extends Deportista {
    private int edad;

    public Adolescente(String identificacion, int edad) {
    	super(identificacion);
        this.edad = edad;
    }

    @Override
    public double cuotaAPagar() {
        if (edad < 15) {
            return ValorCuota.TIPOB.getValor();
        } else {
            return ValorCuota.TIPOC.getValor();
        }
    }
}
