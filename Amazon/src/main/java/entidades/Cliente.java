/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jalt2
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column()
    private String nombre;
    
    @Column()
    private String ap_mat;
    
    @Column()
    private String ap_pat;
    
    @Column()
    private Date fch_nac;
    
    @OneToMany(mappedBy = "cliente")
    private List<ClientesTelefonos> telefonos;
    
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;
    
    
    private Integer edad;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String ap_mat, String ap_pat, Date fch_nac, List<ClientesTelefonos> telefonos, List<Pedido> pedidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.ap_mat = ap_mat;
        this.ap_pat = ap_pat;
        this.fch_nac = fch_nac;
        this.telefonos = telefonos;
        this.pedidos = pedidos;
        this.edad = edad;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    

    public Cliente(Long id, String nombre, String ap_mat, String ap_pat, Date fch_nac, List<ClientesTelefonos> telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.ap_mat = ap_mat;
        this.ap_pat = ap_pat;
        this.fch_nac = fch_nac;
        this.telefonos = telefonos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public Date getFch_nac() {
        return fch_nac;
    }

    public void setFch_nac(Date fch_nac) {
        this.fch_nac = fch_nac;
    }

    public List<ClientesTelefonos> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<ClientesTelefonos> telefonos) {
        this.telefonos = telefonos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ id=" + id + " ]";
    }
    
}
