/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.dao;

import br.com.cliente.bean.Cliente;
import br.com.cliente.util.Conector;
import br.com.cliente.util.IDao;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements IDao{

    @Override
    public void insert(Object o) {
        //Convertendo o meu parametro em objeto cliente(C)
        Cliente c = (Cliente)o;
        
        //CRIANDO UMA VARIAVEL COM NOME SQL E ESTOU APLICANDO UMA INTRUCAO SQL
        //comando para inserir no banco de dados ,pegando os dados do formulario
        String sql = "insert cliente(nome,endereco,municipio,cep,telefone,celular,cnpj,cpf,genero)values(?,?,?,?,?,?,?,?,?)";
        
        try {  // serve 'para esconde o erre para o cliente
          //pegando os valores dos atributos do objeto cliente e atribuir nos campos da tabelas
        PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
        ps.setString(1,c.getNome());
        ps.setString(2,c.getEndereco());
        ps.setString(3,c.getMunicipio());
        ps.setString(4,c.getCep());
        ps.setString(5,c.getTelefone());
        ps.setString(6,c.getCelular());
        ps.setString(7,c.getCnpj());
        ps.setString(8,c.getCpf());
        ps.setString(9,c.getGenero());
         
         ps.execute();                  
       
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
    
    }

    @Override
    public void update(Object o) {
     //Convertendo o meu parametro em objeto cliente(C)
        Cliente c = (Cliente)o;
        
        //CRIANDO UMA VARIAVEL COM NOME SQL E ESTOU APLICANDO UMA INTRUCAO SQL
        //comando para atualizar no banco de dados ,pegando os dados do formulario
        String sql = "update cliente set nome=?,endereco=?,municipio=?,cep=?,telefone=?,celular=?,cpf=?,cnpj=?,genero=? where id=?";
       
        try {  
          //pegando os valores dos atributos do objeto cliente e atribuir nos campos da tabelas
        PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
        ps.setString(1,c.getNome());
        ps.setString(2,c.getEndereco());
        ps.setString(3,c.getMunicipio());
        ps.setString(4,c.getCep());
        ps.setString(5,c.getTelefone());
        ps.setString(6,c.getCelular());
        ps.setString(7,c.getCnpj());
        ps.setString(8,c.getCpf());
        ps.setString(9,c.getGenero());
       // ps.setString(10,c.getId());
        
        ps.execute();                  
       
         } catch (Exception e) {
             e.printStackTrace();
             
         }
        
        
    }

    @Override
    public void delete(Object o) {
     
         Cliente c = (Cliente)o;
        //CRIANDO UMA VARIAVEL COM NOME SQL E ESTOU APLICANDO UMA INTRUCAO SQL
        //comando para inserir no banco de dados ,pegando os dados do formulario
        String sql = "delete from cliente where id =?";
        
        try {  // serve 'para esconde o erre para o cliente
          //delete
       
        PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
        ps.setInt(1,c.getId());
        
         
         ps.execute();                  
       
         } catch (Exception e) {
             e.printStackTrace();
             
         }  
        
    }

    @Override
    public Object select(int i) {
        
        Cliente c = new Cliente();
    String sql = "select* from cliente where id=?";  
     
    
    try{ 
        PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
   
        while (rs.next()) {  
            
          c.setNome(rs.getString("nome"));
          c.setEndereco(rs.getString("endereco"));
          c.setMunicipio(rs.getString("municipio"));
          c.setCep(rs.getString("Cep"));
          c.setTelefone(rs.getString("telefone"));
          c.setCelular(rs.getString("celular"));
          c.setCpf(rs.getString("cpf"));
          c.setCnpj(rs.getString("cnpj"));
          c.setGenero(rs.getString("genero"));
        }
    }catch (SQLException e){
        e.printStackTrace();
        }
    return c;
    }

    @Override
         public List select() {
         List list = new ArrayList();
         String sql = "select * from cliente";
         PreparedStatement ps;
     try{
            ps = Conector.getConexao().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
          while (rs.next()) { 
             Cliente c = new Cliente();
                   
          c.setNome(rs.getString("nome"));
          c.setEndereco(rs.getString("endereco"));
          c.setMunicipio(rs.getString("municipio"));
          c.setCep(rs.getString("Cep"));
          c.setTelefone(rs.getString("telefone"));
          c.setCelular(rs.getString("celular"));
          c.setCpf(rs.getString("cpf"));
          c.setCnpj(rs.getString("cnpj"));
          c.setGenero(rs.getString("genero"));
          
          list.add(c);
        }
    }catch (SQLException e){
        e.printStackTrace();
        }
     return list;
     
      }
          public Object selectandName(String name) {
        Cliente c = new Cliente();
    String sql = "select* from cliente where name='?'";  
     
    try{ 
        PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {  
         c.setNome(rs.getString("nome"));
          c.setEndereco(rs.getString("endereco"));
          c.setMunicipio(rs.getString("municipio"));
          c.setCep(rs.getString("Cep"));
          c.setTelefone(rs.getString("telefone"));
          c.setCelular(rs.getString("celular"));
          c.setCpf(rs.getString("cpf"));
          c.setCnpj(rs.getString("cnpj"));
          c.setGenero(rs.getString("genero"));
          c.setId(rs.getInt("id"));
        }
    }catch (SQLException e){
        e.printStackTrace();
        }
    return c;
    
    }
}
