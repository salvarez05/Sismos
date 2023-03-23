import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        float[][] sismos= new float[7][10];
        mostarmenu(sismos);
    }

    private static void mostarmenu(float[][] m) {
        System.out.println("Que acción desea realizar");
        System.out.println("[1] Ingresar sismo");
        System.out.println("[2] Mostrar mayor sismo");
        System.out.println("[3] Mostrar sismos mayores a 5,0");
        System.out.println("[4] Enviar SMS por sismo mayor o igual a 7.0");
        System.out.println("[5] Salir");
        int opcion=0;
        while(opcion !=5){
        Scanner teclado = new Scanner(System.in);
        opcion= teclado.nextInt();
        switch (opcion) {
            case 1:
                ingresarSismos(m);
                break;
            case 2:
                mayorSismo(m);
                break;
            case 3:
                sismoMayor5(m);
                break;
            case 4:
                mandarSMS(m);
                break;
            case 5:
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        }


    }

    private static void mandarSMS(float[][] m) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <10 ; j++) {
                if (m[i][j] >= 7.0) {
                    System.out.println("Mandando mensaje");;
                }
            }

        }
    }

    private static void sismoMayor5(float[][] m) {
        int contador= 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <10 ; j++) {
                if (m[i][j] >= 5.0) {
                    contador++;
                }
            }

        }
        System.out.println("Hubieron "+contador+ " sismos mayores a 5.0");
    }

    private static float mayorSismo(float[][] m){
            float mayor= 0.0F;
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (m[i][j] > mayor) {
                    mayor= m[i][j];
                }
            }
        }
        System.out.println("El sismo de mayor magnitud fue de: "+mayor);

        return mayor;
    }


    private static void ingresarSismos(float[][] m) {
        Random ran = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j]= ran.nextFloat(0, 9.9F);
            }

        }
        System.out.println("Datos ingresados");

            }

        }
