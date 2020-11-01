package com.example.demo.dao;

import com.example.demo.entidades.Pelicula;
import com.example.demo.repositorio.RepositorioPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ServicePeliculaDAOImpl implements ServicePeliculaDAO {
    @Autowired
    private RepositorioPelicula repositorioPelicula;

    @Override
    public Pelicula registrar(Pelicula pelicula) {
        return repositorioPelicula.save(pelicula);
    }

    @Override
    public Pelicula obtener(String titulo) {
        return repositorioPelicula.buscarPelicula(titulo);
    }

    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>) repositorioPelicula.findAll();
    }

    @Override
    public Pelicula actualizar(Pelicula peilcula) {
        Pelicula s = repositorioPelicula.findById(peilcula.getCodigo()).get();
        if (s != null) {
            repositorioPelicula.save(peilcula);
        }
        return s;
    }
}
