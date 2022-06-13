public class classe {

    String primeiroNome, nomedoMeio, ultimoNome, agencia;
    int numero;
    double saldo, saque = 0, deposito = 0;

    public String getNomeCompleto(){

        String nomeCompleto = primeiroNome +" " + nomedoMeio +" " + ultimoNome;
        return nomeCompleto;
    }

    public String getAgencia(){

        String Agencia = agencia;
        return Agencia;
    }

    public int getNumero(){

        int Numero = numero;
        return Numero;
    }

    public double getSaldo(){

       double Saldo = saldo;
        return Saldo;
    }

    public double getSaque(){
        double Saque = (getSaldo() + deposito) - saque;
        return Saque;
    }

    public double getDeposito(){
        double Deposito = (getSaldo() - saque) + deposito;
        return Deposito;
    }
}
