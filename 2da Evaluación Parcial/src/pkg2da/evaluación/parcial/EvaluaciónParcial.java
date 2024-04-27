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
public class EvaluaciónParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoTiempoCom tiempocom = new EmpleadoTiempoCom("Raul", 1500.50);
        imprimirdatos(tiempocom);
        
        System.out.println("");
        
        EmpleadosPorHora porhora = new EmpleadosPorHora("Kevin", 4564.50, 98);
        imprimirdatos(porhora);
        
        System.out.println("");
        EmpleadosPorContrato contra = new EmpleadosPorContrato("Luis", 4521.2);
        imprimirdatos(contra);
        
        System.out.println("");
        
        
       
    }
    public static void imprimirdatos(MostrarDatos datos){
        datos.imprimirdatos();
        //CASTING
        EmpleadoTiempoCom tiempocom;
        EmpleadosPorHora porhora;
        EmpleadosPorContrato contra;
}
}   
