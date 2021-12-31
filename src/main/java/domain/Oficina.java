package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "oficina")
public class Oficina implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nome;
    private String especialidade;
    private String endereco;

    @OneToMany(mappedBy = "carro", targetEntity = Carro.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Carro> carros;
    
    public Oficina(Integer codigo, String nome, String especialidade, String endereco, List<Carro> carros) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.carros = carros;
    }

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

    public List<Carro> getCarros() {
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

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
