package dao;
// Generated 28/mai/2018 15:27:08 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * EncomendaProduto generated by hbm2java
 */
public class EncomendaProduto  implements java.io.Serializable {


     private EncomendaProdutoId id;
     private int idfornecedor;
     private short quantidade;
     private BigDecimal vlrunit;

    public EncomendaProduto() {
    }

    public EncomendaProduto(EncomendaProdutoId id, int idfornecedor, short quantidade, BigDecimal vlrunit) {
       this.id = id;
       this.idfornecedor = idfornecedor;
       this.quantidade = quantidade;
       this.vlrunit = vlrunit;
    }
   
    public EncomendaProdutoId getId() {
        return this.id;
    }
    
    public void setId(EncomendaProdutoId id) {
        this.id = id;
    }
    public int getIdfornecedor() {
        return this.idfornecedor;
    }
    
    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }
    public short getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }
    public BigDecimal getVlrunit() {
        return this.vlrunit;
    }
    
    public void setVlrunit(BigDecimal vlrunit) {
        this.vlrunit = vlrunit;
    }




}


