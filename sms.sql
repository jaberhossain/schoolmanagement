-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 02:48 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `staffinfo`
--

CREATE TABLE `staffinfo` (
  `Name` varchar(30) NOT NULL,
  `ID` int(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Mobile` int(10) NOT NULL,
  `timming` varchar(15) NOT NULL,
  `place` varchar(30) NOT NULL,
  `Salary` int(10) NOT NULL,
  `position` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffinfo`
--

INSERT INTO `staffinfo` (`Name`, `ID`, `password`, `Mobile`, `timming`, `place`, `Salary`, `position`) VALUES
('Kodom ', 1, 'kodom', 129384778, '10:00-17:00', 'Building 2', 8000, 'peon'),
('Alimuddin', 2, 'alim', 1289345, '11:00-15:00', 'building 2', 9000, 'guard'),
('Alo', 3, 'alo', 129384928, '10-12', 'b2', 20000, 'peon');

-- --------------------------------------------------------

--
-- Table structure for table `studentinfo`
--

CREATE TABLE `studentinfo` (
  `Name` varchar(39) NOT NULL,
  `ID` int(8) NOT NULL,
  `password` varchar(15) NOT NULL,
  `Phone_Number` int(10) NOT NULL,
  `Cgpa` float NOT NULL,
  `Father_Name` varchar(20) NOT NULL,
  `Mother_Name` varchar(20) NOT NULL,
  `Address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentinfo`
--

INSERT INTO `studentinfo` (`Name`, `ID`, `password`, `Phone_Number`, `Cgpa`, `Father_Name`, `Mother_Name`, `Address`) VALUES
('Anisur Rahman', 2, 'anis', 198273894, 3.1, 'Aminur Rahman', 'Salma Alom', '3/Gha School Road,Mohakhali');

-- --------------------------------------------------------

--
-- Table structure for table `teacheremail`
--

CREATE TABLE `teacheremail` (
  `Teacher Name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacheremail`
--

INSERT INTO `teacheremail` (`Teacher Name`, `email`) VALUES
('Alom Ahmed', 'aahmed@yahoo.com'),
('Marzia Begom', 'marzia@gmail.com'),
('Enayet Ullah', 'ullahen@hotmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `teacherinfo`
--

CREATE TABLE `teacherinfo` (
  `ID` int(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `Salary` int(10) NOT NULL,
  `Mobile_Number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacherinfo`
--

INSERT INTO `teacherinfo` (`ID`, `password`, `Name`, `Address`, `Department`, `Salary`, `Mobile_Number`) VALUES
(1, 'alom', 'Alom Ahmed', 'Banani,Dhaka', 'Mathematics', 50000, 1918277346),
(2, 'marzia', 'Marzia Begom', 'Mohammadpur', 'English', 60000, 182394873),
(3, 'enayet', 'Enayet Ullah', 'KHilgaon', 'Arts', 50000, 1753283945);

-- --------------------------------------------------------

--
-- Table structure for table `timminglist`
--

CREATE TABLE `timminglist` (
  `Name` varchar(30) NOT NULL,
  `Sunday` varchar(20) NOT NULL,
  `Monday` varchar(20) NOT NULL,
  `Tuesday` varchar(20) NOT NULL,
  `Wednesday` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `timminglist`
--

INSERT INTO `timminglist` (`Name`, `Sunday`, `Monday`, `Tuesday`, `Wednesday`) VALUES
('Alom', '10:00-14:00', '8:00-13:00', '8:00-15:00', '1000-13:00'),
('Enayet', '10:00-14:00', '10:00-15:00', '11:00-13:00', '11:00-14:00'),
('Marzia', '11:00-16:00', '11:00-16:00', '10:00-14:00', '8:00-15:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staffinfo`
--
ALTER TABLE `staffinfo`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `studentinfo`
--
ALTER TABLE `studentinfo`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `teacherinfo`
--
ALTER TABLE `teacherinfo`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `timminglist`
--
ALTER TABLE `timminglist`
  ADD PRIMARY KEY (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staffinfo`
--
ALTER TABLE `staffinfo`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `studentinfo`
--
ALTER TABLE `studentinfo`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `teacherinfo`
--
ALTER TABLE `teacherinfo`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
