CREATE DATABASE IF NOT EXISTS podcastdb;
USE podcastdb;


CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    tipo_usuario VARCHAR(20) NOT NULL
);

-- Usuários de exemplo
INSERT INTO usuarios (nome_usuario, senha, tipo_usuario) VALUES
('admin', '1234', 'ADMINISTRADOR'),
('joao', '1234', 'OPERADOR'),
('maria', '1234', 'USUARIO');


CREATE TABLE podcast (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    produtor VARCHAR(100) NOT NULL,
    nome_episodio VARCHAR(150) NOT NULL,
    numero_episodio INT NOT NULL,
    duracao VARCHAR(20),
    url VARCHAR(255)
);


