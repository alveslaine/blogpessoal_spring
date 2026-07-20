package com.generation.blogpessoal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_temas")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "O atributo tema é obrigatório!")
    @Size(min = 5, max = 100)
    @Column(length = 100)
    private String tema;

    @NotBlank(message = "A descrição é obrigatória!")
    @Size(min = 5, max = 100, message = "A descrição deve ter entre 5 e 100 caracteres.")
    @Column(length = 100)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}