/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.bfl.tabd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cliente
 */
public class PublicacaoDAO {

    private static String dbURL = "jdbc:postgresql://localhost:5432/tabd2"; //url de conexao
    private static Connection conn = null;

    private static void abrirConexao() {
        try {
            Class.forName("org.postgresql.Driver").newInstance(); //carregando o driver 
            conn = DriverManager.getConnection(dbURL, "postgres", "d1amante");// abrindo uma nova conexao
        } catch (Exception except) {
            except.printStackTrace();
        }
    }

    public List<PublicacaoBanco> consultarPublicacao(String valor) throws Exception {
        PreparedStatement stmt ;
        ResultSet rs;
        List<PublicacaoBanco> listaPublicacao = new ArrayList<PublicacaoBanco>();

        try {
            abrirConexao();
            String x = "\'" + valor + "\'";
            //String sql = "select * from public.publicacao";
            String sql = "select * from public.publicacao where titulo =" + x;
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                PublicacaoBanco pub = new PublicacaoBanco();
                
                pub.setId(rs.getInt("id"));
                pub.setTitulo(rs.getString("titulo"));
                pub.setPaginaInicial(rs.getInt("paginainicial"));
                pub.setPaginaFinal(rs.getInt("paginafinal"));
                pub.setDataDoBanco(rs.getString("datapublicacao"));
                
                listaPublicacao.add(pub);
            }
        } finally {
            conn.close();
        }
        return listaPublicacao;
    }

}
