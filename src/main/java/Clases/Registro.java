package Clases;

public class Registro {

    private String nombre;
    private double altura;
    private int nacimiento;

    /*public Registro(String nombre, double altura, int nacimiento) {
        this.nombre = nombre;
        this.altura = altura;
        this.nacimiento = nacimiento;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
}
