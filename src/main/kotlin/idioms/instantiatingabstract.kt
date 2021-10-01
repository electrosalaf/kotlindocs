package idioms

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun main() {

    val myObject = object : MyAbstractClass() {

        override fun doSomething() {
            TODO("Not yet implemented")
        }

        override fun sleep() {
            TODO("Not yet implemented")
        }

    }
    myObject.doSomething()
}