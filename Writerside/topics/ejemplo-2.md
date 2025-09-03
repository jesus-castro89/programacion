# Ejemplo 2: El náufrago satisfecho

## Descripción

“El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las cuales tienen un costo de $20.00, $25.00
y $28.00 respectivamente. La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que los
clientes adquieren solo un tipo de hamburguesa, realice un algoritmo para determinar cuánto debe pagar una persona por N
hamburguesas.

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
6. Si tipo==1
    Entonces
        total= cantidad * 20.00
    En otro caso
        Si tipo == 2
            Entonces
                total= cantidad * 25.00
            En otro caso
                total= cantidad * 28.00
7. Escribir "El pago será con tarjeta?"
8. Leer tarjeta
9. Si tarjeta
    Entonces
        total *= 1.05
10. Escribir "El total de su compra es de ", total
11. FIN
```

## Diagrama de Flujo

![Diagrama sin título.drawio.png](Diagrama sin título.drawio.png)

## Explicación del Algoritmo

1. Se declaran las variables necesarias: `tipo` para el tipo de hamburguesa, `cantidad` para la cantidad a comprar,
   `total` para el costo total y `tarjeta` para indicar si el pago será con tarjeta.
2. Se solicita al usuario seleccionar el tipo de hamburguesa.
3. Se lee la opción seleccionada por el usuario.
4. Se solicita al usuario ingresar la cantidad de hamburguesas a comprar.
5. Se lee la cantidad ingresada por el usuario.
6. Se utiliza una estructura condicional para determinar el costo por unidad según el tipo de hamburguesa seleccionado:
   - Si el tipo es 1 (sencilla), se multiplica la cantidad por $20.00.
   - Si el tipo es 2 (doble), se multiplica la cantidad por $25.00.
   - Si el tipo es 3 (triple), se multiplica la cantidad por $28.00.
7. Se pregunta al usuario si el pago será con tarjeta.
8. Se lee la respuesta del usuario (verdadero o falso).
9. Si el pago es con tarjeta, se aplica un cargo del 5 % al total.
    * Para ello, se multiplica el total por 1.05.
10. Finalmente, se muestra el total de la compra al usuario.