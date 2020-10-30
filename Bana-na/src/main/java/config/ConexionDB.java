/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Toshiba
 */
public class ConexionDB {
    
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setDriverClassName("C:\\Users\\Toshiba\\.m2\\repository\\org\\springframework\\spring-jdbc\\4.3.25.RELEASE\\spring-jdbc-4.3.25.RELEASE.jar");
        dataSource.setUrl("jdbc:mysql://localhost:8090/clientes");
        dataSource.setUsername("root");
        dataSource.setPassword("katana.1");
        return dataSource;
    }
    
}
