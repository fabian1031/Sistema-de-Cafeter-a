# Sistema de cafeteria 
Solución a las preguntas

## Ejercicio 1:
¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le
asignas 3.50?
RTA/
Usamos doublé porque el precio de algún producto suele incluir con decimales. En cambo int es para números enteros. 
Si declaramos el precio como int y le asignamos 3.50 al int nos va a generar errores de compilación

## Ejercicio 2:
¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese
operador?
RTA/
Utilizamos el operador > para validar que el subtotal es mayor a los 30.000. Devolvera un valor de tipo boolean true o false.

## Ejercicio 3:
¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en
este ejercicio donde el switch no sería la mejor opción?
RTA/
Cuando la condición no es un valor exacto sino un rango, por ejm si iva dependiera de precio es mayor a %5000, en ese caso no se puede expresar en un case, por que tocaria usar un if-else

## Ejercicio 4:
¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este
caso?
RTA/
Si la condición **While** nunca se vuelve falsa lo que ocurre es que se va a generar un bucle infinito. 
Para prevenir este caso se debe asegurar que dentro del ciclo tengamos una modificación de la variable de control, en este caso que vaya disminuyendo su valor inventario -= pedido).

## Ejercicio 5:
¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
el orden de ejecución.
RTA/
El ciclo do-while es mas apropiado ya que nos garantiza que el código se ejecute al menos una vez. 
Con while primero revisa la condición antes de ejecutar el bloque
con do-while primero ejecuta la accion y después revisa la condición

## Ejercicio 6:
¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando
conoces el número de elementos?
RTA/
Aunque ambos pueden hacer lo mismo, el for es más conveniente cuando conoces el número de elementos por que toda esta en la misma liena y no tengo que inicializar varialbes por fuera, evita descuidos como olvidar el contador.

## Ejercicio 7: 
El siguiente código tiene errores. Encuéntralos, corrígelos y explica cada uno.
public class CajaRegistradora { public static void main(String[] args) { int
cantidadVendida = "5"; double precioUnitario = 4500; double total = cantidadVendida *
precioUnitario boolean aplicaDescuento = (total > 20000); if (aplicaDescuento = true)
{ total = total - (total * 0.10); } System.out.println("Total: " + total); } }
Pregunta: ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
lógico? ¿Cómo los distingues?

Respuesta: 
Se encontraron 3 errores:
1. El primero fue en el int debia ir sin comillas, se esta intentando asignar un string a una variable de entero
2. Faltaba el ; después de precioUnitario
3. El de comparación en el if estaba como asignación y no comparacion




Integrantes:
- Fabian Beltran
- Ivan Chavez
- Maira Pinilla
