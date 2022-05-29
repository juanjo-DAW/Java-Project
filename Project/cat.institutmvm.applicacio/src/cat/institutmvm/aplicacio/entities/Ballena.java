package cat.institutmvm.aplicacio.entities;

/**
 * Creaacion de la clase Ballena que extiende de la superclase Animal.
 */
public class Ballena extends Animal{
    /**
     * Creacion de los atributos de la super clase con sus tipos respectivos.
     */
    private String profundidad;
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
     * @param profundidad
     * @param parasitos
     */
    public Ballena(String habitat, String especie, String genero, String tiempoNavegacion, String horaLlegada, String viento, String nubosidad, String direcionViento, int embarcaciones, float size, String profundidad, boolean parasitos) {
        super(habitat, especie, genero, tiempoNavegacion, horaLlegada, viento, nubosidad, direcionViento, embarcaciones, size);
        this.setProfundidad(profundidad);
        this.setParasitos(parasitos);
    }

    /**
     * Creacion de los getters y los setters.
     *
     */
    public String getProfundidad() {
        return this.profundidad;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public boolean isParasitos() {
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
