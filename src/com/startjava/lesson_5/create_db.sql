-- create

CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark INTEGER,
	height INTEGER,
	weight INTEGER,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INTEGER);


