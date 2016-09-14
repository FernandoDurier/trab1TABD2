
package br.unirio.fernandodurier.tabd2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.unirio.fernandodurier.tabd2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPublicacao_QNAME = new QName("http://tabd2.fernandodurier.unirio.br/", "GetPublicacao");
    private final static QName _GetPublicacaoResponse_QNAME = new QName("http://tabd2.fernandodurier.unirio.br/", "GetPublicacaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.unirio.fernandodurier.tabd2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPublicacao_Type }
     * 
     */
    public GetPublicacao_Type createGetPublicacao_Type() {
        return new GetPublicacao_Type();
    }

    /**
     * Create an instance of {@link GetPublicacaoResponse }
     * 
     */
    public GetPublicacaoResponse createGetPublicacaoResponse() {
        return new GetPublicacaoResponse();
    }

    /**
     * Create an instance of {@link Publicacao }
     * 
     */
    public Publicacao createPublicacao() {
        return new Publicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicacao_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tabd2.fernandodurier.unirio.br/", name = "GetPublicacao")
    public JAXBElement<GetPublicacao_Type> createGetPublicacao(GetPublicacao_Type value) {
        return new JAXBElement<GetPublicacao_Type>(_GetPublicacao_QNAME, GetPublicacao_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tabd2.fernandodurier.unirio.br/", name = "GetPublicacaoResponse")
    public JAXBElement<GetPublicacaoResponse> createGetPublicacaoResponse(GetPublicacaoResponse value) {
        return new JAXBElement<GetPublicacaoResponse>(_GetPublicacaoResponse_QNAME, GetPublicacaoResponse.class, null, value);
    }

}
