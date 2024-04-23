-- TIENDA -- 
-- 1 Llista el nom de tots els productes que hi ha en la taula producto. 
SELECT nombre FROM producto;
-- 2 Llista els noms i els preus de tots els productes de la taula producto.
SELECT nombre, precio FROM producto;
-- 3 Llista totes les columnes de la taula producto.
SELECT * FROM producto;
-- 4 Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD).
SELECT nombre, precio, round((precio * 1.07),2) AS "dolar" FROM producto; 
-- 5 Llista el nom dels productes, el preu en euros i el preu en dòlars estatunidencs (USD). Utilitza els següents àlies per a les columnes: nom de producto, euros, dòlars.
SELECT nombre AS 'NOM PRODCUTE', precio AS EURO, round((precio * 1.07),2) AS DOLAR FROM producto; 
-- 6 Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a majúscula.
SELECT UPPER (nombre), precio FROM producto;
-- 7 Llista els noms i els preus de tots els productes de la taula producto, convertint els noms a minúscula.
SELECT LOWER (nombre), precio FROM producto;
-- 8 Llista el nom de tots els fabricants en una columna, i en una altra columna obtingui en majúscules els dos primers caràcters del nom del fabricant.
SELECT CONCAT(UPPER (SUBSTRING(nombre,1,1)), LOWER (SUBSTRING(nombre,2,length(nombre)))) AS nombre FROM fabricante;
-- 9 Llista els noms i els preus de tots els productes de la taula producto, arrodonint el valor del preu.
SELECT nombre, round(precio,1) FROM producto;
-- 10 Llista els noms i els preus de tots els productes de la taula producto, truncant el valor del preu per a mostrar-lo sense cap xifra decimal.
SELECT nombre, round(precio,0) FROM producto;
-- 11 Llista el codi dels fabricants que tenen productes en la taula producto.
SELECT fabricante.codigo FROM fabricante JOIN producto ON producto.codigo_fabricante = fabricante.codigo;
-- 12 Llista el codi dels fabricants que tenen productes en la taula producto, eliminant els codis que apareixen repetits.
SELECT DISTINCT fabricante.codigo FROM fabricante JOIN producto ON producto.codigo_fabricante = fabricante.codigo;
-- 13 Llista els noms dels fabricants ordenats de manera ascendent.
SELECT nombre FROM fabricante ORDER BY nombre ASC;
-- 14 Llista els noms dels fabricants ordenats de manera descendent.
SELECT nombre FROM fabricante ORDER BY nombre DESC;
-- 15 Llista els noms dels productes ordenats, en primer lloc, pel nom de manera ascendent i, en segon lloc, pel preu de manera descendent.
SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;
-- 16 Retorna una llista amb les 5 primeres files de la taula fabricante.
SELECT * FROM fabricante LIMIT 5;
-- 17 Retorna una llista amb 2 files a partir de la quarta fila de la taula fabricante. La quarta fila també s'ha d'incloure en la resposta.
SELECT * FROM fabricante LIMIT 3,2;
-- 18 Llista el nom i el preu del producte més barat. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MIN(preu), necessitaria GROUP BY.
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;
-- 19 Llista el nom i el preu del producte més car. (Utilitza solament les clàusules ORDER BY i LIMIT). NOTA: Aquí no podria usar MAX(preu), necessitaria GROUP BY.
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
-- 20 Llista el nom de tots els productes del fabricant el codi de fabricant del qual és igual a 2.
SELECT nombre FROM producto WHERE codigo_fabricante = 2;
-- 21 Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades.
SELECT producto.nombre AS Producto, producto.precio, fabricante.nombre AS Fabricante FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo;
-- 22 Retorna una llista amb el nom del producte, preu i nom de fabricant de tots els productes de la base de dades. Ordena el resultat pel nom del fabricant, per ordre alfabètic.
SELECT producto.nombre AS Producto, producto.precio, fabricante.nombre AS Fabricante FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo ORDER BY fabricante.nombre ASC;
-- 23 Retorna una llista amb el codi del producte, nom del producte, codi del fabricador i nom del fabricador, de tots els productes de la base de dades.
SELECT producto.nombre, producto.codigo,  fabricante.nombre, producto.codigo_fabricante FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo;
-- 24 Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més barat.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo ORDER BY producto.precio ASC LIMIT 1;
-- 25 Retorna el nom del producte, el seu preu i el nom del seu fabricant, del producte més car.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo ORDER BY producto.precio DESC LIMIT 1;
-- 26 Retorna una llista de tots els productes del fabricant Lenovo.
SELECT producto.nombre, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo';
-- 27 Retorna una llista de tots els productes del fabricant Crucial que tinguin un preu major que 200 €.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Crucial' AND precio > 200;
-- 28 Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Sense utilitzar l'operador IN.
SELECT producto.nombre AS Producto, fabricante.nombre AS Fabricante FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Asus' OR fabricante.nombre = 'Hewlett-Packard' OR fabricante.nombre ='Seagate';
-- 29 Retorna un llistat amb tots els productes dels fabricants Asus, Hewlett-Packardy Seagate. Fent servir l'operador IN.
SELECT producto.nombre AS Producto, fabricante.nombre AS Fabricante FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre IN('Asus','Hewlett-Packard','Seagate');
-- 30 Retorna un llistat amb el nom i el preu de tots els productes dels fabricants el nom dels quals acabi per la vocal e.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE '%e';
-- 31 Retorna un llistat amb el nom i el preu de tots els productes el nom de fabricant dels quals contingui el caràcter w en el seu nom.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE '%w%';
-- 32 Retorna un llistat amb el nom de producte, preu i nom de fabricant, de tots els productes que tinguin un preu major o igual a 180 €. Ordena el resultat, en primer lloc, pel preu (en ordre descendent) i, en segon lloc, pel nom (en ordre ascendent).
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE precio >= 180 ORDER BY precio DESC, producto.nombre ASC;
-- 33 Retorna un llistat amb el codi i el nom de fabricant, solament d'aquells fabricants que tenen productes associats en la base de dades.
SELECT DISTINCT producto.codigo_fabricante, fabricante.nombre FROM fabricante JOIN producte ON fabricante.codigo = codigo_fabricante;
-- 34 Retorna un llistat de tots els fabricants que existeixen en la base de dades, juntament amb els productes que té cadascun d'ells. El llistat haurà de mostrar també aquells fabricants que no tenen productes associats.
SELECT fabricante.codigo,producto.nombre, producto.codigo_fabricante, fabricante.nombre FROM fabricante LEFT JOIN producto ON fabricante.codigo = codigo_fabricante ;
-- 35 Retorna un llistat on només apareguin aquells fabricants que no tenen cap producte associat.
SELECT fabricante.nombre FROM fabricante LEFT JOIN producto ON fabricante.codigo = codigo_fabricante  WHERE producto.nombre IS NULL;
-- 36 Retorna tots els productes del fabricador Lenovo. (Sense utilitzar INNER JOIN).
SELECT producto.nombre, producto.precio FROM fabricante LEFT JOIN producto ON fabricante.codigo = codigo_fabricante WHERE fabricante.nombre = 'Lenovo';
-- 37 Retorna totes les dades dels productes que tenen el mateix preu que el producte més car del fabricant Lenovo. (Sense usar INNER JOIN).
SELECT producto.nombre, producto.precio FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE precio =(SELECT MAX(precio) FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre ='Lenovo');
-- 38 Llista el nom del producte més car del fabricant Lenovo.
SELECT producto.nombre, producto.precio FROM fabricante LEFT JOIN producto ON fabricante.codigo = codigo_fabricante WHERE fabricante.nombre = 'Lenovo' ORDER BY precio DESC LIMIT 1;
-- 39 Llista el nom del producte més barat del fabricant Hewlett-Packard.
SELECT producto.nombre, producto.precio FROM fabricante LEFT JOIN producto ON fabricante.codigo = codigo_fabricante WHERE fabricante.nombre = 'Hewlett-Packard' ORDER BY precio ASC LIMIT 1;
-- 40 Retorna tots els productes de la base de dades que tenen un preu major o igual al producte més car del fabricant Lenovo.
SELECT producto.nombre, producto.precio FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE precio >=(SELECT MAX(precio) FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre ='Lenovo');
-- 41 Llesta tots els productes del fabricant Asus que tenen un preu superior al preu mitjà de tots els seus productes.
SELECT producto.nombre, producto.precio FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE precio >(SELECT AVG(precio) FROM producto LEFT JOIN fabricante ON codigo_fabricante = fabricante.codigo WHERE fabricante.nombre ='Asus' );

-- UNIVERSIDAD --
-- 1 Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT persona.apellido1, persona.apellido2, nombre FROM persona WHERE tipo='alumno' ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;
-- 2 Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo='alumno' AND telefono IS NULL;
-- 3 Retorna el llistat dels alumnes que van néixer en 1999.
SELECT nombre, apellido1, apellido2 FROM persona WHERE YEAR (fecha_nacimiento) = 1999  AND tipo='alumno';
-- 4 Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo='profesor' AND telefono IS NULL AND nif LIKE '%L';
-- 5 Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
-- 6 Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
SELECT p.apellido1, p.apellido2, p.nombre, d.nombre FROM persona AS p JOIN profesor ON id_profesor = p.id JOIN departamento AS d ON id_departamento = d.id ORDER BY p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
-- 7 Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
SELECT a.nombre, ce.anyo_inicio, ce.anyo_fin FROM alumno_se_matricula_asignatura AS am JOIN asignatura AS a ON am.id_asignatura = a.id JOIN curso_escolar AS ce ON am.id_curso_escolar = ce.id JOIN persona AS p ON am.id_alumno = p.id WHERE p.tipo='alumno' AND p.nif='26902806M';
-- 8 Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT DISTINCT d.nombre FROM departamento d JOIN profesor p ON  d.id = p.id_departamento JOIN asignatura a ON p.id_profesor = a.id_profesor JOIN grado g ON a.id_grado = g.id WHERE g.nombre ='Grado en Ingeniería Informática (Plan 2015)'; 
-- 9 Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
SELECT DISTINCT p.nombre FROM alumno_se_matricula_asignatura am JOIN persona p ON am.id_alumno = p.id JOIN curso_escolar ce ON am.id_curso_escolar = ce.id WHERE ce.anyo_inicio = '2018' AND ce.anyo_fin ='2019';

-- LEFT JOIN RIGHT JOIN --
-- 1 Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El llistat ha de retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor/a. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT d.nombre, p.apellido1, p.apellido2, p.nombre FROM persona p JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN departamento d ON pr.id_departamento = d.id ORDER BY d.nombre ASC, p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
-- 2 Retorna un llistat amb els professors/es que no estan associats a un departament.
SELECT p.nombre AS Nombre_Persona, d.nombre AS Departamento FROM persona p LEFT JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN departamento d ON pr.id_departamento= d.id WHERE pr.id_departamento IS NULL AND p.tipo='profesor';
-- 3 Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT p.nombre AS Nombre_Persona, d.nombre AS Departamento FROM persona p RIGHT JOIN profesor pr ON p.id = pr.id_profesor RIGHT JOIN departamento d ON pr.id_departamento= d.id WHERE pr.id_departamento IS NULL;
-- 4 Retorna un llistat amb els professors/es que no imparteixen cap assignatura.
SELECT p.nombre AS Profesor FROM profesor pr LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor LEFT JOIN persona p ON pr.id_profesor = p.id WHERE a.id IS NULL;
-- 5 Retorna un llistat amb les assignatures que no tenen un professor/a assigna.
SELECT a.nombre AS Asignatura_Sense_Profesor FROM asignatura a LEFT JOIN profesor pr ON pr.id_profesor = a.id_profesor  WHERE a.id_profesor IS NULL;
-- 6 Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT DISTINCT d.nombre AS Departamento_Sin_Asignaturas FROM departamento d LEFT JOIN profesor pr ON pr.id_departamento = d.id LEFT JOIN asignatura a ON a.id_profesor = pr.id_profesor  WHERE a.curso IS NULL;

-- RESUM --
-- 1 Retorna el nombre total d'alumnes que hi ha.
SELECT COUNT(*) ALUMNOS_TOTALES  FROM persona WHERE tipo = 'alumno';
-- 2 Calcula quants alumnes van néixer en 1999.
SELECT COUNT(*) NACIDOS_1999 FROM persona WHERE YEAR (fecha_nacimiento) = 1999 AND tipo='alumno'; 
-- 3 Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
SELECT COUNT(pr.id_profesor) AS Profes, d.nombre FROM profesor pr JOIN departamento d ON pr.id_departamento = d.id WHERE pr.id_profesor IS NOT NULL GROUP BY id_departamento ORDER BY Profes DESC;
-- 4 Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats. Aquests departaments també han d'aparèixer en el llistat.
SELECT COUNT(pr.id_profesor) AS Profes, d.nombre FROM profesor pr RIGHT JOIN departamento d ON pr.id_departamento = d.id GROUP BY id_departamento;
-- 5 Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT COUNT(a.id_grado) AS Asignaturas, g.nombre FROM asignatura a  RIGHT JOIN grado g ON a.id_grado = g.id GROUP BY g.nombre ORDER BY Asignaturas DESC;
-- 6 Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
SELECT COUNT(a.id_grado) AS Asignaturas, g.nombre FROM asignatura a  RIGHT JOIN grado g ON a.id_grado = g.id GROUP BY g.nombre HAVING COUNT(a.id_grado) > 40 ORDER BY Asignaturas DESC;
-- 7 Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre, a.tipo, SUM(a.creditos) FROM grado g JOIN asignatura a ON g.id = a.id_grado GROUP BY a.creditos;
-- 8 Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars. El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
SELECT COUNT(am.id_alumno) AS Alumnos, ce.anyo_inicio FROM alumno_se_matricula_asignatura am JOIN curso_escolar ce ON am.id_curso_escolar = ce.id GROUP BY ce.anyo_inicio;
-- 9 Retorna un llistat amb el nombre d'assignatures que imparteix cada professor/a. El llistat ha de tenir en compte aquells professors/es que no imparteixen cap assignatura. El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
SELECT p.id, p.nombre, p.apellido1, p.apellido2, COUNT(a.id_profesor) AS Asignaturas FROM profesor pr  JOIN persona p ON pr.id_profesor = p.id LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor GROUP BY p.id  ORDER BY Asignaturas DESC;
-- 10 Retorna totes les dades de l'alumne/a més jove.
SELECT * FROM persona WHERE tipo LIKE 'alumno' ORDER BY fecha_nacimiento ASC LIMIT 1;
-- 11 Retorna un llistat amb els professors/es que tenen un departament associat i que no imparteixen cap assignatura.
SELECT DISTINCT p.nombre, d.nombre AS Departamento, a.nombre AS Asignatura FROM persona p JOIN profesor pr ON p.id = pr.id_profesor JOIN departamento d ON pr.id_departamento = d.id LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor WHERE a.nombre IS NULL AND d.id IS NOT NULL;





