/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajojdbc.gestion_bancaria;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Alumnado
 */
@Entity
@Table(name = "Cuenta")
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findById", query = "SELECT c FROM Cuenta c WHERE c.id = :id"),
    @NamedQuery(name = "Cuenta.findByNumero", query = "SELECT c FROM Cuenta c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cuenta.findByContrasenia", query = "SELECT c FROM Cuenta c WHERE c.contrasenia = :contrasenia"),
    @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "Contrasenia")
    private String contrasenia;
    @Basic(optional = false)
    @Column(name = "Saldo")
    private int saldo = 0;
    @OneToMany(mappedBy = "cuenta")
    private Collection<Transacciones> transaccionesCollection;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID")
    @ManyToOne
    private Usuario iDUsuario;

    public Cuenta() {
    }

    public Cuenta(Integer id) {
        this.id = id;
    }

    public Cuenta(Integer id, int numero, String contrasenia, int saldo) {
        this.id = id;
        this.numero = numero;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Collection<Transacciones> getTransaccionesCollection() {
        return transaccionesCollection;
    }

    public void setTransaccionesCollection(Collection<Transacciones> transaccionesCollection) {
        this.transaccionesCollection = transaccionesCollection;
    }

    public Usuario getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Usuario iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabajojdbc.gestion_bancaria.Cuenta[ cuentaPK=" + id + " ]";
    }
    
}
