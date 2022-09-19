-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Set 19, 2022 alle 11:44
-- Versione del server: 10.4.24-MariaDB
-- Versione PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `negoziami`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `cars`
--

DROP TABLE IF EXISTS `cars`;
CREATE TABLE `cars` (
  `id_car` int(11) NOT NULL,
  `model` varchar(40) DEFAULT NULL,
  `brand` varchar(40) DEFAULT NULL,
  `category` varchar(15) DEFAULT NULL,
  `power_supply` varchar(20) DEFAULT NULL,
  `displacement` varchar(10) DEFAULT NULL,
  `number_doors` varchar(1) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `daily_price` double(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `cars`
--

INSERT INTO `cars` (`id_car`, `model`, `brand`, `category`, `power_supply`, `displacement`, `number_doors`, `color`, `daily_price`) VALUES
(1, '159', 'Alfa Romeo', 'Berlina', 'Benzina', '3.2 Jts', '5', 'Nero', 150.00),
(2, 'Micra', 'Nissan', 'Berlina', 'Diesel', '1.5 Mt', '5', 'Bianco', 110.00),
(3, 'Bravo', 'Fiat', 'Berlina', 'Benzina', '1.4', '5', 'Rosso scuro', 90.00),
(4, 'Tipo', 'Fiat', 'Berlina', 'Diesel', '1.4 Mjt', '5', 'Grigio', 115.00),
(5, 'A4', 'Audi', 'Berlina', 'Benzina', '3.5 Tfsi', '5', 'Argento', 350.00),
(6, 'Classe E', 'Mercedes', 'Berlina', 'Diesel', '4.0 V8', '5', 'Argento', 530.00),
(7, 'Sandero', 'Dacia', 'Utilitaria', 'Benzina', '1.2', '5', 'Blu', 105.00),
(8, 'C1', 'Citroen', 'Utilitaria', 'Diesel', '1.4 Hdi', '5', 'Grigio scuro', 85.00),
(9, 'Picanto', 'Kia', 'Utilitaria', 'Benzina', '1.2', '5', 'Bianco', 135.00),
(10, 'i10', 'Hyundai', 'Utilitaria', 'Gpl', '1.0', '5', 'Marrone', 97.00),
(11, 'Space Star', 'Mitsubishi', 'Utilitaria', 'Bi-Fuel Gpl', '1.0', '5', 'Giallo', 120.00),
(12, 'Twingo', 'Renault', 'Utilitaria', 'Benzina', '1.0', '5', 'Rosso', 110.00),
(13, 'Transit', 'Ford', 'Furgone', 'Diesel', '2.0', '3', 'Grigio', 200.00),
(14, 'Expert', 'Peugeot', 'Furgone', 'Diesel', '1.5', '3', 'Argento', 210.00),
(15, 'Master', 'Renault', 'Furgone', 'Diesel', '2.3', '3', 'Grigio Scuro', 180.00),
(16, 'Proace', 'Toyota', 'Furgone', 'Diesel', '1.5', '3', 'Bianco', 185.00),
(17, 'Vivaro', 'Opel', 'Furgone', 'Diesel', '2.0', '3', 'Rosso', 175.00),
(18, 'Daily', 'Iveco', 'Furgone', 'Diesel', '3.0', '3', 'Blu', 209.00),
(19, 'X1', 'Bmw', 'Suv', 'Ibrida', '2.0', '5', 'Azzurro', 295.00),
(20, 'Ateca', 'Cupra', 'Suv', 'Benzina', '2.0', '5', 'Grigio Scuro', 309.00),
(21, 'HR-V', 'Honda', 'Suv', 'Full Hybrid', '1.6', '5', 'Bianco', 305.00),
(22, 'Puma', 'Ford', 'Suv', 'Ibrida', '1.0', '5', 'Blu celeste', 315.00),
(23, 'Kamiq', 'Skoda', 'Suv', 'Diesel', '1.6 Tdi', '5', 'Bianco', 329.00),
(24, 'Cayenne', 'Porsche', 'Suv', 'Benzina', '3.0', '5', 'Nero', 405.00);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id_car`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `cars`
--
ALTER TABLE `cars`
  MODIFY `id_car` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
