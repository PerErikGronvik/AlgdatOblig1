package no.oslomet.cs.algdat;

import com.sun.source.tree.WhileLoopTree;

import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {
    }

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1; // Gruppemedlemmer.
    }

    // Oppgave 1
    public static int maks(int[] a) {// Metoden skal kaste en NoSuchElementException med passende tekst på en tom tabell, da en tom tabell ikke har en største verdi
        if (a.length == 0) {
            throw new NoSuchElementException("En tom tabell har ikke en største verdi");
        } else if (a.length == 1) {
            return a[0];
        } else {
            //Sammenlikn de to første elementene i tabellen. Hvis det første elementet er
            //størst, bytt plass på de to verdiene.
            //Sammenlikn så de to neste elementene i tabellen (element 2 og 3, så indeks
            //1 og 2). Hvis det første av dem er størst, bytt plass på de to verdiene.
            //3. Fortsett med de neste to elementene, så de neste to, helt til du har gått
            //gjennom hele tabellen.

            for (int i = 0; i < a.length - 1; i++) {

                if (a[i] > a[i + 1]) {
                    // Bytt tall
                    int f = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = f;
                }
            }
            //største verdi ligge bakerst, og du kan returnere denne.
            return a[a.length - 1];
        }
    }

    public static int ombyttinger(int[] a) {
        int teller = 0;
        if (a.length == 0) {
            return teller; //ny
        } else if (a.length == 1) {
            return teller; //ny
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    //bytt tall
                    int f = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = f;
                    teller++; //teller byttinger
                }
            }
            return teller; // returnerer antall byttinger
        }

    }

    public static double gjennomsnittligOmbyttinger(int[] a) {
        double sum = 0.0;
        int n = a.length;
        if (n <= 1) {
            return sum; //ingen ombyttinger
        } else {
            for (int i = 1; i < n; i++) {
                sum += (double) i / (i + 1);
            }
            return sum;
        }
        //maks ombyttinger. må være 2 tall. 2 tall kan byttes 1 gang. 3 tall kan byttes 2 gang osv..
        //n-1
        //gjennomsnitt sannsynlighet for bytt ved 2 tall + sannsynlighet for bytte ved 3 tall + ved n tall
        // 1/2 ved første 2/3 ved andre siden de to første har større sannsynlighet for å være større.
        // (n/n+1) der (n > 1)
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        //Metoden skal gi 0 dersom tabellen er tom. En tom tabell skal ikke gi feilmelding.
        if (a.length == 0) {
            return 0;
        } else if (a.length == 1) { //tabell med et tall har et unikt tall
            return 1;
        } else {
            int teller = 1; // første tall er alltid unikt
            for (int i = 0; i < a.length - 1; i++) { //teller bare nye tall
                if (a[i] < a[i + 1]) {
                    teller++;
                } else if (a[i] > a[i + 1]) { //reagerer om feil funnet
                    throw new IllegalStateException("Tabellen er ikke sortert stigende");
                }
            }
            return teller;
        }
    }


    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0) {
            return 0;
        } else if (a.length == 1) { //tabell med et tall har et unikt tall
            return 1;
        } else {
            int teller = 0; // første tall er alltid unikt, men nå er det annen fremgangsmetode
            int minsteUbrukteTall;
            int storsteTall;
            //løkke som finner det største ubrukte tallet
            for (int i = 0; i < a.length-1; i++) { //finne største tall
                if (a[i] > storsteTall) {
                    storsteTall=a[i];
                }
            }
            while (minsteUbrukteTall != storsteTall) {        //while løkke som går gjennom alle minste ubrukte tall
                for (int i = 0; i < a.length-1; i++) { //finne neste minste tall
                    if (a[i] > a[i + 1] && a[i] < minsteUbrukteTall) {
                        minsteUbrukteTall=a[i];
                    }
                }

            }


            //while fortsetter helt helt til det minste ulike tallet er det største
            //returnerer teller
        }

            //Tabellen a kan nå være en hvilken som helst heltallstabell, den trenger ikke være sortert, og kan ha flere like verdier.
        //Metoden skal returnere hvor mange forskjellige verdier som er i a, og skal ikke endre på tabellens innhold.

        //Metoden skal ikke bruke noen hjelpetabeller. Alt arbeid skal kun foregå innenfor
        //tabellen a. Du kan derfor eksempelvis ikke lage en sortert kopi av a, eller lage en
        //tabell over tidligere registrerte verdier. Du kan selvfølgelig lage hjelpevariabler.

        throw new UnsupportedOperationException();}

    // Oppgave 4
    public static void delsortering(int[] a) {


        //Den skal dele tabellen a i to sorterte deler. Venstre del skal inneholde alle oddetallene sortert, og
        //høyre del alle partallene sortert. Følgende eksempel viser bruksområdet:
        // Eksempel a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}

        //Tabellen a kan være tom, kan inneholde både negative og positive tall, kan
        //bestå av kun oddetall, eller kun av kun partall. Ingen av disse mulighetene skal gi
        //feilmelding.

        //Metoden skal ikke bruke hjelpetabeller. Alt arbeid skal kun foregå innenfor
        //tabellen a. Du kan selvfølgelig bruke hjelpevariabler.
        //Metoden må lages så den er relativt effektiv. En av testene vil måle effektivitet
        //på store tabeller.

        throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void rotasjon(char[] a) {

        //En rotasjon i en tom tabell eller tabell med nøyaktig ett element skal ikke gi
        //feilmelding, men rotasjonen vil da ikke gjøre noe.

        //Metoden skal «rote-
        //re» elementene i en tabell. En rotasjon gjøres ved at det siste elementet settes
        //først, og alle andre element forskyves ett steg mot høyre. F

        //char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        //rotasjon(a);
        //// a er nå {'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'}


        throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a, int k) {

        //Vi går her videre fra forrige oppgave, og vil kunne rotere mer enn ett steg.
        //Lag metoden public static void rotasjon(char[] a, int k), der k er et
        //vilkårlig heltall. Dersom k = 1 skal metoden gjøre det samme som i forrige oppgave.
        //Dersom k > 1 skal metoden gi samme svar som om man bruker rotasjon(a) k
        //ganger. Dersom k er negativ, skal rotasjonen gå motsatt retning. Det er ingen
        //grense på størrelsen til k.
        //Metoden må lages så den er relativt effektiv. En av testene vil måle effektivitet
        //på store tabeller. Følgende eksempler viser bruksområder:
        //char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        //rotasjon(a, 3);
        //// a er nå {'H', 'I', 'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}
        //rotasjon(a, -2);
        //// a er nå {'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'}
        //rotasjon(a, 19);
        //// a er nå {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}


        throw new UnsupportedOperationException();}


    // Oppgave 7
    public static String flett(String s, String t) {
        //«flette» sammen to strenger s og t, slik at resultatet er en streng
        //der annenhvert tegn kommer fra s, og annenhvert kommer fra t. Hvis s
        //og t har forskjellig lengde, skal det som er «til overs» legges inn bakerst.
        //Metoden skal returnere den sammenflettede strengen. Følgende eksempler
        //viser bruksområder.
        //String a = flett("ABC", "DEF");
        //// a er nå "ADBECF"
        //a = flett("IJKLMN","OPQ");
        //// a er nå "IOJPKQLMN"
        //a = flett("", "AB");
        //// a er nå "AB"
        //Tomme strenger er lovlig input.

        throw new UnsupportedOperationException();}

    public static String flett(String... s) {

        //Lag metoden public static String flett(String... s). Metoden
        //skal «flette» sammen alle strengene i tabellen s. Flettingen skal fortløpende
        //hente første tegn fra første streng, så første tegn fra andre streng, og så

        //videre. Etter siste streng begynner vi på ny med nå andre tegn fra første
        //streng, så andre tegn fra andre streng, og så videre. En «oppbrukt» streng
        //skal hoppes over. Den sammenflettede strengen skal returneres. Følgende
        //eksempel viser bruksområdet.
        //String a = flett("AM ", "L", "GEDS", "ORATKRR", "",
        //"R TRTE", "IO", "TGAUU");
        //// a er nå "ALGORITMER OG DATASTRUKTURER"
        //Det skal ikke gi feilmelding å sende inn null strenger (men svaret skal da bli
        //en tom streng), eller én streng (men svaret skal da bli den samme strengen).
        //Hint: Ved å bruke en dobbel for-løkke kan du nesten gå gjennom s[i][j],
        //hvor i tilsvarer hvilket «ord» man er på, og j er hvilken «bokstav» man er
        //kommet til. Men merk at vi vil gå gjennom j «tregere» enn i.


        throw new UnsupportedOperationException();}

    // Oppgave 8
    public static int[] indeksSortering(int[] a) {
        //Lag metoden public static int[] indeksSortering(int[] a). Den skal
        //returnere en tabell med indekser som beskriver en sortering av a, men tabellen a
        //skal ikke endres. Følgende eksempel beskriver et bruksområde.
        //int[] a = {6, 10, 16, 11, 7, 12, 3, 9, 8, 5};
        //int[] indeks = indeksSortering(a);
        //// a er uendret, indeks er nå {6, 9, 0, 4, 8, 7, 1, 3, 5, 2}.
        //Resultatet forteller oss nå at den minste verdien til a er på plassering 6, den nest
        //minste verdien er på plass 9, og så videre. Den største verdien kan da hentes ut
        //ved å se på siste element i indekstabellen, så maks(a) er derfor a[2], som er 16.
        //Koden
        //for (int i = 0; i < a.length; i++) System.out.print(a[indeks[i]] + " ");
        //skal derfor printe ut verdiene til a i stigende rekkefølge.
        //Det blir ikke lagt vekt på effektivitet, kun at koden fungerer. Du kan lage
        //hjelpetabeller om du ønsker (og må jo lage minst én, tabellen som skal returneres).
        //Tabellen a kan ha like verdier, og da vil løsningen ikke være entydig. Om den
        //minste verdien for eksempel forekomme to ganger, spiller det ingen rolle hvilken
        //av dem indeks[0] refererer til. Men indeks[1] må da referere til den andre av
        //dem. Om a er en tom tabell, skal den returnerte tabellen også være en tom tabell.


        throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] tredjeMin(int[] a) {
        //Lag metoden public static int[] tredjeMin(int[] a), som finner indekse-
        //ne tilhørende de tre minste verdiene i tabellen a. Den returnerer en tabell med
        //lengde 3, hvor den første verdien skal være indeksen til den minste verdien i a,
        //den andre verdien skal være indeksen til den nest minste verdien i a, og den tredje
        //verdien er indeksen til den tredje minste verdien i a.
        //Bruk samme idé som i Programkode 1.2.5 a). Bruk tre hjelpevariabler for
        //verdier, og tre hjelpevariabler for indekser. Bruk indeksSortering() fra forrige
        //oppgave for å gi dem korrekte startverdier. Dette gjør du ved å bruke den på kun
        //de tre første verdiene i a. Ikke bruk indeksSortering() på hele a, da dette blir
        //alt for ueffektivt. Metoden vil bli testet for å se om den er for ueffektiv.
        //Om tabellen a har færre enn tre elementer, skal det kastes en
        //NoSuchElementException med en passende tekst. Metoden skal ikke endre på
        //innholdet i a.

        throw new UnsupportedOperationException();}

    // Oppgave 10
    public static boolean inneholdt(String a, String b) {
        //I denne oppgaven sier vi at en streng er inneholdt i en annen streng, dersom hver
        //bokstav i den første strengen forekommer minst like mange ganger i den andre
        //strengen, men ikke nødvendigvis i samme rekkefølge. Noen eksempler:
        //• Strengen ABBA er inneholdt i ABBABBA, BARBARER, og RABARBRA.
        //• Strengen ABBA er ikke inneholdt i BARBERER, eller AKROBAT.
        //I de første eksemplene ser vi at alle ordene inneholder minst to A-er, og minst to
        //B-er, og derfor vil ABBA være inneholdt i dem. I de neste eksemplene ser vi at
        //BARBERER har to B-er, men kun én A, og AKROBAT har to A-er, men kun én
        //B. ABBA vil derfor ikke være inneholdt i dem.
        //Lag metoden public static boolean inneholdt(String a, String b),
        //som forteller om strengen a er inneholdt i strengen b. Det vil si, metoden skal
        //returnere true dersom a er inneholdt i b, og false ellers. Du kan om du ønsker
        //anta at begge strengene kun har store bokstaver (A-Å). Det er ingen grense på
        //hvor lange ordene kan være.
        //Metoden må lages så den er relativt effektiv. En av testene vil måle effektivitet
        //på store strenger.
        //Hint: Om du gjør om en bokstav til et heltall, kan du bruke en tabell med lengde
        //256 til å telle opp hvor mange ganger du har sett en bokstav. For eksempel vil
        //antall[(int) 'A'] += 1 øke antall[65] med én.


        throw new UnsupportedOperationException();}
}