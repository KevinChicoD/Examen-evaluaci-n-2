/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2da.evaluación.parcial;

/**
 *
 * @author invitado
 */
public abstract class Empleado implements MostrarDatos{
    private String nombre;
    private double salarioInicial;
    
    public Empleado() {
        nombre = "";
        salarioInicial = 0.0;
    }

    public Empleado(String nombre, double salarioInicial) {
        this.nombre = nombre;
        this.salarioInicial = salarioInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(double salarioInicial) {
        this.salarioInicial = salarioInicial;
    }
    
    @Override
    public void imprimirdatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario inicial: " + salarioInicial);
    }
    
    public abstract double CalcularSalarioAnual();
    
}
