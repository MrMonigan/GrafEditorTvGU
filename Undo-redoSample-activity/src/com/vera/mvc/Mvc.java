/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.mvc;

import com.vera.mvc.Controller.Controller;
import com.vera.mvc.Controller.Singleton;

/**
 *
 * @author Wera
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Singleton singleton = Singleton.getInstance(new Controller());
    }
    
}
