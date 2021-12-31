package dto;

import java.time.LocalDate;
import java.util.List;

import domain.Carro;
import domain.Cliente;

public class ClienteDTO {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private List<Carro> carros;

    public ClienteDTO(Cliente cliente) {
        this.setCpf(cliente.getCpf());
        this.setNome(cliente.getNome());
        this.setDataNascimento(cliente.getDataNascimento());
        this.setCarros(cliente.getCarros());
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
