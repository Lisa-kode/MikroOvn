public class Main {

    public static void main(String[] args) {
        System.out.println("Smarthome dummy 1");

        /*Man kalder instansen MikroOvn, som indeholder alle de variabler vi beskriv i class 'Mirkoovn'
          og nu laver vi en specifik MikroOvn, en ny som vi kalder sunesOvn. */


        MikroOvn sunesOvn = new MikroOvn(); //Instansierer et objekt af klassen MikroOvn
        sunesOvn.drejeHastighed = -100; //kører hurtigt baglæns
        sunesOvn.temperatur = 700;
        sunesOvn.wattYdelse = 300;

        MikroOvn tommyOvn = new MikroOvn(); //Instansierer et objekt af klassen MikroOvn
        tommyOvn.drejeHastighed = 20; //kører langsomt forlæns
        tommyOvn.temperatur = 150;
        tommyOvn.wattYdelse = 500;

        System.out.println("sunes ovn kører med " + sunesOvn.drejeHastighed + " omdrejninger");
        System.out.println();

    }
}
