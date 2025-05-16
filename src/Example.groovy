class Example {
    def password = "plaintext123"  // should trigger HardCodedPassword

    def runQuery(String userInput) {
        def sql = "SELECT * FROM users WHERE name = '$userInput'" // should trigger SqlInjection
        println sql
    }

    def useMD5() {
        def digest = java.security.MessageDigest.getInstance("MD5") // should trigger UseOfInsecureCryptographicAlgorithm
    }
}


class Example {
    def badMethod() {
        println "Hello, world"
        def unused = 123
    }
}

class Example {

    static def myList = []
    def Name = "TestName" // Violates naming conventions

    def calculateStuff(int x) {
        if (x > 0)
        {
            println("Positive number") // println usage
        }
        else
        {
            println("Negative number") // println usage
        }

        def unusedVar = 42 // unused variable
        return x * 2
    }

    def insecureMethod() {
        def password = "plaintext123" // Hardcoded password
        def result = "SELECT * FROM users WHERE name = '$Name'" // SQL injection risk

        println("Running insecureMethod") // println again
    }

    def deeplyNestedMethod() {
        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        println("Too deeply nested") // DeeplyNestedIfStatement
                    }
                }
            }
        }
    }

    def longMethod() {
        println("Starting long method")
        1.upto(25) {
            println("Line: $it")
        }
    }

    void dummyMethod(){
        // Method with empty body – useless method
    }

    def duplicateCode() {
        println("This is duplicate code")
        println("This is duplicate code") // Possible DuplicateStringLiteral
    }

}

class Sample {
    def Password = "123456" // Violates naming convention and hardcoded password
    def calculate() {
        println "Calculating..." // Use of println
        def unusedVar = 42 // Unused variable
        if (true) {
            if (true) {
                if (true) {
                    println "Deeply nested if statements" // Deep nesting
                }
            }
        }
    }
}

import java.util.Random
import java.io.File

class Example extends java.rmi.server.UnicastRemoteObject {  // NonFinalSubclassOfSensitiveInterface

    public static String publicField = "test"  // NonFinalPublicField

    public Example() throws java.rmi.RemoteException {}

    def useInsecureRandom() {
        def r = new Random() // InsecureRandom
        println r.nextInt()
    }

    def createTempFile() {
        File.createTempFile("test", ".txt")  // FileCreateTempFile
    }

    def runExit() {
        System.exit(1)  // SystemExit
    }

    protected void finalize() throws Throwable {  // PublicFinalizeMethod + ObjectFinalize
        println("Finalizing...")
    }

    def arrayFunc() {
        def arr = [1, 2, 3]
        int[] nums = [1, 2, 3]  // UnsafeArrayDeclaration
    }

    def useJavaIO() {
        def f = new java.io.File("somefile.txt") // JavaIoPackageAccess
    }
}

