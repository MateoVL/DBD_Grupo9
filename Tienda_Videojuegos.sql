-- TABLE
CREATE TABLE CATEGORIA ( 
  Id_Categoria int NOT NULL,
  Nombre_Categoria VARCHAR(20) NOT NULL,
  PRIMARY KEY (Id_Categoria) );
CREATE TABLE CATEGORIA_VIDEOJUEGO (
  Id_Categoria int NOT NULL,
  Id_Videojuego int NOT NULL,
  PRIMARY KEY (Id_Categoria, Id_Videojuego),
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA(Id_Categoria),
  FOREIGN KEY (Id_Videojuego) references VIDEOJUEGO(Id_Videojuego) );
CREATE TABLE demo (ID integer primary key, Name varchar(20), Hint text );
CREATE TABLE ROL ( 
  Id_Rol int NOT NULL,
  Nombre_Rol VARCHAR(15) NOT NULL,
  PRIMARY KEY (Id_Rol) );
CREATE TABLE USUARIO ( 
  Id_Usuario int not NULL,
  Nombre_Usuario VARCHAR(15) NOT NULL,
  Correo_Usuario VARCHAR(35) NOT NULL,
  Clave_Usuario VARCHAR(20) NOT NULL,
  Ip_Usuario VARCHAR(35) NOT NULL,
  Fecha_Registro_usuario DATE NOT NULL,
  Rol VARCHAR(15) NOT NULL,
  PRIMARY key (Id_Usuario),
  FOREIGN KEY (Rol) REFERENCES ROL(Nombre_Rol) );
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
  FOREIGN KEY (Id_Categoria) REFERENCES CATEGORIA_VIDEOJUEGO(Id_Categoria) );
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
