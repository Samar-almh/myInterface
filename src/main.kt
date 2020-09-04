fun main(args: Array<String>) {
    val obj = Child()

    obj.son()
    obj.daughter()
}
interface A {

    fun son() {
        println("From interface A")
    }
}

interface B  {
    fun daughter() {
        println("From interface B")
    }
}

// implements two interfaces A and B
class Child: A, B


