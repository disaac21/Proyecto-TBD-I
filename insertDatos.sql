-- 10 inserts for CLIENTE
INSERT INTO CLIENTE (id, nombre, correoElectronico)
VALUES
    (1, 'John Smith', 'john.smith@email.com'),
    (2, 'Alice Johnson', 'alice.johnson@email.com'),
    (3, 'Bob Brown', 'bob.brown@email.com'),
    (4, 'Sarah White', 'sarah.white@email.com'),
    (5, 'David Jones', 'david.jones@email.com'),
    (6, 'Emily Davis', 'emily.davis@email.com'),
    (7, 'Michael Smith', 'michael.smith@email.com'),
    (8, 'Linda Johnson', 'linda.johnson@email.com'),
    (9, 'James Brown', 'james.brown@email.com'),
    (10, 'Laura White', 'laura.white@email.com');

-- Inserts for DETALLE_FACTURA matching FACTURA and PRODUCTO
INSERT INTO DETALLE_FACTURA (factura_numero, producto_codigoUPC)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 4),
    (2, 5),
    (2, 6),
    (3, 7),
    (3, 8),
    (3, 9),
    (4, 10),
    (4, 11),
    (4, 12),
    (5, 13),
    (5, 14),
    (5, 15),
    (6, 16),
    (6, 17),
    (6, 18),
    (7, 19),
    (7, 20),
    (7, 21),
    (8, 22),
    (8, 23),
    (8, 24),
    (9, 25);

-- 25 inserts for FACTURA
INSERT INTO FACTURA (numero, fecha, isv, subtotal, total, cliente_id, tienda_id)
VALUES
    (1, '2023-09-01', 15.0, 100.0, 115.0, 1, 1),
    (2, '2023-09-02', 10.0, 50.0, 60.0, 2, 2),
    (3, '2023-09-03', 8.0, 75.0, 83.0, 3, 3),
    (4, '2023-09-04', 20.0, 200.0, 240.0, 4, 4),
    (5, '2023-09-05', 12.0, 90.0, 102.0, 5, 5),
    (6, '2023-09-06', 18.0, 120.0, 138.0, 1, 2),
    (7, '2023-09-07', 6.0, 45.0, 51.0, 2, 3),
    (8, '2023-09-08', 14.0, 150.0, 170.0, 3, 4),
    (9, '2023-09-09', 22.0, 180.0, 202.0, 4, 5),
    (10, '2023-09-10', 9.0, 80.0, 89.0, 5, 1),
    (11, '2023-09-11', 11.0, 95.0, 106.0, 1, 2),
    (12, '2023-09-12', 7.0, 65.0, 72.0, 2, 3),
    (13, '2023-09-13', 17.0, 110.0, 127.0, 3, 4),
    (14, '2023-09-14', 13.0, 85.0, 98.0, 4, 5),
    (15, '2023-09-15', 19.0, 130.0, 149.0, 5, 1),
    (16, '2023-09-16', 10.0, 70.0, 80.0, 1, 2),
    (17, '2023-09-17', 16.0, 105.0, 121.0, 2, 3),
    (18, '2023-09-18', 12.0, 90.0, 102.0, 3, 4),
    (19, '2023-09-19', 8.0, 60.0, 68.0, 4, 5),
    (20, '2023-09-20', 14.0, 115.0, 129.0, 5, 1),
    (21, '2023-09-21', 11.0, 85.0, 96.0, 1, 2),
    (22, '2023-09-22', 15.0, 120.0, 138.0, 2, 3),
    (23, '2023-09-23', 9.0, 70.0, 79.0, 3, 4),
    (24, '2023-09-24', 20.0, 150.0, 170.0, 4, 5),
    (25, '2023-09-25', 13.0, 100.0, 113.0, 5, 1);


-- Inserts for INVENTARIO
INSERT INTO INVENTARIO (tienda_id, producto_codigoUPC, precio, cantidad, reorden)
VALUES
    (1, 1, 10, 100, 'Low'),
    (1, 2, 15, 150, 'Medium'),
    (1, 3, 20, 200, 'High'),
    (1, 4, 12, 120, 'Low'),
    (1, 5, 18, 180, 'Medium'),
    (2, 6, 14, 140, 'Low'),
    (2, 7, 16, 160, 'Medium'),
    (2, 8, 22, 220, 'High'),
    (2, 9, 11, 110, 'Low'),
    (2, 10, 17, 170, 'Medium'),
    (3, 11, 9, 90, 'Low'),
    (3, 12, 13, 130, 'Medium'),
    (3, 13, 19, 190, 'High'),
    (3, 14, 10, 100, 'Low'),
    (3, 15, 15, 150, 'Medium'),
    (4, 16, 21, 210, 'High'),
    (4, 17, 8, 80, 'Low'),
    (4, 18, 14, 140, 'Medium'),
    (4, 19, 20, 200, 'High'),
    (4, 20, 9, 90, 'Low'),
    (5, 21, 13, 130, 'Medium'),
    (5, 22, 19, 190, 'High'),
    (5, 23, 11, 110, 'Low'),
    (5, 24, 16, 160, 'Medium'),
    (5, 25, 22, 220, 'High');

-- 25 inserts for PRODUCTO
INSERT INTO PRODUCTO (codigoUPC, nombre, tamaño, embalaje, marca)
VALUES
    (1, 'Product A', 'Small', 'Box', 'Brand X'),
    (2, 'Product B', 'Medium', 'Bag', 'Brand Y'),
    (3, 'Product C', 'Large', 'Box', 'Brand Z'),
    (4, 'Product D', 'Small', 'Box', 'Brand X'),
    (5, 'Product E', 'Medium', 'Bag', 'Brand Y'),
    (6, 'Product F', 'Large', 'Box', 'Brand Z'),
    (7, 'Product G', 'Small', 'Box', 'Brand X'),
    (8, 'Product H', 'Medium', 'Bag', 'Brand Y'),
    (9, 'Product I', 'Large', 'Box', 'Brand Z'),
    (10, 'Product J', 'Small', 'Box', 'Brand X'),
    (11, 'Product K', 'Medium', 'Bag', 'Brand Y'),
    (12, 'Product L', 'Large', 'Box', 'Brand Z'),
    (13, 'Product M', 'Small', 'Box', 'Brand X'),
    (14, 'Product N', 'Medium', 'Bag', 'Brand Y'),
    (15, 'Product O', 'Large', 'Box', 'Brand Z'),
    (16, 'Product P', 'Small', 'Box', 'Brand X'),
    (17, 'Product Q', 'Medium', 'Bag', 'Brand Y'),
    (18, 'Product R', 'Large', 'Box', 'Brand Z'),
    (19, 'Product S', 'Small', 'Box', 'Brand X'),
    (20, 'Product T', 'Medium', 'Bag', 'Brand Y'),
    (21, 'Product U', 'Large', 'Box', 'Brand Z'),
    (22, 'Product V', 'Small', 'Box', 'Brand X'),
    (23, 'Product W', 'Medium', 'Bag', 'Brand Y'),
    (24, 'Product X', 'Large', 'Box', 'Brand Z'),
    (25, 'Product Y', 'Small', 'Box', 'Brand X');

-- 10 inserts for TIENDA
INSERT INTO TIENDA (id, nombre, horario)
VALUES
    (1, 'Store 1', '08:00:00'),
    (2, 'Store 2', '09:00:00'),
    (3, 'Store 3', '10:00:00'),
    (4, 'Store 4', '08:30:00'),
    (5, 'Store 5', '09:30:00'),

-- 15 inserts for TIPO PRODUCTO
INSERT INTO TIPO (producto_codigoUPC, tipo)
VALUES
    (1, 'Type A'),
    (2, 'Type B'),
    (3, 'Type C'),
    (4, 'Type A'),
    (5, 'Type B'),
    (6, 'Type C'),
    (7, 'Type A'),
    (8, 'Type B'),
    (9, 'Type C'),
    (10, 'Type A'),
    (11, 'Type B'),
    (12, 'Type C'),
    (13, 'Type A'),
    (14, 'Type B'),
    (15, 'Type C');
    (16, 'Type A'),
    (17, 'Type B'),
    (18, 'Type C'),
    (19, 'Type A'),
    (20, 'Type B'),
    (21, 'Type C'),
    (22, 'Type A'),
    (23, 'Type B'),
    (24, 'Type C'),
    (25, 'Type A'),

-- 10 inserts for UBICACIONTIENDA
INSERT INTO UBICACION (tienda_id, ubicacion)
VALUES
    (1, 'Location A'),
    (2, 'Location B'),
    (3, 'Location C'),
    (4, 'Location D'),
    (5, 'Location E'),
    (1, 'Location F'),
    (2, 'Location G'),
    (3, 'Location H'),
    (4, 'Location I'),
    (5, 'Location J');

-- Inserts for VENDE, assigning a vendor to each product
INSERT INTO VENDE (producto_codigoUPC, vendedor_id)
VALUES
    (1, 1),  -- Product A is sold by Vendor 1
    (2, 2),  -- Product B is sold by Vendor 2
    (3, 3),  -- Product C is sold by Vendor 3
    (4, 4),  -- Product D is sold by Vendor 4
    (5, 5),  -- Product E is sold by Vendor 5
    (6, 1),  -- Product F is sold by Vendor 1
    (7, 2),  -- Product G is sold by Vendor 2
    (8, 3),  -- Product H is sold by Vendor 3
    (9, 4),  -- Product I is sold by Vendor 4
    (10, 5),  -- Product J is sold by Vendor 5
    (11, 1),  -- Product K is sold by Vendor 1
    (12, 2),  -- Product L is sold by Vendor 2
    (13, 3),  -- Product M is sold by Vendor 3
    (14, 4),  -- Product N is sold by Vendor 4
    (15, 5),  -- Product O is sold by Vendor 5
    (16, 1),  -- Product P is sold by Vendor 1
    (17, 2),  -- Product Q is sold by Vendor 2
    (18, 3),  -- Product R is sold by Vendor 3
    (19, 4),  -- Product S is sold by Vendor 4
    (20, 5),  -- Product T is sold by Vendor 5
    (21, 1),  -- Product U is sold by Vendor 1
    (22, 2),  -- Product V is sold by Vendor 2
    (23, 3),  -- Product W is sold by Vendor 3
    (24, 4),  -- Product X is sold by Vendor 4
    (25, 5);  -- Product Y is sold by Vendor 5

-- 10 inserts for VENDEDOR
INSERT INTO VENDEDOR (id, nombre)
VALUES
    (1, 'Vendor 1'),
    (2, 'Vendor 2'),
    (3, 'Vendor 3'),
    (4, 'Vendor 4'),
    (5, 'Vendor 5'),
    (6, 'Vendor 6'),
    (7, 'Vendor 7'),
    (8, 'Vendor 8'),
    (9, 'Vendor 9'),
    (10, 'Vendor 10');