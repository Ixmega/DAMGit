Se crean las clases Procesador y Ordenador, donde cada ordenador contiene un procesador. Se comprueba que los núcleos sean mayores que 0 mediante IllegalArgumentException.
En Ordenador se utilizan tres constructores, aprovechando this() para reutilizar código y establecer valores por defecto.
También se crea la clase Monitor para comprobar que Java no genera un constructor vacío automáticamente cuando ya existe otro constructor con parámetros.
En Main se crean y muestran ordenadores utilizando los tres constructores.