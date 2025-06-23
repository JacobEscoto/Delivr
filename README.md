# Delivr - Sistema de Entregas a Domicilio

[Delivr](https://github.com/JacobEscoto/Delivr) es una aplicación desarrollada en Java para la gestión de entregas a domicilio (Delivery). Cuenta con validaciones robustas, métodos auxiliares, operaciones CRUD, GUI amigable y diversas funcionalidades orientadas a una experiencia completa de envío y recepción de paquetes.

---

## Herramientas Utilizadas

- API de Java: `Scanner`, `Random`, `ArrayList`, `Swing`
- Generación aleatoria de IDs, dimensiones de caja y posición de repartidores
- Bucles `do-while` y `while`
- Ciclos `for` para recorrer estructuras de datos
- GUI amigable usando Swing
- Método recursivo para cálculo del costo total
- Métodos estáticos y no estáticos
- Constructores y sobrecarga de métodos
- Uso de matriz como mapa gráfico
- Salida por consola con `println`, `print`, `printf`

---

## Menú Principal

Al iniciar la aplicación se presenta un menú con las siguientes opciones:

- Clientes
- Repartidores
- Paquetes
- Pedidos

---

## Funcionalidades Principales

### 1. Menú de Clientes

#### 1.1 Agregar Cliente
Formulario para ingresar datos del cliente con validaciones:
- Nombre y apellido (separados por espacio)
- Teléfono numérico de 8 dígitos
- Correo con dominio `@gmail.com` o `@hotmail.com`
- Edad mayor o igual a 18
- Dirección obligatoria

#### 1.2 Buscar Cliente
Busca por nombre o ID. Muestra mensajes de advertencia, error o resultados según corresponda.

#### 1.3 Listar Clientes
Lista todos los clientes registrados. Incluye botón **Borrar** para eliminar clientes por nombre o ID.

---

### 2. Menú de Repartidores

#### 2.1 Agregar Repartidor
Registro con validaciones. Selección de vehículo (Carro, Moto, Bicicleta, Camión).

#### 2.2 Buscar Repartidor
Busca por ID, nombre o tipo de vehículo. Muestra resultados múltiples si aplica.

#### 2.3 Listar Repartidores
Muestra todos los repartidores. Botón para eliminar por nombre o ID.

---

### 3. Menú de Paquetes

#### 3.1 Agregar Paquete
- Categoría (Ropa, Comida, Medicina, Tecnología, Frágil)
- Peso en kg (debe de incluir un punto decimal)
- Descripción opcional
- Incluir seguro usando un checkbox
- Validaciones y mensajes emergentes

#### 3.2 Buscar Paquete
Busca por ID, nombre del cliente o categoría.

#### 3.3 Listar Paquetes
Lista ID, categoría, peso y estado del seguro de todos los paquetes.

---

### 4. Menú de Pedidos (Entregas)

#### 4.1 Agregar Pedido
- Requiere al menos un paquete y un repartidor registrados
- Selección de paquete y repartidor
- Cálculo de costo total mediante método recursivo
- Cálculo auxiliar del peso volumétrico

#### 4.2 Enviar Pedido
- Simula entrega del pedido
- Cambia estado a “En Camino” y luego a “Entregado”
- Muestra la simulacion de una factura
- Visualización gráfica del recorrido del repartidor en matriz

#### 4.3 Buscar Pedido
Búsqueda por ID de pedido.

#### 4.4 Listar Pedidos
Muestra todos los pedidos con estado “Pendiente” o “En Camino”.

---

## Funcionalidades Adicionales

### 1. Generación de ID's únicas
- IDs generados con `Random`, combinando caracteres y nombre de referencia

### 2. Cálculo de Peso Volumétrico
**Fórmula:** (largo(cm) × ancho(cm) × alto(cm)) / 6000

- Se compara el peso bruto con el peso volumétrico
- Dependiendo de que peso sea el mayor, se utilizara para el costo total

### 3. Metodo Recursivo para aplicar descuentos al costo total
- Caso base: no aplica a ningun descuento y se aplica el costo normal, y si incluye seguro se le adicionara un extra
- Caso recursivo:
    - Si Edad es mayor o igual a 65 se aplicara un 60% descuento
    - Si peso es mayor o igual a 40 se aplicara un 10% descuento
    - Si el precio base supera los 500 se le aplicara un 15% descuento

> Cada condicion validada se le colocara o se actualizara a 0 para evitar reevaluar el mismo caso

---

## Interfaz Gráfica (Swing)

Componentes utilizados:
- `JFrame`, `JOptionPane`, `JPanel`, `JButton`
- `JTextField`, `JTextArea`
- `JComboBox`, `JLabel`, `JCheckBox`


