-- --------------------------------------------------------
--
-- Tabela de exemplo para testes
--
CREATE TABLE IF NOT EXISTS calopsita (
  id SERIAL PRIMARY KEY,
  cor varchar(255) DEFAULT NULL,
  mutacao varchar(50) DEFAULT NULL,
  idade smallint DEFAULT NULL
);