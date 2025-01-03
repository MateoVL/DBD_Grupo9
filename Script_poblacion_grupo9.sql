-- Datos para la tabla ROL
INSERT INTO ROL (Id_Rol, nombre_Rol) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor');

-- Datos para la tabla USUARIO
INSERT INTO USUARIO (Id_Usuario, Nombre_Usuario, Correo_Usuario, Clave_Usuario, Ip_Usuario, Fecha_Registro_usuario, Rol) VALUES
(1, 'xXJuanXx', 'juan.perez@gmail.com', 'clave123', '192.168.1.1', '2024-01-15', 'Admin'),
(2, 'Maria69', 'maria.gomez@hotmail.com', 'segura456', '192.168.1.2', '2024-02-20', 'Cliente'),
(3, 'Carlit0x', 'carlos.rojas@yahoo.com', 'miClave789', '192.168.1.3', '2024-03-10', 'Vendedor'),
(4, 'AnaLopez', 'ana.lopez@outlook.com', 'password2024', '192.168.1.4', '2024-04-05', 'Cliente'),
(5, 'PedroGarcia', 'pedro.garcia@gmail.com', 'passw0rd', '192.168.1.5', '2024-05-12', 'Vendedor'),
(6, 'elRubius', 'rubius.gamer@gmail.com', 'clave1234', '192.168.1.6', '2024-06-15', 'Cliente'),
(7, 'notPaola', 'paola.hernandez@gmail.com', 'tuMamita', '192.168.1.7', '2024-07-20', 'Admin'),
(8, 'ChicoTrujillo', 'trujillo.music@gmail.com', 'miClave91011', '192.168.1.8', '2024-08-10', 'Vendedor'),
(9, 'GamerPro', 'gamer.pro@hotmail.com', 'colocolo1991', '192.168.1.9', '2024-09-05', 'Cliente'),
(10, 'TechGuru', 'tech.guru@outlook.com', 'passw0rd123', '192.168.1.10', '2024-10-12', 'Vendedor'),
(11, 'SuperMario', 'mario.bros@gmail.com', 'claveMario', '192.168.1.11', '2024-11-15', 'Cliente'),
(12, 'QueenBee', 'bee.queen@gmail.com', 'buzzbuzz', '192.168.1.12', '2024-12-20', 'Admin'),
(13, 'NinjaWarrior', 'ninja.warrior@yahoo.com', 'stealth123', '192.168.1.13', '2024-01-05', 'Vendedor'),
(14, 'PixelArtist', 'pixel.artist@gmail.com', 'picopalquelee', '192.168.1.14', '2024-02-10', 'Cliente'),
(15, 'CodeMaster', 'code.master@outlook.com', 'vivaRATM', '192.168.1.15', '2024-03-15', 'Admin'),
(21, 'Martin69gamer', 'martin.araya.g@usach.cl', 'DBDsepasasolo', '192.148.1.95', '2024-02-21', 'Admin');


-- Datos para la tabla CATEGORIA
INSERT INTO CATEGORIA (Id_Categoria, Nombre_Categoria) VALUES
(1, 'Acción'),
(2, 'Aventura'),
(3, 'Deportes'),
(4, 'Estrategia'),
(5, 'RPG'),
(6, 'Simulación'),
(7, 'Puzzle'),
(8, 'Carreras'),
(9, 'Terror'),
(10, 'Plataformas'),
(11, 'Musical'),
(12, 'Educativo'),
(13, 'Arcade'),
(14, 'Multijugador Masivo'),
(15, 'Sandbox'),
(16, 'Survival'),
(17, 'Metroidvania'),
(18, 'Battle Royale'),
(19, 'MOBA'),
(20, 'Shooter en Primera Persona'),
(21, 'Shooter en Tercera Persona'),
(22, 'Realidad Virtual'),
(23, 'Realidad Aumentada'),
(24, 'Party Games'),
(25, 'Roguelike'),
(26, 'Roguelite'),
(27, 'Novela Visual'),
(28, 'Point and Click'),
(29, 'Hack and Slash');



-- Datos para la tabla VIDEOJUEGO
INSERT INTO VIDEOJUEGO (Id_Videojuego, Nombre_Videojuego, Url_Videojuego, Descripcion_Videojuego, Precio_Videojuego, Num_Ventas_Videojuego, Fecha_Lanzamiento_Videojuego, Id_Categoria) VALUES
(1, 'Minecraft', 'https://minecraft.net', 'Un juego de construcción y aventuras.', 20000, 5000000, '2009-05-17', 2),
(2, 'GTA V', 'https://rockstargames.com/gta-v', 'Juego de mundo abierto y acción.', 30000, 10000000, '2013-09-17', 1),
(3, 'FIFA 23', 'https://ea.com/fifa', 'El mejor simulador de fútbol.', 50000, 2000000, '2022-09-30', 3),
(4, 'Civilization VI', 'https://civilization.com', 'Estrategia por turnos.', 25000, 1000000, '2016-10-21', 4),
(5, 'The Witcher 3', 'https://thewitcher.com', 'Juego de rol épico.', 40000, 3000000, '2015-05-19', 5),
(6, 'Fortnite', 'https://fortnite.com', 'Battle Royale y construcción.', 0, 35000000, '2017-07-25', 18),
(7, 'Among Us', 'https://innersloth.com/gameAmongUs.php', 'Juego de deducción social.', 5000, 15000000, '2018-06-15', 24),
(8, 'Red Dead Redemption 2', 'https://rockstargames.com/reddeadredemption2', 'Aventura en el viejo oeste.', 60000, 25000000, '2018-10-26', 2),
(9, 'League of Legends', 'https://leagueoflegends.com', 'MOBA competitivo.', 0, 101000000, '2009-10-27', 19),
(10, 'The Legend of Zelda: Breath of the Wild', 'https://zelda.com/breath-of-the-wild', 'Aventura y exploración.', 50000, 25000000, '2017-03-03', 2),
(11, 'Super Mario Odyssey', 'https://mario.nintendo.com', 'Plataformas y aventuras.', 50000, 20000000, '2017-10-27', 10),
(12, 'Animal Crossing: New Horizons', 'https://animal-crossing.com', 'Simulación de vida.', 50000, 30000000, '2020-03-20', 6),
(13, 'Cyberpunk 2077', 'https://cyberpunk.net', 'RPG futurista.', 60000, 13000000, '2020-12-10', 5),
(14, 'Hades', 'https://supergiantgames.com/games/hades', 'Roguelike de acción.', 25000, 2000000, '2020-09-17', 25),
(15, 'Valorant', 'https://playvalorant.com', 'Shooter táctico en primera persona.', 0, 14000000, '2020-06-02', 20);


-- Datos para la tabla BOLETA
INSERT INTO BOLETA (Id_Boleta, Nombre_Vendedor, Nombre_Comprador, Precio_Total, Fecha_Compra) VALUES
(1, 'Carlit0x', 'Maria69', 50000, '2024-06-15'),
(2, 'PedroGarcia', 'AnaLopez', 70000, '2024-07-10'),
(3, 'elRubius', 'GamerPro', 80000, '2024-08-20'),
(4, 'TechGuru', 'SuperMario', 60000, '2024-09-15'),
(5, 'NinjaWarrior', 'PixelArtist', 45000, '2024-10-10'),
(6, 'CodeMaster', 'QueenBee', 75000, '2024-11-05'),
(7, 'ChicoTrujillo', 'Martin69gamer', 90000, '2024-12-01');

-- Datos para la tabla CARRO_COMPRA
INSERT INTO CARRO_COMPRA (Id_Carro, Fecha_Creacion_Carro, Estado_Carro, Id_usuario) VALUES
(1, '2024-06-01', 1, 2),
(2, '2024-07-05', 0, 4),
(3, '2024-08-10', 1, 6),
(4, '2024-09-15', 0, 8),
(5, '2024-10-20', 1, 10),
(6, '2024-11-25', 0, 12),
(7, '2024-12-30', 1, 14);


-- Datos para la tabla CATEGORIA_VIDEOJUEGO
INSERT INTO CATEGORIA_VIDEOJUEGO (Id_Categoria, Id_Videojuego) VALUES
(1, 2),
(2, 1),
(3, 3),
(4, 4),
(5, 5),
(6, 12),
(7, 7),
(8, 8),
(9, 9),
(10, 11),
(11, 11),
(12, 12),
(13, 13),
(14, 9),
(15, 1),
(16, 6),
(17, 14),
(18, 6),
(19, 9),
(20, 15),
(21, 15),
(22, 6),
(23, 6),
(24, 7),
(25, 14),
(26, 14),
(27, 13),
(28, 13),
(29, 13);


-- Datos para la tabla LISTA_DESEOS
INSERT INTO LISTA_DESEOS (Id_lista_deseos, Id_usuario_lista) VALUES
(1, 2),
(2, 4),
(3, 6),
(4, 8),
(5, 10),
(6, 12),
(7, 14),
(8, 15),
(9, 1),
(10, 3),
(11, 5),
(12, 7);


-- Datos para la tabla CONTENIDO_LISTAS
INSERT INTO CONTENIDO_LISTAS (Id_Lista, Id_videojuego) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 4),
(3, 5),
(4, 6),
(4, 7),
(5, 8),
(5, 9),
(6, 10),
(6, 11),
(7, 12),
(7, 13),
(8, 14),
(8, 15),
(9, 1),
(9, 2),
(10, 3),
(10, 4),
(11, 5),
(11, 6),
(12, 7),
(12, 8);


-- Datos para la tabla UBICACION
INSERT INTO UBICACION (Id_Ubicacion, Pais, Ciudad, Direccion) VALUES
(1, 'Chile', 'Santiago', 'Av. Providencia 123'),
(2, 'Chile', 'Valparaíso', 'Calle Condell 456'),
(3, 'Chile', 'Concepción', 'Av. O’Higgins 789'),
(4, 'Chile', 'La Serena', 'Calle Balmaceda 1011'),
(5, 'Chile', 'Antofagasta', 'Av. Argentina 1213'),
(6, 'Chile', 'Temuco', 'Calle Caupolicán 1415'),
(7, 'Chile', 'Iquique', 'Av. Arturo Prat 1617'),
(8, 'Chile', 'Puerto Montt', 'Calle Urmeneta 1819'),
(9, 'Chile', 'Rancagua', 'Av. Libertador Bernardo O’Higgins 2021'),
(10, 'Chile', 'Arica', 'Calle 21 de Mayo 2223');


-- Datos para la tabla TIENDA
INSERT INTO TIENDA (Id_Tienda, Nombre_Tienda, Ip_Tienda, Direccion_Tienda, Id_Jefe, Id_Ubicacion) VALUES
(1, 'Tienda GamerZone', '10.0.0.1', 'Mall Costanera Center', 3, 1),
(2, 'Tienda PlayTime', '10.0.0.2', 'Mall Marina Arauco', 5, 2),
(3, 'Tienda GameWorld', '10.0.0.3', 'Mall Plaza Oeste', 6, 3),
(4, 'Tienda PixelPlay', '10.0.0.4', 'Mall Vivo Imperio', 7, 4),
(5, 'Tienda RetroGames', '10.0.0.5', 'Mall Florida Center', 8, 5),
(6, 'Tienda NextGen', '10.0.0.6', 'Mall Parque Arauco', 9, 6),
(7, 'Tienda VirtualZone', '10.0.0.7', 'Mall Plaza Norte', 10, 7),
(8, 'Tienda ArcadeHub', '10.0.0.8', 'Mall Plaza Egaña', 11, 8),
(9, 'Tienda GameMasters', '10.0.0.9', 'Mall Plaza Vespucio', 12, 9),
(10, 'Tienda eSportsCenter', '10.0.0.10', 'Mall Arauco Maipú', 13, 10);


-- Datos para la tabla VALORACION
INSERT INTO VALORACION (Id_Valoracion, Descripcion_Valoracion, Puntuacion_Valoracion, Fecha_Valoracion) VALUES
(1, 'Excelente juego, muy entretenido.', 5, '2024-06-01'),
(2, 'Buen juego, pero algo caro.', 4, '2024-07-10'),
(3, 'Gráficos impresionantes y jugabilidad adictiva.', 5, '2024-08-15'),
(4, 'Historia interesante, pero algunos bugs.', 3, '2024-09-20'),
(5, 'Multijugador muy divertido, pero falta contenido.', 4, '2024-10-05'),
(6, 'Gran juego, pero la dificultad es alta.', 4, '2024-11-10'),
(7, 'Excelente para jugar con amigos.', 5, '2024-12-25'),
(8, 'Buena música y ambientación.', 4, '2025-01-15'),
(9, 'Demasiado corto para el precio.', 3, '2025-02-20'),
(10, 'Innovador y creativo.', 5, '2025-03-10'),
(11, 'Repetitivo después de un tiempo.', 3, '2025-04-05'),
(12, 'Controles intuitivos y fáciles de aprender.', 4, '2025-05-12'),
(13, 'Gran variedad de personajes y habilidades.', 5, '2025-06-18'),
(14, 'Requiere conexión constante a internet.', 2, '2025-07-22'),
(15, 'Actualizaciones frecuentes y buen soporte.', 5, '2025-08-30');


-- Datos para la tabla VALORACION_VIDEOJUEGO
INSERT INTO VALORACION_VIDEOJUEGO (Id_valoracion, Id_videojuego) VALUES
(1, 1),
(2, 3),
(3, 2),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15);


-- Datos para la tabla VIDEOJUEGO_EN_TIENDA
INSERT INTO VIDEOJUEGO_EN_TIENDA (Id_Videojuego, Id_Tienda, Stock) VALUES
(1, 1, 100),
(2, 2, 50),
(3, 3, 75),
(4, 4, 60),
(5, 5, 90),
(6, 6, 120),
(7, 7, 80),
(8, 8, 110),
(9, 9, 95),
(10, 10, 85),
(1, 2, 40),
(2, 1, 55);

-- Datos para la tabla RANKING_VIDEOJUEGO
INSERT INTO RANKING_VIDEOJUEGO (Id_Ranking, Id_Videojuego, Puntos, Fecha_Ranking) VALUES
(1, 1, 95, '2024-06-01'),
(2, 2, 90, '2024-07-01'),
(3, 3, 88, '2024-08-01'),
(4, 4, 92, '2024-09-01'),
(5, 5, 85, '2024-10-01'),
(6, 6, 93, '2024-11-01'),
(7, 7, 89, '2024-12-01'),
(8, 8, 91, '2025-01-01'),
(9, 9, 87, '2025-02-01'),
(10, 10, 94, '2025-03-01'),
(11, 11, 86, '2025-04-01'),
(12, 12, 90, '2025-05-01'),
(13, 13, 88, '2025-06-01'),
(14, 14, 92, '2025-07-01'),
(15, 15, 89, '2025-08-01');


-- Datos para la tabla COMPRA
INSERT INTO COMPRA (Id_Compra, Subtotal, Metodo_Pago, Id_Carro) VALUES
(1, 50000, 'Tarjeta de Crédito', 1),
(2, 70000, 'Transferencia Bancaria', 2),
(3, 80000, 'PayPal', 3),
(4, 60000, 'Tarjeta de Débito', 4),
(5, 45000, 'Efectivo', 5),
(6, 75000, 'Criptomoneda', 6),
(7, 90000, 'Tarjeta de Crédito', 7);


-- Datos para la tabla CARRO_VIDEOJUEGO
INSERT INTO CARRO_VIDEOJUEGO (Id_Carro, Id_Videojuego, Cantidad) VALUES
(1, 1, 2), -- Carro 1 con 2 copias de Minecraft
(1, 2, 1), -- Carro 1 con 1 copia de GTA V
(2, 3, 3), -- Carro 2 con 3 copias de FIFA 23
(2, 4, 1), -- Carro 2 con 1 copia de Civilization VI
(3, 5, 2), -- Carro 3 con 2 copias de The Witcher 3
(3, 6, 5), -- Carro 3 con 5 copias de Fortnite
(4, 7, 4), -- Carro 4 con 4 copias de Among Us
(4, 8, 1), -- Carro 4 con 1 copia de Red Dead Redemption 2
(5, 9, 3), -- Carro 5 con 3 copias de League of Legends
(5, 10, 2), -- Carro 5 con 2 copias de Zelda: Breath of the Wild
(6, 11, 1), -- Carro 6 con 1 copia de Super Mario Odyssey
(6, 12, 2), -- Carro 6 con 2 copias de Animal Crossing
(7, 13, 1), -- Carro 7 con 1 copia de Cyberpunk 2077
(7, 14, 3), -- Carro 7 con 3 copias de Hades
(7, 15, 2); -- Carro 7 con 2 copias de Valorant
