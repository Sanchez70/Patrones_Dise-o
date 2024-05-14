/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

import Bridge.control_remoto.ControlAvanzado;
import Bridge.control_remoto.ControlBasico;
import Bridge.dispositivos.Radio;
import Bridge.dispositivos.Tv;

/**
 *
 * @author DELL
 */
public class Demo {
    
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }
    
    public static void testDevice(Dispositivo device) {
        System.out.println("Pruebas con el control remoto basico");
        ControlBasico basicRemote = new ControlBasico(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Pruebas con el control remoto avanzado");
        ControlAvanzado advancedRemote = new ControlAvanzado(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
