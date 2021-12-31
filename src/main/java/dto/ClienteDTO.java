package dto;

import java.time.LocalDate;
import java.util.List;

public class ClienteDTO {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private List<CarroDTO> carros;

    public ClienteDTO(String cpf, String nome, LocalDate dataNascimento, List<CarroDTO> carros) {
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

    public List<CarroDTO> getCarros() {
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

    public void setCarros(List<CarroDTO> carros) {
        this.carros = carros;
    }
}
