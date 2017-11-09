package entidade;


public class EContaCorrente {
    private Double saldo = 0.0;

    public EContaCorrente() { }
    
    public EContaCorrente(Double saldo) {
        this.saldo = saldo;
    }

   
   //Metodo get para obter saldo 
    public Double getSaldo() {
        return saldo;
    }
//Metodo set para setar saldo
    public void setSaldo(Double saldo) {
        if(saldo == null) {
            throw new IllegalArgumentException("não é permitido saldo nulo");
        }
        this.saldo = saldo;
    }
    
}
