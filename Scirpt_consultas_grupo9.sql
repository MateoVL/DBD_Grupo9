--1. Agregar un producto al carrito de compras.

--2. Eliminar un producto del carrito de compras. 

--3. Mostrar los productos del carrito de compras.

--4. Mostrar el precio total a pagar por el carrito de compras.

--5. Mostrar todos los videojuegos que se vendan en una ubicacion geografica especifica.
SELECT V.Nombre_Videojuego, U.Ciudad, T.Nombre_Tienda
FROM VIDEOJUEGO V
JOIN VIDEOJUEGO_EN_TIENDA VT ON V.Id_Videojuego = VT.Id_Videojuego
JOIN TIENDA T ON VT.Id_Tienda = T.Id_Tienda
JOIN UBICACION U ON T.Id_Ubicacion = U.Id_Ubicacion
WHERE U.Ciudad = 'Santiago';

--6. Mostrar ranking de los productos con mas ventas.
SELECT V.Nombre_Videojuego, V.Num_Ventas_Videojuego
FROM VIDEOJUEGO V
ORDER BY V.Num_Ventas_Videojuego DESC;

--7. Mostrar lista de deseos de un usuario.
