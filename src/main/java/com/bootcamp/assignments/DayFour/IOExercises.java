package com.bootcamp.assignments.DayFour;

import javax.print.DocFlavor;
import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOExercises {

    // https://www.w3resource.com/java-exercises/io/index.php

    public void startExercises()  {
        firstExercise();
        secondExercise();
        thirdExercise();
        fourthExercise();
        fifthExercise();
        sixthExercise();
        sevenExercise();
        eightExercise();
        nineExercise();
        tenExercise();
        elevenExercise();
        twelveExercise();
        thirteenExercise();
        fourteenExercise();
        fifteenExercise();
        sixteenExercise();
        seventeenExercise();
        eighteenExercise();
    }

    private void firstExercise() {
        //get list of files in directory
        File file = new File("/Users/Ernestas/IO test/");
        String[] fileList = file.list();
        for(String name:fileList) {
            System.out.println(name);
        }
    }

    private void secondExercise() {
        //Write a Java program to get specific files by extensions from a specified folder.
        File file = new File("/Users/Ernestas/IO test/");
        String[] fileList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().equals("work.txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String name :fileList){
            System.out.println(name);
        }

    }

    private void thirdExercise() {
        //Write a Java program to check if a file or directory specified by pathname exists or not
        File file = new File("/Users/Ernestas/IO test/aaa.txt");
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file does not exist");
        }

    }

    private void fourthExercise() {
        //Write a Java program to check if a file or directory has read and write permission.
        File file = new File("/Users/Ernestas/IO test/work.txt");
        if (file.canRead() && file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can read and write");
        } else {
            System.out.println(file.getAbsolutePath() + " can not read and write");
        }

    }

    private void fifthExercise() {
        //Write a Java program to check if given pathname is a directory or a file
        File file = new File("/Users/Ernestas/IO test/work.txt");
        if (file.isDirectory())
        {
            System.out.println(file.getAbsolutePath() + " is a directory.");
        }
        else
        {
            System.out.println(file.getAbsolutePath() + " is not a directory.");
        }
        if (file.isFile())
        {
            System.out.println(file.getAbsolutePath() + " is a file.");
        }
        else
        {
            System.out.println(file.getAbsolutePath() + " is not a file.");
        }

    }

    private void sixthExercise() {
        File file = new File("/Users/Ernestas/IO test/1.txt");
        File secondFile = new File("/Users/Ernestas/IO test/work.txt");
        try {
            BufferedReader readFirstFile = new BufferedReader(new FileReader(file));
            BufferedReader readSecondFile = new BufferedReader(new FileReader(secondFile));
            String firstString;
            String secondString;
            firstString = readFirstFile.readLine();
            secondString = readSecondFile.readLine();
            System.out.println(firstString);
            System.out.println(secondString);

            int comparison = firstString.compareTo(secondString);
            System.out.println(" lexicographical comparison of two files is" + comparison);

            readFirstFile.close();
            readSecondFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void sevenExercise() {

        File file = new File("/Users/Ernestas/IO test/work.txt");
        Date lastModified = new Date(file.lastModified());
        System.out.println(lastModified);

    }

    private void eightExercise() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("input some string : ");
//        try {
//            String someString = reader.readLine();
//            System.out.println("the thing you typed is : " + someString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }

    private void nineExercise() {
        File file = new File("/Users/Ernestas/IO test/work.txt");
        System.out.println(IOHelpers.bytesSize(file));
        System.out.println(IOHelpers.kilobytesSize(file));
        System.out.println(IOHelpers.megabytesSize(file));

    }

    private void tenExercise() {

        //TODO. reflect on this. read on basics. Why *2?
        File file = new File("/Users/Ernestas/IO test/work.txt");
        InputStream input = null;

        try {
            input = new FileInputStream(file);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = input.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(input != null) input.close();
            } catch(Exception ex){

            }
        }


    }

    private void elevenExercise() {

        BufferedReader reader = null;
        String line = "";
        File file = new File("/Users/Ernestas/IO test/multiplelines.txt");
        try {
            reader = new BufferedReader( new FileReader(file));
            while( (line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    private void twelveExercise() {

        // why last value is null?
        System.out.println("-------exercise twelve-----------------");

        StringBuilder builder = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/Ernestas/IO test/multiplelines.txt"));
            while (line != null) {

                if (line == null) {
                    break;
                }
                builder.append(line);
                line = reader.readLine();
                //builder.append(line);
//                builder.append(System.lineSeparator());
                System.out.println(line);
            }
            System.out.println("builder printed" + builder);
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }


    }

    private void thirteenExercise() {

        System.out.println("-------exercise 13-----------------");

        StringBuilder builder = new StringBuilder();
        String line = "";
        String appendedText = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/Ernestas/IO test/multiplelines.txt"));
            while (line != null)
            {
                appendedText += line;
                line = reader.readLine();

            }
            System.out.println(appendedText);
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }



    }

    private void fourteenExercise() {
        System.out.println("-------exercise 14-----------------");
        StringBuilder sb = new StringBuilder();
        File file = new File("/Users/Ernestas/IO test/multiplelines.txt");
        String line = "";
        List<String> list = new ArrayList<>();
        try { BufferedReader reader = new BufferedReader(new FileReader(file));

            while (line != null) {
                line = reader.readLine();

                if (line==null) {
                    break;
                }

                list.add(line);


            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("contents of list are" + list.toString());
        System.out.println("size is" + list.size());


    }

    private void fifteenExercise() {

        //no br

        System.out.println("-------exercise 15-----------------");

        String line = "";
        try
        {
            File newFile = new File("/Users/Ernestas/IO test/addline.txt");
            FileWriter writer = new FileWriter(newFile,false);
            //appends the string to the file
            writer.write("Something new \n");
            writer.write("Something new2 \n");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader(newFile));

            while (line != null)
            {

                line = reader.readLine();
                if (line==null) {
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException ioe)
        {
            System.err.println(ioe);
        }


    }

    private void sixteenExercise() {

        //with br

        System.out.println("-------exercise 16-----------------");
        StringBuilder builder = new StringBuilder();
        File file = new File("/Users/Ernestas/IO test/addline.txt");
        String line = "";
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write("new line from ex 16 \n");
            writer.write("another line from ex 16 \n");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));

            while (line != null) {

                builder.append(line);
                builder.append(System.lineSeparator());


                line = reader.readLine();
                System.out.println(line);


            }
        reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    private void seventeenExercise() {
        System.out.println("-------exercise 17-----------------");

//        String line = "";
//        try {
//            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("/Users/Ernestas/IO test/addline.txt"), "UTF-8"));
//            while (((line = reader.readLine()) != null) && reader.getLineNumber() <= 3){
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.err.println(e);
//        } catch (IOException e) {
//            System.err.println(e);
//        }
        File file = new File("/Users/Ernestas/IO test/addline.txt");
        String line = "";
        try {
           BufferedReader reader = new BufferedReader(new FileReader(file));
           int lineCount = 1;
            while (((line = reader.readLine()) != null) && lineCount <= 3){
                System.out.println("line count" + lineCount);
                System.out.println(line);
                lineCount++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    public void eighteenExercise()  {
        System.out.println("-------exercise 18-----------------");

        String longestWord = " ";
        String currentWord = " ";
        File file = new File("/Users/Ernestas/IO test/longestword.tx");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println(e);
        }
        while (scanner.hasNext()) {
            currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
        }

        }
        System.out.println("longest word from a given list is : " + longestWord);

    }


    public void eighteenExercise(File file) throws FileNotFoundException {
        System.out.println("-------exercise 18-----------------");


        String longestWord = " ";
        String currentWord = " ";
        Scanner scanner = null;
        scanner = new Scanner(file);


        while (scanner.hasNext()) {
            currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }

        }
        System.out.println("longest word from a given list is : " + longestWord);

    }
}
