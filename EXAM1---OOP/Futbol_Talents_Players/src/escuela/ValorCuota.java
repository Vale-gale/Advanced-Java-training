package escuela;

public enum ValorCuota {
    TIPOA(10000),
    TIPOB(20000),
    TIPOC(30000),
    TIPOD(40000),
    TIPOE(50000);

    private final double valor;

    ValorCuota(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
