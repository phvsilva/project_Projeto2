package dao;
// Generated 28/mai/2018 15:27:08 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Pagamentoencomenda generated by hbm2java
 */
public class Pagamentoencomenda  implements java.io.Serializable {


     private PagamentoencomendaId id;
     private BigDecimal valor;

    public Pagamentoencomenda() {
    }

    public Pagamentoencomenda(PagamentoencomendaId id, BigDecimal valor) {
       this.id = id;
       this.valor = valor;
    }
   
    public PagamentoencomendaId getId() {
        return this.id;
    }
    
    public void setId(PagamentoencomendaId id) {
        this.id = id;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}


