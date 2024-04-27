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
public class EmpleadosPorHora extends Empleado{
    private int horasTrabajadas;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
     public EmpleadosPorHora() {
        super();
        horasTrabajadas = 0;
    }

    public EmpleadosPorHora(String nombre, double salarioInicial, int horasTrabajadas) {
        super(nombre, salarioInicial);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double CalcularSalarioAnual() {
        return getHorasTrabajadas() * getSalarioInicial();
    }
    
    @Override
         public void imprimirdatos(){
            super.imprimirdatos();
            System.out.println("Salario final: " + CalcularSalarioAnual());
            
        }
}
