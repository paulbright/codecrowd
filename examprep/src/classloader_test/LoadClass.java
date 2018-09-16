/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classloader_test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 *
 * @author paulbright
 */
public class LoadClass {
   
    
    public LoadClass(){
        
    }
    //jarPath file:///home/locationJar/
    //classToLoad org.co.paul.Hello
    
    public Class loadClass(String jarPath, String classToLoad) throws MalformedURLException, ClassNotFoundException{
        URL url = new URL(jarPath);
        URL[] urls =  { url};
        
        URLClassLoader ucl = new URLClassLoader(urls);
        Class c = ucl.loadClass(classToLoad);
        return c;
    }
}
