DROP SCHEMA IF EXISTS `Eksamen` ;

CREATE SCHEMA IF NOT EXISTS `Eksamen` DEFAULT CHARACTER SET utf8 ;
USE `Eksamen` ;

CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON Eksamen.* TO 'user'@'localhost';

CREATE TABLE IF NOT EXISTS `Eksamen`.`users` (
  `username` VARCHAR(20) NOT NULL,
  `password` VARCHAR(50) NULL,
  `name` VARCHAR(50) NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `Eksamen`.`Aktie` ;

CREATE TABLE IF NOT EXISTS `Eksamen`.`aktie` (
  `name` VARCHAR(150) NULL,
  `symbol` VARCHAR(50) NOT NULL,
  `price` DOUBLE(30,3) NOT NULL,
  PRIMARY KEY (`symbol`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `Eksamen`.`trades` ;

CREATE TABLE IF NOT EXISTS `Eksamen`.`trades` (
  `ID` INT auto_increment,
  `users_username` VARCHAR(150) NOT NULL,
  `aktie_symbol` VARCHAR(50) NOT NULL,
  `bought_soldPrice` DOUBLE(30,2) NOT NULL,
  `volume` INT NOT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (users_username) REFERENCES users(username),
  FOREIGN KEY (aktie_symbol) REFERENCES aktie(symbol))
ENGINE = InnoDB;

INSERT INTO users values ("user1", '1234', 'Christian');

INSERT INTO aktie values ('aktie nr. 1', 'aktie1', 120);
INSERT INTO aktie values ('aktie nr. 2', 'aktie2', 130);
INSERT INTO aktie values ('aktie nr. 3', 'aktie3', 140);


INSERT INTO trades (users_username,aktie_symbol,bought_soldPrice,volume) values ('user1','aktie1',200,1);
INSERT INTO trades (users_username,aktie_symbol,bought_soldPrice,volume) values ('user1','aktie2',120,1);
select * from trades;