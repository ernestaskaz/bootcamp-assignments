package com.bootcamp.assignments.DayFour;

import java.io.File;

public class IOHelpers {

    public static String megabytesSize(File file) {
        return "file size is : " + (double) file.length()/(1024*1024)+ " mb";
    }

    public static String kilobytesSize(File file) {
        return "file size is : " + (double) file.length()/1024+ "  kb";
    }

    public static String bytesSize(File file) {
        return "file size is : " +  file.length()+ " bytes";
    }
}
