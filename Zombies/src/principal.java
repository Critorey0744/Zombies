import com.mycompany.principal.ubicaciones;
import com.mycompany.principal.zombies;

import java.util.*;

public class principal {
    ArrayList<ubicaciones> ubicacion = new ArrayList<ubicaciones>();
    ArrayList<zombies> zombie = new ArrayList<zombies>();
    zombies zombiee = new zombies();
    Date fechaInvisible = new Date(2000-1900, 1, 1);
    ubicaciones ubicaciones = new ubicaciones();
    public static void main(String[] args) {
        //menu
        principal inicio = new principal();
        inicio.zombie = new ArrayList();
        inicio.mostrarMenu();
    }


    public void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        while (i < 1) {
            System.out.println("Por favor ingrese un numero del 0 al 12 " +
                    "Si ingresas 0 finaliza el programa;");
            System.out.println("Si ingresas 0 finaliza el programa;");
            System.out.println("Si ingresas 1 vas a registrar un nuevo Zombie");
            System.out.println("Si ingresas 2 conoceras la información de todos los Zombies");
            System.out.println("Si ingresas 3 conoceras la cantidad de Zombies registrados");
            System.out.println("Si ingresas 4 conoceras la información de los Zombies con sangre O+ ó AB+");
            System.out.println("Si ingresas 5 conoceras la información de los Zombies nacidos despues del 2000");
            System.out.println("Si ingresas 6 conoceras la vida de los Zombies disminuira en un 50%");
            System.out.println("Si ingresas 7 vas a registrar una nueva ubicación");
            System.out.println("Si ingresas 8 conoceras la información de todas las ubicaciones");
            System.out.println("Si ingresas 9 conoceras las ubicaciones mas seguras de la ciudad");
            System.out.println("Si ingresas 10 conoceras las ubicaciones segun la distancia a Alexandria");
            System.out.println("Si ingresas 11 encontraras la frase del dia");
            System.out.println("Solo ingresa 12 en una emergencia");
            int respuesta = entrada.nextInt();
            int contadorZombies = 0;
            switch (respuesta) {
                case 0: {
                    System.out.println("Ha finalizado el programa");
                    break;
                }
                case 1: {
                    System.out.println("Ingresa la información del zombie");
                    System.out.println("Nombre:");
                    String nombre = entrada.next();
                    System.out.println("Salud:");
                    int salud = entrada.nextInt();
                    System.out.println("Fecha de nacimiento:");
                    System.out.println("Dia");
                    int dia = entrada.nextInt();
                    System.out.println("Mes");
                    int mes = entrada.nextInt();
                    System.out.println("Año");
                    int año = entrada.nextInt();
                    Date nacimiento = new Date(año - 1990, mes - 1, dia);
                    System.out.println("Tipo de sangre:");
                    String sangre = entrada.next();
                    zombiee.setNombre(nombre);
                    zombiee.setSalud(salud);
                    zombiee.setFechaNacimiento(nacimiento);
                    zombiee.setSangre(sangre);
                    zombie.add(new zombies(nombre, salud, nacimiento, sangre));
                    contadorZombies++;
                    continue;
                }
                case 2: {
                    System.out.println("Los datos de los zombies registrados son: ");
                    int total = zombie.size();
                    if (total == 0){
                    System.out.println("0, sin zombies registrados ");
                    }
                    else {
                        for (int j = 0; j < total; j++){
                        System.out.println("Zombie "+j+" : "+zombie.get(j).toString());
                        }
                    }
                    continue;
                }
                case 3: {
                /*    System.out.println("La cantidad de zombies registrados son: ");
                    int total = zombies.Zombie.size();
                    System.out.println(total);
                }*/
                    if(contadorZombies == 1){
                        System.out.println("Hay registrado un zombie");
                    }
                    if(contadorZombies == 0){
                        System.out.println("No se han registrado zombies!");
                    }
                    if(contadorZombies>1){
                        System.out.println("Se han creado "+contadorZombies+ " zombies");
                    }
                    continue;
                }
                case 4: {
                    System.out.println("La información de los zombies con sangre AB u O es la siguiente: ");
                    for(int k = 0; k<zombie.size(); k++){
                        if(zombie.get(k).getSangre().equalsIgnoreCase("AB") || zombie.get(k).getSangre().equalsIgnoreCase("O")){
                            System.out.println(zombie.get(k).toString());
                        }
                    }
                    continue;
                }
                case 5: {
                    System.out.println("Los zombies nacidos después del año 2000 son los siguientes");
                    for(int v = 0; v<zombie.size(); v++){
                        if(zombie.get(v).getFechaNacimiento().getTime() > fechaInvisible.getTime()){
                            System.out.println(zombie.get(v).toString());
                        }
                    }
                    continue;
                }
                case 6: {
                    System.out.println("Ha salido el sol! ahora...Los zombies... (suspenso)....SE QUEMARÁN!!!");
                    for (int u = 0; u<zombie.size(); u++){
                        System.out.println("El zombie " + u + " ahora tiene " + zombie.get(u).getSalud()/2 + " de vida");
                    }
                    continue;
                }
                case 7: {
                    System.out.println("Ingresa los siguientes datos: ");
                    System.out.println("Nombre de la ubicación");
                    String nUbicacion = entrada.next();
                    System.out.println("La distancia a Alexandria");
                    float Distancia = entrada.nextFloat();
                    System.out.println("La cantidad de zombies que merodean la ubicación");
                    int cantidadZombies = entrada.nextInt();
                    ubicaciones.setNombreUbicacion(nUbicacion);
                    ubicaciones.setDistancia(Distancia);
                    ubicaciones.setZombies(cantidadZombies);
                    ubicacion.add(new ubicaciones(nUbicacion, Distancia, cantidadZombies));
                    continue;
                }
                case 8: {
                    System.out.println("Las ubicaciones almacenadas hasta el momento son: ");
                    for(int p = 0; p<ubicacion.size(); p++){
                        System.out.println(ubicacion.get(p).toString());
                    }
                    continue;
                }
                case 9: {
                    System.out.println("La ubicación más segura es:"+ ubicaciones.mInformacion(com.mycompany.principal.ubicaciones.seguridad(ubicacion)));
                    continue;
                }
                case 11:{
                    String[] frases = new String[5];
                    frases[0]= "¡No quiero ser un superviviente en un apocalipsis zombie! ¿Habéis visto que agobiados van? Yo zombie y a dar vueltitas por ahí. A mi ritmo. ";
                    frases[1]= "Hola! nos gustaria visitarte para un bocadillo de media noche. Como suena el helado y los cerebros? Sinceramente Los zombies";
                    frases[2]= "Incluso si hay un apocalipsis zombie, aún podrás viajar usando el sistema Tesla Supercharging.";
                    frases[3]= "Aléjate de las ventanas y mantén poca iluminación si no deseas visitantes inesperados, no querás perder la cabeza por ello.";
                    frases[4]= "Mmm, Mmmmm, por aqui huele a cerebros frescos. y eso dice que o estaré perdiendo la cabeza, o disfrutando una rica cena ";
                    Random aleatorio = new Random();
                    int resultado = aleatorio.nextInt(frases.length);
                    String total = frases[resultado];
                    System.out.println("La frase de hoy es: "+total);
                    continue;
                }
                case 12: {
                    System.out.println("estas seguro que es una emergencia? escribe si o no");
                    String anster = entrada.next();
                    if (anster.equals("si")){
                        System.out.println("Alexandria a caido, toda nuestra sociedad esta en riesgo, eliminaremos nuestros datos y asi ellos nos sabran a donde ir");
                        System.out.println("Eliminado....");
                        ubicacion.clear();
                        zombie.clear();
                        System.out.println("Hemos borrado todo, huye soldado, y reconstruye una nueva Alexandria mas fuerte!!");
                        System.out.println("Fue un placer");
                        continue;
                    }
                    else {
                        break;
                    }

                }
            }
        }
    }
}

