# encoding: utf-8
Feature: buscar un termino en google
  
  Scenario Outline: Busqueda de <termino>
    Given que el usuario esta en google
    When él busca la palabra <termino>
   Examples:
    |termino|
    |Impresora|