
package br.com.SGP.projeto;

import br.com.SGP.usuario.Usuario;

public class Projeto {

    private Long id;
    private String nome;
    private String descrição;
    private Usuario responsavel;

    public Projeto() {

    }

    public Projeto(Long id, String nome, String descrição, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descrição;
    }

    public void setDescricao(String descrição) {
        this.descrição = descrição;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario usuario1) {
        this.responsavel = usuario1;
    }

}
