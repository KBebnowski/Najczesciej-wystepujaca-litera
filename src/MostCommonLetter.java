/*
// You are given an implementation of a function
// String finalFunction(String s)
// that, given a non-empty string consisting of N English letters, returns the character which occurs most frequently in the string.
// If more than one character satisfies that requriment, the function should return the earliest alphabectically.
// For example, if both c and d are the most frequence letters, then the answer is c.
// For example, given is string:
// S = "Hello"
// the function should return letter . It appears twice in S, No other character appear as frequently.
// Plus will be when method will return how many times letter occurs
//
// Created By Kamil Bębnowski 02.10.2019r.
 */

import java.util.Arrays;

class MostCommonLetter {

    public static void finalFunction(String s){
        char[] word = s.toCharArray();                  //zamiana Stringa na tablice char'ow
        Arrays.sort(word);                              //posortowanie tablicy aby spelnialo zalozenia programu. Jesli ilosc liter A i B jest taka sama to wyswietl ta ktora jest wczesniej w alfabecie
        int length = word.length;                       //wyluskanie dlugosci tablicy
        CharToUpperCase(word, length);                  //zamiana liter na litery takiej samej wielkosci
        System.out.println(CountLetter(word, length));  //wyswietlenie wyniku metody ktora zwraca najczesciej wystepujaca litere
    }

    private static void CharToUpperCase(char[] word, int length) {
        for(int ii=0; ii<length; ii++){
            char mostFrequence = Character.toUpperCase(word[ii]);
            word[ii]=mostFrequence;
        }
    }

    public static String CountLetter (char[] word, int length){

        int globalcounter =0;
        char globalmostfrequence = 0;

        for(int ii=0; ii<length; ii++) {
            char mostfrequence = word[ii];
            int counter = 0;
            if (mostfrequence != ' ') {
                for (int jj = 0; jj < length; jj++) {
                    if (mostfrequence == word[jj]) {
                        counter++;
                        if (counter > globalcounter) {
                            globalcounter = counter;
                            globalmostfrequence = mostfrequence;
                        }
                    } else {
                        continue;
                    }
                }
            }
            else{
                continue;
            }
        }
        String result = globalmostfrequence + " - " + globalcounter;
        return result;
    }


    public static void main(String[] args)
    {
        String przykladowy_napis = "Ala ma kota i 3 psy";

        finalFunction(przykladowy_napis);
    }
}