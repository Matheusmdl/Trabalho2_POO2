package br.edu.ifgoias.academico.services;

import br.edu.ifgoias.academico.entities.Disciplina;
import br.edu.ifgoias.academico.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listarTodas() {
        return repository.findAll();
    }

    public Optional<Disciplina> procurarPorId(Integer id) {
        return repository.findById(id);
    }

    public Disciplina inserir(Disciplina disciplina) {
        return repository.save(disciplina);
    }

    public Disciplina atualizar(Integer id, Disciplina novaDisciplina) {
        if (repository.existsById(id)) {
            novaDisciplina.setIddisciplina(id);
            return repository.save(novaDisciplina);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
