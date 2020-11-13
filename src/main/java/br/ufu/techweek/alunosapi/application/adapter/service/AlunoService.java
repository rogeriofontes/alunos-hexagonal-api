package br.ufu.techweek.alunosapi.application.adapter.service;

import br.ufu.techweek.alunosapi.core.entity.Aluno;

import java.util.List;
import java.util.Optional;

public interface AlunoService {
    Aluno salvar(Aluno aluno);
    Aluno editar(Long id, Aluno aluno);
    List<Aluno> list();
    Optional<Aluno> findById(Long id);
    void delete(Long id);
}
