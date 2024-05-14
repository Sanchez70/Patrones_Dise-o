/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge.control_remoto;

import Bridge.Dispositivo;

/**
 *
 * @author DELL
 */
public class ControlAvanzado extends ControlBasico{

    public ControlAvanzado(Dispositivo device) {
        super.device = device;
    }    

    public void mute() {
        System.out.println("Control: silenciar");
        device.setVolume(0);
    }
}
