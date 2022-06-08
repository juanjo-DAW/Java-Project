package cat.institutmvm.aplicacio.entities;

/**
 * Creaacion de la clase Mantarraya que extiende de la superclase Animal.
 */
public class Mantarraya extends Animal{
    /**
     * Creacion de los atributos de la super clase con sus tipos respectivos.
     */
    private String profundidad;
    private boolean venenosas;

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
    public Mantarraya(String habitat, String especie, String genero, String tiempoNavegacion, String horaLlegada, String viento, String nubosidad, String direcionViento, int embarcaciones, float size) {
        super(habitat, especie, genero, tiempoNavegacion, horaLlegada, viento, nubosidad, direcionViento, embarcaciones, size);
        this.setProfundidad(profundidad);
        this.setVenenosas(venenosas);
    }

    /**
     * Creacion de los getters y los setters.
     * @return
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
    public boolean isVenenosas() {
        return this.venenosas;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public boolean getVenenosas() {
        return this.venenosas;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setVenenosas(boolean venenosas) {
        this.venenosas = venenosas;
    }
}
