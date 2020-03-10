-- querise

SELECT * FROM jaegers;

SELECT * FROM jaegers WHERE status = 'Active';

SELECT * FROM jaegers WHERE mark = 1 or mark = 6;

SELECT * FROM jaegers ORDER BY mark DESC;

SELECT * FROM jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

SELECT AVG(weight) FROM jaegers;

UPDATE jaegers SET kaijukill = kaijukill + 1  WHERE status = 'Active';

DELETE FROM jaegers WHERE status = 'Destroyed';



