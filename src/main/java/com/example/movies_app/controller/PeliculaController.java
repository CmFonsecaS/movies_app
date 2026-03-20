package com.example.movies_app.controller;

import com.example.movies_app.model.Pelicula;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    private final List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1L, "Moana", 2016, "Ron Clements, John Musker", "Animación, Aventura", "Una joven elegida por el océano emprende un viaje para salvar a su pueblo y descubrir su destino."));
        peliculas.add(new Pelicula(2L, "Star Wars: El retorno del Jedi", 1983, "Richard Marquand", "Ciencia ficción, Aventura", "Los rebeldes intentan destruir la segunda Estrella de la Muerte mientras Luke enfrenta a Darth Vader y al Emperador."));
        peliculas.add(new Pelicula(3L, "Matrix", 1999, "Lana Wachowski, Lilly Wachowski", "Ciencia ficción, Acción", "Un hacker descubre la verdad sobre su realidad y su papel en la guerra contra las máquinas."));
        peliculas.add(new Pelicula(4L, "El castillo ambulante", 2004, "Hayao Miyazaki", "Animación, Fantasía", "Una joven es transformada en anciana por una bruja y busca romper el hechizo con la ayuda de un mago en un castillo mágico."));
        peliculas.add(new Pelicula(5L, "El Señor de los Anillos: Las dos torres", 2002, "Peter Jackson", "Fantasía, Aventura", "La Comunidad se divide mientras continúa la misión de destruir el Anillo Único y se preparan para la batalla contra Sauron."));
    }

    @GetMapping
    public ResponseEntity<List<Pelicula>> getAllPeliculas() {
        return ResponseEntity.ok(peliculas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> getPeliculaById(@PathVariable Long id) {
        Optional<Pelicula> peliculaOpt = peliculas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        return peliculaOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
