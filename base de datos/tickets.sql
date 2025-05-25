CREATE TABLE public.usuarios(
nombre char(100) NOT NULL,
nombreUsuario CHAR(100)NOT NULL, 
departamento INT,
contrasenia char(10) NOT NULL,
correo CHAR(75) NOT NULL,
rol int NOT NULL,
identificacion INT NOT NULL PRIMARY KEY
);

CREATE TABLE public.tickets(
	nombre char(100),
	departamento int,
	prioridad int,
	adjunto char,
	fechacreacion date,
	estadoticket int,
	nota char(100),
	flujodetrabajo int,
	idticket INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.nivelprioridad(
	nombre char(100),
	descripcion char(100),
	idnivelprioridad INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.departamento(
	nombre char(100),
	descripcion char(100),
	iddepartamento INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.rol(
	nombre char(100),
	descripcion char(100),
	idrol INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.permisos(
	nombre char(100),
	descripcion char(100),
	idpermisos INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.flujodetrabajo(
	nombre char(100),
	idflujo INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.estadoticket(
	nombre char(100),
	descripcion char(100),
	idestadoticket INT  NOT NULL PRIMARY KEY
);

CREATE TABLE public.permisosusuario(
	ididentificacion int,
	idpermisos int
);



