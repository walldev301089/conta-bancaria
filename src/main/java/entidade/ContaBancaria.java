package entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroDaConta;
    private String agencia;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String agencia, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
}
