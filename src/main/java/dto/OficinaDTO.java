package dto;

import java.util.List;

import domain.Carro;
import domain.Oficina;

public class OficinaDTO {
    private Integer codigo;
    private String nome;
    private String especialidade;
    private String endereco;
    private List<Carro> carros;

    public OficinaDTO(Oficina oficina) {
        this.setCodigo(oficina.getCodigo());
        this.setNome(oficina.getNome());
        this.setEspecialidade(oficina.getEspecialidade());
        this.setEndereco(oficina.getEndereco());
        this.setCarros(oficina.getCarros());
    }
    // Getter
    public Integer getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public List<Carro> getCarros() {
        return this.carros;
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

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
