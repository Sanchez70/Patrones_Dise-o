/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.CompressionDecorator;
import decorator.DataSource;
import decorator.DataSourceDecorator;
import decorator.EncryptionDecorator;
import decorator.FileDataSource;
import java.io.*;

/**
 *
 * @author 4lej4
 */
public class Demo {
    public static void main(String[] args) {
        File directory = new File("out");
if (!directory.exists()) {
    directory.mkdirs(); // Crea los directorios si no existen
}
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
