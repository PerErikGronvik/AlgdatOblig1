[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/VjzRkYWj)
# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* pegro6469, pegro6469@oslomet.no
* fikk kanskje til svar??

## Arbeidsfordeling
* pegro6469, kommer uansett til å prøve å gjøre alt. Evt passasjer får gjøre minst 3 oppgaver inkludert nr 8

## Oppgavebeskrivelser

### Forberedelse
Gjorde om all oppgavetekst til psudokode i kode filen. Få tak i templatefilene siden det ikke var tilgang til classroom og prøve å få git opp og gå. Begynte på oppgavene men har enda ikke peiling på git. Kom inn på classroom etter oppgave 1.

### Oppgave 1
Importerte java.util. Sjekket om det var 0 i array og returnerte feil, sjekket om det var 1 i arrayet for å unngå feil, returnerer tallet. Brukte en for-løkke for å løpe igjenneom og bytte ved nødvendighet. Deretter la jeg til en teller som la til 1 hver gang byttingen skjedde. Laget en ny formel for å representere funksjonen for gjennomsnittlige ombyttinger.
a: O(n) sammenligninger siden (n-1) er maks sammenligninger.
b: Det blir færrest ombyttinger når arrayet er sortert i synkende rekkefølge, 0 obyttinger.
c: Det blir flest ombyttinger når det første tallet også er det største. (n-1) ombyttinger.
d: Ved å kjøre public static double gjennomsnittligOmbyttinger(int[] a) kan du få gjennomsnittlig ombyttinger for arrayet a. 
e: Formelen for ombyttinger er. Summering av lengden n: n/n+1 der n >= 1. som blir: 1/2 +2/3 + 3/4 osv... som vil si O(n)
f: Når en bruker en vanlig maks algoritme er sannsynligheten summen av 1/(n+1) n >= 1. som blir 1/2 + 1/3 +1/4 osv. dette er O(log (n)). log (n) er bedre enn n, en annen måte å si det er at sjansen for bytting nærmer seg 100% sannsynlig for metoden, mens for en vanlig algoritme nærmer sannsynligheten for bytting seg null.

### Oppgave 2
Her ble det brukt mye tid på at for-løkken startet på 1 og skulle ha startet på 0. Jeg startet med kode for lengdene 0 og 1, enkle if statements. Jeg brukte en løkke og prøvde å være minimalistisk. Jeg teller derfor bare når det er en endring, dersom det er feil rekkefølge kaster jeg feil. Når tallet er likt er det mest effektivt å bare ikke telle enn å lage egen kode for det. 

### Oppgave 3
I oppgave 3 har jeg gjort tin unødvendig vanskelig. Vi vet at antall ulike = antallet - antallet like. For å finne antallet like kan jeg lete etter ett likt tall og telle og flytte pekeren om det finner et likt tall, deretter gjøre dette gjennom løllen til slutt kan jeg trekke alle tellinger fra a.length. Dette har jeg ikke gjort, for det blir for enkelt nettopp. Min kode har egen kode for 0-1 tall, for 2 og større kjører gjennom arrayet og finner minste tall og lagrer minste tall med hjelpevariabel for å holde styr på minste ubrukte tall. Jeg kjører gjennom tabellen mange ganger og dette er veldig innefektivt.

### Oppgave 4
Laget bytt funskjon for å komprimere koden. Delsorteringen i oddetall og partall. Her har jeg v<a.length og h>0 for å forhindre at løkken løper utenfor løkken og gir 0 peker ved en type. Skriptet velger høyre som pivot, det er en høyrepeker og en venstrepeker som går fra sidene mot midten, eskludert pivoten. Algoritmen bytter slik at oddetall havner på venste side og oddetall på høyre. Så kjøres qicksort på oddetall og partall hver for seg. 

### Oppgave 5
Lagrer et element og så skriver over alle element på siden, et om gangen.  Det lagrede elementet settes inn på slutten av algoritmen. 

### Oppgave 6
Ikke obligatorisk, kanskje senere.

### Oppgave 7



//Due by Sep 13, 2024, 21:59 UTC