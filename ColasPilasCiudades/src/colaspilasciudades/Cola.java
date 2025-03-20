package colaspilasciudades;

public class Cola {
    private Nodo frente, fin;
    private int tamanio;

    public Cola() {
        frente = fin = null;
        tamanio = 0;
    }

    public void insertar(String ciudad) {
        Nodo nuevo = new Nodo(ciudad);
        if (fin != null) {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
        tamanio++;
    }

    public String eliminar() {
        if (frente == null) return "No hay ciudades para eliminar.";
        String ciudad = frente.ciudad;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        tamanio--;
        return "Ciudad eliminada: " + ciudad;
    }

    public int tamanio() {
        return tamanio;
    }
}
