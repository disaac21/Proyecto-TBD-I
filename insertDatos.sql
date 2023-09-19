-- Sample data for CLIENTE table
INSERT INTO CLIENTE (id, nombre, correo_electronico)
VALUES
    (1, 'John Smith', 'john.smith@email.com'),
    (2, 'Alice Johnson', 'alice.johnson@email.com'),
    (3, 'Bob Brown', 'bob.brown@email.com'),
    (4, 'Sarah White', 'sarah.white@email.com'),
    (5, 'David Jones', 'david.jones@email.com'),
    (6, 'Emily Wilson', 'emily.wilson@email.com'),
    (7, 'Michael Davis', 'michael.davis@email.com'),
    (8, 'Linda Miller', 'linda.miller@email.com'),
    (9, 'James Wilson', 'james.wilson@email.com'),
    (10, 'Karen Brown', 'karen.brown@email.com');

-- Sample data for TIENDA table
INSERT INTO TIENDA (id, nombre, horario)
VALUES
    (1, 'Store A', '08:00:00'),
    (2, 'Store B', '09:00:00'),
    (3, 'Store C', '10:00:00'),
    (4, 'Store D', '08:30:00'),
    (5, 'Store E', '09:30:00'),
    (6, 'Store F', '10:30:00'),
    (7, 'Store G', '08:45:00'),
    (8, 'Store H', '09:45:00'),
    (9, 'Store I', '10:45:00'),
    (10, 'Store J', '08:15:00');

-- Sample data for VENDEDOR table
INSERT INTO VENDEDOR (id, nombre)
VALUES
    (1, 'Michael Jackson'),
    (2, 'Emily Davis'),
    (3, 'David Lee'),
    (4, 'Laura Smith'),
    (5, 'Robert Johnson'),
    (6, 'Jessica Brown'),
    (7, 'Mark Wilson'),
    (8, 'Jennifer Davis'),
    (9, 'Chris White'),
    (10, 'Melissa Miller');

-- Sample data for PRODUCTO table
INSERT INTO PRODUCTO (UPC, nombre, tamaño, embalaje, marca)
VALUES
    (101, 'Product X', 'Large', 'Box', 'Brand 1'),
    (102, 'Product Y', 'Small', 'Bottle', 'Brand 2'),
    (103, 'Product Z', 'Medium', 'Bag', 'Brand 3'),
    (104, 'Product A', 'Small', 'Box', 'Brand 4'),
    (105, 'Product B', 'Large', 'Bottle', 'Brand 5'),
    (106, 'Product C', 'Medium', 'Bag', 'Brand 6'),
    (107, 'Product D', 'Large', 'Box', 'Brand 7'),
    (108, 'Product E', 'Small', 'Bottle', 'Brand 8'),
    (109, 'Product F', 'Medium', 'Bag', 'Brand 9'),
    (110, 'Product G', 'Small', 'Box', 'Brand 10');

-- Sample data for TIPO table
INSERT INTO TIPO (codigo_UPC, tipo)
VALUES
    (101, 'Type A'),
    (101, 'Type B'),
    (102, 'Type C'),
    (103, 'Type A'),
    (104, 'Type B'),
    (105, 'Type C'),
    (106, 'Type A'),
    (107, 'Type B'),
    (108, 'Type C'),
    (109, 'Type A');

-- Sample data for INVENTARIO table
INSERT INTO INVENTARIO (idTIENDA, UPC)
VALUES
    (1, '101'),
    (1, '102'),
    (2, '103'),
    (2, '104'),
    (3, '105'),
    (3, '106'),
    (4, '107'),
    (4, '108'),
    (5, '109'),
    (5, '110');

-- Sample data for UBICACION table
INSERT INTO UBICACION (tienda_id, ubicacion)
VALUES
    (1, 'Aisle 1'),
    (1, 'Aisle 2'),
    (2, 'Shelf 1'),
    (2, 'Shelf 2'),
    (3, 'Section A'),
    (3, 'Section B'),
    (4, 'Rack 1'),
    (4, 'Rack 2'),
    (5, 'Row 1'),
    (5, 'Row 2');

-- Sample data for FACTURA table
INSERT INTO FACTURA (numero, fecha, isv, subtotal, total, cliente_id, tienda_id)
VALUES
    (1001, '2023-09-19', 0.15, 100.00, 115.00, 1, 1),
    (1002, '2023-09-20', 0.10, 50.00, 55.00, 2, 2),
    (1003, '2023-09-21', 0.20, 75.00, 90.00, 3, 3),
    (1004, '2023-09-22', 0.10, 60.00, 66.00, 4, 4),
    (1005, '2023-09-23', 0.15, 85.00, 97.75, 5, 5),
    (1006, '2023-09-24', 0.10, 40.00, 44.00, 6, 6),
    (1007, '2023-09-25', 0.20, 120.00, 144.00, 7, 7),
    (1008, '2023-09-26', 0.15, 70.00, 80.50, 8, 8),
    (1009, '2023-09-27', 0.10, 55.00, 60.50, 9, 9),
    (1010, '2023-09-28', 0.20, 95.00, 114.00, 10, 10);
