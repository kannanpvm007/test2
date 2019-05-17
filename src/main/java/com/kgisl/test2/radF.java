package com.kgisl.test2;

import java.io.File;

/**
 * radF
 */
public class radF {
    public static void main(String[] args) {




     
            File f = new File("D:\\Kannan\\test2\\RW");
            long fs = getFSE(f);
            System.out.println("bytes:" + fs);
            
     
     
        }   
     
        private static long getFSE(File folder) {
            long size = 0;
            for (File file : folder.listFiles()) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += getFSE(file);
                    double kb = (double) size / 1024;
                    double mb = (double) size / (1024 * 1024);
                    System.out.println("kb:" + kb + "\n mb:" + mb);
                }
     
            }
            return size;
     
            // System.out.println("byte:"+size);
            // System.out.println("kb:"+(long)size/1024);
            // System.out.println("mb:"+(long)size/(1024*1024));
     
        }
    }


    //     File data1 = new File("D:\\Kannan\\test2\\RW");
        
    //     File[] flo1 = data1.listFiles();
    //   //  for (File read : flo1) {

    //         long FS = data1.length();
    //         System.out.println("File name :"+data1.getName());
    //       long fs=getFolderSize(data1);

    //         System.out.println("File  in by: " + FS);
    //         System.out.println("File  in KB: " + (double) FS / 1024);
    //         System.out.println("File  in  MB:" + (double) FS / (1024 * 1024));
    //         System.out.println("\n");
    //    // }   
    // }

    // private static long getFolderSize() {
    //     return 0;
// }}

