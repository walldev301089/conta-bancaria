package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import entidade.ContaBancaria;

public interface ContaBancariaRepositorio extends JpaRepository<ContaBancaria, Long> {
}
