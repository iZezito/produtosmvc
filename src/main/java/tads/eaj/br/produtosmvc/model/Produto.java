package tads.eaj.br.produtosmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import tads.eaj.br.produtosmvc.errorhandling.ApiMessages;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = ApiMessages.ERRO_VAZIO)
    String nome;
    @NotBlank(message = ApiMessages.ERRO_VAZIO)
    String descricao;
    @Min(0)
    Float preco;
}
