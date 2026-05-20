# Constructors APP - Gestión de Empresa Constructora

## Descripción
Aplicación de escritorio moderna desarrollada en Java 11+ con Apache NetBeans 23 para la gestión integral de una empresa constructora. Conectada a SQL Server con interfaz moderna y responsiva.

## Módulos Independientes

### Módulo 1: Seguridad y Usuarios (Integrante 1)
- Autenticación y login avanzado
- Gestión de usuarios
- Asignación de roles y permisos
- Auditoría de operaciones
- Dashboard de seguridad

### Módulo 2: Recursos Humanos (Integrante 2)
- Gestión de empleados
- Contratos laborales
- Control de asistencia
- Nómina y pagos
- Reportes de personal

### Módulo 3: Clientes y Finanzas (Integrante 3)
- Gestión de clientes
- Cotizaciones
- Presupuestos
- Pagos y facturas
- Reportes financieros

### Módulo 4A: Proyectos (Integrante 4)
- Creación y gestión de proyectos
- Fases y sub-fases
- Tareas y seguimiento
- Avance de proyectos
- Flujo de estado

### Módulo 4B: Inventario (Integrante 4)
- Gestión de materiales
- Almacenes
- Control de stock
- Movimientos de inventario
- Alertas de stock mínimo

### Módulo 4C: Proveedores (Integrante 4)
- Registro de proveedores
- Categorías de proveedores
- Órdenes de compra
- Pagos a proveedores
- Histórico de compras

### Módulo 4D: Subcontratistas (Integrante 4)
- Registro de subcontratistas
- Contratos de subcontratación
- Pagos a subcontratistas
- Seguimiento de trabajos
- Evaluación de desempeño

## Requisitos del Sistema
- **Java**: JDK 11 o superior
- **IDE**: Apache NetBeans 23 o superior
- **Base de Datos**: SQL Server 2019 o superior
- **Driver JDBC**: mssql-jdbc-12.6.0.jre11.jar o superior

## Configuración Inicial

### 1. Descargar Driver JDBC
Descargar desde: https://github.com/microsoft/mssql-jdbc/releases

### 2. Configurar Conexión a BD
Editar `src/config/DatabaseConnection.java`:
```java
private static final String SERVER = "tu_servidor";
private static final String PORT = "1433";
private static final String DATABASE = "constructors_db";
private static final String USERNAME = "sa";
private static final String PASSWORD = "tu_contraseña";
```

### 3. Crear Base de Datos
Ejecutar el script SQL proporcionado para crear todas las tablas.

### 4. Datos Iniciales
Usuario por defecto:
- **Username**: admin
- **Password**: admin123
- **Rol**: Administrador

## Estructura del Proyecto
```
constructors-app/
├── src/
│   ├── config/
│   │   └── DatabaseConnection.java
│   ├── modulo1_seguridad/
│   │   ├── models/
│   │   │   ├── Usuario.java
│   │   │   ├── Rol.java
│   │   │   └── Auditoria.java
│   │   ├── dao/
│   │   │   ├── UsuarioDAO.java
│   │   │   ├── RolDAO.java
│   │   │   └── AuditoriaDAO.java
│   │   └── ui/
│   │       ├── LoginFrame.java
│   │       ├── UsuarioFrame.java
│   │       └── DashboardFrame.java
│   ├── modulo2_rrhh/
│   │   ├── models/
│   │   │   ├── Empleado.java
│   │   │   ├── Contrato.java
│   │   │   ├── Asistencia.java
│   │   │   └── Nomina.java
│   │   ├── dao/
│   │   │   ├── EmpleadoDAO.java
│   │   │   ├── ContratoDAO.java
│   │   │   ├── AsistenciaDAO.java
│   │   │   └── NominaDAO.java
│   │   └── ui/
│   ├── modulo3_finanzas/
│   │   ├── models/
│   │   │   ├── Cliente.java
│   │   │   ├── Cotizacion.java
│   │   │   ├── Presupuesto.java
│   │   │   └── Pago.java
│   │   ├── dao/
│   │   │   ├── ClienteDAO.java
│   │   │   ├── CotizacionDAO.java
│   │   │   ├── PresupuestoDAO.java
│   │   │   └── PagoDAO.java
│   │   └── ui/
│   ├── modulo4a_proyectos/
│   │   ├── models/
│   │   │   ├── Proyecto.java
│   │   │   ├── Fase.java
│   │   │   ├── Tarea.java
│   │   │   └── Avance.java
│   │   ├── dao/
│   │   └── ui/
│   ├── modulo4b_inventario/
│   │   ├── models/
│   │   │   ├── Material.java
│   │   │   ├── Almacen.java
│   │   │   ├── InventarioMaterial.java
│   │   │   └── MovimientoInventario.java
│   │   ├── dao/
│   │   └── ui/
│   ├── modulo4c_proveedores/
│   │   ├── models/
│   │   │   ├── Proveedor.java
│   │   │   ├── CategoriaProveedor.java
│   │   │   └── PagoProveedor.java
│   │   ├── dao/
│   │   └── ui/
│   └── modulo4d_subcontratistas/
│       ├── models/
│       │   ├── Subcontratista.java
│       │   ├── ContratoSubcontratista.java
│       │   └── PagoSubcontratista.java
│       ├── dao/
│       └── ui/
├── lib/
│   └── mssql-jdbc-12.6.0.jre11.jar
└── nbproject/
```

## Características de la Interfaz

- ✓ Interfaz moderna y profesional
- ✓ Tema oscuro/claro seleccionable
- ✓ Navegación intuitiva por módulos
- ✓ Tablas con búsqueda y filtros avanzados
- ✓ Formularios validados
- ✓ Reportes exportables a PDF/Excel
- ✓ Gráficos y estadísticas
- ✓ Sistema de notificaciones
- ✓ Control de permisos por módulo

## Uso de la Aplicación

1. Abrir proyecto en Apache NetBeans 23
2. Configurar la conexión a SQL Server
3. Compilar el proyecto (Clean and Build)
4. Ejecutar Main.java
5. Usar credenciales por defecto para login
6. Navegar por los módulos según permisos asignados

## Equipo de Desarrollo

- **Integrante 1**: Módulo Seguridad y Usuarios
- **Integrante 2**: Módulo Recursos Humanos
- **Integrante 3**: Módulo Clientes y Finanzas
- **Integrante 4**: Módulos Proyectos, Inventario, Proveedores y Subcontratistas

## Soporte y Mantenimiento

Para problemas de conexión:
1. Verificar que SQL Server esté ejecutándose
2. Comprobar credenciales en DatabaseConnection.java
3. Validar que el driver JDBC está en el classpath
4. Revisar los logs de la aplicación

## Licencia
Proyecto privado para uso interno de la empresa constructora.

## Versión
v1.0 - Desarrollo inicial
