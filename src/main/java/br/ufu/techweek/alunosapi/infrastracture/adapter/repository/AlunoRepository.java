package br.ufu.techweek.alunosapi.infrastracture.adapter.repository;

import br.ufu.techweek.alunosapi.core.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
