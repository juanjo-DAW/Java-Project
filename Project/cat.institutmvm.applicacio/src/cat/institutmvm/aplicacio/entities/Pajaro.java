package cat.institutmvm.aplicacio.entities;

/**
 * Creaacion de la clase Pajaro que extiende de la superclase Animal.
 */
public class Pajaro extends Animal {
    /**
     * Creacion de los atributos de la super clase con sus tipos respectivos.
     */
    private boolean parasitos;

    /**
     * Creacion del constructor con sus respectivos parametros.
     * @param habitat
     * @param especie
     * @param genero
     * @param tiempoNavegacion
     * @param horaLlegada
     * @param viento
     * @param nubosidad
     * @param direcionViento
     * @param embarcaciones
     * @param size
     */
    public Pajaro(String habitat, String especie, String genero, String tiempoNavegacion, String horaLlegada, String viento, String nubosidad, String direcionViento, int embarcaciones, float size) {
        super(habitat, especie, genero, tiempoNavegacion, horaLlegada, viento, nubosidad, direcionViento, embarcaciones, size);
        this.setParasitos(parasitos);
    }

    /**
     * Creacion de los getters y los setters.
     *
     */
    public boolean isParasitos() {
        return parasitos;
    }

    /**
     * Creacion de los getters y los setters.
     *
     */
    public boolean getParasitos() {
        return this.parasitos;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setParasitos(boolean parasitos) {
        this.parasitos = parasitos;
    }
}