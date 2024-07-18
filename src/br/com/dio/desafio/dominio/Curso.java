package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    //Construtor
    public Curso(){}

    // getters e setters
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
