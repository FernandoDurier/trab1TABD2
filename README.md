# trab1TABD2

GetPublicacao é a questão 1 que tem os dados de publicacao mockados numa lista de publicações;

consultarPublicacoesNoPostgresql é o serviço da questão 2;

Publicacao e ListaPublicacao são as classes necessárias;

PublicaçãoDAO é o Objeto de Acesso à Base de Dados;



<------------------cliente do exercicio1------------------------------------------------------------------------------->


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import br.unirio.fernandodurier.tabd2.Publicacao;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String titulo = "";
        System.out.println("Digite um titulo.\n");
        Scanner input = new Scanner(System.in);
        titulo = input.nextLine();
        java.util.List<br.unirio.fernandodurier.tabd2.Publicacao> p = getPublicacao(titulo);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Lista de Publicacoes com titulo = "+ titulo);
        for(int i = 0; i<p.size();i++){
        System.out.println("-----------------------------------------------------------");
        System.out.println("ID: "+ p.get(i).getId());
        System.out.println("Titulo: "+ p.get(i).getTitulo());
        System.out.println("PaginaInicial: "+ p.get(i).getPaginaInicial());
        System.out.println("PaginaFinal: "+ p.get(i).getPaginaFinal());
        System.out.println("DataPublicacao: "+ p.get(i).getDataPublicacao());
        }  
        System.out.println("------------------------------------------------------------");
    }

    private static java.util.List<br.unirio.fernandodurier.tabd2.Publicacao> getPublicacao(java.lang.String titulo) {
        br.unirio.fernandodurier.tabd2.GetPublicacao_Service service = new br.unirio.fernandodurier.tabd2.GetPublicacao_Service();
        br.unirio.fernandodurier.tabd2.GetPublicacao port = service.getGetPublicacaoPort();
        return port.getPublicacao(titulo);
    }
    
}


<----------------------------------------------------------------------------------------------------------------->
