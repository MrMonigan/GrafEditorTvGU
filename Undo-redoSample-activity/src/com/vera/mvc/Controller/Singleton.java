/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vera.mvc.Controller;

/**
 *
 * @author mrmon
 */



public class Singleton {
    private static  Singleton instance;
     public Controller value;
     
    private Singleton(Controller value) {
        this.value = value;
    }
    
    private Singleton(){}
    public static Singleton getInstance(Controller value) {
		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
    
}
