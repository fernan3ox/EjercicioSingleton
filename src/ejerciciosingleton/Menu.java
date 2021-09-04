/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class Menu {
    private static Menu instancia;
    
    private Menu(){}
    
    public static Menu getInstancia(){
        if (instancia == null) {
            instancia=new Menu();
        }
        return instancia;
    }
    public void Principal(){
        
        int opcion=0;
        
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("***Menu*** \n 1.Multiplicar \n 2.Dividir \n 3.Salir"));
            
            switch(opcion){
                case 1:
                    Multiplicar();
                    break;
                case 2:
                    Dividir();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Final de la ejecucion");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Precione una opcion para continuar");
                    
            }
            
            
        } while (opcion==3);
        
        
    }

    private void Multiplicar() {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+(numero1*numero2));
    }

    private void Dividir() {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        if (numero1>numero2){
            JOptionPane.showMessageDialog(null, "La divicion es: "+(numero1/numero2));
            
        } else{
        
         JOptionPane.showMessageDialog(null, "El primer numero debe ser mayor al segundo");
        }
    }
}
