-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Apr 13, 2022 at 07:35 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mathsmaster`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(150) NOT NULL,
  `password` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `userName`, `password`) VALUES
(1, 'admin', 'admin'),
(3, 'admin2', '1234'),
(4, 'budara', 'budara');

-- --------------------------------------------------------

--
-- Table structure for table `correctanswer`
--

DROP TABLE IF EXISTS `correctanswer`;
CREATE TABLE IF NOT EXISTS `correctanswer` (
  `Pid` int(40) NOT NULL AUTO_INCREMENT,
  `question` varchar(150) NOT NULL,
  `correct` varchar(150) NOT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `correctanswer`
--

INSERT INTO `correctanswer` (`Pid`, `question`, `correct`) VALUES
(1, 'LEVEL 1: (Q1)Please Find the answer?', '21'),
(2, 'LEVEL 1: (Q2)Find the Missing Number?', '30'),
(3, 'LEVEL 1: (Q3) What is Answer for Last Row?', '23'),
(4, 'LEVEL 1: (Q4) Please Provide Answer For this question.', '99'),
(5, 'LEVEL 1: (Q5) Check this Question.', '50'),
(6, 'LEVEL 2: (Q6) Can You Slove it?', '72'),
(7, 'LEVEL 2: (Q7) Can You Slove this?', '3'),
(8, 'LEVEL 2: (Q8) Can You Slove this?', '4'),
(9, 'LEVEL 2: (Q9) Can You Slove this?', '169'),
(10, 'LEVEL 2: (Q10) Can You Slove this?', '12');

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
CREATE TABLE IF NOT EXISTS `questions` (
  `userName` varchar(150) NOT NULL,
  `q1` varchar(150) NOT NULL,
  `q2` varchar(150) NOT NULL,
  `q3` varchar(150) NOT NULL,
  `q4` varchar(150) NOT NULL,
  `q5` varchar(150) NOT NULL,
  `q6` varchar(150) NOT NULL,
  `q7` varchar(150) NOT NULL,
  `q8` varchar(150) NOT NULL,
  `q9` varchar(150) NOT NULL,
  `q10` varchar(150) NOT NULL,
  PRIMARY KEY (`userName`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`userName`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`, `q8`, `q9`, `q10`) VALUES
('thathsara@gmail.com', 'Over Due', 'Skipped', 'Skipped', 'Skipped', 'Skipped', 'Skipped', 'Skipped', 'Skipped', 'False', 'False'),
('budara@gmail.com', 'True', 'True', 'True', 'Over Due', 'Skipped', 'True', 'True', 'True', 'True', 'Skipped'),
('malkini@gmail.com', 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'True', 'True');

-- --------------------------------------------------------

--
-- Table structure for table `totalmarks`
--

DROP TABLE IF EXISTS `totalmarks`;
CREATE TABLE IF NOT EXISTS `totalmarks` (
  `TID` int(50) NOT NULL AUTO_INCREMENT,
  `userName` varchar(150) NOT NULL,
  `marks` varchar(150) NOT NULL,
  PRIMARY KEY (`TID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `totalmarks`
--

INSERT INTO `totalmarks` (`TID`, `userName`, `marks`) VALUES
(1, 'thathsara@gmail.com', '0'),
(2, 'budara@gmail.com', '70'),
(3, 'malkini@gmail.com', '100');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `userName`, `email`, `password`) VALUES
(1, 'thathsara', 'thathsara@gmail.com', '1234'),
(2, 'budara', 'budara@gmail.com', '1234'),
(3, 'budara', 'budara@gmail.com', '1234'),
(4, 'malkini', 'malkini@gmail.com', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
