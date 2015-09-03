USE [master]
GO

/****** Object:  Database [OlympicsDataWarehouse]    Script Date: 28/06/2015 17:05:42 ******/
CREATE DATABASE [OlympicsDataWarehouse]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'OlympicsDataWarehouse', FILENAME = N'D:\Documents\workspace\UNIVILLE\4ANO\SISPD\Integration Services\ETL Olimpiadas\Saidas\Bancos\OlympicsDataWarehouse.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'OlympicsDataWarehouse_log', FILENAME = N'D:\Documents\workspace\UNIVILLE\4ANO\SISPD\Integration Services\ETL Olimpiadas\Saidas\Bancos\OlympicsDataWarehouse_log.ldf' , SIZE = 6912KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [OlympicsDataWarehouse] SET COMPATIBILITY_LEVEL = 120
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [OlympicsDataWarehouse].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ARITHABORT OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET  DISABLE_BROKER 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET RECOVERY FULL 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET  MULTI_USER 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [OlympicsDataWarehouse] SET DB_CHAINING OFF 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [OlympicsDataWarehouse] SET  READ_WRITE 
GO

