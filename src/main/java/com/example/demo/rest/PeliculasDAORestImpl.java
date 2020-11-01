package com.example.demo.rest;

import com.example.demo.dao.ServicePeliculaDAO;
import com.example.demo.entidades.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PeliculasDAORestImpl implements PeliculasDAORest{
    @Autowired
    private ServicePeliculaDAO servicePeliculaDAO;

    @GetMapping("/peliculas")
    public List<Pelicula> obtenerPeliculas() {
        return  servicePeliculaDAO.listar();
    }

    @GetMapping("/peliculas/{titulo}")
    public Pelicula buscarPelicula(@PathVariable(name = "titulo") String titulo) {
        return servicePeliculaDAO.obtener(titulo);
    }

    @PostMapping("/pelicula")
    public Pelicula registrar(@RequestBody Pelicula pelicula){
        return servicePeliculaDAO.registrar(pelicula);
    }

    @PatchMapping("/pelicula")
    public Pelicula actualizar(@RequestBody Pelicula pelicula){
        return servicePeliculaDAO.actualizar(pelicula);
    }
}
