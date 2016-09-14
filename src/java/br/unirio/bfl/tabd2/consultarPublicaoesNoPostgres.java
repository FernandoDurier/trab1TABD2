/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.bfl.tabd2;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cliente
 */
@WebService(serviceName = "consultarPublicaoesNoPostgres")
public class consultarPublicaoesNoPostgres {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "search")
    public List<PublicacaoBanco> consultarPublicacoesPorTitulo(@WebParam(name = "valor") String valor) throws Exception {
        PublicacaoDAO dao = new PublicacaoDAO();
        return dao.consultarPublicacao(valor);
    }
}
