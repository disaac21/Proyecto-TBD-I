CREATE TABLE `CLIENTE` (
  `id` int NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `correo_electronico` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
)

CREATE TABLE `FACTURA` (
  `numero` int NOT NULL,
  `fecha` date NOT NULL,
  `isv` double NOT NULL,
  `subtotal` double NOT NULL,
  `total` double NOT NULL,
  `cliente_id` int NOT NULL,
  `tienda_id` int NOT NULL,
  PRIMARY KEY (`numero`),
  UNIQUE KEY `numero_UNIQUE` (`numero`),
  KEY `cliente_id_idx` (`cliente_id`),
  KEY `tiendaID_idx` (`tienda_id`),
  CONSTRAINT `clienteID` FOREIGN KEY (`cliente_id`) REFERENCES `CLIENTE` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tiendaID` FOREIGN KEY (`tienda_id`) REFERENCES `TIENDA` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE `INVENTARIO` (
  `idTIENDA` int NOT NULL,
  `UPC` varchar(45) NOT NULL,
  PRIMARY KEY (`idTIENDA`,`UPC`)
)

CREATE TABLE `PRODUCTO` (
  `UPC` int NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tamaño` varchar(20) NOT NULL,
  `embalaje` varchar(20) NOT NULL,
  `marca` varchar(50) NOT NULL,
  PRIMARY KEY (`UPC`),
  UNIQUE KEY `UPC_UNIQUE` (`UPC`)
)

CREATE TABLE `TIENDA` (
  `id` int NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `horario` time DEFAULT NULL,
  PRIMARY KEY (`id`)
)

CREATE TABLE `TIPO` (
  `codigo_UPC` int NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_UPC`,`tipo`),
  UNIQUE KEY `codigo_UPC_UNIQUE` (`codigo_UPC`),
  CONSTRAINT `tipo_codigoUPC` FOREIGN KEY (`codigo_UPC`) REFERENCES `PRODUCTO` (`UPC`) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE `UBICACION` (
  `tienda_id` int NOT NULL,
  `ubicacion` varchar(45) NOT NULL,
  PRIMARY KEY (`tienda_id`,`ubicacion`),
  UNIQUE KEY `id_UNIQUE` (`tienda_id`),
  CONSTRAINT `ubicaciones_id` FOREIGN KEY (`tienda_id`) REFERENCES `TIENDA` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE `VENDEDOR` (
  `id` int NOT NULL,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
)