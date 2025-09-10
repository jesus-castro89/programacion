# Ejemplo 5: El náufrago satisfecho (En caso de)

## Descripción

Tomaremos la misma descripción del ejemplo 2, pero ahora usaremos la estructura de control "En caso de" para resolver el
problema.

## Solución

Partiendo de lo visto sobre algoritmos, podemos plantear la solución al problema de la siguiente manera:

## Pseudocódigo

```
Algoritmo CostoHamburguesa

Definición de Variables:
    Entero: tipo, cantidad
    Real: total
    Lógico: tarjeta

1. INICIO
2. Escribir "Seleccione el tipo de hamburguesa a comprar:
                1. Sencilla
                2. Doble
                3. Triple"
3. Leer tipo
4. Escribir "Ingrese la cantidad a comprar"
5. Leer cantidad
6. En caso de tipo
        Caso 1:
            total= cantidad * 20.00
        Caso 2:
            total= cantidad * 25.00
        Caso 3:
            total= cantidad * 28.00
        Otro caso:
            Escribir "Tipo de hamburguesa no válido"
            total = 0
7. Escribir "El pago será con tarjeta?"
8. Leer tarjeta
9. Si tarjeta
    Entonces
        total *= 1.05
10. Escribir "El total de su compra es de ", total
11. FIN
```

## Diagrama de Flujo

```d2
vars: {
  d2-config: {
    layout-engine: dagre
    sketch: true
  }
}
A:"Inicio"{shape: oval}
B:"\"Seleccione el tipo de hamburguesa a comprar:\n1. Sencilla\n2. Doble\n3. Triple\""{shape: document}
C:"tipo"{shape: parallelogram}
D:"\"Ingrese la cantidad a comprar\""{shape: document}
E:"cantidad"{shape: parallelogram}
F:"tipo"{shape: diamond}
G:"total= cantidad * 20.00"{shape: rectangle}
H:"total= cantidad * 25.00"{shape: rectangle}
I:"total= cantidad * 28.00"{shape: rectangle}
J:"\"Tipo de hamburguesa no válido\ntotal = 0\""{shape: document}
P1:""{
    shape: circle
    width: 30
    height: 30
    }
K:"\"El pago será con tarjeta?\""{shape: document}
L:"tarjeta"{shape: parallelogram}
M:"tarjeta"{shape: diamond}
N:"total *= 1.05"{shape: rectangle}
O:"\"El total de su compra es de \", total"{shape: document}
P:""{
    shape: circle
    width: 30
    height: 30
    }
Q:"Fin"{shape: oval}

A -> B -> C -> D -> E -> F
F -> G: 1
F -> H: 2
F -> I: 3
F -> J: Otro caso
G -> P1
H -> P1
I -> P1
J -> P1
P1 -> K -> L
L -> M
M -> N: Sí
M -> P: No
N -> P
P -> O
O -> Q
```


```d2
vars: {
  d2-config: {
    layout-engine: dagre
    sketch: true
  }
}
A:"nCita <= 3"{shape: diamond}
B:|" costoCita = 200 
total = costoCita * nCita"|{shape: rectangle}
C:"nCita <= 5"{shape: diamond}
D:|" costoCita = 150
total = (600) + (costoCita * (nCita - 3))"|{shape: rectangle}
E:"nCita <= 8"{shape: diamond}
F:|" costoCita = 100
total = (900) + (costoCita * (nCita - 5))"|{shape: rectangle}
G:|" costoCita = 50
total = (1200) + (costoCita * (nCita - 8))"|{shape: rectangle}
H:"Fin"{shape: oval}

A -> B: Sí
A -> C: No
C -> D: Sí
C -> E: No
E -> F: Sí
E -> G: No
B -> H
D -> H
F -> H
G -> H
```