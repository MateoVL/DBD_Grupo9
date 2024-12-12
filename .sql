-- INSERTAR VALORES EN LAS TABLAS

-- UBICACION
INSERT INTO UBICACION (Id_Ubicacion, Pais, Ciudad, Direccion)
VALUES
  (1, 'Chile', 'Santiago', 'Av. Las Condes 1234'),
  (2, 'Chile', 'Valparaíso', 'Calle Serrano 456'),
  (3, 'Argentina', 'Buenos Aires', 'Av. 9 de Julio 789'),
  (4, 'Perú', 'Lima', 'Av. Arequipa 456'),
  (5, 'Brasil', 'Río de Janeiro', 'Rua Copacabana 789');

-- USUARIO
INSERT INTO USUARIO (Id_Usuario, Nombre_Usuario, Correo_Usuario, Clave_Usuario, Ip_Usuario, Fecha_Registro_usuario, Rol)
VALUES
  (1, 'admin', 'admin@tienda.com', 'admin123', '192.168.1.1', '2024-01-01', 'Admin'),
  (2, 'cliente1', 'cliente1@gmail.com', 'cliente123', '192.168.1.2', '2024-02-01', 'Cliente'),
  (3, 'vendedor1', 'vendedor1@gmail.com', 'vendedor123', '192.168.1.3', 'Vendedor'),
  (4, 'cliente2', 'cliente2@hotmail.com', 'clavecliente2', '192.168.1.4', '2024-03-05', 'Cliente'),
  (5, 'vendedor2', 'vendedor2@hotmail.com', 'clavevendedor2', '192.168.1.5', '2024-04-10', 'Vendedor');

-- TIENDA
INSERT INTO TIENDA (Id_Tienda, Nombre_Tienda, Ip_Tienda, Direccion_Tienda, Id_Jefe, Id_Ubicacion)
VALUES
  (1, 'Tienda Central', '192.168.2.1', 'Av. Providencia 101', 3, 1),
  (2, 'Sucursal Valparaíso', '192.168.2.2', 'Calle Valpo 202', 3, 2),
  (3, 'Sucursal Buenos Aires', '192.168.2.3', 'Av. Corrientes 123', 5, 3);

-- CATEGORIA
INSERT INTO CATEGORIA (Id_Categoria, Nombre_Categoria)
VALUES
  (1, 'Acción'),
  (2, 'Aventura'),
  (3, 'Deportes'),
  (4, 'Rol'),
  (5, 'Simulación');

-- VIDEOJUEGO
INSERT INTO VIDEOJUEGO (Id_Videojuego, Nombre_Videojuego, Url_Videojuego, Descripcion_Videojuego, Precio_Videojuego, Num_Ventas_Videojuego, Fecha_Lanzamiento_Videojuego, Id_Categoria)
VALUES
  (1, 'Juego Acción 1', 'http://juegoaccion1.com', 'Un juego de acción emocionante.', 29990, 100, '2023-12-01', 1),
  (2, 'Juego Aventura 1', 'http://juegoaventura1.com', 'Un juego de aventura increíble.', 39990, 200, '2023-11-15', 2),
  (3, 'Juego Deportes 1', 'http://juegodeportes1.com', 'Un juego de deportes divertido.', 19990, 300, '2023-10-20', 3),
  (4, 'Juego Rol 1', 'http://juegorol1.com', 'Una épica aventura de rol.', 49990, 150, '2023-09-15', 4),
  (5, 'Juego Simulación 1', 'http://juegosimulacion1.com', 'Una experiencia de simulación realista.', 25990, 120, '2023-08-10', 5);

-- VIDEOJUEGO_EN_TIENDA
INSERT INTO VIDEOJUEGO_EN_TIENDA (Id_Videojuego, Id_Tienda, Stock)
VALUES
  (1, 1, 50),
  (2, 1, 30),
  (3, 2, 20),
  (4, 3, 40),
  (5, 1, 25);

-- CARRO_COMPRA
INSERT INTO CARRO_COMPRA (Id_Carro, Fecha_Creacion_Carro, Estado_Carro, Id_usuario, Id_videojuego)
VALUES
  (1, '2024-04-01', 0, 2, 1),
  (2, '2024-04-02', 1, 2, 2),
  (3, '2024-04-03', 0, 4, 3);

-- CARRO_VIDEOJUEGO
INSERT INTO CARRO_VIDEOJUEGO (Id_Carro, Id_Videojuego, Cantidad)
VALUES
  (1, 1, 2),
  (2, 2, 1),
  (3, 3, 3);

-- COMPRA
INSERT INTO COMPRA (Id_Compra, Subtotal, Metodo_Pago, Id_Carro)
VALUES
  (1, 59980, 'Tarjeta de crédito', 1),
  (2, 39990, 'Efectivo', 2),
  (3, 59970, 'Transferencia bancaria', 3);

-- VALORACION
INSERT INTO VALORACION (Id_Valoracion, Descripcion_Valoracion, Puntuacion_Valoracion, Fecha_Valoracion)
VALUES
  (1, 'Muy buen juego', 5, '2024-03-15'),
  (2, 'Excelente calidad', 4, '2024-03-16'),
  (3, 'Entretenido pero corto', 3, '2024-03-17');

-- VALORACION_VIDEOJUEGO
INSERT INTO VALORACION_VIDEOJUEGO (Id_Valoracion, Id_Videojuego)
VALUES
  (1, 1),
  (2, 2),
  (3, 3);

-- VALORACION_USUARIO
INSERT INTO VALORACION_USUARIO (Id_usuario, Id_valoracion)
VALUES
  (2, 1),
  (3, 2),
  (4, 3);

-- RANKING_VIDEOJUEGO
INSERT INTO RANKING_VIDEOJUEGO (Id_Ranking, Id_Videojuego, Puntos, Fecha_Ranking)
VALUES
  (1, 1, 100, '2024-05-01'),
  (2, 2, 80, '2024-05-02'),
  (3, 3, 70, '2024-05-03');
