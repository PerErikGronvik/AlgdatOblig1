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
d: Ved å kjøre public static double gjennomsnittligOmbyttinger(int[] a) kan du få gjennomsnittlig ombyttinger for arrayet a. Summering av lengden n: n/n+1 der n >= 1

### Oppgave 2
Her ble det brukt mye tid på at for-løkken startet på 1 og skulle ha startet på 0. Jeg startet med kode for lengdene 0 og 1, enkle if statements. Jeg brukte en løkke og prøvde å være minimalistisk. Jeg teller derfor bare når det er en endring, dersom det er feil rekkefølge kaster jeg feil. Når tallet er likt er det mest effektivt å bare ikke telle enn å lage egen kode for det. 

### Oppgave 3

//Due by Sep 13, 2024, 21:59 UTC