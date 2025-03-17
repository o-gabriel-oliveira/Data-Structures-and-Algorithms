package data_structures.stack

class ArrayStack<T>(private var capacity: Int = 2): Stack<T> {
    private var size: Int = 0
    private var elements: Array<Any?> = arrayOfNulls(capacity)

    private fun increaseCapacity() {
        this.capacity *= 2
        this.elements = elements.copyOf(capacity)
    }

    private fun decreaseCapacity() {
        this.capacity /= 2
        this.elements = elements.copyOf(capacity)
    }

    override fun push(element: T) {
        if (size >= capacity)
            increaseCapacity()
        this.elements[size++] = element
    }

    @Suppress("UNCHECKED_CAST")
    override fun pop(): T? {
        if (isEmpty())
            return null
        val element = elements[--size] as T
        this.elements[size] = null
        return element
    }

    @Suppress("UNCHECKED_CAST")
    override fun peek(): T? {
        if (isEmpty())
            return null
        return elements[size] as T
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun size(): Int {
        return size
    }
}
