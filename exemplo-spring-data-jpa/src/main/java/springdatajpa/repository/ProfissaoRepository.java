package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.Profissao;

import java.util.List;

public interface ProfissaoRepository extends JpaRepository<Profissao,Integer> {
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details
    List<Profissao> findByNomeContaining(String nome);
}
