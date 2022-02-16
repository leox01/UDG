public class PruebaAlumno {


    public static void main(String[] args) {
        //Crear una instacia de un alumno
        Alumno alumno = new Alumno(); //instanciando el objeto
        Alumno alumno2 = new Alumno();

        //Asignación de valores al objeto
        //alumno.codigo = 10;
        alumno.setCodigo(10);
        alumno.setCarrera("Sistemas");
        alumno.setNombre("Leo");

        alumno2.setCodigo(0);
        alumno2.setCarrera("Informatica");
        alumno2.setNombre("Veronica");

        //utilizando el objeto
        System.out.println("El código del alumno es "+alumno.getCodigo());
        System.out.println("El nombre del alumno es "+alumno.getNombre());
        System.out.println("La carrea del alumno es "+alumno.getCarrera());

        System.out.println("El código del alumno2 es "+alumno2.getCodigo());
        System.out.println("El nombre del alumno2 es "+alumno2.getNombre());
        System.out.println("La carrea del alumno2 es "+alumno2.getCarrera());


    }
}
