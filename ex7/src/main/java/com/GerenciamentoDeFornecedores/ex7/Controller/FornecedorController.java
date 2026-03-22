package com.GerenciamentoDeFornecedores.ex7.Controller;

import com.GerenciamentoDeFornecedores.ex7.Model.FornecedorModel;
import com.GerenciamentoDeFornecedores.ex7.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorService service;

    @PostMapping
    public FornecedorModel criar(@RequestBody FornecedorModel fornecedorModel){
        return service.criar(fornecedorModel);
    }

    @GetMapping
    public List<FornecedorModel>litar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel>buscaPorId(@PathVariable Long id){
        return service.buscaPorId(id);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
