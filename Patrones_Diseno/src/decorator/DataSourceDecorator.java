/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author 4lej4
 */
public class DataSourceDecorator implements DataSource{
    //Almacena una fuente de datos
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }
//Delega la llamada a la fuente de datos
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
//---
    @Override
    public String readData() {
        return wrappee.readData();
    }
}
