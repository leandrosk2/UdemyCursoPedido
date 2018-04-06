package br.com.pedido.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pedido.domain.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{

}
