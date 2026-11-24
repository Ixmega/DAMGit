Se crea la clase Vehiculo con los atributos marca, modelo y anio, y dos subclases, Coche y Moto, que heredan de ella y añaden sus propios atributos.
Los constructores de las subclases utilizan super() para inicializar los atributos heredados. Además, sobrescriben mostrarInformacion() reutilizando el método de Vehiculo mediante super.
También se comprueba que final impide sobrescribir descripcionCorta() en las clases hijas.
En TestVehiculo se crean y muestran los distintos vehículos.