/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author paulbright
 */
public class TestPaths {
    public static void main(String[] args) {
        Path path1 = Paths.get("F:\\A\\B\\C");
        Path path2 = Paths.get("F:\\A");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
