package modulo1_seguridad.ui;

import modulo1_seguridad.models.Usuario;
import modulo1_seguridad.dao.UsuarioDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/**
 * Ventana de Login - Interfaz Moderna
 * Integrante: 1 - Seguridad y Usuarios
 */
public class LoginFrame extends JFrame {
    
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnSalir;
    private JLabel lblMensaje;
    
    public LoginFrame() {
        setTitle("Constructors APP - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(false);
        
        // Panel principal con fondo gradiente
        JPanel panelPrincipal = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(Graphics2D.KEY_ANTIALIASING, Graphics2D.VALUE_ANTIALIAS_ON);
                
                // Gradiente de azul
                GradientPaint gradient = new GradientPaint(0, 0, new Color(41, 128, 185),
                        0, getHeight(), new Color(52, 152, 219));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        
        // Panel de contenido (blanco)
        JPanel panelContenido = new JPanel();
        panelContenido.setBackground(Color.WHITE);
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        // Título
        JLabel lblTitulo = new JLabel("CONSTRUCTORS APP");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setForeground(new Color(41, 128, 185));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelContenido.add(lblTitulo);
        
        JLabel lblSubtitulo = new JLabel("Sistema de Gestión Empresarial");
        lblSubtitulo.setFont(new Font("Arial", Font.PLAIN, 12));
        lblSubtitulo.setForeground(new Color(100, 100, 100));
        lblSubtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelContenido.add(lblSubtitulo);
        
        panelContenido.add(Box.createVerticalStrut(30));
        
        // Campo Usuario
        JLabel lblUsername = new JLabel("Usuario:");
        lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
        lblUsername.setForeground(new Color(50, 50, 50));
        panelContenido.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 13));
        txtUsername.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        txtUsername.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        panelContenido.add(txtUsername);
        panelContenido.add(Box.createVerticalStrut(15));
        
        // Campo Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 12));
        lblPassword.setForeground(new Color(50, 50, 50));
        panelContenido.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 13));
        txtPassword.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        txtPassword.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        panelContenido.add(txtPassword);
        panelContenido.add(Box.createVerticalStrut(15));
        
        // Mensaje de error
        lblMensaje = new JLabel("");
        lblMensaje.setForeground(new Color(200, 0, 0));
        lblMensaje.setFont(new Font("Arial", Font.PLAIN, 11));
        lblMensaje.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelContenido.add(lblMensaje);
        panelContenido.add(Box.createVerticalStrut(20));
        
        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.WHITE);
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        btnLogin = new JButton("INGRESAR");
        btnLogin.setFont(new Font("Arial", Font.BOLD, 12));
        btnLogin.setPreferredSize(new Dimension(120, 40));
        btnLogin.setBackground(new Color(41, 128, 185));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setBorder(BorderFactory.createEmptyBorder());
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.addActionListener(this::login);
        
        btnSalir = new JButton("SALIR");
        btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
        btnSalir.setPreferredSize(new Dimension(120, 40));
        btnSalir.setBackground(new Color(189, 195, 199));
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorder(BorderFactory.createEmptyBorder());
        btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSalir.addActionListener(e -> System.exit(0));
        
        panelBotones.add(btnLogin);
        panelBotones.add(btnSalir);
        panelContenido.add(panelBotones);
        
        // Agregar paneles
        panelPrincipal.add(panelContenido, BorderLayout.CENTER);
        add(panelPrincipal);
    }
    
    private void login(ActionEvent e) {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());
        
        if (username.isEmpty() || password.isEmpty()) {
            lblMensaje.setText("Por favor complete todos los campos");
            return;
        }
        
        try {
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.autenticar(username, password);
            
            if (usuario != null) {
                lblMensaje.setText("✓ Login exitoso");
                lblMensaje.setForeground(new Color(0, 128, 0));
                
                System.out.println("\n" + "=".repeat(50));
                System.out.println("LOGIN EXITOSO");
                System.out.println("=".repeat(50));
                System.out.println("Usuario: " + usuario.getUsername());
                System.out.println("ID Empleado: " + usuario.getIdEmpleado());
                System.out.println("Roles: " + usuario.getRoles().size());
                System.out.println("=".repeat(50) + "\n");
                
                JOptionPane.showMessageDialog(this,
                    "¡Bienvenido " + usuario.getUsername() + "!",
                    "Login Exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
                
                // TODO: Abrir DashboardFrame principal
                this.dispose();
            } else {
                lblMensaje.setText("Usuario o contraseña incorrectos");
            }
        } catch (SQLException ex) {
            lblMensaje.setText("Error de conexión a BD");
            System.err.println("Error en login: " + ex.getMessage());
        }
    }
}
