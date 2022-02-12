public class Account{
    private String nome;
    private double bal;

   

    public Account(String nome, double bal){
        this.nome = nome;

        if (bal > 0.0) {
            this.bal = bal;
        }
    }

    public void deposito(double deposito){
        if (deposito > 0.0) {
            bal = bal + deposito;
        }
    }

    public double getBal(){
        return bal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }


}