package Classes;

public class TestaBanco {

      public static void main(String[] args) {
        
           Cliente lais = new Cliente();
           lais.nome = "Lais Fernanda";
           lais.cpf = "095.568.482-12";
           lais.profissao = "Desenvolvedora";
           
           Conta contaDaLais  = new Conta();
           contaDaLais.deposita(100);
                    
           contaDaLais.titular = lais;
           System.out.println(contaDaLais.titular.nome);
                   
      }
    
}
