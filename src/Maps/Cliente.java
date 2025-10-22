package Maps;

public class Cliente {
    private String nombre;
    private String apellido;
    private int id;
    private long cuenta;
    private double saldo;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int id, long cuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", cuenta=" + cuenta +
                ", saldo=" + saldo +
                '}';
    }
}
