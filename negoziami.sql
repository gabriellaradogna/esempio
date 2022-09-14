-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Set 14, 2022 alle 17:49
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
CREATE DATABASE IF NOT EXISTS `negoziami` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `negoziami`;

-- --------------------------------------------------------

--
-- Struttura della tabella `cars`
--

CREATE TABLE `cars` (
  `id_car` int(11) NOT NULL,
  `model` varchar(40) DEFAULT NULL,
  `brand` varchar(40) DEFAULT NULL,
  `category` varchar(15) DEFAULT NULL,
  `power_supply` varchar(20) DEFAULT NULL,
  `displacement` varchar(10) DEFAULT NULL,
  `number_seats` varchar(1) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `daily_price` double(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `cars`
--

INSERT INTO `cars` (`id_car`, `model`, `brand`, `category`, `power_supply`, `displacement`, `number_seats`, `color`, `daily_price`) VALUES
(1, '159', 'Alfa Romeo', 'Berlina', 'Benzina', '3.2 Jts', '5', 'Nero', 150.00),
(2, 'Micra', 'Nissan', 'Berlina', 'Diesel', '1.5 Mt', '5', 'Bianco', 110.00),
(3, 'Bravo', 'Fiat', 'Berlina', 'Benzina', '1.4', '5', 'Rosso scuro', 90.00),
(4, 'Tipo', 'Fiat', 'Berlina', 'Diesel', '1.4 Mjt', '5', 'Grigio', 115.00),
(5, 'A4', 'Audi', 'Berlina', 'Benzina', '3.5 Tfsi', '5', 'Argento', 350.00),
(6, 'Classe E', 'Mercedes', 'Berlina', 'Diesel', '4.0 V8', '5', 'Azzurro', 530.00),
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

-- --------------------------------------------------------

--
-- Struttura della tabella `rental_cars`
--

CREATE TABLE `rental_cars` (
  `id_rental` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_car` int(11) DEFAULT NULL,
  `rental_start` date DEFAULT NULL,
  `rental_end` date DEFAULT NULL,
  `total_price` double(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `rental_cars`
--

INSERT INTO `rental_cars` (`id_rental`, `id_user`, `id_car`, `rental_start`, `rental_end`, `total_price`) VALUES
(1, 3, 14, '2022-09-15', '2022-09-17', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `fiscal_code` varchar(16) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `locality` varchar(50) DEFAULT NULL,
  `province` varchar(2) DEFAULT NULL,
  `postal_code` varchar(5) DEFAULT NULL,
  `business_name` varchar(50) DEFAULT NULL,
  `vat_number` varchar(11) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `users`
--

INSERT INTO `users` (`id_user`, `first_name`, `last_name`, `fiscal_code`, `telephone`, `address`, `locality`, `province`, `postal_code`, `business_name`, `vat_number`, `username`, `password`) VALUES
(1, 'Francesco', 'Verdi', 'VRDFNC94E22F839U', '3206491043', 'Via Giardino dei Fiori, 19', 'Bari', 'BA', '70129', NULL, NULL, NULL, NULL),
(2, 'Giuseppe', 'Bianchi', 'BNCGPP00D22F839B', '3210457698', 'Via dei Colombi, 78', 'Napoli', 'NA', '80100', NULL, NULL, 'Peppe33', 'password00'),
(3, 'Carla', 'Neri', 'NRECRL70P28H501Y', '3784569803', 'Via dei Partigiani, 18', 'Roma', 'RM', '00010', 'CarServ S.r.l', '07643520567', NULL, NULL),
(4, 'Paola', 'Gialli', 'GLLPLA83M41C352I', '3215648795', 'Via dei Serpenti, 65', 'Bari', 'BA', '70126', NULL, NULL, NULL, NULL),
(5, 'Gennaro', 'Savastano', 'SVSGNR76M09F839Q', '3485760917', 'Via Furiosi, 65', 'Napoli', 'NA', '80100', NULL, NULL, NULL, NULL);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id_car`);

--
-- Indici per le tabelle `rental_cars`
--
ALTER TABLE `rental_cars`
  ADD PRIMARY KEY (`id_rental`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_car` (`id_car`);

--
-- Indici per le tabelle `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `cars`
--
ALTER TABLE `cars`
  MODIFY `id_car` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT per la tabella `rental_cars`
--
ALTER TABLE `rental_cars`
  MODIFY `id_rental` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT per la tabella `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `rental_cars`
--
ALTER TABLE `rental_cars`
  ADD CONSTRAINT `id_car` FOREIGN KEY (`id_car`) REFERENCES `cars` (`id_car`),
  ADD CONSTRAINT `id_user` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
