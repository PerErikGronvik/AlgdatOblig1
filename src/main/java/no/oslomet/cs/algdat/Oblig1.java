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

    public static int antallUlikeUsortert(int[] a) { //hvilken som helst heltallstabell, ikke sortert, flere like verdier.

        if (a.length == 0) {
            return 0;
        } else if (a.length == 1) { //tabell med et tall har et unikt tall
            return 1;
        } else { //finner om tall har et likt etter seg.
            int likeTallTeller = 0;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        likeTallTeller++;
                        break;
                    }
                }
            }
            int unike = a.length - likeTallTeller;
            return unike;


        }
    }


    // Oppgave 4

    //lager en byttefunksjon
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Gjør om quicksorten til rekursiv og som bruker bytt og tar inn verdier
    public static void quicksortRange(int[] a, int v, int h) {
        int orginalV = v;
        int orginalH = h;
        if ((h - v) <= 0) { //om 0 eller et tall ferdig.
            return;
        } else if ((h - v) == 1) { //to elementer
            if (a[v] > a[h]) {
                bytt(a, v, h);
            }
            return;
        } else {// sortering
            boolean rangeSortert = false;
            int pivot = a[h];
            int pivotIndex = h;
            h--;
            while (!rangeSortert) {// sortering quicksort https://www.youtube.com/watch?v=Hoixgm4-P4M
                while (v <= h && a[v] < pivot) {
                    v++;
                }
                while (v <= h && a[h] >= pivot) {
                    h--;
                }
                if (v < h) {
                    bytt(a, v, h);
                } else { //ferdig
                    bytt(a, v, pivotIndex);
                    rangeSortert = true;
                }
            }
            quicksortRange(a, orginalV, (v - 1));
            quicksortRange(a, (v + 1), orginalH);
        }
    }


    public static void delsortering(int[] a) {
        //a = new int[]{1, 2, 3, 4, 5, 6};

        //tom og en verdi
        Boolean ferdig = false;
        int v = 0;
        int h = a.length - 1;
        while (!ferdig) {
            // Venstrepeker skal finne oddetall
            while (v <= h && a[v] % 2 != 0 && v < a.length) {
                v++;
            }
            // Høyrepeker skal finne oddetall.
            while (v <= h && a[h] % 2 == 0 && h > 0) {
                h--;
            }
            // når begge har funnet og ikke passert hverande, bytter tallene plass.
            if (v < h) {
                bytt(a, v, h);
            } else { //stopper løkken om alle partallene er til venstre
                ferdig = true;
            }

        }
        // Kjøre quicksort
        int startH = v;
        int startV = 0;
        quicksortRange(a, startV, (v - 1));
        quicksortRange(a, startH, (a.length - 1));
    }

    // Oppgave 5
    public static void rotasjon(char[] a) {
        //En rotasjon i en tom tabell eller tabell med nøyaktig ett element skal ikke gi
        //feilmelding, men rotasjonen vil da ikke gjøre noe.
        if (a.length == 0) {
        } else if (a.length == 1) {
        } else {
            char siste = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = siste;
        }
    }

    // Oppgave 6    Ikke obligatorisk
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


        throw new UnsupportedOperationException();
    }


    // Oppgave 7

    public static String flett(String s, String t) {
        int i = 0;
        int stringlengthV = s.length();
        int stringlengthH = t.length();
        String nyString = "";
        int stringLengthMax = Math.max(s.length(), t.length()); // finner lengste
        while (i < stringLengthMax) { //kjører gjennom hver bokstav
            if (i < stringlengthV) {
                nyString += s.charAt(i);
            }
            if (i < stringlengthH) {
                nyString += t.charAt(i);
            }
            i++;
        }
        return nyString;
    }
    public static String flett(String... s) {
        String nyString = "";
        int høyeste=0;
        for (int i = 0; i < s.length; i++) { // Finner lengste ord
            if (s[i].length()>høyeste){
                høyeste=s[i].length();
            }

        }
        for (int i = 0; i < høyeste; i++) { // går gjennomm ord
            for (int j = 0; j < s.length; j++) { // går gjennom bokstav
                if(i<s[j].length()) {
                    nyString += s[j].charAt(i);
                }
            }
        }
        return nyString;
    }


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

        throw new UnsupportedOperationException();
    }

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