# java-basic

## Sintaxis básica

Objetos (tipo de acceso) (estructura) (nombre) [ (tipo de relacion) (clase o interfaz) ] { (cuerpo) }
```java
public class MiClase extends MiOtraClase implements MiInterfaz {
// Cuerpo de la clase
}
```
Funcion o metodo (acceso) (objeto) (nombre)( ( (objeto)(nombre) ) )[ throws(Exception) ]{ (cuerpo) }
```java
public int sumar(int a, int b) throws Exception{ // Puede ser que b sea cero
// Cuerpo del método
return a / b;
}
```
Atributos (acceso) (objeto) (nombre) [ = new (objeto) ]
```java
private String nombre = "Ejemplo";
```
## Estructura de control

for( (atributo) ; (condicion) ; (incremento)){ (cuerpo) }
```java
for (int i = 0; i < 10; i++) { // Cuerpo del bucle }
```
for( (objeto) (nombre) : (iterable) ) { (cuerpo) }
```java
for (String elemento : listaDeStrings) {
// Cuerpo del bucle
}
```
if  (condicion)  { (cuerpo) } else{ (cuerpo) };
```java
if(a > b){ a }else{ b }
```
(objeto) (nombre) = (condicion) ?(valor a retornar si verdadero) : (valor a retornar si falso);
```java
int resultado = (a > b) ? a : b;
```
do{ (cuerpo) } while ( (condicion) ); ----> si condicion es true el bucle es infinito
```java
int i = 0;
do {
// Cuerpo del bucle
i++;
} while (i < 5);
```

switch( (variable) ) { case (resultado): (cuerpo) break; default: (cuerpo) break;}
```java
switch ( (variable) ) {
case (valor1):
// Cuerpo del caso 1
break;
case (valor2):
// Cuerpo del caso 2
break;
default:
// Cuerpo por defecto
break;
}
```
## Gestion de Errores

try{ (cuerpo con error) } catch ( (Exception) (nombre) ) { (cuerpo) } finally { (cuerpo) }

```java
try {
// Cuerpo con posibles errores
} catch ( (Exception) (nombre) ) {
// Manejo de la excepción
} finally {
// Cuerpo que se ejecuta siempre
}
```

## Tipo de datos
### Tipos primitivos
int
byte
boolean
float
double
### Tipos no primitivos

Set<>
Map<,>
List
Wrappers(Integer, String, Byte)
Clases(personalizadas por el programador)