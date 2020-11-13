package br.ufu.techweek.alunosapi.infrastracture.adapter.repository;

import br.ufu.techweek.alunosapi.core.entity.Aluno;
import br.ufu.techweek.alunosapi.core.repository.AlunoPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoPersistencePortAdapter implements AlunoPersistencePort {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno addAluno(Aluno aluno) {
       return alunoRepository.save(aluno);
    }

    @Override
    public void removeAluno(Long id) {
        alunoRepository.findById(id);
    }

    @Override
    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Optional<Aluno> getAlunoById(Long alunoId) {
        return alunoRepository.findById(alunoId);
    }
}
