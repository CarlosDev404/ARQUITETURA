package  br.edu.iftm.ds.exemplos.arquitetura.domain;




public class Cliente {




     private Integer codigo;




     private  String nome ;




      public Cliente ( Integer codigo , String nome) {
          this.codigo = codigo;
          this.nome = nome;




      }
      public Integer getCodigo() {
          return codigo;
      }
       public void setCodigo(Integer codigo) {
           this.codigo = codigo;
       }




       public String getName(){
           return nome;
       }
        public void setNome(String nome) {
            this.nome = nome;
           
        }
   
}
