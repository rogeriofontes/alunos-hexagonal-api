package br.ufu.techweek.alunosapi.application.adapter.service;

import br.ufu.techweek.alunosapi.core.entity.Aluno;
import br.ufu.techweek.alunosapi.core.service.AlunoServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServicePortAdapter implements AlunoServicePort {

    @Autowired
    private AlunoService alunoService;

    @Override
    public Aluno salvar(Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    @Override
    public Aluno editar(Long id, Aluno aluno) {
        return alunoService.editar(id, aluno);
    }

    @Override
    public List<Aluno> list() {
        return alunoService.list();
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoService.findById(id);
    }

    @Override
    public void delete(Long id) {
        alunoService.findById(id);
    }
}
