package br.ufu.techweek.alunosapi.core.repository;

import br.ufu.techweek.alunosapi.core.entity.Aluno;

import java.util.List;
import java.util.Optional;

public interface AlunoPersistencePort {
    Aluno addAluno(Aluno aluno);

    void removeAluno(Long id);

    List<Aluno> getAlunos();

    Optional<Aluno> getAlunoById(Long alunoId);
}
