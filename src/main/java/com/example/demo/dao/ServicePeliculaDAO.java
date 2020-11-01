package com.example.demo.dao;

import com.example.demo.entidades.Pelicula;

import java.util.List;

public interface ServicePeliculaDAO {
    Pelicula registrar(Pelicula peilcula);
    Pelicula obtener(String titulo);
    List<Pelicula> listar();
    Pelicula actualizar(Pelicula peilcula);
}
