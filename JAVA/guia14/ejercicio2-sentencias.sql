select * from tienda.fabricante ;
UPDATE tienda.fabricante SET nombre='nombre' WHERE codigo=  cod;



-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
select nombre from tienda.producto;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
select nombre, precio from tienda.producto;

-- 3. Lista todas las columnas de la tabla producto.
select * from tienda.producto;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
select nombre, round(precio) as precio_redondeado from tienda.producto;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
select codigo_fabricante from tienda.producto;

-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
select codigo_fabricante from tienda.producto group by codigo_fabricante;

-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre from tienda.fabricante order by nombre asc;

-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
select nombre, precio from tienda.producto order by nombre asc, precio desc;

-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * from tienda.fabricante limit 5;

-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre,precio from tienda.producto order by precio asc limit 1;

-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select nombre,precio from tienda.producto order by precio desc limit 1;

-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre,precio from tienda.producto where precio <= 120;

-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
select nombre,precio from tienda.producto where precio between 60 and 120;

-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
select nombre,codigo_fabricante from tienda.producto where codigo_fabricante in ('1','3','5');

-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
select * from tienda.producto where nombre like '%Portátil%';

-- Consultas Multitabla
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo as cod_producto, p.nombre as nombre_prod, p.codigo_fabricante, f.nombre as nombre_fabricante
from tienda.producto p, tienda.fabricante f
where  p.codigo_fabricante = f.codigo;

-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.
select p.nombre as producto, p.precio, f.nombre as fabricante
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
order by f.nombre asc;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
select p.nombre as producto, p.precio, f.nombre as fabricante
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
order by p.precio asc limit 1;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
select f.codigo as cod_fab,f.nombre as fabricante, p.codigo as cod_prod,p.nombre as producto,p.precio
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre in ('Lenovo');

-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
select f.codigo as cod_fab,f.nombre as fabricante, p.codigo as cod_prod,p.nombre as producto,p.precio
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre in ('Crucial')
and p.precio>200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.Utilizando el operador IN.
select f.codigo as cod_fab,f.nombre as fabricante, p.codigo as cod_prod,p.nombre as producto,p.precio
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre in ('Asus','Hewlett-Packard');

-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
select f.codigo as cod_fab,f.nombre as fabricante, p.codigo as cod_prod,p.nombre as producto,p.precio
from tienda.producto p, tienda.fabricante f
where p.codigo_fabricante = f.codigo
and p.precio >= 180 order by p.precio desc, f.nombre asc;

-- Consultas Multitabla
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
select f.nombre as fabricante, p.nombre as producto
from tienda.producto p right join tienda.fabricante f
on p.codigo_fabricante = f.codigo;

-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
select f.nombre as fabricante, p.nombre as producto
from tienda.producto p right join tienda.fabricante f
on p.codigo_fabricante = f.codigo
where p.codigo is null;

-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
 select nombre as producto 
 from tienda.producto  
 where codigo_fabricante = (select codigo from tienda.fabricante where nombre in ('Lenovo'));
 
 -- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN). (Puse mayor ya que no hay ningun valor igual)
select * from producto where precio > 
(select max(precio) from producto where codigo_fabricante = ( select codigo from fabricante where nombre like '%Lenovo%'));

-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
select nombre, precio from producto where precio =
(select max(precio) from producto where codigo_fabricante = ( select codigo from fabricante where nombre like '%Lenovo%'));

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
select * from producto where precio > 
(select avg(precio) from producto where codigo_fabricante = ( select codigo from fabricante where nombre like '%Asus%'));

-- Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN)
select nombre from tienda.fabricante where codigo in (select distinct codigo_fabricante from tienda.producto);

-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select nombre from tienda.fabricante where codigo not in ( select distinct codigo_fabricante from tienda.producto);

-- Subconsultas (En la cláusula HAVING)

-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo

SELECT f.nombre, count(p.codigo) as numero_productos FROM fabricante f INNER JO