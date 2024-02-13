package es.ieslavereda.Exercises.Exercise3;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(int edad, String nombre) throws ExceptionGatuna{
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws ExceptionGatuna{
        if (edad<0){
            throw new ExceptionGatuna("La edad del gato no puede ser negativa.");
        }
        this.edad = edad;
    }
    public void setNombre(String nombre) throws ExceptionGatuna{
        if (nombre.length()<3){
            throw new ExceptionGatuna("El nombre del gato debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "\n------Gato------" +
                "\nNombre: " + nombre +
                "\nEdad: " + edad;
    }
}
