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

