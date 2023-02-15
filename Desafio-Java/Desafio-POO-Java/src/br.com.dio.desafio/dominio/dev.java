package br.com.dio.desafio.dominio;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir() {}

    public void calcularTotalXp() {}


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos(){
        return conteudoConcluidos;
    }
    public void setConteudoInscritos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Object.equals(nome, dev.nome) && Object.equals(conteudoInscritos, dev.conteudoInscritos) && Object.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    public int hashCode() {
        return Object.hash(nome, conteudoConcluidos, conteudoConcluidos);
    }



}
