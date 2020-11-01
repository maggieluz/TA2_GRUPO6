package com.example.demo.rest;

import com.example.demo.entidades.Pelicula;

import java.util.List;

public interface PeliculasDAORest {
    List<Pelicula> obtenerPeliculas();
    Pelicula buscarPelicula(String titulo);
    Pelicula registrar(Pelicula pelicula);
    Pelicula actualizar(Pelicula pelicula);
}
