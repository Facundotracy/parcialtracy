/*
Crear programa que haga un menu con lo siguiente:
1-Calcular perímetro triángulo
2-Calcular superficie triángulo
3-Calcular perímetro cuadrado
4-Calcular superficie cuadrado
5-Salir
 */

package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Puesto 2.2
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numeroSw;
    String cadenaSw;
    cadenaSw = JOptionPane.showInputDialog("MENU\n1-Calcular perímetro de un triángulo\n2-Calcular superficie de un triángulo\n3-Calcular perímetro de un cuadrado\n4-Calcular superficie de un cuadrado\n5-Salir");
    numeroSw = Integer.parseInt(cadenaSw);
        switch (numeroSw) {
            case 1: 
                //Perímetro triángulo
                break;
            case 2:
                //Superficie triángulo
                break;
            case 3:
                //Perímetro cuadrado
                break;
            case 4:
                //Superficie cuadrado
                break;
            case 5:
                //Salir
                break;
        }
    }
    
}
