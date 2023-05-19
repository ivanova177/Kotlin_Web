class Node(var key: Int) {
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree {
    private var root: Node? = null

    fun insert(key: Int) {
        root = insertRecursive(root, key)
    }

    private fun insertRecursive(current: Node?, key: Int): Node {
        if (current == null) {
            return Node(key)
        }

        if (key < current.key) {
            current.left = insertRecursive(current.left, key)
        } else if (key > current.key) {
            current.right = insertRecursive(current.right, key)
        }

        return current
    }

    fun search(key: Int): Boolean {
        return searchRecursive(root, key)
    }

    private fun searchRecursive(current: Node?, key: Int): Boolean {
        if (current == null) {
            return false
        }

        if (key == current.key) {
            return true
        }

        return if (key < current.key) {
            searchRecursive(current.left, key)
        } else {
            searchRecursive(current.right, key)
        }
    }

    fun delete(key: Int) {
        root = deleteRecursive(root, key)
    }

    private fun deleteRecursive(current: Node?, key: Int): Node? {
        if (current == null) {
            return null
        }

        if (key == current.key) {
            if (current.left == null && current.right == null) {
                return null
            }

            if (current.right == null) {
                return current.left
            }

            if (current.left == null) {
                return current.right
            }

            val smallestValue = findSmallestValue(current.right)
            current.key = smallestValue
            current.right = deleteRecursive(current.right, smallestValue)
            return current
        }

        if (key < current.key) {
            current.left = deleteRecursive(current.left, key)
        } else {
            current.right = deleteRecursive(current.right, key)
        }

        return current
    }

    private fun findSmallestValue(root: Node?): Int {
        return if (root?.left == null) {
            root!!.key
        } else {
            findSmallestValue(root.left)
        }
    }

    fun inorderTraversal() {
        inorderTraversalRecursive(root)
    }

    private fun inorderTraversalRecursive(node: Node?) {
        if (node != null) {
            inorderTraversalRecursive(node.left)
            println(node.key)
            inorderTraversalRecursive(node.right)
        }
    }
}

fun main() {
    val tree = BinaryTree()

    // Вставка элементов в дерево
    tree.insert(50)
    tree.insert(30)
    tree.insert(20)
    tree.insert(40)
    tree.insert(70)
    tree.insert(60)
    tree.insert(80)

    // Поиск элемента в дереве
    println(tree.search(60)) // Вывод: true
    println(tree.search(90)) // Вывод: false

    // Удаление элемента из дерева
    tree.delete(20)
    tree.delete(30)

    // Обход дерева
    println("Обход дерева:")
    tree.inorderTraversal()
}