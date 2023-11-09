package escuela;
package escuelaFutbolTalentsPlayers;

import java.util.ArrayList;
import java.util.List;

public class Escuela implements PatronEscuela {
    private String nombre;
    private List<Deportista> deportistas;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.deportistas = new ArrayList<>();
    }

    @Override
    public void agregarDeportista(Deportista deportista) {
        deportistas.add(deportista);
    }

    @Override
    public void imprimirListaDeCuotas() {
        System.out.println("*****Escuela " + nombre + "******");
        for (Deportista deportista : deportistas) {
            System.out.println(deportista);
        }
    }
}
