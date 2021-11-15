
package com.mycompany.bytebank.encapsulado;

public class Cliente {
   
    private String nome;
    private String cpf;
    private String profissao;

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
}

