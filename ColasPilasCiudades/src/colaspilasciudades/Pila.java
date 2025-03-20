package colaspilasciudades;

public class Pila {
    private Nodo tope;
    private int tamanio;

    public Pila() {
        tope = null;
        tamanio = 0;
    }

    public void insertar(String ciudad) {
        Nodo nuevo = new Nodo(ciudad);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public String retirar() {
        if (tope == null) return "No hay ciudades para eliminar.";
        String ciudad = tope.ciudad;
        tope = tope.siguiente;
        tamanio--;
        return "Ciudad eliminada: " + ciudad;
    }

    public String verUltima() {
        return (tope != null) ? "Última ciudad ingresada: " + tope.ciudad : "No hay ciudades en la pila.";
    }

    public int tamaño() {
        return tamanio;
    }
}
