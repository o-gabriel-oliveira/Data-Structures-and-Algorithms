package data_structures

import data_structures.stack.ArrayStack

fun main() {
    val arrayStack = ArrayStack<Int>()

    for (number in 1..10)
        arrayStack.push(number)

    println(arrayStack.toString())

    for (number in 0.. 7)
        arrayStack.pop()

    println(arrayStack.toString())
    println("\nsize: ${arrayStack.size()}")
}
