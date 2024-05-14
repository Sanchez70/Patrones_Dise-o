/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge.control_remoto;

import Bridge.ControlRemoto;
import Bridge.Dispositivo;

/**
 *
 * @author DELL
 */
public class ControlBasico implements ControlRemoto{
    
    protected Dispositivo device;

    public ControlBasico() {
    }

    public ControlBasico(Dispositivo device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Control: Botón de encendido");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Control: bajar volumen");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Control: subir volumen");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Control: retroceder canal");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Control: avanzar canal");
        device.setChannel(device.getChannel() + 1);
    }    
}