import java.util.Scanner;

/**
 * BinaryTreeApp.java
 *
 * Programa sencillo que implementa un árbol binario de búsqueda (BST) para
 * enteros.
 * Funcionalidades:
 * - Insertar números
 * - Recorrer inorden (mostrar orden ascendente)
 * - Buscar un número (indica si existe o no)
 *
 * 
 *
 * Autor: (Kevin Royo)
 */

public class BinaryApp {
    // Nodo del árbol
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int v) {
            value = v;
            left = null;
            right = null;
        }
    }

    // Raíz del árbol
    private Node root;

    public BinaryApp() {
        root = null;
    }

    // Insertar un valor en el árbol
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    // Buscar un valor en el árbol
    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value) {
        if (current == null)
            return false;
        if (value == current.value)
            return true;
        return value < current.value
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    // Recorrido inorden (izquierda - raíz - derecha)
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node node) {
        if (node == null)
            return;
        inorderRecursive(node.left);
        System.out.print(node.value + " ");
        inorderRecursive(node.right);
    }

    // Menú de consola
    private void runMenu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = readInt(sc);
            switch (option) {
                case 1:
                    System.out.print("Ingrese número a insertar: ");
                    Integer nInsert = readIntNullable(sc);
                    if (nInsert != null) {
                        insert(nInsert);
                        System.out.println("Número insertado: " + nInsert);
                    } else {
                        System.out.println("Entrada inválida. No se insertó.");
                    }
                    break;
                case 2:
                    System.out.println("Recorrido inorden (orden ascendente):");
                    inorder();
                    break;
                case 3:
                    System.out.print("Ingrese número a buscar: ");
                    Integer nSearch = readIntNullable(sc);
                    if (nSearch != null) {
                        boolean found = contains(nSearch);
                        System.out.println(found ? "Número encontrado: " + nSearch : "No existe el número: " + nSearch);
                    } else {
                        System.out.println("Entrada inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo. Gracias.");
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione 1-4.");
            }
            System.out.println();
        } while (option != 4);
        sc.close();
    }

    private void printMenu() {
        System.out.println("=== Árbol Binario (BST) - Menú ===");
        System.out.println("1. Insertar número");
        System.out.println("2. Mostrar recorrido inorden");
        System.out.println("3. Buscar número");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
    }

    private int readInt(Scanner sc) {
        if (sc.hasNextInt()) {
            int v = sc.nextInt();
            sc.nextLine();
            return v;
        } else {
            sc.nextLine();
            return -1;
        }
    }

    private Integer readIntNullable(Scanner sc) {
        if (sc.hasNextInt()) {
            int v = sc.nextInt();
            sc.nextLine();
            return v;
        } else {
            sc.nextLine();
            return null;
        }
    }

    public static void main(String[] args) {
        BinaryApp app = new BinaryApp();

        app.runMenu();
    }
}
