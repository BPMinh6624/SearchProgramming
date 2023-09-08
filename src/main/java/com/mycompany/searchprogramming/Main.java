/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchprogramming;

import com.mycompany.searchprogramming.Common.Library;
import com.mycompany.searchprogramming.Model.Element;
import com.mycompany.searchprogramming.Controller.SearchProgramming;
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.getSize_array()));
        new SearchProgramming(element).run();    
    }
}
