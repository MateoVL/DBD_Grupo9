-- Mostrar todos los videojuegos que se vendan en una ubicacion geografica especifica. (10 pts)
SELECT V.Nombre_Videojuego, U.Ciudad, T.Nombre_Tienda
FROM VIDEOJUEGO V
JOIN VIDEOJUEGO_EN_TIENDA VT ON V.Id_Videojuego = VT.Id_Videojuego
JOIN TIENDA T ON VT.Id_Tienda = T.Id_Tienda
JOIN UBICACION U ON T.Id_Ubicacion = U.Id_Ubicacion
WHERE U.Ciudad = 'Santiago';

-- Mostrar ranking de los productos con mas ventas. (10 pts)
SELECT V.Nombre_Videojuego, V.Num_Ventas_Videojuego
FROM VIDEOJUEGO V
ORDER BY V.Num_Ventas_Videojuego DESC;
