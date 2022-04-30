package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Funcionario;
import com.biblioteca.Biblioteca.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    //get all Funcionarios
    @GetMapping("/funcionario")
    public List<Funcionario> getAllFuncionarios(){
        return funcionarioRepository.findAll();
    }
}
