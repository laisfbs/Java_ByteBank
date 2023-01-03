
package Classes;

public class Conta {
    
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
  
    //metodo sem retorno
  public void deposita(double valor){
           this.saldo += valor;
  }
 
  //metodo com retorno
 public boolean saca(double valor){
     if(this.saldo >= valor){
         this.saldo -= valor;
         return true;
     } else {
         return false;
     }
 }
 
 public boolean transfere(double valor, Conta destino){
    if(this.saldo >= valor){
    this.saldo -= valor;
    destino.deposita(valor);
    return true;
} else{
        return false;
    }
      }
 
         }