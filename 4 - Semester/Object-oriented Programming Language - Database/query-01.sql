CREATE DATABASE Universidade;

GO USE Universidade;

Go
CREATE TABLE
  Estudante (
    id INT PRIMARY KEY NOT NULL IDENTITY (1, 1),
    name VARCHAR(100),
    ra VARCHAR(20),
    situation VARCHAR(10)
  );

GO
ALTER TABLE Estudante ADD data_nascimento DATE;

GO
INSERT INTO
  Estudante (name, ra, situation)
VALUES
  ('Ana Souza', 'RA123456', 'Ativo'),
  ('Bruno Santos', 'RA654321', 'Ativo'),
  ('Carlos Lima', 'RA987654', 'Inativo'),
  ('Diana Costa', 'RA456789', 'Ativo'),
  ('Eduardo Pereira', 'RA321654', 'Inativo'),
  ('Fernanda Almeida', 'RA147258', 'Ativo'),
  ('Gabriel Rocha', 'RA258369', 'Ativo'),
  ('Helena Dias', 'RA369258', 'Inativo'),
  ('Igor Menezes', 'RA753951', 'Ativo'),
  ('Juliana Castro', 'RA159357', 'Ativo');

GO
ALTER TABLE Estudante ADD turma_curso VARCHAR(50);

GO
ALTER TABLE Estudante
DROP COLUMN turma_curso;

GO EXEC sp_rename 'Estudante',
'Unip';

GO
SELECT
  *
FROM
  Unip;