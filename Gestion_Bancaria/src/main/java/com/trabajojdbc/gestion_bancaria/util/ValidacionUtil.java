package com.trabajojdbc.gestion_bancaria.util;

/**
 * Clase de utilidad que contiene los métodos estaticos para pequeñas verificaciones del código.
 * * @author Daniel
 */
public class ValidacionUtil {

    /**
     * Valida el formato del dni antes de trabajar con él.
     * @param dni DNI para comprobar si cumple el formato.
     * @return True si es un valor válido (8 números y 1 letra mayúscula) o false si no lo es
     */
    public static boolean dniCheck(String dni) {
        if (dni == null || dni.trim().isEmpty()) //Comprobamos que no es nulo ni está vacío
        {
            return false;
        }
        return dni.matches("^[0-9]{8}[A-Z]$"); //Aplicación de Regex (8 números y 1 letra mayúscula en ese orden)
    }

}
