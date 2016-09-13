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

    public List<Publicacao> consultarPublicacao(String valor) throws Exception {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Publicacao> listaPublicacao = new ArrayList<Publicacao>();

        try {
            abrirConexao();
            String x = "\'" + valor + "\'";
            //String sql = "select * from public.publicacao";
            String sql = "select * from public.publicacao where titulo =" + x;
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Publicacao pub = new Publicacao(rs.getInt("id"), rs.getString("titulo"), rs.getInt("paginainicial"),
                        rs.getInt("paginafinal"), rs.getString("datapublicacao"));
                listaPublicacao.add(pub);
            }
        } finally {
            conn.close();
        }

        return listaPublicacao;
    }

}
