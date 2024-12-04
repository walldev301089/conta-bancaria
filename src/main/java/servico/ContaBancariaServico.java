package servico;

import entidade.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.ContaBancariaRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaServico {
    @Autowired
    private ContaBancariaRepositorio contaBancariaRepositorio;

    public ContaBancaria cadastrarConta(String numeroDaConta, String agencia, Double saldo) {
        ContaBancaria contaBancaria = new ContaBancaria(numeroDaConta, agencia, saldo);
        return contaBancariaRepositorio.save(contaBancaria);
    }

    public List<ContaBancaria> listarContas() {
        return contaBancariaRepositorio.findAll();
    }

    public Optional<ContaBancaria> obterConta(Long id) {
        return contaBancariaRepositorio.findById(id);
    }

    public void deletarConta(Long id) {
        contaBancariaRepositorio.deleteById(id);
    }
}