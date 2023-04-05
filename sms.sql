-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2022 at 11:30 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `AdmissionNumber` varchar(50) NOT NULL,
  `Units` varchar(255) NOT NULL,
  `Amount` int(255) NOT NULL,
  `Paid` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`AdmissionNumber`, `Units`, `Amount`, `Paid`) VALUES
('1001', 'OOP', 20000, 18000),
('1002', 'Knowledge Base', 16000, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

CREATE TABLE `fees` (
  `AdmissionNumber` varchar(50) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Amount` int(255) NOT NULL,
  `Mode_of_Payment` varchar(20) NOT NULL,
  `ChequeNo` varchar(100) NOT NULL,
  `CardNo` varchar(100) NOT NULL,
  `Paid` int(255) NOT NULL,
  `Balance` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fees`
--

INSERT INTO `fees` (`AdmissionNumber`, `Course`, `Amount`, `Mode_of_Payment`, `ChequeNo`, `CardNo`, `Paid`, `Balance`) VALUES
('1001', 'Computer Science', 20000, 'Card', '', 'cxrt5676838', 18000, 2000),
('1002', 'IT', 16000, 'Cheque', '45967079', '', 12000, 4000),
('1004', 'IT', 20000, 'Cash', '', '', 15000, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `AdmissionNumber` varchar(50) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`AdmissionNumber`, `UserName`, `Password`) VALUES
('10000000', 'hgfhh', 'jhgnbnb'),
('1001', 'sm', 'smeaner'),
('1002', 'mosoti', 'pimp');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `AdmissionNumber` varchar(50) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `PhoneNumber` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`AdmissionNumber`, `Name`, `Course`, `Gender`, `PhoneNumber`) VALUES
('1001', 'stinkmeaner', 'COMPUTER SCIENCE', 'Male', '0705730780'),
('1002', 'evans', 'IT', 'Male', '0115347567'),
('1003', 'Thiongo', 'COMPUTER SCIENCE', 'Male', '0789567456'),
('1004', 'joe', 'IT', 'Male', '0789678544');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`AdmissionNumber`);

--
-- Indexes for table `fees`
--
ALTER TABLE `fees`
  ADD PRIMARY KEY (`AdmissionNumber`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`AdmissionNumber`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`AdmissionNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
