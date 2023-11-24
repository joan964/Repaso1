package main;

import java.util.Scanner;

public class Actividad420 {

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        introduccion();
        double InteresAnual =obtenirInteresAnual();
        double capitalInvertida=obtenirCapitalAInvertir();

        for (int any = 0; any < 15; any++) {
            double ajudaGovern=obtenirAjudaGovern(capitalInvertida);
            double futur=obtenirValorFuturInversio(capitalInvertida,InteresAnual,any);
            
        }



    }
    //Obté el valor de la inversió @capitalInvertit transcorreguts @numAnys a un interés mensual de @interesMensual

    public static double obtenirValorFuturInversio(double capitalInvertit, double interesMensual, int numAnys) {
        double paso1= numAnys*12;
        double paso2=1+interesMensual;
        double paso3=Math.pow(paso1,paso2);
        double valorFutur = capitalInvertit * paso3;
        System.out.println(valorFutur);
        return valorFutur;
    }

    // Obté el total aportat pel govern en funció de @capitalInverti

    public static double obtenirAjudaGovern(double capitalInvertit) {

        if (capitalInvertit>10000 && capitalInvertit<50000){
            return capitalInvertit+25;
        } else if (capitalInvertit>50000) {
            return capitalInvertit+50;
        }else {
            return capitalInvertit;
        }
    }

    // Demana a l'usuari que inserisca les dades sobre el interés anual (accepta decimals) i el torna.

    public static double obtenirInteresAnual() {
        String mensaje="Interès anual (%): ";
        int interèsAnual=pedirNumero(mensaje);

        return interèsAnual;
    }
    // Demana a l'usuari que inserisca el capital que invertirà (accepta decimals) i el torna.

    public static double obtenirCapitalAInvertir() {
        String mensaje="Capital a invertir (€): ";
        int capitalInvertida=pedirNumero(mensaje);

        return capitalInvertida;
    }

    // Obtenir indicació gràfica sobre el rendiment de la inversió
    public static String obtenirIndicacio(double capitalInvertit, double totalObtingut) {

        String primeraLinea="Any     Valor Futur(+ajuda)         Indicació";
        String segundaLinea="=============================================";
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"      ");
        }
        return primeraLinea;
    }

    public static void introduccion() {
        System.out.println("Batoi INVERSIONS 2021");
        System.out.println("=====================");
    }

    public static int pedirNumero(String mensaje) {
        do {
            int numeroIntroducido =pedirNumeroLetra(mensaje);
            if (numeroIntroducido > 0) {
                    return numeroIntroducido;
                }else {
                    System.out.println("Error! Les dades introduïdes no són correctes");
                }
        } while (true);

    }

    public static int pedirNumeroLetra(String mensaje) {

        int numeroIntroducido;
        do {
            System.out.print(mensaje);
            if (teclado.hasNextDouble()) {
                numeroIntroducido = teclado.nextInt();
                return numeroIntroducido;
            }
            else {
                System.out.println("Error! El tipus de dades introduït és incorrecte");
            }
            teclado.next();
        } while (true);
    }

}
