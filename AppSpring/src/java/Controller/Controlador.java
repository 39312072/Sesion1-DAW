/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import config.Conexion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrador
 */
public class Controlador {
    Conexion conn = new Conexion();
    JdbcTemplate JdbcTemplate = new JdbcTemplate();
    ModelAndView mav = new ModelAndView();
    
    
    
}
