Algoritmo CalculadoraBasica
	// Declaración de variables
	Definir num1, num2, respuesta, suma, resta, multiplicacion, division Como Entero
	// Bucle para repetir el menú hasta que el usuario decida salir
	Repetir
		// Mostrar menú
		Escribir 'Escriba una de las siguientes opciones'
		Escribir '1. Suma'
		Escribir '2. Resta'
		Escribir '3. Multiplicación'
		Escribir '4. División'
		Escribir '5. Salir'
		// Leer la opción del usuario
		Leer respuesta
		// Estructura condicional (if-else if)
		Si respuesta>=1 Y respuesta<=4 Entonces
			Escribir 'Introduce el primer numero'
			Leer num1
			Escribir 'Introduce el segundo numero'
			Leer num2
		FinSi
		Si respuesta==1 Entonces
			suma <- num1+num2
			Escribir 'La suma de ', num1, ' y ', num2, ' es ', suma
		FinSi
		Si respuesta==2 Entonces
			resta <- num1-num2
			Escribir 'La resta de ', num1, ' y ', num2, ' es ', resta
		FinSi
		Si respuesta==3 Entonces
			multiplicacion <- num1*num2
			Escribir 'La multiplicacion de ', num1, ' y ', num2, ' es ', multiplicacion
		FinSi
		Si respuesta==4 Entonces
			// Prevención de división por cero
			Si num2<>0 Entonces
				division <- num1/num2
				Escribir 'La division de ', num1, ' y ', num2, ' es ', division
			SiNo
				Escribir 'Error: No se puede dividir por cero.'
			FinSi
		FinSi
		Si respuesta==5 Entonces
			Escribir 'Has seleccionado salir, saliendo...'
		FinSi
	Hasta Que respuesta==5
FinAlgoritmo
