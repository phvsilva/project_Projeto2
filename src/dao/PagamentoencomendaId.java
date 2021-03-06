package dao;
// Generated 28/mai/2018 15:27:08 by Hibernate Tools 4.3.1



/**
 * PagamentoencomendaId generated by hbm2java
 */
public class PagamentoencomendaId  implements java.io.Serializable {


     private int idencomenda;
     private int idgestor;

    public PagamentoencomendaId() {
    }

    public PagamentoencomendaId(int idencomenda, int idgestor) {
       this.idencomenda = idencomenda;
       this.idgestor = idgestor;
    }
   
    public int getIdencomenda() {
        return this.idencomenda;
    }
    
    public void setIdencomenda(int idencomenda) {
        this.idencomenda = idencomenda;
    }
    public int getIdgestor() {
        return this.idgestor;
    }
    
    public void setIdgestor(int idgestor) {
        this.idgestor = idgestor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PagamentoencomendaId) ) return false;
		 PagamentoencomendaId castOther = ( PagamentoencomendaId ) other; 
         
		 return (this.getIdencomenda()==castOther.getIdencomenda())
 && (this.getIdgestor()==castOther.getIdgestor());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdencomenda();
         result = 37 * result + this.getIdgestor();
         return result;
   }   


}


