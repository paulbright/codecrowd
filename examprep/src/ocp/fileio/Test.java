/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.fileio;

/**
 *
 * @author paulbright
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
Below is the content of 'F:\Message.properties' file:
key1=Good Morning!
key2=Good Evening!
*/
public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties ();
        FileInputStream fis = new FileInputStream ("/Users/paulbright/develop/code_crowd/Message.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("key1"));
        System.out.println(prop.getProperty("key2", "Good Day!"));
        System.out.println(prop.getProperty("key3", "Good Day!"));
        System.out.println(prop.getProperty("key4"));
    }
}