public class Alumno {

    //Variables de instacia
        //Código
    private int codigo;
        //Nombre
    private String nombre;
        //Carrera del alumno
    private String carrera;
    //Constructor
    public Alumno(){
        System.out.println("Estoy creando un objeto de tipo Alumno");
    }

    //Comportamientos o métodos
    public void setCodigo(int codigo){

        this.codigo = codigo;

    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
