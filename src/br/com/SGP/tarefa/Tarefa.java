package br.com.SGP.tarefa;

import java.time.LocalDate;

import br.com.SGP.projeto.Projeto;

public class Tarefa {

    private Long id;
    private String titulo;
    private String descrição;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private TarefaPrioridade prioridade;
    private TarefaStatus status;
    private Projeto projeto;

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void tarefa() {

    }

    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descrição;
    }

    public void setDescricao(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public TarefaPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(TarefaPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    public TarefaStatus getStatus() {
        return status;
    }

    public void setStatus(TarefaStatus status) {
        this.status = status;
    }

    public void setProjetos(Projeto projetoSGP) {
        this.projeto = projetoSGP;
    }

}
