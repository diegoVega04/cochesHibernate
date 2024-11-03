DROP DATABASE IF EXISTS coches_diego;
CREATE DATABASE  coches_diego;
USE coches_diego;

CREATE TABLE  Coche (
  matricula varchar(7) NOT NULL,
  marca varchar(50) DEFAULT NULL,
  modelo varchar(50) DEFAULT NULL,
  tipo enum ('familiar', 'deportivo', 'SUV', 'furgoneta'),
  PRIMARY KEY (matricula)
);