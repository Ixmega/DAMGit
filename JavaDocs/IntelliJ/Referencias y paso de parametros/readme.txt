Hemos creado la clase Caja con la variable contenido.
En TestReferencias, creamos una nueva caja, con el contenido "inicial"

Al llamar al método modificar, en el método se crea la variable Caja c, que recibe una copia de la referencia de miCaja. Por tanto, ambas variables apuntan al mismo objeto y, al modificar su contenido desde c, también cambia el contenido que vemos desde miCaja.
Al llamar al método reasignar, en el método se crea la variable Caja c, que recibe igualmente una copia de la referencia al mismo objeto. Sin embargo, al utilizar c = new Caja("nueva"), estamos asignando a c la referencia de un objeto nuevo. Esto solo afecta a la variable local c, no a miCaja. Al finalizar el método, c deja de existir y, si no hay otras referencias al objeto nuevo, este podrá ser eliminado por el recolector de basura.
Algo parecido pasa con numero. Vale inicialmente 5 y, al llamar a incrementar, le pasamos una copia de su valor. La variable n es independiente de numero, por eso al modificarla no cambia el valor original. Al finalizar el método, n deja de existir.

En la segunda parte, al crear la caja a como un nuevo objeto y luego escribir Caja b = a, hacemos que las dos variables apunten al mismo objeto, ya que estamos copiando su referencia.
Por tanto, al modificar el contenido del objeto desde una de las dos variables, también cambia lo que vemos desde la otra, porque ambas son el mismo objeto.

En la tercera parte, la variable c puede guardar una referencia a un objeto de tipo Caja, pero al asignarle null, no apunta a ningún objeto. Al intentar acceder a uno de sus métodos, se produce una excepción NullPointerException.
El mensaje del error es: Cannot invoke "Caja.getContenido()" because "c" is null.