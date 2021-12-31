package domain;

import java.util.List;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Oficina")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private List<Carro> carros;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, List<Carro> carros) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setCarros(carros);
    }

    // Getter
    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    // Setter
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
