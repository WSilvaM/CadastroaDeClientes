/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.util;

import java.util.List;

/**
 *
 * @author tecsistem
 */
public interface IDao {
    
  public void insert(Object o); //Responsavel para inserir
public void update(Object o);//Responsavel para atualizar
public void delete(Object o);//Resposavel para excluir 
public Object select (int i); //Resposalvel para seleciona
public List select();//Resposavel 

}
