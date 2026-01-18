# Árbol Binario en Java

## Objetivo del proyecto

Desarrollar en Java un programa que implemente un árbol binario de búsqueda (BST), permitiendo insertar, recorrer en inorden y buscar números. El propósito es que los estudiantes comprendan la estructura y funcionamiento de los árboles binarios, aplicar estas estructuras en código y documentar el trabajo en GitHub.

---

## Qué es un árbol binario 

Un árbol binario es una estructura de datos donde cada nodo tiene como máximo dos hijos: izquierdo y derecho.  
Un árbol binario de búsqueda (BST) organiza los datos para que, para cualquier nodo, los valores del subárbol izquierdo sean menores y los del subárbol derecho sean mayores. Esto permite búsquedas eficientes.

---

## Implementación 

- Lenguaje: Java.
- Estructura: clase `Node` para representar nodos; métodos recursivos para insertar, buscar y recorrer inorden.
- El programa incluye un menú en consola con opciones para insertar, imprimir inorden, buscar y salir.

---

## Ejemplo de ejecución 

1. Iniciar programa y ver menú.
2. Insertar estos números en orden: 40, 20, 60, 10, 30, 50, 70.
3. Seleccionar "Mostrar recorrido inorden" → salida: `10 20 30 40 50 60 70`
4. Buscar el número 30 → salida: `Número encontrado: 30`
5. Buscar el número 99 → salida: `No existe el número: 99`

---

## Capturas de pantalla 

### 1. Menú inicial  
![Menú inicial](capturas/menu.png)

### 2. Insertar números  
![Insertar números - parte 1](capturas/insert1.png)  
![Insertar números - parte 2](capturas/insert2.png)

### 3. Recorrido inorden  
![Recorrido inorden](capturas/inorder.png)

### 4. Buscar número existente  
![Buscar número existente](capturas/buscar_ok.png)

### 5. Buscar número inexistente  
![Buscar número inexistente](capturas/buscar_no.png)

### 6. Salir  
![Salir del programa](capturas/salir.png)








