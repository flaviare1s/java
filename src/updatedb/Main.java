package updatedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Configurações do banco
        String url = "jdbc:postgresql://localhost:5432/empresaflavia";
        String usuario = "postgres";
        String senha = "";

        // String para select
        String instrucaoSelect = "SELECT * FROM produto";

        // String para insert com parâmetros
        String instrucaoUpdate = "UPDATE produto SET descricao=? WHERE codprod=?";

        try {
            // Estabelecendo conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Preparando a instrução para insert
            PreparedStatement pstmt = conexao.prepareStatement(instrucaoUpdate);

            // Definindo os valores dos parâmetros
            pstmt.setString(1, "caderno 15 matérias");
            pstmt.setInt(2, 9); // exemplo codprod


            // Executando insert
            int linhasAtualizadas = pstmt.executeUpdate();
            System.out.println("Linhas inseridas: " + linhasAtualizadas);

            // Fechando o PreparedStatement do insert
            pstmt.close();

            // Criando um Statement para executar select
            Statement stmt = conexao.createStatement();

            // Executando o select para mostrar os dados da tabela
            ResultSet rs = stmt.executeQuery(instrucaoSelect);

            // Lendo e imprimindo os resultados
            while (rs.next()) {
                int codprod = rs.getInt("codprod");
                String descricao = rs.getString("descricao");
                double valorprod = rs.getDouble("valorprod");
                java.sql.Date datacompra = rs.getDate("datacompra");

                System.out.println("codprod: " + codprod + ", descricao: " + descricao + ", valorprod: " + valorprod + ", datacompra: " + datacompra);
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            conexao.close();

            System.out.println("Operação realizada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
