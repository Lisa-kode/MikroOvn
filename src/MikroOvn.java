import org.w3c.dom.ls.LSOutput;

//Denne class kan ikke køre i sig selv, da den bare indeholder informationer: data fields (variabler) + metoder

public class MikroOvn{

   //Objektets egenskaber dvs. instansvariabler

    double temperatur; //celcius
    int timer; //mikrosekunder
    String funktion; //optøgning, varmning
    boolean tallerkenDrejer; //true: drejer, false: drejer ikke
    byte drejeHastighed; //hastighed mellem 1% og 100%
    short wattYdelse; //watt
    boolean lys; //tændt eller slukket

    /*Læg mærke til at alle datatyper er valgt ud fra den forventede variabelværdi
    ex short for watt, fordi den ikke kan være så høj
     */

    //Gør ting, dvs. metoder     //Metoder kan enten retunerer eller ej.

    boolean start() {
        lys = true;        //variabel valgt, så returnerer svar på om den kører eller ej med lampe
        if(temperatur >100) //hvis temperatur over 100 grader, stop.
            stop();

        return lys;
    }


    void stop() {
        lys = false;
        // @TODO Sluk kontakten der starter mikroovnen
    }


}