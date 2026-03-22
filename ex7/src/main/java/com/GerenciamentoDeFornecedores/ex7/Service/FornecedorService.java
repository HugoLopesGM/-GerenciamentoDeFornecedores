package com.GerenciamentoDeFornecedores.ex7.Service;

import com.GerenciamentoDeFornecedores.ex7.Model.FornecedorModel;
import com.GerenciamentoDeFornecedores.ex7.Repository.FornecedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
@Autowired
    private FornecedorRepositorio repositorio;

    public FornecedorModel criar(FornecedorModel fornecedorModel){
        return repositorio.save(fornecedorModel);
    }

    public List<FornecedorModel>listar(){
        return repositorio.findAll();
    }

    public Optional<FornecedorModel>buscaPorId(Long id){
        return repositorio.findById(id);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }

}
