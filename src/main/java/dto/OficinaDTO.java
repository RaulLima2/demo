package dto;

import java.util.List;

public class OficinaDTO {
    private Integer codigo;
    private String nome;
    private String especialidade;
    private String endereco;
    private List<CarroDTO> carros;

    // Getter
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<CarroDTO> getCarros() {
        return carros;
    }

    // Setter

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCarros(List<CarroDTO> carros) {
        this.carros = carros;
    }
}
