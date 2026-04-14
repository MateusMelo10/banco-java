    public class Conta {
        double saldo;

        public void verSaldo() {
            System.out.println("Saldo: " + saldo);
        }
        public void depositar(double valor) {
            saldo += valor;
        }
        public void sacar(double valor) {
            if (valor > saldo) {
                System.out.println("Saldo Insuficiente");
            } else  {
                saldo -= valor;
            }
        }
    }
