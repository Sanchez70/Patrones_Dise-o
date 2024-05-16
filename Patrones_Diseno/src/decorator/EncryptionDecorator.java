/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.*;

/**
 *
 * @author 4lej4
 */
public class EncryptionDecorator extends DataSourceDecorator{
    //Toma a datasource como parametro
    //Llama al constructor de la clase datasourceSecorator y establece la fuente de datos que se va a decorar 
    public EncryptionDecorator(DataSource source) {
        super(source);
    }
//Sobrescribe el metodo writedata de la base y encripta los datos
    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }
//Sobrescribe el metodo readData para desencriptar los datos antes de leerlos y devolverlos 
    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
