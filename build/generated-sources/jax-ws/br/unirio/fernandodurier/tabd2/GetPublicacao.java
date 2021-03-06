
package br.unirio.fernandodurier.tabd2;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetPublicacao", targetNamespace = "http://tabd2.fernandodurier.unirio.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetPublicacao {


    /**
     * 
     * @param titulo
     * @return
     *     returns java.util.List<br.unirio.fernandodurier.tabd2.Publicacao>
     */
    @WebMethod(operationName = "GetPublicacao")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetPublicacao", targetNamespace = "http://tabd2.fernandodurier.unirio.br/", className = "br.unirio.fernandodurier.tabd2.GetPublicacao_Type")
    @ResponseWrapper(localName = "GetPublicacaoResponse", targetNamespace = "http://tabd2.fernandodurier.unirio.br/", className = "br.unirio.fernandodurier.tabd2.GetPublicacaoResponse")
    @Action(input = "http://tabd2.fernandodurier.unirio.br/GetPublicacao/GetPublicacaoRequest", output = "http://tabd2.fernandodurier.unirio.br/GetPublicacao/GetPublicacaoResponse")
    public List<Publicacao> getPublicacao(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo);

}
