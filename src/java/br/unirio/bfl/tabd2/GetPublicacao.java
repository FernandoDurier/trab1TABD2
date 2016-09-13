/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.bfl.tabd2;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cliente
 */
@WebService(serviceName = "GetPublicacao")
public class GetPublicacao {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetPublicacao")
    public List<Publicacao> GetPublicacao(@WebParam(name = "titulo") String titulo) {

        ListaPublicacoes lista = new ListaPublicacoes();
        ArrayList<Publicacao> publicacoes = lista.getPublicacoes();
        ArrayList<Publicacao> resposta = new ArrayList<Publicacao>();

        for (int i = 0; i < publicacoes.size(); i++) {
            String pt = publicacoes.get(i).getTitulo();
            Publicacao pub = publicacoes.get(i);
            if (pt.equals(titulo)) {
                resposta.add(pub);
            }
        }

        return resposta;
    }
}
