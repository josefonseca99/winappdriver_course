# language: es
Característica: Calculadora de Windows
  Yo como usuario del sistema operativo windows quiero utilizar la calculadora cientifica
  para realizar operaciones basicas.

  Escenario: Operacion basica de suma de dos enteros.
    Dado la calculadora esta en modo Cientifico
    Cuando se realiza la suma de 1001 mas 1000
    Entonces se verifica que el resultado de la suma es 2001
