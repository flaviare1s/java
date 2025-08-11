package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Configurações do banco
        String url = "jdbc:postgresql://localhost:5432/empresaflavia";
        String usuario = "postgres";
        String senha = "";
        String instrucaoSelect = "SELECT * FROM produto";

        try {
            // Estabelecendo conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Criando um statement para executar SQL
            Statement stmt = conexao.createStatement();

            // Executando uma query na tabela produto
            ResultSet rs = stmt.executeQuery(instrucaoSelect);

            // Lendo os resultados
            while (rs.next()) {
                // Ajuste aqui para as colunas da sua tabela produto
                int codprod = rs.getInt("codprod");
                String descricao = rs.getString("descricao");  // supondo que 'descricao' exista
                System.out.println("ID: " + codprod + ", Nome: " + descricao);
            }
            rs.close();

            // Executando uma query para obter versão do PostgreSQL
            rs = stmt.executeQuery("SELECT version()");
            while (rs.next()) {
                System.out.println("Versão do PostgreSQL: " + rs.getString(1));
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            conexao.close();

            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
