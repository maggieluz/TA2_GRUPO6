package com.example.demo.repositorio;

import com.example.demo.entidades.Pelicula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPelicula extends CrudRepository<Pelicula, Long> {
    @Query("SELECT s FROM Pelicula s WHERE s.titulo=:xtitulo")
    public Pelicula buscarPelicula(String xtitulo);
}
