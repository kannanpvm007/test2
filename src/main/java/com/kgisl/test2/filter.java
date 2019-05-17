package com.kgisl.test2;

import java.io.File;
//import java.io.FilenameFilter;
import java.io.FilenameFilter;

/**
 * filter
 */
public class filter {
    public static void main(String[] args) {
        
    

    File data1 = new File("D:\\Kannan\\test2\\RW");
    String[] flter = data1.list(new FilenameFilter() {
    
        @Override
        public boolean accept(File dir, String name) {
            if(name.toLowerCase().endsWith(".txt")){
            return true;
        }else{ return false;}
        }
    });

    for(String ls:flter){
        System.out.println(ls);
    }
        
        //File[] flo1 = data1.listFiles();

    }
        
}