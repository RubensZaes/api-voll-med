package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
        this.cidade = dadosEndereco.cidade();
        this.uf = dadosEndereco.uf();
    }

    public void atulizarInformacoes(DadosEndereco dadosEndereco) {
        if(dadosEndereco.logradouro() != null) this.logradouro = dadosEndereco.logradouro();
        if(dadosEndereco.bairro() != null) this.logradouro = dadosEndereco.bairro();
        if(dadosEndereco.cep() != null) this.logradouro = dadosEndereco.cep();
        if(dadosEndereco.numero() != null) this.logradouro = dadosEndereco.numero();
        if(dadosEndereco.complemento() != null) this.logradouro = dadosEndereco.complemento();
        if(dadosEndereco.cidade() != null) this.logradouro = dadosEndereco.cidade();
        if(dadosEndereco.uf() != null) this.logradouro = dadosEndereco.uf();
    }
}
