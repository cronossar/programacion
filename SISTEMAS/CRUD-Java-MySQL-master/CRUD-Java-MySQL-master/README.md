# CRUD-Java-MySQL

Aplicación Java en modo gráfico, para crear un mantenimiento sencillo hacia una tabla de una base de datos.

#

1.  Agregar un registro.
2.  Modificar un registro.
3.  Eliminar un registro.
4.  Mostrar el contenido de la tabla.

Tema: Ferretería
-     Tabla: Categorías
#

El gestor de base de datos es MySQL, en entorno XAMPP.
``` sql 
create database ferreteria

CREATE TABLE `categorias` (
`ID_catego` int(11) NOT NULL,
`Nom_catego` varchar(20) NOT NULL,
`Nom_Produ` varchar(30) NOT NULL,
`Stock` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```

#
Conexión 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="1.0" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd">
  <persistence-unit name="ferreteria?zeroDateTimeBehavior=convertToNullPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
    <class>ferreteriaapp.Categorias_1</class>
    <properties>
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/ferreteria?zeroDateTimeBehavior=convertToNull"/>
      <property name="javax.persistence.jdbc.user" value="root"/>
      <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
      <property name="javax.persistence.jdbc.password" value=""/>
    </properties>
  </persistence-unit>
</persistence>

```

#

![1](https://user-images.githubusercontent.com/25255847/27245139-166f3c6a-52a7-11e7-819d-700ca44ed323.png)
![2](https://user-images.githubusercontent.com/25255847/27245136-15ee8390-52a7-11e7-8e4c-762b467859f5.png)
![3](https://user-images.githubusercontent.com/25255847/27245138-165436e0-52a7-11e7-8ea8-8141161c8539.png)

