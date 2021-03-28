import java.util.Scanner;

public class Juego {


    Scanner teclado = new Scanner(System.in);



    Propiedad[] propiedades = new Propiedad[40];


    ArcaComunal[] arcaComunal = new ArcaComunal[12];
    Casualidad[] casualidades = new Casualidad[12];


    Propiedad objetoPropiedad =new Propiedad();

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


       void crearPropiedadesTablero(){

           for (int j = 0; j < propiedades.length ; j++) {
              propiedades[j] = new Propiedad(false,"Sin Asignar",0,"",true,false);
           }
           propiedades[0]= new Propiedad(false,"GO",200,"INICIO",false,false);
            propiedades[1] = new Propiedad( false , "Ronda de Valencia" , 60 , "Cafe",false ,true);
            propiedades[3] = new Propiedad( false , "Plaza Lavapies" , 60 , "Cafe",false ,true);
            propiedades[6] = new Propiedad( false , "Glorieta Cuatro caminos" , 100 , "Celeste" ,false,true);
            propiedades[8] = new Propiedad( false , "Avenida Reina Victoria" , 100 , "Celeste" ,false,true);
            propiedades[9] = new Propiedad( false , "Calee Bravo Murillo" , 120 , "Celeste" ,false,true);
            propiedades[11] = new Propiedad( false , "Glorieta de Bilbao" , 140 , "Rosado" ,false,true);
            propiedades[13] = new Propiedad( false , "Calle Alberto Aguilera" , 140 , "Rosado" ,false,true);
            propiedades[14] = new Propiedad( false , "Calle Fuencarral", 160 , "Rosado" ,false,true);
            propiedades[16] = new Propiedad( false , "Avenida Felipe II" , 180 , "Naranja" ,false,true);
            propiedades[18] = new Propiedad( false , "Calle Velasquez" , 180 , "Naranja" ,false,true);
            propiedades[19] = new Propiedad( false , "Calle Serrano" , 200 , "Naranja" ,false,true);
            propiedades[21] = new Propiedad( false , "Avenida de America" , 220 , "Rojo" ,false,true);
            propiedades[23] = new Propiedad( false , "Calle Maria de Molina" , 220 , "Rojo" ,false,true);
            propiedades[24] = new Propiedad( false , "Calle Cea Bermudez" , 240 , "Rojo" ,false,true);
            propiedades[26] = new Propiedad( false , "Avenida de Los Reyes Catolicos" , 260 , "Amarrillo" ,false,true);
            propiedades[27] = new Propiedad( false , "Calle Bailen" , 260 , "Amarrillo" ,false,true);
            propiedades[29] = new Propiedad( false , "Plaza de España" , 280, "Amarrillo" ,false,true);
            propiedades[31] = new Propiedad( false , "Puerta del Sol" , 300 , "Verde" ,false,true);
            propiedades[32] = new Propiedad( false , "Calle Alcala" , 300 , "Verde" ,false,true);
            propiedades[34] = new Propiedad( false , "Gran Via" , 320 , "Verde",false,true);
            propiedades[37] = new Propiedad( false , "Paseo de la Castelana" , 350 , "Azul" ,false,true);
            propiedades[39] = new Propiedad( false , "Paseo del Prado" , 400 , "Azul",false,true );
            propiedades[15] = new Propiedad( false , "F. Pensilvania" , 200 , "Ferrocarril",false ,true);
            propiedades[35] = new Propiedad( false , "F. Short Line" , 200 , "Ferrocarril" ,false,true);
            propiedades[5] = new Propiedad( false , "F. Reading" , 200 , "Ferrocarril" ,false,true);
            propiedades[25] = new Propiedad( false , "F. B & O" , 200 , "Ferrocarril" ,false,true);


//           for (int i = 0; i <propiedades.length ; i++) {
//               System.out.println(propiedades[i].getNombre());
//           }
    }

    void crearTarjetasArc(){


            arcaComunal[0] = new ArcaComunal( "Canal 13 Gana 15 Martin FIERRO" , "gana 50" , 50 );
            arcaComunal[1] = new ArcaComunal( "Feriagro es todo un exito" , "gana 100" , 100 );
            arcaComunal[2] = new ArcaComunal( "Hector Magneto debe operarse" , "pague 50" , -50 );
            arcaComunal[3] = new ArcaComunal( "Editorial Ivrea de revistas sigue en alza" , "gana 75" , 75 );
            arcaComunal[4] = new ArcaComunal( "Sus abogados lograron sacarlo libre de la carcel" , "Libre de la cacel" , 50 );
            arcaComunal[5] = new ArcaComunal( "La justicia lo acusa de armar una revolucion vaya para la carcel" , "Va para la carcel" , -50);
            arcaComunal[6] = new ArcaComunal( "Victor Hugo lo denuncia y lo hace perder apoyo" , "pague 20", -20 );
            arcaComunal[7] = new ArcaComunal( "Quieren quitarle su parte de la empresa editorial" , "Debe pagar 100 para sus abogados" , -100 );
            arcaComunal[8] = new ArcaComunal( "Baja la soja" , "pierde 25" , 25 );
            arcaComunal[9] = new ArcaComunal( "Usted gano el concurso de belleza gana 50" , "gana 50" , 50 );
            arcaComunal[10] = new ArcaComunal( "Su editorial gana un premio a la mejor editorial" , "gana 25" , 50 );
            arcaComunal[11] = new ArcaComunal( "Con recursos de amparo se logran frenar la ley de medios" , "pierde 50" , -50 );
            arcaComunal[12] = new ArcaComunal( "Rechazan la fusion cablevision multicanal" , "pierde 25", -25 );

            casualidades[0]= new Casualidad( "Las editoriales de libros escolares pega una licitacion" ,"gana 50" ,50);
            casualidades[1]= new Casualidad( "La AFIP realiza un operativo en clarin" , "pierde 25" , -25 );
            casualidades[2]= new Casualidad( "Logra meter un diputado en el congreso" , "gana 100" , 100 );
            casualidades[3]= new Casualidad( "Fans de un libro hacen marchas en su contra" , "pierde 50" , -50 );
            casualidades[4]= new Casualidad( "Sus abogados lograron sacarlo libre de la carcel" , "Libre de la cacel" , 50 );
            casualidades[5]= new Casualidad( "La justicia lo acusa de armar una revolucion vaya para la carcel" , "Va para la carcel" , -50 );
            casualidades[6]= new Casualidad( "Canal 7 de Coedoba y el 12 de Bania nesecitan una nueva estructura" , "pague 50" , -50 );
            casualidades[7]= new Casualidad( "Interfieren la señal de NT" , "pierde 75" , -75 );
            casualidades[8]= new Casualidad( "El Frente empresario es todo un exito" , "gana 50" , 50 );
            casualidades[9]= new Casualidad( "La fundacion Noble necesita fondos" , "pague 25" , -25 );
            casualidades[10]= new Casualidad( "Bonelli y silvestre quedan en una pelea ante el entrevistado oficialista" , "page 15" , -15);
            casualidades[11]= new Casualidad( "Instala la problematica de la inseguridad gracias a nuestra empresa" , "gana 25" , 50 );
            casualidades[12]= new Casualidad( "Usted necesita ir al medico a hacerse unos chequeos" , "pague 25" , -25 );

    }






    void inicioDeJuego(int cantidadJugadores){

            String nombre ;
        if (cantidadJugadores == 2) {
            jugadores = new Jugador[2];
            for (int i = 0; i <jugadores.length ; i++) {
                jugadores[i] = new Jugador("",1000,0,0);
            }

            for (int i = 0; i < jugadores.length; i++) {

                System.out.println("Ingrese el Nombre Del Jugador " + i);
                nombre = teclado.next();
                jugadores[i].setNombre(nombre);

            }

            bienvenida(jugadores);

            crearPropiedadesTablero();
            int jugador = 0;
            for (int i = 0; i < 11 ; i++) {


                turnoJugador();



            }
        }else if (cantidadJugadores==3){

            jugadores = new Jugador[3];
            for (int i = 0; i <jugadores.length ; i++) {
                jugadores[i] = new Jugador("",1000,0,0);
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
                jugadores[i] = new Jugador("",1000,0,0);
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



    void turnoJugador(){
        int dado;

        for (int i = 0; i < jugadores.length ; i++) {
           System.out.println("turno del : "+ jugadores[i].getNombre());
            dado = ((int)(Math.random()*6))+1 + ((int)(Math.random()*6)) + 1 ;
           System.out.println("Dados = " + dado );
            jugadores[i].setPosicion(jugadores[i].getPosicion()+dado);
            System.out.println("posicion " + jugadores[i].getNombre() + " = " +jugadores[i].getPosicion());

            verificarSiEstaEnPropiedad(i,dado);
        }
    }

    void verificarSiEstaEnPropiedad(int numeroJugador,int posicionPropiedad){

            if(propiedades[posicionPropiedad].isPropiedad()){
                if(!propiedades[posicionPropiedad].isTieneDueno()){
                    menuCompraPropiedad(posicionPropiedad ,numeroJugador);
                }else {
                    System.out.println("Esta Propiedad Tiene Dueño ");
                }

            }else{
                if (propiedades[posicionPropiedad].getNombre() == "GO" ){

                }else if(propiedades[posicionPropiedad].getNombre() == "ArcaComunal" ){

                }else if(propiedades[posicionPropiedad].getNombre() == "Casualida" ){

                }
            }

        }


     void menuCompraPropiedad(int posicionPropiedad,int numeroJugador) {
        int opcion ;
        System.out.println("Usted ha Caido en Una propiedad ");
        System.out.println("Desea Comprar la Proiedad "+ propiedades[posicionPropiedad].getNombre());
        System.out.println("1) Si ");
        System.out.println("2) NO ");
        System.out.println("Introduzca una opcion");
        opcion=teclado.nextInt();
        if (opcion == 1){
            propiedades[posicionPropiedad].setTieneDueno(true);
            jugadores[numeroJugador].setDinero(jugadores[numeroJugador].getDinero() - propiedades[posicionPropiedad].getValor());
            System.out.println("Cantidad De Dinero Del Jugador : "+ jugadores[numeroJugador].getNombre() + " Dinero " + jugadores[numeroJugador].getDinero());
            jugadores[numeroJugador].setCantidadPropiedades(jugadores[numeroJugador].getCantidadPropiedades() + 1);
            System.out.println("Cantidad De Propiedades Del Jugadros : " +jugadores[numeroJugador].getNombre() + "Propiedades : " + jugadores[numeroJugador].getCantidadPropiedades());
        }else {
            System.out.println("continuando el Juego");
        }
    }


}
