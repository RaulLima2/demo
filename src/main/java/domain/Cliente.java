package domain;

import java.util.List;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    @OneToMany(mappedBy="carro", targetEntity=Carro.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
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
