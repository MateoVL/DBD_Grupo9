--1. Agregar un producto al carrito de compras.

--2. Eliminar un producto del carrito de compras.
DELETE FROM CARRO_VIDEOJUEGO WHERE id_videojuego IN (SELECT nombre_videojuego
                                                     FROM VIDEOJUEGO
                                                     where nombre_videojuego = <introducir nombr de videojuego>
                                                    );--
/*Ejemplo*/
DELETE FROM CARRO_VIDEOJUEGO WHERE Id_Videojuego IN (SELECT id_videojuego
                                                     FROM VIDEOJUEGO
                                                     where nombre_videojuego = 'FIFA 23'
                                                    );--Elimina el id de FIFA 23 en el carro

--3. Mostrar los productos del carrito de compras.
SELECT V.Nombre_Videojuego, V.Precio_Videojuego, CV.Cantidad, (V.Precio_Videojuego * CV.Cantidad) AS Subtotal
FROM CARRO_VIDEOJUEGO as CV
JOIN VIDEOJUEGO as V ON CV.Id_Videojuego = V.Id_Videojuego
WHERE CV.Id_Carro = <introducir id de carro>;

--4. Mostrar el precio total a pagar por el carrito de compras.
SELECT CV.Id_Carro, SUM(V.Precio_Videojuego * CV.Cantidad) AS Subtotal
FROM CARRO_VIDEOJUEGO as CV
JOIN VIDEOJUEGO as V ON CV.Id_Videojuego = V.Id_Videojuego
WHERE CV.Id_Carro = <introducir id de carro>
GROUP BY CV.Id_Carro;

--5. Mostrar todos los videojuegos que se vendan en una ubicacion geografica especifica.
SELECT V.Nombre_Videojuego, U.Ciudad, T.Nombre_Tienda
FROM VIDEOJUEGO as V
JOIN VIDEOJUEGO_EN_TIENDA as VT ON V.Id_Videojuego = VT.Id_Videojuego
JOIN TIENDA as T ON VT.Id_Tienda = T.Id_Tienda
JOIN UBICACION as U ON T.Id_Ubicacion = U.Id_Ubicacion
WHERE U.Ciudad = 'Introducir Ciudad';

--6. Mostrar ranking de los productos con mas ventas.
SELECT V.Nombre_Videojuego, V.Num_Ventas_Videojuego
FROM VIDEOJUEGO as V
ORDER BY V.Num_Ventas_Videojuego DESC;

--7. Mostrar lista de deseos de un usuario.
SELECT V.Nombre_Videojuego
FROM CONTENIDO_LISTAS as CL, VIDEOJUEGO as V, USUARIO as U, LISTA_DESEOS as L
WHERE "Introducir Nombre Usuario" = U.Nombre_Usuario 
AND U.id_usuario = L.Id_usuario_lista 
AND L.Id_lista_deseos = CL.Id_Lista 
AND CL.Id_videojuego = V.Id_Videojuego;
