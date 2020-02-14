# language: es
Característica: Calculadora de Windows
  Yo como usuario del sistema operativo windows quiero utilizar la calculadora por defecto
  para realizar operaciones básicas.

  Escenario: Operación básica de suma de dos enteros.
    Dado la calculadora esta en modo Científico
    Cuando se realiza la suma de 250 mas 850
    Entonces se verifica que el resultado de la suma es 1100
