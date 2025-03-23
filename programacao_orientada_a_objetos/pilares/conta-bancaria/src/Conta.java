public class Conta {
    private String numero;
    private double saldo;
    private double chequeEspecialTotal;
    private double chequeEspecialDisponivel;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.chequeEspecialTotal = calcularChequeEspecial();
        this.chequeEspecialDisponivel = this.chequeEspecialTotal;
    }

    private double getSaldo() {
        return saldo;
    }

    public double getValorChequeEspecialTotal() {
        return chequeEspecialTotal;
    }

    public double getChequeEspecialDisponivel() {
        return chequeEspecialDisponivel;
    }

    private void setChequeEspecialDisponivel(double chequeEspecialDisponivel) {
        this.chequeEspecialDisponivel = chequeEspecialDisponivel;
    }

    public double consultarSaldo() {
        return getSaldo();
    }

    public void depositar(double valor) {
        if (verificarUsoChequeEspecial()) {
            double valorChequeEspecialUsado = getValorChequeEspecialTotal() - getChequeEspecialDisponivel();
            double juros = valorChequeEspecialUsado * 0.2;

            if (valor >= juros) {
                valor -= juros;

                if (valor > getChequeEspecialDisponivel()) {
                    this.saldo = valor - getChequeEspecialDisponivel();
                    setChequeEspecialDisponivel(getValorChequeEspecialTotal());
                } else {
                    setChequeEspecialDisponivel(getChequeEspecialDisponivel() + valor);
                }
            } else {
                setChequeEspecialDisponivel(getChequeEspecialDisponivel() + valor);
            }
        } else {
            this.saldo += valor;
        }
    }
    
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(double valorBoleto) {
        if (valorBoleto <= saldo) {
            this.saldo -= valorBoleto;
            return true;
        } else if (valorBoleto <= (saldo + chequeEspecialDisponivel)) {
            this.chequeEspecialDisponivel -= valorBoleto - saldo;
            this.saldo = 0;
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarUsoChequeEspecial() {
        double chequeEspecialUsado = getValorChequeEspecialTotal() - getChequeEspecialDisponivel();
        return chequeEspecialUsado > 0 ? true : false;
    }

    private double calcularChequeEspecial() {
        double saldo = getSaldo();

        if (saldo <= 500) {
            return 50;
        } else {
            return saldo * 0.5;
        }
    }
}
