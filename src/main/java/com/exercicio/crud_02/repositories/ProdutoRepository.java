package com.exercicio.crud_02.repositories;

import com.exercicio.crud_02.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
