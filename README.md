# 🎬 MICROSERVICIO PELÍCULAS

---

## 🚀 Descripción del Proyecto

Proyecto desarrollado con **Spring Boot**, utilizando:

- **Java 21**
- **Spring Boot 3.2.3**

---

## 📦 Modelo de Datos

En `Pelicula.java` se implementa un objeto que contiene los siguientes atributos:

- **id**
- **titulo**
- **año**
- **director**
- **genero**
- **sinopsis**

Se utilizó la librería **Lombok** para reducir código repetitivo.

---

## 🎥 Datos Iniciales

Se inicializó una lista con las siguientes películas:

- Moana  
- Star Wars: El retorno del Jedi  
- Matrix  
- El castillo ambulante  
- El Señor de los Anillos: Las dos torres  

---

## 🌐 Controlador

En `PeliculaController` se definieron endpoints que retornan datos en formato **JSON**.

---

# 📡 ENDPOINTS DISPONIBLES

---

## 🔹 1. Obtener todas las películas

**URL:**

http://localhost:8080/peliculas

<img width="1086" height="760" alt="Snag_9a355b" src="https://github.com/user-attachments/assets/2126c50c-63b1-4a26-add8-5487bf6c1d32" />

---

## 🔹 2. Obtener una película por ID

**URL:**

http://localhost:8080/peliculas/{id}

<img width="1041" height="268" alt="Snag_9a8bf7" src="https://github.com/user-attachments/assets/876b3902-9192-4cb8-bf1a-6681ba7c0d83" />

---

