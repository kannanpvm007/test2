package com.kgisl.test2;

import java.io.File;

/**
 9. Read a folder and get file size in bytes, kb, mb
 */
public class ReadFol {

public static void main(String[] args) {
    
//     File data = new File("C:\\Users\\kannan.r\\Desktop\\RW");
//     File[] flo = data.listFiles();
//     for(File read: flo){
    
//    String out= read.getName();
//    System.out.println(read.getParent().length());

//    System.out.println(read.hashCode());
//    System.out.println(out);
    
//         }



// FileWriter writer = new FileWriter("");  
//     BufferedWriter buffer = new BufferedWriter(writer);  
//     buffer.write("Welcome to javaTpoint.");  
//     buffer.close();  
//     System.out.println("Success");  
//     } 

System.out.println("____________________________________");

        File data1 = new File("C:\\Users\\kannan.r\\Desktop\\RW");
        File[] flo1 = data1.listFiles();
    for(File read: flo1){
    
   String out= read.getName();
   System.out.println("byet");
   System.out.println(out.getBytes());
  
   //System.out.println(read.getParent());

  // System.out.println(read.hashCode());
  // System.out.println(read);
   //System.out.println(out);


    
    }}}

