import java.util.Scanner;

public class Juego {


    Scanner teclado = new Scanner(System.in);
    int dado = ((int)(Math.random()*6-1+1)+6);


    Propiedad[] propiedades = new Propiedad[25];


    Jugador jugadores[];




    public void inicio (){

        System.out.println();
        System.out.println("Bienvenidos");
        System.out.println(" Monopolio ");
        System.out.println("1)Inicio");
        System.out.println("2)SALIR");

        System.out.println("Introduzca una Opcion");
        int n = teclado.nextInt();

        if (n == 1) {
            int cantidadJugadores;
            System.out.println("Cantidad De Jugadores Entre 2 y 4");
                cantidadJugadores=teclado.nextInt();
            if (cantidadJugadores == 2) {
                inicioDeJuego(2);
            }else if (cantidadJugadores==3){
                inicioDeJuego(3);

            }else if (cantidadJugadores ==4){
                inicioDeJuego(4);
            }

        } else {
            System.out.println("SALIENDO");
        }
    }


        void crearPropiedades(){

            propiedades[0] = new Propiedad( false , "Ronda de Valencia" , 60 , "Cafe" );
            propiedades[1] = new Propiedad( false , "Plaza Lavapies" , 60 , "Cafe" );
            propiedades[2] = new Propiedad( false , "Glorieta Cuatro caminos" , 100 , "Celeste" );
            propiedades[3] = new Propiedad( false , "Avenida Reina Victoria" , 100 , "Celeste" );
            propiedades[4] = new Propiedad( false , "Calee Bravo Murillo" , 120 , "Celeste" );
            propiedades[5] = new Propiedad( false , "Glorieta de Bilbao" , 140 , "Rosado" );
            propiedades[6] = new Propiedad( false , "Calle Alberto Aguilera" , 140 , "Rosado" );
            propiedades[7] = new Propiedad( false , "Calle Fuencarral", 160 , "Rosado" );
            propiedades[8] = new Propiedad( false , "Avenida Felipe II" , 180 , "Naranja" );
            propiedades[9] = new Propiedad( false , "Calle Velasquez" , 180 , "Naranja" );
            propiedades[10] = new Propiedad( false , "Calle Serrano" , 200 , "Naranja" );
            propiedades[11] = new Propiedad( false , "Avenida de America" , 220 , "Rojo" );
            propiedades[12] = new Propiedad( false , "Calle Maria de Molina" , 220 , "Rojo" );
            propiedades[13] = new Propiedad( false , "Calle Cea Bermudez" , 240 , "Rojo" );
            propiedades[14] = new Propiedad( false , "Avenida de Los Reyes Catolicos" , 260 , "Amarrillo" );
            propiedades[15] = new Propiedad( false , "Calle Bailen" , 260 , "Amarrillo" );
            propiedades[16] = new Propiedad( false , "Plaza de España" , 280, "Amarrillo" );
            propiedades[17] = new Propiedad( false , "Puerta del Sol" , 300 , "Verde" );
            propiedades[18] = new Propiedad( false , "Calle Alcala" , 300 , "Verde" );
            propiedades[19] = new Propiedad( false , "Gran Via" , 320 , "Verde" );
            propiedades[20] = new Propiedad( false , "Paseo de la Castelana" , 350 , "Azul" );
            propiedades[21] = new Propiedad( false , "Paseo del Prado" , 400 , "Azul" );
            propiedades[22] = new Propiedad( false , "F. Pensilvania" , 200 , "Ferrocarril" );
            propiedades[23] = new Propiedad( false , "F. Short Line" , 200 , "Ferrocarril" );
            propiedades[24] = new Propiedad( false , "F. Reading" , 200 , "Ferrocarril" );
            propiedades[25] = new Propiedad( false , "F. B & O" , 200 , "Ferrocarril" );
    }



    void inicioDeJuego(int cantidadJugadores){

            String nombre ;
        if (cantidadJugadores == 2) {
            jugadores = new Jugador[2];
            for (int i = 0; i <jugadores.length ; i++) {
                jugadores[i] = new Jugador("",5000,0);
            }

            for (int i = 0; i < jugadores.length; i++) {

                System.out.println("Ingrese el Nombre Del Jugador " + i);
                nombre = teclado.next();
                jugadores[i].setNombre(nombre);
            }

            bienvenida(jugadores);
        }else if (cantidadJugadores==3){

            jugadores = new Jugador[3];
            for (int i = 0; i <jugadores.length ; i++) {
                jugadores[i] = new Jugador("",5000,0);
            }

            for (int i = 0; i < jugadores.length; i++) {

                System.out.println("Ingrese el Nombre Del Jugador " + i);
                nombre = teclado.next();
                jugadores[i].setNombre(nombre);
            }

            bienvenida(jugadores);

        }else if (cantidadJugadores ==4){

            jugadores = new Jugador[4];

            for (int i = 0; i <jugadores.length ; i++) {
                jugadores[i] = new Jugador("",5000,0);
            }

            for (int i = 0; i < jugadores.length; i++) {

                System.out.println("Ingrese el Nombre Del Jugador " + i);
                nombre = teclado.next();
                jugadores[i].setNombre(nombre);
            }
            bienvenida(jugadores);
        }


    }


    void bienvenida(Jugador[]jugadores ){
        for (int i = 0; i < jugadores.length ; i++) {
            System.out.println("Bienvenido : " + jugadores[i].getNombre() );
        }
    }

}
