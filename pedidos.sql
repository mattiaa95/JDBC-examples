-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-07-2016 a las 00:14:33
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `pruebas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE IF NOT EXISTS `pedidos` (
  `NÚMERODEPEDIDO` int(4) NOT NULL DEFAULT '0',
  `CÓDIGOCLIENTE` varchar(4) DEFAULT NULL,
  `FECHADEPEDIDO` varchar(10) DEFAULT NULL,
  `FORMADEPAGO` varchar(8) DEFAULT NULL,
  `DESCUENTO` decimal(3,2) DEFAULT NULL,
  `ENVIADO` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`NÚMERODEPEDIDO`),
  KEY `CÓDIGOCLIENTE` (`CÓDIGOCLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`NÚMERODEPEDIDO`, `CÓDIGOCLIENTE`, `FECHADEPEDIDO`, `FORMADEPAGO`, `DESCUENTO`, `ENVIADO`) VALUES
(1, 'CT01', '11/03/2000', 'CONTADO', '0.02', 'VERDADERO'),
(3, 'CT23', '18/03/2000', 'APLAZADO', '0.06', 'FALSO'),
(5, 'CT25', '31/03/2000', 'CONTADO', '0.09', 'FALSO'),
(7, 'CT12', '12/04/2000', 'CONTADO', '0.07', 'FALSO'),
(8, 'CT01', '15/04/2000', 'TARJETA', '0.02', 'VERDADERO'),
(9, 'CT21', '21/04/2000', 'CONTADO', '0.04', 'FALSO'),
(11, 'CT04', '01/05/2001', 'CONTADO', '0.08', 'VERDADERO'),
(12, 'CT06', '19/05/2001', 'CONTADO', '0.09', 'VERDADERO'),
(13, 'CT13', '30/04/2000', 'APLAZADO', '0.03', 'FALSO'),
(16, 'CT25', '11/05/2001', 'CONTADO', '0.12', 'FALSO'),
(19, 'CT10', '22/05/2002', 'CONTADO', '0.07', 'VERDADERO'),
(21, 'CT16', '28/05/2001', 'CONTADO', '0.03', 'FALSO'),
(22, 'CT07', '31/05/2000', 'TARJETA', '0.05', 'VERDADERO'),
(25, 'CT18', '02/06/2000', 'CONTADO', '0.06', 'FALSO'),
(26, 'CT09', '04/06/2001', 'APLAZADO', '0.07', 'VERDADERO'),
(27, 'CT34', '06/06/2000', 'CONTADO', '0.04', 'FALSO'),
(28, 'CT28', '08/06/2000', 'APLAZADO', '0.08', 'FALSO'),
(29, 'CT30', '02/04/2001', 'TARJETA', '0.06', 'FALSO'),
(30, 'CT02', '15/08/2000', 'CONTADO', '0.06', 'VERDADERO'),
(31, 'CT30', '08/06/2000', 'TARJETA', '0.05', 'VERDADERO'),
(32, 'CT14', '20/06/2001', 'APLAZADO', '0.06', 'FALSO'),
(34, 'CT26', '23/06/2002', 'TARJETA', '0.05', 'FALSO'),
(35, 'CT26', '30/06/2001', 'CONTADO', '0.06', 'FALSO'),
(37, 'CT24', '02/07/2001', 'TARJETA', '0.03', 'VERDADERO'),
(39, 'CT20', '08/07/2001', 'TARJETA', '0.06', 'VERDADERO'),
(40, 'CT04', '12/07/2002', 'CONTADO', '0.12', 'FALSO'),
(42, 'CT34', '15/07/2002', 'APLAZADO', '0.07', 'VERDADERO'),
(43, 'CT09', '18/07/2001', 'CONTADO', '0.07', 'FALSO'),
(44, 'CT34', '20/07/2002', 'APLAZADO', '0.04', 'FALSO'),
(45, 'CT30', '22/07/2002', 'TARJETA', '0.07', 'FALSO'),
(46, 'CT31', '25/07/2002', 'CONTADO', '0.06', 'FALSO'),
(47, 'CT34', '31/07/2000', 'APLAZADO', '0.08', 'FALSO'),
(48, 'CT18', '30/08/2002', 'CONTADO', '0.03', 'FALSO'),
(49, 'CT28', '02/09/2002', 'CONTADO', '0.03', 'FALSO'),
(50, 'CT09', '05/09/2002', 'APLAZADO', '0.08', 'FALSO'),
(51, 'CT09', '05/09/2002', 'CONTADO', '0.05', 'VERDADERO'),
(63, 'CT28', '10/09/2000', 'CONTADO', '0.09', 'FALSO'),
(72, 'CT01', '18/08/2002', 'CONTADO', '0.05', 'VERDADERO'),
(73, 'CT01', '02/08/2001', 'CONTADO', '0.07', 'FALSO'),
(74, 'CT01', '17/09/2002', 'APLAZADO', '0.08', 'FALSO'),
(75, 'CT01', '30/09/2002', 'TARJETA', '0.12', 'FALSO'),
(76, 'CT01', '19/10/2002', 'CONTADO', '0.04', 'VERDADERO'),
(77, 'CT01', '28/10/2000', 'CONTADO', '0.05', 'FALSO'),
(79, 'CT34', '12/12/2000', 'CONTADO', '0.05', 'FALSO'),
(85, 'CT04', '23/12/2002', 'TARJETA', '0.04', 'FALSO'),
(86, 'CT09', '24/12/2001', 'APLAZADO', '0.03', 'FALSO'),
(98, 'CT01', '27/12/2001', 'CONTADO', '0.08', 'VERDADERO'),
(102, 'CT06', '12/01/2001', 'CONTADO', '0.07', 'VERDADERO'),
(103, 'CT02', '24/01/2001', 'CONTADO', '0.04', 'FALSO'),
(105, 'CT30', '01/01/2001', 'APLAZADO', '0.09', 'FALSO'),
(5005, 'CT30', '10/08/2002', 'TARJETA', '0.00', 'VERDADERO'),
(5050, 'CT30', '27/03/2002', 'TARJETA', '0.00', 'VERDADERO');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`CÓDIGOCLIENTE`) REFERENCES `clientes` (`CÓDIGOCLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
