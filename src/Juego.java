import java.util.Scanner;

public class Juego {


    Scanner teclado = new Scanner(System.in);

    public void inicio (){

        System.out.println();
        System.out.println("Bienvenidos");
        System.out.println(" Monopolio ");
        System.out.println("1)2 Jugadores");
        System.out.println("2)3 Jugadores");
        System.out.println("3)3 Jugadores");
        System.out.println("4)SALIR");

        System.out.println("Introduzca una Opcion");
        int n = teclado.nextInt();


        if (n==1){
            System.out.println("2 Jugadores ");
            System.out.println("Introduzca los nombres");
            System.out.println("jugador 1 :");
            System.out.println();
            String nombre1 = teclado.nextLine();
            System.out.println("jugador 2");
            String nombre2 = teclado.nextLine();

        }else if (n==2){
            System.out.println("3 Jugadores ");
            System.out.println("Introduzca los nombres");
            System.out.println("jugador 1 :");
            String nombre1 = teclado.nextLine();
            System.out.println("jugador 2");
            String nombre2 = teclado.nextLine();
            System.out.println("jugador 3");
            String nombre3 = teclado.nextLine();
        }else if (n==3){
            System.out.println("3 Jugadores ");
            System.out.println("Introduzca los nombres");
            System.out.println("jugador 1 :");
            String nombre1 = teclado.nextLine();
            System.out.println("jugador 2");
            String nombre2 = teclado.nextLine();
            System.out.println("jugador 3");
            String nombre3 = teclado.nextLine();
            System.out.println("jugador 4");
            String nombre4 = teclado.nextLine();
        }else {
            System.out.println("SALIENDO");
        }
    }
}
