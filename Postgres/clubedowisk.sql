

CREATE TABLE IF NOT EXISTS caixa (
  CODIGO serial primary key,
  DINHEIRO float NOT NULL DEFAULT '0',
  CHEQUE float NOT NULL DEFAULT '0',
  CARTAO float NOT NULL DEFAULT '0',
  VALE float NOT NULL DEFAULT '0'
);


INSERT INTO caixa (CODIGO, DINHEIRO, CHEQUE, CARTAO, VALE) VALUES
(1, 58.41, 8.65, 0, 0);


CREATE TABLE IF NOT EXISTS clientes (
CODIGO serial primary key,
  NOME varchar(255) DEFAULT NULL,
  ENDERECO varchar(255) DEFAULT NULL,
  BAIRRO varchar(60) DEFAULT NULL,
  CIDADE varchar(60) DEFAULT NULL,
  UF varchar(2) DEFAULT NULL,
  CEP varchar(10) DEFAULT NULL,
  TELEFONE varchar(20) DEFAULT NULL
);

INSERT INTO clientes (CODIGO, NOME, ENDERECO, BAIRRO, CIDADE, UF, CEP, TELEFONE) VALUES
(1, 'CLUBE DO WHISKY', 'RUA DOMINGOS DE MEDEIROS', 'CENTRO', 'POMBAL', 'PB', '58840-000', '(83) 9 9981-3837'),
(2, 'JOÃO ALFREDO DA SILVA', 'RUA: PEDRO BOTARO, 100', 'CENTRO', 'POMBAL', 'PB', '58840-000', '(83) 9 9944-5100');



CREATE TABLE IF NOT EXISTS contas (
  PK_CODIGO serial primary key,
  FK_CODIGO_PESSOA integer NOT NULL,
  DESCRICAO varchar(500) NOT NULL,
  DATA date DEFAULT NULL,
  VENCIMENTO date DEFAULT NULL,
  PAGAMENTO date DEFAULT NULL,
  FK_TIPO_PAGAMENTO integer NOT NULL DEFAULT '1',
  OBSERVACAO varchar(300) NOT NULL,
  SITUACAO tinyint(1) NOT NULL,
  VALOR float NOT NULL,
  TIPO_CONTA varchar(10) NOT NULL DEFAULT 'PAGAR'
);



INSERT INTO contas (PK_CODIGO, FK_CODIGO_PESSOA, DESCRICAO, DATA, VENCIMENTO, PAGAMENTO, FK_TIPO_PAGAMENTO, OBSERVACAO, SITUACAO, VALOR, TIPO_CONTA) VALUES
(1, 1, 'conta de luz', '2014-07-02', '2014-07-10', '2014-07-10', 1, '', 0, 40, 'PAGAR'),
(2, 1, 'conta de agua', '2014-07-02', '2014-07-10', '2014-07-10', 1, 'tste2', 1, 30.5, 'PAGAR'),
(3, 1, 'INTERNET OI VELOX', '2014-07-03', '2014-07-10', '2014-07-10', 1, 'CONTA DE INTERNET', 0, 84.89, 'PAGAR'),
(4, 1, 'Formatação de computador', '2014-07-03', '2014-07-10', '2014-07-10', 1, '', 1, 80, 'RECEBER'),
(5, 1, 'Cheque do cliente a ser descontado dia 15/06/2014', '2014-07-04', '2014-07-15', '2014-07-10', 3, 'teste', 0, 340, 'RECEBER');



CREATE TABLE IF NOT EXISTS fornecedores (
  CODIGO serial primary key,
  NOME varchar(255) DEFAULT NULL,
  ENDERECO varchar(255) DEFAULT NULL,
  BAIRRO varchar(60) DEFAULT NULL,
  CIDADE varchar(60) DEFAULT NULL,
  UF varchar(2) DEFAULT NULL,
  CEP varchar(10) DEFAULT NULL,
  TELEFONE varchar(20) DEFAULT NULL
);

INSERT INTO fornecedores (CODIGO, NOME, ENDERECO, BAIRRO,CIDADE, UF, CEP, TELEFONE) VALUES
(1, 'B&A LTDA', 'RUA DO PRADO', 'CENTRO', 'PATOS', 'PB', '58700', '(83) 3208-6150');


CREATE TABLE IF NOT EXISTS produtos (
  CODIGO serial primary key,
  FORNECEDORES_CODIGO integer NOT NULL,
  NOME varchar(255) DEFAULT NULL,
  VALOR float DEFAULT NULL,
  ESTOQUE integer DEFAULT NULL,
  CODIGO_BARRAS varchar(100) DEFAULT '0',
 foreign key (fornecedores_Codigo) references fornecedores(codigo)
);


INSERT INTO produtos (CODIGO, FORNECEDORES_CODIGO, NOME, VALOR, ESTOQUE, CODIGO_BARRAS) VALUES
(1, 1, 'Johnnie Walker Red Label 1000 ml', 85.00, -2, '1'),
(2, 1, 'Jack Daniels 1000 ml', 544.00, 88, '2'),
(3, 1, 'Johnnie Walker Double Black 1000 ml', 799.00, 57, '3'),
(4, 1, 'Chivas Regal 12 anos 1000 ml', 180.00, 90, '4'),
(5, 1, 'Old Parr 12 anos 1000 ml', 130.00, 94, '5'),
(6, 1, 'black and white', 39.90, 29, '123456');



CREATE TABLE IF NOT EXISTS tbl_usuarios (
  pk_codigo serial primary key,
  nome varchar(45) NOT NULL,
  login varchar(45) NOT NULL,
  senha varchar(45) NOT NULL
);



INSERT INTO tbl_usuarios (pk_codigo, nome, login, senha) VALUES
(1, 'ADMINISTRADOR', 'admin', '123'),
(5, 'JOSÉ ALYSSON', 'alysson', '123');



CREATE TABLE IF NOT EXISTS tipo_pagamento (
  pk_codigo serial primary key,
  descricao varchar(45) NOT NULL
);



INSERT INTO tipo_pagamento (pk_codigo, descricao) VALUES
(1, 'DINHEIRO'),
(2, 'CARTÃO'),
(3, 'CHEQUE'),
(4, 'VALE');



CREATE TABLE IF NOT EXISTS vendas (
  CODIGO serial primary key,
  CLIENTES_CODIGO integer NOT NULL,
  DATA_VENDA date DEFAULT NULL,
  VALOR_TOTAL float DEFAULT NULL,
  DESCONTO float DEFAULT NULL,
  TIPO_PAGAMENTO integer DEFAULT '1',
  foreign key (CLIENTES_CODIGO) references clientes(codigo)
);



INSERT INTO vendas (CODIGO, CLIENTES_CODIGO, DATA_VENDA, VALOR_TOTAL, DESCONTO, TIPO_PAGAMENTO) VALUES
(1, 1, '2019-05-10', 412, 0, 0),
(2, 1, '2019-06-29', 115.75, 0, 0),
(3, 1, '2019-07-01', 500, 0, 0),
(4, 1, '2019-07-01', 500, 500, 0),
(5, 1, '2019-07-01', 500, 500, 0),
(6, 1, '2019-07-01', 500, 500, 0),
(7, 1, '2019-07-02', 1.25, 0, 1),
(8, 1, '2019-07-04', 500, 500, 1),
(9, 1, '2019-07-05', 500, 500, 1),
(10, 1, '2019-07-05', 0, 0, 1),
(11, 1, '2019-07-05', 19.57, 0, 1),
(12, 1, '2019-07-05', 27.62, 0, 1),
(13, 1, '2019-07-05', 1, 0.25, 0),
(14, 1, '2019-07-05', 125, 0, 0),
(15, 1, '2019-07-05', 26.62, 0, 0),
(16, 1, '2019-07-06', 1.25, 0, 1),
(17, 1, '2019-07-06', 7.65, 0, 3),
(18, 1, '2019-07-06', 14.1, 0, 1),
(19, 1, '2019-07-06', 27.5, 0, 1),
(20, 2, '2019-07-06', 8.65, 0, 3),
(21, 1, '2019-07-06', 1.25, 0, 1),
(22, 1, '2019-07-06', 9, 0, 1),
(23, 1, '2019-07-06', 1.25, 0, 0),
(24, 1, '2019-07-06', 6.4, 0, 0),
(25, 1, '2019-07-06', 5.8, 0, 0),
(26, 1, '2019-07-06', 10.92, 0, 0),
(27, 1, '2019-07-06', 17.32, 0, 1),
(28, 1, '2019-07-06', 14.42, 0, 1),
(29, 1, '2019-07-21', 14.42, 0, 1),
(30, 1, '2019-08-08', 2, 0, 1);


CREATE TABLE IF NOT EXISTS vendas_produto (
  CODIGO serial primary key,
  CODIGO_PRODUTO integer DEFAULT NULL,
  CODIGO_VENDA integer DEFAULT NULL,
  QUANTIDADE integer DEFAULT NULL,
  foreign key (CODIGO_PRODUTO) references PRODUTOS(CODIGO),
  foreign key (CODIGO_VENDA) references VENDAS(CODIGO)
);


INSERT INTO vendas_produto (CODIGO, CODIGO_PRODUTO, CODIGO_VENDA, QUANTIDADE) VALUES
(1, 1, 1, 3),
(2, 2, 1, 2),
(3, 1, 2, 1),
(4, 1, 2, 2),
(5, 3, 2, 32),
(10, 2, 4, 1),
(11, 3, 4, 1),
(12, 1, 4, 1),
(13, 4, 4, 1),
(14, 2, 5, 1),
(15, 1, 5, 1),
(16, 2, 6, 1),
(17, 3, 6, 1),
(18, 1, 7, 1),
(19, 2, 8, 1),
(20, 3, 8, 1),
(21, 4, 8, 1),
(22, 5, 8, 1),
(23, 1, 8, 1),
(24, 1, 9, 1),
(25, 2, 9, 1),
(26, 3, 9, 1),
(27, 4, 9, 1),
(28, 1, 9, 3),
(29, 1, 10, 1),
(30, 2, 11, 1),
(31, 3, 11, 1),
(32, 4, 11, 1),
(33, 1, 12, 1),
(34, 2, 12, 1),
(35, 3, 12, 1),
(36, 4, 12, 1),
(37, 5, 12, 1),
(38, 6, 12, 1),
(39, 1, 13, 1),
(40, 1, 14, 1),
(41, 1, 15, 1),
(42, 2, 15, 1),
(43, 3, 15, 1),
(44, 4, 15, 1),
(45, 5, 15, 1),
(46, 1, 16, 1),
(47, 1, 17, 1),
(48, 4, 17, 1),
(49, 1, 18, 2),
(50, 5, 18, 2),
(51, 1, 19, 1),
(52, 1, 19, 21),
(53, 1, 20, 1),
(54, 6, 20, 1),
(55, 4, 20, 1),
(56, 1, 21, 1),
(57, 6, 22, 2),
(58, 3, 22, 2),
(59, 1, 23, 1),
(60, 4, 24, 1),
(61, 5, 25, 1),
(62, 2, 26, 1),
(63, 1, 26, 1),
(64, 1, 27, 1),
(65, 2, 27, 1),
(66, 4, 27, 1),
(67, 1, 28, 1),
(68, 2, 28, 1),
(69, 3, 28, 1),
(70, 1, 29, 1),
(71, 2, 29, 1),
(72, 3, 29, 1),
(73, 1, 30, 1),
(74, 6, 30, 1);
