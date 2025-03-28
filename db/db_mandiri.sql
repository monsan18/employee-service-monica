-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 28, 2025 at 02:23 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mandiri`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `department_id` bigint(20) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `employment_status` varchar(255) NOT NULL,
  `manager_id` int(11) DEFAULT NULL,
  `marital_status` int(11) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `no_bpjs` varchar(255) DEFAULT NULL,
  `no_npwp` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `address`, `department_id`, `dob`, `email`, `employment_status`, `manager_id`, `marital_status`, `name`, `no_bpjs`, `no_npwp`, `phone`, `salary`) VALUES
(1, NULL, 2, '1992-05-10', 'alice@example.com', 'Active', 0, 0, 'Alice Johnson', NULL, NULL, NULL, 0),
(2, NULL, 1, '1986-05-12', 'fred@example.com', 'Active', 1, 0, 'Fred', NULL, NULL, NULL, 0),
(3, NULL, 3, '1986-05-12', 'viona@example.com', 'Active', 2, 0, 'Viona', NULL, NULL, NULL, 0),
(4, NULL, 3, '1988-02-12', 'bill@example.com', 'Active', 3, 0, 'Bill', NULL, NULL, NULL, 0),
(6, NULL, 4, '1985-10-22', 'george@example.com', 'In-active', 4, 0, 'George', NULL, NULL, NULL, 0),
(7, NULL, 7, '1995-10-22', 'chiara@example.com', 'Active', 3, 0, 'Chiara', NULL, NULL, NULL, 0),
(8, NULL, 6, '2001-10-22', 'kenzou@example.com', 'Active', 6, 0, 'Kenzou', NULL, NULL, NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_fopic1oh5oln2khj8eat6ino0` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
