package Cuenta;

public class Cuenta {

    private int saldo;
    private String numeroCuenta;

    public Cuenta(int saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int depositar(int valor) {
        this.saldo += valor;
        return valor;
    }

    public int retirar(int valor) throws FondosInsuficientesException {
        if (valor > saldo) {
            throw new FondosInsuficientesException("No hay suficientes fondos para retirar " + valor);
        }
        saldo -= valor;
        return saldo;
    }

    public int mostrarSaldo() {
        return this.saldo;
    }


}
