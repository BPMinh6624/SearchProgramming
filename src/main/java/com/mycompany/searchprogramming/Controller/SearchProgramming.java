/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchprogramming.Controller;

import com.mycompany.searchprogramming.Common.Algorithm;
import com.mycompany.searchprogramming.Common.Library;
import com.mycompany.searchprogramming.Model.Element;
import com.mycompany.searchprogramming.View.Menu;

public class SearchProgramming extends Menu<String>{
    
    static String[] mc = {"Linear search", "Binary search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("SEARCH PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int n) {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        switch (n) {
            case 1:
                int res=algorithm.linearSearch(array, value);
                if (res == -1) System.out.println("Not found");
                else System.out.println("The target: "+value+ " is found at index: "+res);
                break;
            case 2:
                int result=algorithm.binarySearch(array, value);
                if (result == -1) System.out.println("Not found");
                else System.out.println("The target: "+value+ " is found at index: "+result);
                break;
            case 3:
                System.exit(0); 
                
        }
        run();
    }

}
