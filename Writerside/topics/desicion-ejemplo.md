# Ejemplo 1: Algoritmo de Decisión

“El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las cuales tienen un costo de $20.00, $25.00
y $28.00 respectivamente. La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que los
clientes adquieren solo un tipo de hamburguesa, realice un algoritmo para determinar cuánto debe pagar una persona por N
hamburguesas.

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

![Diagrama sin título.drawio.png](Diagrama sin título.drawio.png)