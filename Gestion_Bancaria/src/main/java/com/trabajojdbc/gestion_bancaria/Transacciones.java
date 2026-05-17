package com.trabajojdbc.gestion_bancaria;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "Transacciones")
@NamedQueries({
    @NamedQuery(name = "Transacciones.findAll", query = "SELECT t FROM Transacciones t"),
    @NamedQuery(name = "Transacciones.findById", query = "SELECT t FROM Transacciones t WHERE t.id = :id"),
    @NamedQuery(name = "Transacciones.findByCantidad", query = "SELECT t FROM Transacciones t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Transacciones.findByFecha", query = "SELECT t FROM Transacciones t WHERE t.fecha = :fecha")})
public class Transacciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "Fecha")
    private String fecha;
    @JoinColumn(name = "ID_CuentaE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cuenta cuentaEmisor;
    @JoinColumn(name = "ID_CuentaR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cuenta cuentaReceptor;
    @Column(name = "Comentario")
    private String comentario;

    public Transacciones() {
    }

    public Transacciones(Integer id) {
        this.id = id;
    }

    public Transacciones(double cantidad, String fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transacciones)) {
            return false;
        }
        Transacciones other = (Transacciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trabajojdbc.gestion_bancaria.Transacciones[ transaccionesPK=" + id + " ]";
    }

    public Cuenta getCuentaEmisor() {
        return cuentaEmisor;
    }

    public void setCuentaEmisor(Cuenta cuentaEmisor) {
        this.cuentaEmisor = cuentaEmisor;
    }

    public Cuenta getCuentaReceptor() {
        return cuentaReceptor;
    }

    public void setCuentaReceptor(Cuenta cuentaReceptor) {
        this.cuentaReceptor = cuentaReceptor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
