/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajojdbc.gestion_bancaria.util;

/**
 *
 * @author jc324
 */
public class ValidacionUtil {
    private ValidacionUtil() {}
    
    public static boolean dniCheck(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            return false;
        }
        return dni.matches("^[0-9]{8}[A-Z]$"); //Aplicación de Regex
    }
    
    
}
