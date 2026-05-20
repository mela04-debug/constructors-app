import modulo1_seguridad.ui.LoginFrame;
import config.DatabaseConnection;
import javax.swing.UIManager;

/**
 * Clase principal de la aplicación Constructors APP
 * Punto de entrada del sistema
 */
public class Main {
    
    public static void main(String[] args) {
        // Configurar look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Error configurando look and feel: " + e.getMessage());
        }
        
        // Verificar conexión a BD
        try {
            DatabaseConnection.getConnection();
            System.out.println("\n" + "=".repeat(50));
            System.out.println("    CONSTRUCTORS APP - INICIANDO");
            System.out.println("=".repeat(50));
            System.out.println("Versión: 1.0");
            System.out.println("Módulos: Seguridad, RRHH, Finanzas, Proyectos,");
            System.out.println("         Inventario, Proveedores, Subcontratistas");
            System.out.println("=".repeat(50) + "\n");
            
            // Mostrar pantalla de login
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
            
        } catch (Exception e) {
            System.err.println("Error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
