package dao;
// Generated 28/mai/2018 15:27:08 by Hibernate Tools 4.3.1



/**
 * PagamentoId generated by hbm2java
 */
public class PagamentoId  implements java.io.Serializable {


     private int codpedido;
     private int idcliente;

    public PagamentoId() {
    }

    public PagamentoId(int codpedido, int idcliente) {
       this.codpedido = codpedido;
       this.idcliente = idcliente;
    }
   
    public int getCodpedido() {
        return this.codpedido;
    }
    
    public void setCodpedido(int codpedido) {
        this.codpedido = codpedido;
    }
    public int getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PagamentoId) ) return false;
		 PagamentoId castOther = ( PagamentoId ) other; 
         
		 return (this.getCodpedido()==castOther.getCodpedido())
 && (this.getIdcliente()==castOther.getIdcliente());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodpedido();
         result = 37 * result + this.getIdcliente();
         return result;
   }   


}

