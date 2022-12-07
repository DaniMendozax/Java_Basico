public class Cuenta {
    private String name;
    private String accountNumber;
    private double tipoInteres;
    private double saldo;

    // Constructor por defecto
    public Cuenta(){
    }

    //Constructor con parametros
    public Cuenta(String name, String accountNumber, double tipoInteres, double saldo){
        this.name = name;
        this.accountNumber = accountNumber;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public Cuenta(final Cuenta c){
        name = c.name;
        accountNumber = c.accountNumber;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo de ingreso
    public boolean ingreso(double n){
        boolean ingresoCorrecto = true;
        if (n < 0){
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }return ingresoCorrecto;
    }

    //Metodo reintegro
    public boolean reintegro(double n){
        boolean reintegroCorrecto = true;
        if (n < 0){
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    // Metodo transferecncia
    public  boolean transferencia(Cuenta c, double n){
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        }else {
            correcto = false;
        }
        return correcto;
    }
}
