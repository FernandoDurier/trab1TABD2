/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.bfl.tabd2;

import java.util.GregorianCalendar;

/**
 *
 * @author Cliente
 */
public class Publicacao {

    private int id;
    private String titulo;
    private int paginaInicial;
    private int paginaFinal;
    private GregorianCalendar dataPublicacao;
    private String DataDoBanco;

    public String getDataDoBanco() {
        return DataDoBanco;
    }

    public void setDataDoBanco(String DataDoBanco) {
        this.DataDoBanco = DataDoBanco;
    }

    public Publicacao(int id, String titulo, int paginaInicial, int paginaFinal, GregorianCalendar dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.dataPublicacao = dataPublicacao;
    }

    public Publicacao(int id, String titulo, int paginaInicial, int paginaFinal, String DataDoBanco) {
        this.id = id;
        this.titulo = titulo;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
        this.DataDoBanco = DataDoBanco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public GregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(GregorianCalendar dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
