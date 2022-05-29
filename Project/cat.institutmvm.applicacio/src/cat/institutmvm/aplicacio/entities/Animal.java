package cat.institutmvm.aplicacio.entities;

/**
 * Creacion de la super clase que servira para que otras clases hereden sus atributos al extenderse de esta misma.
 */
public class Animal {
    /**
     * Creacion de los atributos de la super clase con sus tipos respectivos.
     */
    private String habitat, especie, genero, tiempoNavegacion, horaLlegada, viento, nubosidad, direcionViento;
    private int embarcaciones;
    private float size;

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
    public Animal(String habitat, String especie, String genero, String tiempoNavegacion, String horaLlegada, String viento, String nubosidad, String direcionViento, int embarcaciones, float size) {
        this.setHabitat(habitat);
        this.setEspecie(especie);
        this.setGenero(genero);
        this.setTiempoNavegacion(tiempoNavegacion);
        this.setHoraLlegada(horaLlegada);
        this.setViento(viento);
        this.setNubosidad(nubosidad);
        this.setDirecionViento(direcionViento);
        this.setEmbarcaciones(embarcaciones);
        this.setSize(size);
    }

    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getHabitat() {
        return this.habitat;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getEspecie() {
        return this.especie;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getGenero() {
        return this.genero;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getTiempoNavegacion() {
        return this.tiempoNavegacion;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setTiempoNavegacion(String tiempoNavegacion) {
        this.tiempoNavegacion = tiempoNavegacion;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getHoraLlegada() {
        return this.horaLlegada;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getViento() {
        return this.viento;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setViento(String viento) {
        this.viento = viento;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getNubosidad() {
        return this.nubosidad;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public String getDirecionViento() {
        return this.direcionViento;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setDirecionViento(String direcionViento) {
        this.direcionViento = direcionViento;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public int getEmbarcaciones() {
        return this.embarcaciones;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setEmbarcaciones(int embarcaciones) {
        this.embarcaciones = embarcaciones;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public float getSize() {
        return this.size;
    }
    /**
     * Creacion de los getters y los setters.
     * @return
     */
    public void setSize(float size) {
        this.size = size;
    }
}