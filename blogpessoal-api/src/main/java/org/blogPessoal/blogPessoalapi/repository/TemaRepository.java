package org.blogPessoal.blogPessoalapi.repository;

import java.util.List;

import org.blogPessoal.blogPessoalapi.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List<Tema> findByDescricaoContainingIgnoreCase(String descricao);
}
