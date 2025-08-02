# 🎬 Proyecto: Contenido Audiovisual - Programación Orientada a Objetos

Este proyecto en Java permite gestionar un catálogo de contenidos audiovisuales incluyendo **películas**, **documentales**, **series de TV** y **novelas**. Está estructurado usando el patrón de diseño MVC, aplica los principios **SOLID**, utiliza archivos **CSV** para persistencia y cuenta con **pruebas unitarias con JUnit**.

---

## 📁 Estructura del Proyecto

```
ContenidoAudiovisual_U4_POO/
├── controller/            # Controlador que gestiona lógica y datos
│   └── ContenidoController.java
├── model/                 # Clases del modelo (POJOs)
│   ├── ContenidoAudiovisual.java (abstracta)
│   ├── Pelicula.java
│   ├── Documental.java
│   ├── SerieTV.java
│   ├── Novela.java
│   ├── Actor.java
│   └── Investigador.java
├── view/                  # Vista: interfaz de usuario por consola
│   └── ConsolaView.java
├── main/                  # Clase Main para lanzar la aplicación
│   └── Main.java
├── data/             # Archivos CSV
│   └── contenidos.csv
├── test/                  # Pruebas unitarias con JUnit
│   ├── PeliculaTest.java
│   ├── DocumentalTest.java
│   ├── SerieTVTest.java
│   └── NovelaTest.java
```

---

## 🛠️ Instalación y Ejecución

### ✅ Requisitos

- Java JDK 17 o superior
- IDE como IntelliJ IDEA o Eclipse
- Biblioteca JUnit 5 (para pruebas)

### ▶️ Ejecutar el Proyecto

1. **Descarga el archivo `.zip`** y descomprímelo.
2. **Abre tu IDE** (por ejemplo, Eclipse).
3. Selecciona `File > Open` y navega a la carpeta descomprimida.
4. Abre el archivo `Main.java` en el paquete `main` y ejecútalo.
5. Puedes clonar el repositorio como opcion alterna 

Verás este menú en consola:

```
=== MENÚ ===
1. Cargar contenidos desde archivo
2. Mostrar contenidos
3. Agregar contenido
4. Guardar contenidos en archivo
0. Salir
```

---

## 📦 Ejemplo de Archivo CSV

Ubicado en `data/contenidos.csv`:

```csv
Pelicula,Interstellar,2014,Ciencia Ficción,Christopher Nolan
Documental,Planeta Tierra,2006,Naturaleza,Ecosistemas
SerieTV,Stranger Things,2016,Suspenso,4
Novela,Cien Años de Soledad,1967,Drama,Gabriel García Márquez
```

---

## 🧪 Ejecutar Pruebas

1. Abre la carpeta `test/`.
2. Haz clic derecho sobre la clase de prueba o sobre la carpeta y selecciona `Run tests`.
3. Las pruebas cubren creación y comportamiento de cada tipo de contenido.

---

## 🎓 Principios SOLID Aplicados

- **S**: Cada clase tiene una única responsabilidad (SRP).
- **O**: Las clases se extienden (herencia) sin modificar código base (OCP).
- **L**: Subclases pueden reemplazar la clase padre sin errores (LSP).
- **I**: Interfaces específicas son respetadas (aunque en este caso, se usa clase abstracta).
- **D**: El controlador depende de abstracciones (`ContenidoAudiovisual`).

---

## 📌 Notas Adicionales

- Código limpio y comentado.
- Diagrama UML incluido (`ContenidoAudiovisual_U4_POO`).
- Escalable para agregar más tipos de contenidos o relaciones.

---

## Diagrama UML de proyecto Contenido Audiovisuales
![Diagrama realizado con PlantUML](https://github.com/jerrybenjawong/Proyecto_U4_POO_Contenidos/blob/b4f5e492defa49f51ee10861ffb0e231d0f53a0c/Diagrama%20UML%20ContenidosAudiovisuales_U4_POO.png)

---

## 👨‍💻 Autor

Proyecto desarrollado como parte de la materia **Programación Orientada a Objetos**  
📍 Universidad Politécnica Salesiana
