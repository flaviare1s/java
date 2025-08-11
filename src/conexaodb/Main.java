package conexaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Configurações do banco
        String url = "jdbc:postgresql://localhost:5432/empresaflavia"; // nome do banco
        String usuario = "postgres";
        String senha = "";

        try {
            // Estabelecendo conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");

            // Criando um statement para executar SQL
            Statement stmt = conexao.createStatement();

            // Executando uma query simples (mude para uma tabela que exista no seu banco)
            ResultSet rs = stmt.executeQuery("SELECT version()");

            // Lendo os resultados
            while (rs.next()) {
                System.out.println("Versão do PostgreSQL: " + rs.getString(1));
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
