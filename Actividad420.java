package main;

import java.util.Scanner;

public class Actividad420 {

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        introduccion();
        double InteresAnual =obtenirInteresAnual();
        double capitalInvertida=obtenirCapitalAInvertir();
        double interesMensual=interesMensual(InteresAnual);
        double capitalAFuturo=obtenirValorFuturInversio(capitalInvertida,interesMensual,16);


    }
    //Obté el valor de la inversió @capitalInvertit transcorreguts @numAnys a un interés mensual de @interesMensual

    public static double obtenirValorFuturInversio(double capitalInvertit, double interesMensual, int numAnys) {
        double multAños;
        double mensula2;
        double caclculoMensulal;
        double calculoFinal = 0;

        for (int i = 0; i < numAnys; i++) {
             multAños=i*12;
             mensula2=(1+interesMensual);
             caclculoMensulal=Math.pow(mensula2,multAños);
             calculoFinal=capitalInvertit*caclculoMensulal;
            System.out.println(calculoFinal);
        }
        return calculoFinal;
    }

    // Obté el total aportat pel govern en funció de @capitalInverti

    public static double obtenirAjudaGovern(double capitalInvertit) {

        if (capitalInvertit>10000 && capitalInvertit<50000){
            return 25;
        } else if (capitalInvertit>50000) {
            return 50;
        }else {
            return 0;
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
        return "hola";
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
    public static double interesMensual(double interesAnual ){
        double anual1=interesAnual/100;
        double conversión=anual1/12;
        return conversión;
    }

}
