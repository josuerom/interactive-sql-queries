# Añadiendo manualmente controlador JAR

Si no utilizas un gestor de dependencias, puedes añadir el archivo JAR directamente al classpath de tu proyecto desde la línea de comandos. Aquí te explico cómo hacerlo:

  1. Descarga el archivo mysql-connector-j-8.4.0.jar desde el sitio oficial de MySQL.
  
  2. Coloca el archivo mysql-connector-j-8.4.0.jar en una carpeta de tu proyecto, por ejemplo, en una carpeta llamada `lib`.

Abre la CMD y navega hasta el directorio de tu proyecto:
```cmd
cd ruta\a\tu\proyecto
```

Compila tu código Java añadiendo el JAR al classpath. Suponiendo que tienes un archivo MySQLConnectionTest.java, puedes usar el siguiente comando:
```cmd
javac -cp .;lib/mysql-connector-j-8.4.0.jar Main.java
```

Ejecuta tu programa Java añadiendo el JAR al classpath:
```cmd
java -cp .;lib/mysql-connector-j-8.4.0.jar Main
```

Nota: Si estás en un sistema operativo basado en Unix (Linux, macOS), debes usar : en lugar de ; para separar los directorios en el classpath. Ahora navega hasta la carpeta `src` que contiene el archivo `Main.java`
```sh
javac -cp .:lib/mysql-connector-j-8.4.0.jar Main.java
java -cp .:lib/mysql-connector-j-8.4.0.jar Main
```

Siguiendo estos pasos, deberías poder añadir el controlador de MySQL a tu proyecto Java desde la línea de comandos.
