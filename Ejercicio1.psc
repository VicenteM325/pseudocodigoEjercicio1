Algoritmo Ejercicio2
	Definir numero Como Entero
	Escribir "Ingrese un n�mero entero positivo menor a 100: "
	Leer numero
	Si numero > 0 & numero < 100 Entonces
		Para i <- 1 Hasta numero Con Paso 1 Hacer
			x <- azar(100)+1
			Escribir x, " " 
			Si x mod 2 == 0 Entonces
				c<- c+1 
			SiNo
				a<- a+1
			Fin Si
		Fin Para
		Escribir "La cantidad de n�meros pares es: " c
		Escribir "La cantidad de n�meros impares es: " a
	SiNo
	Escribir "El valor ingresado no es v�lido."
	Fin Si	
FinAlgoritmo