package com.example.cadastrolivro.repository;


import com.example.cadastrolivro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivroRepository extends JpaRepository<Livro, Long> {
}
