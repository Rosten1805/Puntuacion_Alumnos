import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno();

        int totalAlumnos;
        String cadenaNota;


        System.out.print("Introduce el numero de alumnos a evaluar: ");
        totalAlumnos= Integer.parseInt(sc.nextLine());

        for(int i=1; i <= totalAlumnos ; i++){

            System.out.print("Introduce el nombre del alumno num " + i + ": ");
            alumno.nombre = sc.nextLine();

            System.out.print("Introduce la nota de " + alumno.nombre + " : ");
            cadenaNota = sc.nextLine();
            alumno.nota = Integer.parseInt(cadenaNota);


            if(alumno.getNota() >= 5){
                alumno.felicitar();
            }

            else{
                alumno.reprender();
            }
        }

    }




}
