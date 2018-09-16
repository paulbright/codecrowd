/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classloader_test;

import com.sun.javafx.util.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 *
 * @author paulbright
 */
public class TestClassLoad {

    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        TestClassLoad tc = new TestClassLoad();
        tc.printClassLoaders();
        LoadClass lc = new LoadClass();
        Class c = lc.loadClass("file:///Users/paulbright/develop/code_crowd/class3/package/", "org.co.paul.Hello");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        Method method = c.getMethod("sayHello");
        method.invoke(obj);
        Class[] cArg = new Class[1];
        cArg[0] = String.class;
        Method method2 = c.getMethod("sayHelloTo", cArg);
        method2.invoke(obj, "Paul");
    }

    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:"
                + TestClassLoad.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());

        System.out.println("Classloader of String:"
                + String.class.getClassLoader());
    }
}
