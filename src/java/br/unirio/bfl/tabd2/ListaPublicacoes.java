/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.bfl.tabd2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Cliente
 */
public class ListaPublicacoes {

    private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

    ListaPublicacoes() {
        publicacoes.add(new Publicacao(1, "Mineracao de Dados", 1, 500, new GregorianCalendar()));
        publicacoes.add(new Publicacao(2, "Mineracao de Dados", 1, 1000, new GregorianCalendar()));
        publicacoes.add(new Publicacao(3, "Mineracao de Dados", 1, 5000, new GregorianCalendar()));
        publicacoes.add(new Publicacao(4, "Arquitetura SOA", 1, 50000, new GregorianCalendar()));
        publicacoes.add(new Publicacao(5, "Introducao a IHC", 1, 80, new GregorianCalendar()));
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

}
