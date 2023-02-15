package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class bootcamp {
    
    private String nome;
    private String desricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }


    public Set<Conteudo> getDevsConteudosInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Conteudo> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos(){
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp dev = (Bootcamp) o;
        return Object.equals(nome, bootcamp.nome) && Object.equals(descricao, bootcamp.descricao) && Object.equals(dataInicial, bootcamp.dataInicial) && Object.equals(dataFinal, bootcamp.dataFinal) && Object.equals(devsInscritos, bootcamp.devsInscritos) && Object.equals(conteudo, bootcamp.conteudo);
    }

    public int hashCode() {
        return Object.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }



}
