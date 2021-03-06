package za.co.standardbank.workfusion.rpa.robots.ao.ui;

public class PackageTest
{
    public static void main(String [] args){
        System.out.println("Cool !");
    }
}

/*

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ ls
PackageTest.java  Test.class  Test.java

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ mkdir -p za/co/standardbank/workfusion/rpa/robots/ao/ui

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ ls
PackageTest.java  Test.class  Test.java  za

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ javac PackageTest.java

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ java PackageTest
Error: Could not find or load main class PackageTest

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ ls
PackageTest.class  PackageTest.java  Test.class  Test.java  za

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ mv PackageTest.class za/co/standardbank/workfusion/rpa/robots/ao/ui

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ ls
PackageTest.java  Test.class  Test.java  za

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ java za/co/standardbank/workfusion/rpa/robots/ao/ui/PackageTest
Cool !

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ java  za.co.standardbank.workfusion.rpa.robots.ao.ui.PackageTest
Cool !

$ ls
PackageTest.java  test  za

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ jar cvf pktest.jar za*
added manifest
adding: za/(in = 0) (out= 0)(stored 0%)
adding: za/co/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/rpa/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/rpa/robots/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/rpa/robots/ao/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/rpa/robots/ao/ui/(in = 0) (out= 0)(stored 0%)
adding: za/co/standardbank/workfusion/rpa/robots/ao/ui/PackageTest.class(in = 469) (out= 323)(deflated 31%)

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ java -cp * za.co.standardbank.workfusion.rpa.robots.ao.ui.PackageTest
Error: Could not find or load main class pktest.jar

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ mkdir buildtest

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ mv pktest.jar buildtest/

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1
$ cd buildtest/

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1/buildtest
$ java -cp * za.co.standardbank.workfusion.rpa.robots.ao.ui.PackageTest
Cool !

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1/buildtest
$ java -cp pktest.jar za.co.standardbank.workfusion.rpa.robots.ao.ui.PackageTest
Cool !

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1/buildtest
$ java -cp ./* za.co.standardbank.workfusion.rpa.robots.ao.ui.PackageTest
Cool !

A142400@24087JNBITD866L /cygdrive/c/develop/code_crowd/class1/buildtest
$


Class path entries can contain the basename wildcard character *, which is considered equivalent to specifying a list of all the files in the directory with the extension .jar or .JAR. For example, the class path entry foo/* specifies all JAR files in the directory named foo. A classpath entry consisting simply of * expands to a list of all the jar files in the current directory.

A class path entry that contains * will not match class files. To match both classes and JAR files in a single directory foo, use either  foo;foo/* or foo/*;foo. The order chosen determines whether the classes and resources in foo are loaded before JAR files in foo, or vice versa.

Subdirectories are not searched recursively. For example, foo/* looks for JAR files only in foo, not in foo/bar, foo/baz, etc.

The order in which the JAR files in a directory are enumerated in the expanded class path is not specified and may vary from platform to platform and even from moment to moment on the same machine. A well-constructed application should not depend upon any particular order. If a specific order is required then the JAR files can be enumerated explicitly in the class path.

Expansion of wildcards is done early, prior to the invocation of a program's main method, rather than late, during the class-loading process itself. Each element of the input class path containing a wildcard is replaced by the (possibly empty) sequence of elements generated by enumerating the JAR files in the named directory. For example, if the directory foo contains a.jar, b.jar, and c.jar, then the class path foo/* is expanded into foo/a.jar;foo/b.jar;foo/c.jar, and that string would be the value of the system property  java.class.path.

The CLASSPATH environment variable is not treated any differently from the -classpath (or -cp) command-line option. That is, wildcards are honored in all these cases. However, class path wildcards are not honored in the Class-Path jar-manifest header.

Note: due to a known bug in java 8, the windows examples must use a backslash preceding entries with a trailing asterisk: https://bugs.openjdk.java.net/browse/JDK-8131329


*/