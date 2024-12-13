--Poblacion de tablas:

insert into ROL (Id_Rol, Nombre_Rol)VALUES
    (1, 'Administrador'),
    (2, 'Jefe Tienda'),
    (3, 'Cliente');


insert into USUARIO (Id_Usuario, Nombre_Usuario, Correo_Usuario, Clave_Usuario, Ip_Usuario, Fecha_Registro_usuario, Rol) VALUES 
    (100, 'Dios', 'dios@gmail.com', 'SoyElAdmin1234', '100.100.100.100', '25-12-2024', 1),
    (200, 'Elon Musk', 'elon.musk@gmail.com', 'TeslaEsLoMejor1971', '162.254.206.227', '20-12-2024', 2),
    (300, 'Edmundo Silva', 'edmundo.silva@gmail.com', 'ColoColo24', '190.114.254.152', '27-12-2024', 3);


insert into TIENDA (id_tienda, nombre_tienda, ip_tienda, direccion_tienda, id_jefe) VALUES
    (11,'Yung Feng','1.12.281.234','Huang Pu Qu 106',200),
    (12,'pecsi','6.66.666.666','El diavlo 666',1),
    (13,'La Biblioteca','9.22.425.546','Plazuela El Limón 69',1),
    (14,'Sansun','1.11.255.255','Nongseo-ro 66',200),
    (15,'zara','9.99.976.963','las calilas 9090',1),
    (16,'rito','0.00.000.000','la grieta 10',1),
    (17,'estim','7.57.457.234','valve 213',1);


insert into VALORACION (id_valoracion, descripcion_valoracion, puntuacion_valoracion, fecha_valoracion) VALUES
    (1000, 'Esta muy bueno, por su historia me encanta.', 4, '01-10-2022'),
    (2000, 'Musica 10/10', 5, '12-12-2023'),
    (3000, 'Los graficos son pesimos', 1, '05-07-2024'),
    (4000, 'Obra maestra GOD quisiera perder la memoria para volver a jugarlo', 5, '02-02-2023');


INSERT INTO CATEGORIA (Id_Categoria, Nombre_Categoria) VALUES
    (1010, 'Acción'),
    (2010, 'Aventura'),
    (3010, 'Deportes'),
    (4010, 'Rol'),
    (5010, 'Simulación');
 
