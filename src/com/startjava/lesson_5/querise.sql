-- querise

jaegers=# SELECT * FROM jaegers;

jaegers=# SELECT * FROM jaegers WHERE status = 'Active';

jaegers=# SELECT * FROM jaegers WHERE mark = 1 or mark = 6;

jaegers=# SELECT * FROM jaegers ORDER BY mark DESC;

jaegers=# SELECT * FROM jaegers ORDER BY mark DESC;

jaegers=# SELECT * FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);

jaegers=# SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

jaegers=# SELECT AVG(weight) FROM jaegers;

jaegers=# UPDATE jaegers SET kaijukill = kaijukill +1  WHERE status = 'Active';

jaegers=# DELETE FROM jaegers WHERE status = 'Destroyed';



