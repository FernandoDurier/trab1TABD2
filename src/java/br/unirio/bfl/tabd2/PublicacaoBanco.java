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
public class PublicacaoBanco {
    
     private int id;
    private String titulo;
    private int paginaInicial;
    private int paginaFinal;
    private String DataDoBanco;

    public PublicacaoBanco() {
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

    public String getDataDoBanco() {
        return DataDoBanco;
    }

    public void setDataDoBanco(String DataDoBanco) {
        this.DataDoBanco = DataDoBanco;
    }
    
    
    
}
