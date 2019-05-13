package com.kgisl.test2;

import java.io.File;

/**
 * radF
 */
public class radF {
    public static void main(String[] args) {

        File data1 = new File("D:\\Kannan\\test2\\RW");
        
        File[] flo1 = data1.listFiles();
      //  for (File read : flo1) {

            long FS = data1.length();
            System.out.println("File name :"+data1.getName());

            System.out.println("File  in by: " + FS);
            System.out.println("File  in KB: " + (double) FS / 1000);
            System.out.println("File  in  MB:" + (double) FS / (1000 * 1000));
            System.out.println("\n");
       // }   
    }
}
