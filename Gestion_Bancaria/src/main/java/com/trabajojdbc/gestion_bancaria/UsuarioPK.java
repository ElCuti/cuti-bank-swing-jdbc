/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajojdbc.gestion_bancaria;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Alumnado
 */
@Embeddable
public class UsuarioPK implements Serializable {

    public UsuarioPK() {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
    
}
