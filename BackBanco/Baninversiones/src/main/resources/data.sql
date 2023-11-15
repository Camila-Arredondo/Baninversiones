insert into clientes (nombre,apellido,rut)
values('Juan','Soto','14454432-5'),
      ('Illustrée', 'Danher', '5444333-2'),
      ('Yáo', 'Housley', '9888777-6'),
      ('Mélia', 'Pigford', '8765432-1'),
      ('Néhémie', 'Gimblet', '9888777-6'),
      ('Pélagie', 'Narey', '9888777-6'),
      ('Noëlla', 'Lindro', '9888777-6'),
      ('Anaïs', 'Pithcock', '8765432-1'),
      ('Bécassine', 'Linton', '11223344-5'),
      ('Maëlann', 'Moy', '19123456-7'),
      ('Maïlys', 'Burns', '11223344-5');

insert into producto (nombre_producto)
values('APV'),
      ('Mis Metas');

insert into cuentas (id_cuenta, nombre_de_banco, cliente_id)
values(12345, 'Banco de Chile', 1),
      (23456, 'Banco de Chile', 2),
      (34567, 'Banco de Chile', 3),
      (45678, 'Banco Santander', 4),
      (56789, 'Banco Santander', 5),
      (67891, 'Banco Falabella', 6),
      (78912, 'Banco Falabella', 7),
      (89123, 'Bancoestado', 8),
      (91234, 'Bancoestado', 9),
      (98765, 'Banco BCI', 10),
      (87654, 'Banco BCI', 11);

insert into pac  (id_codigo_de_servicio, monto,fecha,id_cliente,id_producto)
values  ('123APV456', 170000,'2023-11-05 12:30:45',1,1),
        ('234METAS567', 5000000,'2023-11-05 11:30:45',2,2),
        ('345METAS678', 220000,'2023-11-05 10:30:45',3,2),
        ('456APV789', 5000,'2023-11-10 9:30:45',4,1),
        ('567METAS890', 1000000,'2023-11-10 8:30:45',5,2),
        ('678APV901', 15000,'2023-11-10 7:30:45',6,1),
        ('890APV123', 30000,'2023-11-15 6:30:45',7,1),
        ('901APV234', 8000,'2023-11-15 5:30:45',8,1),
        ('012METAS345', 1200000,'2023-11-15 4:30:45',9,2),
        ('987APV654', 10000,'2023-11-20 3:30:45',10,1),
        ('321APV654', 50000,'2023-11-20 2:30:45',11,1);