package com.bootcamp.assignments.DayFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExercise {

    //shuffle, reverse, copy,

    // List<String> sub_List = list_Strings.subList(0, 3); - indexes FROM -> TO include these values;

    // joining; new AL with AL.add(list); AL.add(list2);

    // cloning; ArrayList<String> newc1 = (ArrayList<String>)c1.clone(); //  ArrayList<String> test = (ArrayList<String>) ((ArrayList<String>) firstList).clone();

    public void startAssignments() {
        compareArrayLists();
        swapElements();

    }

    private void compareArrayLists () {
        System.out.println("---------compare lists--------");

        List<String> firstList = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        List<String> secondList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        Collections.shuffle(firstList);
        Collections.shuffle(secondList);
        System.out.println(firstList);
        System.out.println(secondList);

        ArrayList<String> comparable = new ArrayList<String>();
        for (String string : secondList)
            comparable.add(firstList.contains(string) ? "Yes" : "No");
        System.out.println(comparable);




    }

    private void swapElements() {

        List<String> firstList = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four"));
        String tempString = firstList.get(0);
        firstList.set(0, firstList.get(1));
        firstList.set(1, tempString);
        System.out.println(firstList);
        Collections.swap(firstList, 3, 4);
        System.out.println(firstList);
    }



}
