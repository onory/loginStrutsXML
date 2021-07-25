 /*
 * Esta clase procesa la peticion de la app web
*clase de tipo action
*es llamada por el struts para ejecutar execute
 */
package beans.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(LoginAction.class); // envia informacion a la consola
    
    //atributo para mandar informacion desde el lciente
    
    private String usuario;
     private String password;
    
//metodo que define a strut, en base de struts.xml para evitar mensajes   
    public String execute(){
        
    if("admin".equals(this.usuario)){
        
        return SUCCESS; // proporciona correcto y continua
    }else{
       return INPUT; //regresa a pjsp default es decir login.jsp
        
    }
        
    }

//gets y sets    

    public String getUsuario() {
        return usuario;
    }

        public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
        public String getPassword() {
        return password;
    }

        public void setPassword(String password) {
        this.password = password;
    }
  
    
     
     
    
}
