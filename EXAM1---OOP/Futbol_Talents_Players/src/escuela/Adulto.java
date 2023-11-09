package escuela;

public class Adulto extends Deportista {
    private boolean hijosInscritos;

    public Adulto(String identificacion, boolean hijosInscritos) {
        super(identificacion);
        this.hijosInscritos = hijosInscritos;
    }

    @Override
    public double cuotaAPagar() {
        if (hijosInscritos) {
            return ValorCuota.TIPOD.getValor();
        } else {
            return ValorCuota.TIPOE.getValor();
        }
    }
}
