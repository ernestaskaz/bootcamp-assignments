package com.bootcamp.assignments.DayFour;

import java.util.*;

public class DayFour {


    public void firstAssignment() {

        // 1. declare and initialize String array with 7 arbitrary colors.
        String[] initialColors = {"blue", "red", "black", "yellow", "purple", "orange", "beige"};
        // 2. Create new list "colors" (ArrayList) of type String
        ArrayList<String> colors =  new ArrayList<String>();
        // 3. Copy/add all elements from String array to colors list

        for (String color: initialColors) {
            colors.add(color);

        }
        System.out.println("copied colors" + colors);
        // 4. Remove 3rd element from colors list
        colors.remove(2);
        // 5. Add new color at the end of the colors list
        colors.add("brown");
        System.out.println("removed 3rd element black and added brown " + colors);
        // 6. Add new color at the beginning of the colors list
        colors.add(0, "white");
        System.out.println("added white to zero index " + colors);

        // 7. Loop through colors list and output all values (use for each loop)
        for (String color: colors) {
            System.out.println("7. Loop color is " + color);

        }
        // 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
        // index 2 to index 5)
        List<String> colorsSublist = colors.subList(2, 5);
        //    (hint: take a look at List interface and find a method which you can use to achieve this)
        // 9. Use for loop to output each element of colorsSublist list
        for (int i = 0; i < colorsSublist.size(); i++) {
            System.out.println("9 sublist colors are " + colorsSublist.get(i));

        }



}


    public void secondAssignment() {

        //lowerCase words and put them into an Array.
        String loweredText = Text.TEXT.toLowerCase();
        String[] wordsArray = loweredText.split("\\s+");


        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        //convert array to a List to use methods
        List convertedList = Arrays.asList(wordsArray);
        //hashset takes only unique wordsArray
        HashSet<String> uniqueWordsSet = new HashSet<>(Arrays.asList(wordsArray));


        //populate hashmap with unique keys that are wordsArray
        for (String word: uniqueWordsSet) {
            wordCount.put(word, 0);
        }
        // get wordsArray frequency and put it into key value pair.
        System.out.println(" ");
        for (String word: wordCount.keySet()) {
           int value = Collections.frequency(convertedList, word);
            wordCount.put(word, value);

            // what if: push to stack, find each stack item in a uniqueWordsSet, ++ value, pop.

        }
        System.out.println(" ");
        for (String word: wordCount.keySet()) {
            System.out.println("word/key is " + word + " value is " +  wordCount.get(word));

        }
























    }



    }

