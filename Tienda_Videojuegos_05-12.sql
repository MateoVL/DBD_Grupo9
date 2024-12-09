-- TABLE
CREATE TABLE BOLETA (
  Id_Boleta int, 
  Nombre_Vendedor VARCHAR(30),
  Nombre_Comprador VARCHAR(30),
  Precio_Total int NOT NULL,
  Fecha_Compra DATE,
  PRIMARY key (Id_Boleta) );
CREATE TABLE CARRO_COMPRA (
  Id_Carro int,
  Fecha_Creacion_Carro DATE,
  Estado_Carro int NOT NULL,
  Id_usuario int,
  Id_videojuego int,
  PRIMARY key (Id_Carro),
  FOREIGN key (Id_usuario) references USUARIO(id_usuario),
  FOREIGN key (Id_videojuego) references VIDEOJUEGO(id_videojuego) );
CREATE TABLE CATEGORIA ( 
  Id_Categoria int NOT NULL,
  Nombre_Categoria VARCHAR(20) NOT NULL,
  PRIMARY KEY (Id_Categoria) );
CREATE TABLE CATEGORIA_VIDEOJUEGO (
  Id_Categoria int NOT NULL,
  Id_Videojuego int NOT NULL,
  PRIMARY KEY (Id_Categoria, Id_Videojuego),
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA(id_categoria),
  FOREIGN KEY (Id_Videojuego) references VIDEOJUEGO(id_videojuego) );
CREATE TABLE COMPRA (
  Id_Compra int,
  Subtotal int,
  Metodo_Pago VARCHAR(20),
  PRIMARY key (Id_Compra) );
CREATE TABLE CONTENIDO_LISTAS (
  Id_Lista int,
  Id_videojuego int,
  PRIMARY KEY (Id_Lista, Id_videojuego),
  FOREIGN key (Id_Lista) references LISTA_DESEOS(Id_lista_deseos),
  FOREIGN KEY (Id_videojuego) references VIDEOJUEGO(id_videojuego) );
CREATE TABLE LISTA_DESEOS ( 
  Id_lista_deseos int,
  Id_usuario_lista int,
  PRIMARY KEY (Id_lista_deseos),
  FOREIGN KEY (Id_usuario_lista) REFERENCES USUARIO(id_usuario) );
CREATE TABLE ROL ( 
  Id_Rol int NOT NULL,
  Nombre_Rol VARCHAR(15) NOT NULL,
  PRIMARY KEY (Id_Rol) );
CREATE TABLE TIENDA ( 
  Id_Tienda int,
  Nombre_Tienda VARCHAR(30),
  Ip_Tienda VARCHAR(35),
  Direccion_Tienda VARCHAR(50),
  Id_Jefe int,
  PRIMARY KEY (Id_Tienda),
  FOREIGN KEY (Id_Jefe) REFERENCES USUARIO (id_usuario) );
CREATE TABLE USUARIO ( 
  Id_Usuario int not NULL,
  Nombre_Usuario VARCHAR(15) NOT NULL,
  Correo_Usuario VARCHAR(35) NOT NULL,
  Clave_Usuario VARCHAR(20) NOT NULL,
  Ip_Usuario VARCHAR(35) NOT NULL,
  Fecha_Registro_usuario DATE NOT NULL,
  Rol VARCHAR(15) NOT NULL,
  PRIMARY key (Id_Usuario),
  FOREIGN KEY (Rol) REFERENCES ROL(nombre_rol) );
CREATE TABLE VALORACION (
  Id_Valoracion int,
  Descripcion_Valoracion VARCHAR(200),
  Puntuacion_Valoracion int,
  Fecha_Valoracion DATE,
  PRIMARY key (Id_Valoracion) );
CREATE TABLE VALORACION_USUARIO (
  Id_usuario int,
  Id_valoracion int, 
  PRIMARY KEY (Id_usuario, Id_valoracion),
  FOREIGN key (Id_usuario) references USUARIO(id_usuario),
  FOREIGN key (Id_valoracion) references VALORACION(Id_Valoracion) );
CREATE TABLE VALORACION_VIDEOJUEGO (
  Id_valoracion int,
  Id_videojuego int,
  PRIMARY key (Id_valoracion, Id_videojuego),
  FOREIGN key (Id_valoracion) REFERENCES VALORACION(Id_Valoracion),
  FOREIGN KEY (Id_videojuego) references VIDEOJUEGO(id_videojuego) );
CREATE TABLE VIDEOJUEGO ( 
  Id_Videojuego int not NULL,
  Nombre_Videojuego VARCHAR(30) NOT NULL,
  Url_Videojuego VARCHAR(50),
  Descripcion_Videojuego VARCHAR(400),
  Precio_Videojuego int NOT NULL,
  Num_Ventas_Videojuego int,
  Fecha_Lanzamiento_Videojuego DATE,
  Id_Categoria int,
  PRIMARY KEY (Id_Videojuego),
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA(id_categoria) );
CREATE TABLE VIDEOJUEGO_EN_TIENDA ( 
  Id_videojuego_en_tienda int,
  Id_tienda int,
  Stock int,
  PRIMARY key (Id_videojuego_en_tienda, Id_tienda),
  FOREIGN key (Id_videojuego_en_tienda) references VIDEOJUEGO(id_videojuego),
  FOREIGN key (Id_tienda) references TIENDA(Id_Tienda) );
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
