fun main() {
    sayHello()
    sayHello("With Parameter")
    sayHello(name = "Named Argument")
    sayHelloUnit("Return Unit")
    sayHelloDefault()

    var text = sayHelloReturn()
    println(text)

    text = sayHelloSingle()
    println(text)

    text = sayHelloVariadicArgument("This is ", "Function Variadic Argument")
    println(text)

    println(text.sayHello())

    fun sayHelloScope() {
        println("This is Function Scope")
    }
    sayHelloScope()

    val value = recursive(3)
    println(value)

    val lambdaExpression: (String) -> String = { name: String ->
        val result = "This Is Function $name"
        result
    }

    println(lambdaExpression("Lambda Expression"))
}

fun sayHello() {
    println("This is Function")
}

fun sayHello(name: String) {
    println("This is Function $name")
}

fun sayHelloUnit(name: String): Unit {
    println("This is Function $name")
}

fun sayHelloDefault(name: String = "Default Argument") {
    println("This is Function $name")
}

fun sayHelloReturn(): String {
    return "This is Function Return Type"
}

fun sayHelloSingle(): String = "This is Function Single Expression"

fun sayHelloVariadicArgument(vararg strings: String): String {
    var result = ""
    for (string in strings) {
        result += string
    }
    return result
}

fun String.sayHello(): String = "This is Function Extension"

fun recursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * recursive(value - 1)
    }
}