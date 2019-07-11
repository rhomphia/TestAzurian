create table az_Disco (
	discoId LONG not null primary key,
	nombre VARCHAR(75) null,
	autor VARCHAR(75) null,
	fechaLanzamiento DATE null,
	ranking INTEGER,
	flagActivo BOOLEAN
);

INSERT INTO az_Disco
(discoId,nombre,autor,fechaLanzamiento,ranking,flagActivo)
VALUES
(1,'Disco 1','Autor 1','2019-01-01',14,true),
(2,'Disco 2','Autor 3','2012-01-02',8,true),
(3,'Disco 3','Autor 4','2010-01-03',30,true),
(4,'Disco 4','Autor 3','2007-03-05',7,true),
(5,'Disco 5','Autor 2','1984-03-05',29,true),
(6,'Disco 6','Autor 2','2015-04-03',6,true),
(7,'Disco 7','Autor 2','2013-05-20',13,true),
(8,'Disco 8','Autor 2','2012-06-22',5,true),
(9,'Disco 9','Autor 1','2008-01-01',24,true),
(10,'Disco 10','Autor 3','2008-01-01',2,true),
(11,'Disco 11','Autor 3','2018-06-11',25,true),
(12,'Disco 12','Autor 5','2018-08-12',17,true),
(13,'Disco 13','Autor 6','1990-08-12',20,true),
(14,'Disco 14','Autor 7','1992-01-14',21,true),
(15,'Disco 15','Autor 8','1985-03-05',19,true),
(16,'Disco 16','Autor 11','2001-11-01',26,true),
(17,'Disco 17','Autor 11','2000-02-05',15,true),
(18,'Disco 18','Autor 11','2000-03-01',28,true),
(19,'Disco 19','Autor 11','1999-04-26',16,true),
(20,'Disco 20','Autor 12','1998-04-23',1,true),
(21,'Disco 21','Autor 13','2010-07-13',4,true),
(22,'Disco 22','Autor 13','2010-09-28',18,true),
(23,'Disco 23','Autor 10','2010-05-12',27,true),
(24,'Disco 24','Autor 10','2014-10-11',9,true),
(25,'Disco 25','Autor 16','2014-08-10',22,true),
(26,'Disco 26','Autor 16','2016-09-09',3,true),
(27,'Disco 27','Autor 9','2004-09-08',10,true),
(28,'Disco 28','Autor 9','2004-12-07',23,true),
(29,'Disco 29','Autor 19','2011-11-06',11,true),
(30,'Disco 30','Autor 19','2011-11-05',12,true);