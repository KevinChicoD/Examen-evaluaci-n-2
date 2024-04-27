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
public class EmpleadoTiempoCom extends Empleado{
    
    public EmpleadoTiempoCom() {
        super();
    }
    
     public EmpleadoTiempoCom(String nombre, double salarioInicial) {
        super(nombre, salarioInicial);
     }

    @Override
    public double CalcularSalarioAnual() {
        return getSalarioInicial() * 12 + (getSalarioInicial() * .1);
       }
    
     @Override
         public void imprimirdatos(){
            super.imprimirdatos();
            System.out.println("Salario final: " + CalcularSalarioAnual());
            
        }

    }

