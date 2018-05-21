create database disciplinas
default character set utf8
default collate utf8_general_ci;

use disciplinas;


create table tb_disciplina (
  id int not null unique auto_increment,
  nomeDisciplina varchar(145) not null unique,
  cargaHoraria int not null,
  curso varchar(145) not null,
  vagas int not null,
  periodo varchar(45) not null,
  primary key (id)
) default character set = utf8;


INSERT INTO `tb_disciplina` (`id`, `nomeDisciplina`, `cargaHoraria`, `curso`, `vagas`, `periodo`) VALUES
(14, 'INTRODUÇÃO A LOGICA DE PROGRAMAÇÃO', 60, 'ADS', 50, 'NOTURNO'),
(15, 'LINGUAGEM DE PROGRAMÇÃO 1', 60, 'ADS', 50, 'NOTURNO'),
(18, 'SQL BÁSICO', 30, 'ADMINISTRADOR DE BANCO DE DADOS', 50, 'MATUTINO'),
(19, 'SQL AVANÇADO', 60, 'ADMINISTRADOR DE BANCO DE DADOS', 30, 'NOTURNO'),
(20, 'HTML5', 30, 'DESENVOLVIMENTO WEB', 20, 'MATUTINO');

select * from tb_disciplina order by nomeDisciplina;