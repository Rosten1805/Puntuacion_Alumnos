public class Alumno {
    int nota;
    String nombre;


    public void felicitar(){
        System.out.println("Enhorabuena " + getNombre() + ", has aprobado.");
    }

    public void reprender(){
        System.out.println("Necesitas estudiar, " + getNombre());
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }




}
