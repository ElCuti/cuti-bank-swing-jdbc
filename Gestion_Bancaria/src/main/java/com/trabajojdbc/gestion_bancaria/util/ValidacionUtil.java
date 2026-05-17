package com.trabajojdbc.gestion_bancaria.util;

/**
 *
 * @author Daniel
 */
public class ValidacionUtil {

    private ValidacionUtil() {
    }

    public static boolean dniCheck(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            return false;
        }
        return dni.matches("^[0-9]{8}[A-Z]$"); //Aplicación de Regex
    }

}
