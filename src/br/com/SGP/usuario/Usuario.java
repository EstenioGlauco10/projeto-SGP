package br.com.SGP.usuario;
import java.time.LocalDate;

public class Usuario {

    private long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private LocalDate dataNacimento;
    private StatusUsuario status;

    public Usuario() {

    }

    public Usuario(long id, String nome, String cpf, String email, String senha, LocalDate dataNacimento,
            StatusUsuario status) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataNacimento = dataNacimento;
        this.status = status;
    }

    public long getId() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public Usuario(StatusUsuario status) {
        this.status = status;
    }

}
