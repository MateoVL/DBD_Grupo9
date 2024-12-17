--Tablas:
CREATE TABLE IF NOT EXISTS ROL ( 
  Id_Rol INT NOT NULL,
  nombre_Rol VARCHAR(15) NOT NULL UNIQUE, -- Asegura unicidad
  PRIMARY KEY (Id_Rol)
);

CREATE TABLE if not EXISTS USUARIO ( 
  Id_Usuario int not NULL,
  Nombre_Usuario VARCHAR(15) NOT NULL,
  Correo_Usuario VARCHAR(35) NOT NULL,
  Clave_Usuario VARCHAR(20) NOT NULL,
  Ip_Usuario VARCHAR(35) NOT NULL,
  Fecha_Registro_usuario DATE NOT NULL,
  Rol VARCHAR(15) NOT NULL,
  PRIMARY key (Id_Usuario),
  FOREIGN KEY (Rol) REFERENCES ROL(nombre_rol) );

CREATE TABLE if not EXISTS CATEGORIA ( 
  Id_Categoria int NOT NULL,
  Nombre_Categoria VARCHAR(27) NOT NULL,
  PRIMARY KEY (Id_Categoria) );

CREATE TABLE if not EXISTS VIDEOJUEGO ( 
  Id_Videojuego int not NULL,
  Nombre_Videojuego VARCHAR(70) NOT NULL,
  Url_Videojuego VARCHAR(80),
  Descripcion_Videojuego VARCHAR(400),
  Precio_Videojuego int NOT NULL,
  Num_Ventas_Videojuego int,
  Fecha_Lanzamiento_Videojuego DATE,
  Id_Categoria int,
  PRIMARY KEY (Id_Videojuego),
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA(id_categoria) );

CREATE TABLE if not EXISTS BOLETA (
  Id_Boleta int, 
  Nombre_Vendedor VARCHAR(30),
  Nombre_Comprador VARCHAR(30),
  Precio_Total int NOT NULL,
  Fecha_Compra DATE,
  PRIMARY key (Id_Boleta) );

CREATE TABLE if not EXISTS CARRO_COMPRA (
  Id_Carro int,
  Fecha_Creacion_Carro DATE,
  Estado_Carro int NOT NULL,
  Id_usuario int,
  Id_videojuego int,
  PRIMARY key (Id_Carro),
  FOREIGN key (Id_usuario) references USUARIO(id_usuario),
  FOREIGN key (Id_videojuego) references VIDEOJUEGO(id_videojuego) );



CREATE TABLE if not EXISTS CATEGORIA_VIDEOJUEGO (
  Id_Categoria int NOT NULL,
  Id_Videojuego int NOT NULL,
  PRIMARY KEY (Id_Categoria, Id_Videojuego),
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA(id_categoria),
  FOREIGN KEY (Id_Videojuego) references VIDEOJUEGO(id_videojuego) );

CREATE TABLE if not EXISTS LISTA_DESEOS ( 
  Id_lista_deseos int,
  Id_usuario_lista int,
  PRIMARY KEY (Id_lista_deseos),
  FOREIGN KEY (Id_usuario_lista) REFERENCES USUARIO(id_usuario) );

CREATE TABLE if not EXISTS CONTENIDO_LISTAS (
  Id_Lista int,
  Id_videojuego int,
  PRIMARY KEY (Id_Lista, Id_videojuego),
  FOREIGN key (Id_Lista) references LISTA_DESEOS(Id_lista_deseos),
  FOREIGN KEY (Id_videojuego) references VIDEOJUEGO(id_videojuego) );

CREATE TABLE if not EXISTS UBICACION (
  Id_Ubicacion INT PRIMARY KEY,
  Pais VARCHAR(50) NOT NULL,
  Ciudad VARCHAR(50) NOT NULL,
  Direccion VARCHAR(100)
);

CREATE TABLE if not EXISTS TIENDA (
  Id_Tienda INT,
  Nombre_Tienda VARCHAR(30),
  Ip_Tienda VARCHAR(35),
  Direccion_Tienda VARCHAR(50),
  Id_Jefe INT,
  Id_Ubicacion INT,
  PRIMARY KEY (Id_Tienda),
  FOREIGN KEY (Id_Jefe) REFERENCES USUARIO(Id_Usuario),
  FOREIGN KEY (Id_Ubicacion) REFERENCES UBICACION(Id_Ubicacion)
);

CREATE TABLE if not EXISTS VALORACION (
  Id_Valoracion int,
  Descripcion_Valoracion VARCHAR(200),
  Puntuacion_Valoracion int,
  Fecha_Valoracion DATE,
  PRIMARY key (Id_Valoracion) );

CREATE TABLE if not EXISTS VALORACION_USUARIO (
  Id_usuario int,
  Id_valoracion int, 
  PRIMARY KEY (Id_usuario, Id_valoracion),
  FOREIGN key (Id_usuario) references USUARIO(id_usuario),
  FOREIGN key (Id_valoracion) references VALORACION(Id_Valoracion) );

CREATE TABLE if not EXISTS VALORACION_VIDEOJUEGO (
  Id_valoracion int,
  Id_videojuego int,
  PRIMARY key (Id_valoracion, Id_videojuego),
  FOREIGN key (Id_valoracion) REFERENCES VALORACION(Id_Valoracion),
  FOREIGN KEY (Id_videojuego) references VIDEOJUEGO(id_videojuego) );

CREATE TABLE if not EXISTS VIDEOJUEGO_EN_TIENDA (
  Id_Videojuego INT,
  Id_Tienda INT,
  Stock INT NOT NULL,
  PRIMARY KEY (Id_Videojuego, Id_Tienda),
  FOREIGN KEY (Id_Videojuego) REFERENCES VIDEOJUEGO(Id_Videojuego),
  FOREIGN KEY (Id_Tienda) REFERENCES TIENDA(Id_Tienda)
);

CREATE TABLE if not EXISTS RANKING_VIDEOJUEGO (
  Id_Ranking INT PRIMARY KEY,
  Id_Videojuego INT NOT NULL,
  Puntos INT NOT NULL,
  Fecha_Ranking DATE NOT NULL,
  FOREIGN KEY (Id_Videojuego) REFERENCES VIDEOJUEGO(Id_Videojuego)
);

CREATE TABLE if not EXISTS CARRO_VIDEOJUEGO (
  Id_Carro INT NOT NULL,
  Id_Videojuego INT NOT NULL,
  Cantidad INT NOT NULL,
  PRIMARY KEY (Id_Carro, Id_Videojuego),
  FOREIGN KEY (Id_Carro) REFERENCES CARRO_COMPRA(Id_Carro),
  FOREIGN KEY (Id_Videojuego) REFERENCES VIDEOJUEGO(Id_Videojuego)
);

CREATE TABLE if not EXISTS VIDEOJUEGO_USUARIO (
  Id_Videojuego INT NOT NULL,
  Id_Usuario INT NOT NULL,
  PRIMARY KEY (Id_Videojuego, Id_Usuario),
  FOREIGN KEY (Id_Videojuego) REFERENCES VIDEOJUEGO(Id_Videojuego),
  FOREIGN KEY (Id_Usuario) REFERENCES USUARIO(Id_Usuario)
);

CREATE TABLE if not EXISTS COMPRA (
  Id_Compra INT,
  Subtotal INT NOT NULL,
  Metodo_Pago VARCHAR(27),
  Id_Carro INT NOT NULL,
  PRIMARY KEY (Id_Compra),
  FOREIGN KEY (Id_Carro) REFERENCES CARRO_COMPRA(Id_Carro)
);


-- Asegurar que nombre_Rol sea único para usarlo como clave foránea
ALTER TABLE ROL ADD CONSTRAINT uq_nombre_rol UNIQUE (nombre_Rol);

-- Si quieres validar el estado del carro, esta restricción tiene sentido:
ALTER TABLE CARRO_COMPRA ADD CONSTRAINT chk_estado CHECK (Estado_Carro IN (0, 1));
