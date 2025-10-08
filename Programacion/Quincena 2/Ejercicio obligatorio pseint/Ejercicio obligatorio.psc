Algoritmo sin_titulo
	Escribir 'cual es al duración de la llamada? (en minutos)'
	Leer llamada
	Si llamada>0 Entonces
		Escribir 'la llamada no puede ser menor que 0'
	SiNo
		Si llamada<=5 Entonces
		
		FinSi
		llamada <- llamada*0.3
		Si llamada>5 y llamada <= 8 Entonces
			llamada = llamada * 0.5
			Si llamada > 8 y llamada <= 10 Entonces
				llamada = llamada * 0.4
				Si llamada > 10 Entonces
					llamada = llamada * 0.2
				FinSi
			FinSi
		FinSi
		Escribir 'La llamada es domingo? V/F'
		Leer dia
		Si dia = V Entonces
			llamada = llamada * 0.03
		SiNo
			Escribir 'La llamada es turno de mañana (M) o tarde(T)? M/T'
			Leer turno
		FinSi
	FinSi
FinAlgoritmo
