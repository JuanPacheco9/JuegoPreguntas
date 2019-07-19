/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class JuegoPreguntas {

    public static void m1() {
        String preguntas[] = {"¿Para que materia es esto?",
            "¿Cual es la capital colombia?",
            "¿El resultado de 5*5+5/2*8-5?",
            "¿A qué religión pertenece la filosofía Zen?",
            "¿Quién fue el primer ganador del Premio Nobel de Literatura?",
            "¿Qué isla lleva el nombre de un famoso navegante holandés?"};
        String opciones[] = {"a)Fundamentacion b)Ciudades Sostenibles c)Programacion basica d)Programacion avanzada",
            "a)Bogota b)Berlin c)Suiza d)Barranquilla",
            "a)39 b)144 c)40 d)ninguna",
            "a)Taoisto b)Budismo c)Cristianismo d)Judaismo",
            "a)Un dramaturno b)Un poeta c)Un novelista d)Un ensayista",
            "a)Kalimanta b)Rupertunski c)Tasmania d)Madagaskar"};
        String respuestas[] = {"d", "a", "c", "b", "b", "c"};

        int dineroGanado = 100;

        int contador = 0;

        System.out.println("|------------------¿Quien quiere ser millonario :v------------------|");

        for (int i = 0; i <= preguntas.length; i++) {
            if (i == preguntas.length) {
                System.out.println("SE ACABO EL JUEGO");
                break;
            }
            contador++;
            dineroGanado = dineroGanado * 2;
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|Su dinero actual es :" + dineroGanado + "                                           |");
            System.out.println("|Quiere contestar la siguiente pregunta?                            |");
            System.out.println("|-------------------------------------------------------------------|");
            String opcionDeJugar = "";
            Scanner seguir = new Scanner(System.in);
            opcionDeJugar = seguir.nextLine();
            if (opcionDeJugar.contains("si")) {
                System.out.println("|-------------------------------------------------------------------|");
                System.out.println("|pregunta numero: " + contador);
                System.out.println("|" + preguntas[i]);
                System.out.println("|Opciones: " + opciones[i]);

                System.out.println("|Ingrese respuesta");
                System.out.println("|-------------------------------------------------------------------|");
                String respuesta = "";
                Scanner dato = new Scanner(System.in);
                respuesta = dato.nextLine();
                if (respuestas[i].equals(respuesta)) {
                    System.out.println("Gano");
                    System.out.println(dineroGanado);
                } else {
                    System.out.println("perdio,su dinero ganado fue" + dineroGanado / 2);

                    break;
                }

            } else {
                System.out.println("Felicidades, dinero ganado fue" + dineroGanado);
                break;
            }
        }

    }
}
