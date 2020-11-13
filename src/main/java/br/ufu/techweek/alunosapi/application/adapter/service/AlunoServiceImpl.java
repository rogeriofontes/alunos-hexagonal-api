package br.ufu.techweek.alunosapi.application.adapter.service;

import br.ufu.techweek.alunosapi.core.entity.Aluno;
import br.ufu.techweek.alunosapi.core.repository.AlunoPersistencePort;
import br.ufu.techweek.alunosapi.core.service.AlunoServicePort;
import br.ufu.techweek.alunosapi.core.entity.Desconto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoPersistencePort alunoPersistencePort;

    @Override
    public Aluno salvar(Aluno aluno) {
        BigDecimal comissao = calculaComissao(new BigDecimal(100));
        log.info("Comissao calculada: " + comissao );
        return alunoPersistencePort.addAluno(aluno);
    }

    @Override
    public Aluno editar(Long id, Aluno aluno) {
        aluno.setId(id);
        return alunoPersistencePort.addAluno(aluno);
    }

    @Override
    public List<Aluno> list() {
        return alunoPersistencePort.getAlunos();
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoPersistencePort.getAlunoById(id);
    }

    @Override
    public void delete(Long id) {
        alunoPersistencePort.removeAluno(id);
    }

    public BigDecimal calculaComissao(BigDecimal valor) {
       return Desconto.getType(Desconto.FIES.name()).calculaDesconto(valor);
    }
}
