package br.com.SGP;
import java.time.LocalDate;

import br.com.SGP.projeto.Projeto;
import br.com.SGP.tarefa.TarefaPrioridade;
import br.com.SGP.tarefa.TarefaStatus;
import br.com.SGP.tarefa.Tarefa;
import br.com.SGP.usuario.StatusUsuario;
import br.com.SGP.usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario();

        usuario1.setId(1);
        usuario1.setNome("Bernando Silva");
        usuario1.setStatus(StatusUsuario.ATIVO);

        Projeto projetoSGP = new Projeto();

        projetoSGP.setId(1);
        projetoSGP.setNome("Sistema de Gestão de Projetos");
        projetoSGP.setResponsavel(usuario1);

        Tarefa tarefa = new Tarefa();

        tarefa.setId(1);
        tarefa.setTitulo("Criar classes-entidades");
        tarefa.setDataCriacao(LocalDate.of(2024, 10, 24));
        tarefa.setPrioridade(TarefaPrioridade.ALTA);
        tarefa.setStatus(TarefaStatus.FAZENDO);
        tarefa.setProjetos(projetoSGP);

    }

}
