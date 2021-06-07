-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-05-2021 a las 10:03:06
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agenda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto`
--

CREATE TABLE `contacto` (
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(25) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `contacto`
--

INSERT INTO `contacto` (`nombre`, `telefono`, `email`) VALUES
('Alejandro', '628231915', 'atorres77@mail.com'),
('Alfonso', '615561555', 'alfonsomiranda@email.net'),
('Ana María', '683737567', 'anhidalgo@mail.net'),
('Andrés', '635730666', 'andalvarez@email.net'),
('Ángel', '654782723', 'angelgomez@correo.com'),
('Antonia', '684385724', 'trujillo87@correo.es'),
('Antonio', '645900753', 'antonio.romero@email.com'),
('Bartolomé', '697196502', 'bcliment@correo.es'),
('Carlos', '634624434', 'cargonzalez9@mail.es'),
('Carmen', '671767849', 'carvilchez@correo.net'),
('Cristina', '662821147', 'crilopez@mail.com'),
('Daniel', '638989267', 'dalves41@correo.net'),
('David', '680922713', 'dpaya57@correo.com'),
('Dolores', '690286978', 'dolmarcos11@email.net'),
('Eduardo', '637821172', 'edumora@mail.com'),
('Eva', '671686152', 'evapeña19@email.com'),
('Fernando', '667797896', 'fernandolopez98@mail.net'),
('Francisca', '682357600', 'framercado@email.com'),
('Francisco', '692563574', 'frahernandez@email.es'),
('Francisco Javier', '646444748', 'frafernandez@email.com'),
('Isabel', '640623382', 'ifuentes@mail.es'),
('Jorge', '699771444', 'rodriguez96@mail.es'),
('José', '637088346', 'gil89@correo.com'),
('José Antonio', '661565646', 'josherrera@mail.com'),
('José María', '697897663', 'sanchez31@email.com'),
('Josefa', '675953388', 'jlopez@correo.es'),
('Juan', '672579790', 'jlopez@correo.net'),
('Juan Carlos', '663618622', 'juaescobar34@mail.es'),
('Julián', '607935286', 'julsalvador64@mail.com'),
('Laura', '660996479', 'laurafernandez80@email.ne'),
('Lucia', '672973381', 'lucporras@mail.es'),
('Luis', '697265515', 'lzafra5@mail.com'),
('Manuel', '677391480', 'manuel.fernandez@correo.n'),
('Manuel Jesús', '637844280', 'man.franco@email.net'),
('Manuela', '674413553', 'manuelamanzano81@mail.net'),
('María', '673150144', 'marvega@correo.net'),
('María Ángeles', '695402286', 'mariaangelesmoreno@email.'),
('María Carmen', '667091407', 'mrebollo@email.com'),
('María Concepción', '677364314', 'm.lozano@correo.net'),
('María Dolores', '609451250', 'mar.becerra@correo.com'),
('María Jesús', '602910957', 'mariajesus.cabañas@mail.n'),
('María Mar', '695697871', 'm.martos@mail.net'),
('María Pilar', '650518997', 'marjimenez@mail.net'),
('María Prado', '689407640', 'mar.rodriguez@correo.es'),
('María Teresa', '696619530', 'mar.sanchez@correo.es'),
('Marina', '686227315', 'mmendez@correo.net'),
('Mercedes', '673609546', 'merjimenez@email.es'),
('Pablo', '690425627', 'perez81@email.net'),
('Patricia', '664967389', 'posorio@email.net'),
('Pedro', '681337637', 'pedcarnero@correo.com'),
('Pilar', '622297669', 'puig76@correo.net'),
('Rafael', '661500887', 'r.romero@mail.com'),
('Rafaela', '683053311', 'segura75@email.es'),
('Ramón', '622298766', 'ramonlopez@correo.es'),
('Raquel', '604959629', 'raqcollantes@email.com'),
('Roberto', '670622600', 'robertolopez@correo.com'),
('Sara', '687401941', 'sariglesias@email.es'),
('Sergi', '657958358', 's.canovas@correo.es'),
('Sergio', '686491895', 'sergiodominguez6@email.ne'),
('Vicente', '686275698', 'v.martinez@email.com'),
('Víctor', '660232607', 'vic.hernandez@email.es'),
('Yolanda', '690851400', 'yol.santiago@email.es');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contacto`
--
ALTER TABLE `contacto`
  ADD PRIMARY KEY (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
