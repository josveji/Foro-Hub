CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(200) NOT NULL,
    fecha DATETIME NOT NULL,
    status TINYINT NOT NULL,
    autor_id BIGINT NOT NULL,
    curso BIGINT NOT NULL,
    respuestas BIGINT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE usuarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    correoElectronico VARCHAR(200) NOT NULL UNIQUE,
    contrasena VARCHAR(12) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE respuestas(
    id BIGINT NOT NULL AUTO_INCREMENT,
    mensaje VARCHAR(100) NOT NULL,
    solucion VARCHAR(200) NOT NULL,
    fecha DATETIME NOT NULL,
    autor_id BIGINT NOT NULL,
    topico_id BIGINT NOT NULL,
    curso BIGINT NOT NULL,
    respuestas BIGINT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE perfiles(
    usuario_id BIGINT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE cursos(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
