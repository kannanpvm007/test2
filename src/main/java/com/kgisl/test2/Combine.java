package com.kgisl.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Combine
 */
public class Combine {
    public static void main(String[] args) throws IOException {

File file = new File("C:\\Users\\kannan.r\\Desktop\\RW\\one.txt"); 
File file2 = new File("C:\\Users\\kannan.r\\Desktop\\RW\\two.txt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) {
    //System.out.println(st); 
  }
System.out.println(st);


  } 

} 





