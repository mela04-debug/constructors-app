package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para gestionar la conexión a SQL Server
 * Modificar los parámetros según tu base de datos
 */
public class DatabaseConnection {
    
    // ===== MODIFICAR ESTOS PARÁMETROS SEGÚN TU BD =====
    private static final String SERVER = "localhost";
    private static final String PORT = "1433";
    private static final String DATABASE = "constructors_db";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "tu_contraseña_aqui";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    // ===================================================
    
    private static Connection connection = null;
    
    /**
     * Obtiene la conexión a la base de datos
     * @return Connection objeto de conexión
     * @throws SQLException si hay error en la conexión
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName(DRIVER);
                String url = "jdbc:sqlserver://" + SERVER + ":" + PORT 
                           + ";databaseName=" + DATABASE 
                           + ";encrypt=true;trustServerCertificate=true;";
                
                connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
                System.out.println("✓ Conexión a SQL Server establecida correctamente");
            } catch (ClassNotFoundException e) {
                System.err.println("Error: No se encontró el driver de SQL Server");
                System.err.println("Asegúrate de agregar mssql-jdbc.jar al proyecto");
                throw new SQLException("Driver no encontrado", e);
            } catch (SQLException e) {
                System.err.println("Error al conectar a BD: " + e.getMessage());
                throw e;
            }
        }
        return connection;
    }
    
    /**
     * Cierra la conexión a la base de datos
     */
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("✓ Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
    
    /**
     * Verifica si hay conexión activa
     * @return true si la conexión está activa
     */
    public static boolean isConnected() {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
