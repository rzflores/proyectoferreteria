/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaClases;

import java.util.ArrayList;

/**
 *
 * @author renzo
 */
public class Usuarios {
        
    private int CodUsuario;
    private String Correo;
    private String Password;
    private boolean Habilitado;
    private int Tipo;
    
    public int getCodUsuario() {
        return CodUsuario;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }    
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public boolean isHabilitado() {
        return Habilitado;
    }    
    public void setHabilitado(boolean Habilitado) {
        this.Habilitado = Habilitado;
    }    
    public int getTipo() {
        return Tipo;
    }   
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
    public Usuarios(){}
    public Usuarios(int pCodUsuario, String pCorreo , String pPassword , boolean pHabilitado , int pTipo ){
           this.CodUsuario = pCodUsuario;
           this.Correo = pCorreo;
           this.Password = pPassword;
           this.Habilitado = pHabilitado;
           this.Tipo = pTipo;                  
       }
    
    
    public boolean LogearUsuario(ArrayList<Usuarios>  parrayUsuarios , String pCorreo , String pPassword ){
         for(int i=0 ; i < parrayUsuarios.size() ; i++){
                if( parrayUsuarios.get(i).getCorreo().equals(pCorreo) && parrayUsuarios.get(i).getPassword().equals(pPassword) && parrayUsuarios.get(i).isHabilitado() == true ){
                    return true;
                   }                            
         }         
         return false;
    }
    public int ObtenerTipoUsuario(ArrayList<Usuarios>  parrayUsuarios , String pCorreo , String pPassword ){
         
         for(int i=0 ; i < parrayUsuarios.size() ; i++){
                if( parrayUsuarios.get(i).getCorreo().equals(pCorreo) && parrayUsuarios.get(i).getPassword().equals(pPassword)){
                    return parrayUsuarios.get(i).getTipo();
                   }                            
         }         
         return 0;
    }    
    public boolean  ValidarAnadirUsuarios(ArrayList<Usuarios>  parrayUsuario , Integer pCodUsuario , String pCorreo  ){           
           
        for(int i=0; i< parrayUsuario.size();i++){            
            if(parrayUsuario.get(i).getCodUsuario()== pCodUsuario ){            
                  return false;   
            }            
            if(parrayUsuario.get(i).getCorreo()== pCorreo ){            
                  return false;   
            }      
        }
        return true;  
    }
    
    public void  AnadirUsuarios(Usuarios pusu , ArrayList<Usuarios>   parrayUsuario ){           
           parrayUsuario.add(pusu);                                 
       }
    public boolean  ValidarModificarUsuarios(ArrayList<Usuarios>  parrayUsuario , Integer pCodUsuario  ){           
        
       for(int i=0; i< parrayUsuario.size();i++){
                    if(parrayUsuario.get(i).getCodUsuario() == pCodUsuario){                                         
                       return true;
                }
            }
        return false;
       }
    public void  ModificarUsuarios( ArrayList<Usuarios>   parrayUsuario ,Integer pCodUsuario , String pCorreo , String pPassword  , boolean pHabilitado , int tipo ){       
        
        
           for(int i=0; i< parrayUsuario.size();i++){
            if(parrayUsuario.get(i).getCodUsuario()== pCodUsuario ){                   
               parrayUsuario.get(i).setCorreo(pCorreo);
               parrayUsuario.get(i).setPassword(pPassword);
               parrayUsuario.get(i).setHabilitado(pHabilitado);                  
               parrayUsuario.get(i).setTipo(tipo);
            }
        }    
           
           
           
       }
      
      
    
}
