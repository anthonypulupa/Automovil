/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.automovil1;

import ec.edu.espoch.automovil1.Automovil.clase.Automovil;
import ec.edu.espoch.automovil1.Enum.TipoAutomovil;
import ec.edu.espoch.automovil1.Enum.TipoColor;
import ec.edu.espoch.automovil1.Enum.TipoCombustible;

/**
 *
 * @author anthony
 */
public class Automovil1 {      
 public static void main(String[] args) {
        Automovil auto = new Automovil("Mazda", 23, "ktm", TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 20, TipoColor.AZUL, 40, 2004);
        auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado();
        auto.acelerar(20);
        
        auto.desacelerar(50);
       
        auto.frenar();
       
    }
}


