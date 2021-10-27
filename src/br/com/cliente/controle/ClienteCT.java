/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.controle;

import br.com.cliente.bean.Cliente;
import br.com.cliente.dao.ClienteDao;
import java.util.List;


 
public class ClienteCT {
    
  public void insert(Cliente c){
      ClienteDao dao =  new ClienteDao();
      dao.insert(c);
  }
   public void update(Cliente c){
      ClienteDao dao =  new ClienteDao();
      dao.update(c);  
}
    public void delete(Cliente c){
      ClienteDao dao =  new ClienteDao();
      dao.delete(c);  
}
     public Cliente select(int i){
      ClienteDao dao =  new ClienteDao();
     Cliente c = (Cliente)dao.select(i);  
      return c;
}
      public List select(){
      ClienteDao dao =  new ClienteDao();
      List c = dao.select();
      return c;
}
   public Cliente selectandname(String i){
      ClienteDao dao =  new ClienteDao();
     Cliente c = (Cliente)dao.selectandName(i);  
      return c;
}    
}
