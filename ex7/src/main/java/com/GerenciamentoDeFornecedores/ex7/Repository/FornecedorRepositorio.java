package com.GerenciamentoDeFornecedores.ex7.Repository;

import com.GerenciamentoDeFornecedores.ex7.Model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepositorio extends JpaRepository<FornecedorModel, Long> {
}
