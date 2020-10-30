package Controller;
/**
 *
 * @author Fernando Gutierrez Arevalo
 */

import config.ConexionDB;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {
    
     ConexionDB con = new ConexionDB();
     JdbcTemplate jdbxTemplate = new JdbcTemplate(con.Conectar());
     ModelAndView mav = new ModelAndView();
     
     @RequestMapping("index.html")
     public ModelAndView Listar(){
         String sql = "select * from persona";
         List datos = this.jdbxTemplate.queryForList(sql);
         mav.addObject("lista", datos);
         mav.setViewName("index");
         
         return mav;
     }
    
}
