/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaClases;

import java.util.ArrayList;


public class Categorias {
       private int CodCategoria;
       private String NombreCat;
       private String UrlIconoCat;
       
        public int getCodCategoria() {
            return CodCategoria;
        }

       
        public String getNombreCat() {
            return NombreCat;
        }

        
        public void setNombreCat(String NombreCat) {
            this.NombreCat = NombreCat;
        }

        
        public String getUrlIconoCat() {
            return UrlIconoCat;
        }

        
        public void setUrlIconoCat(String UrlIconoCat) {
            this.UrlIconoCat = UrlIconoCat;
        }
       public Categorias(){}
       public Categorias(int pCodCategoria, String pNombreCat , String pUrlIconoCat){
           this.CodCategoria = pCodCategoria;
           this.NombreCat = pNombreCat;
           this.UrlIconoCat = pUrlIconoCat;
       
       }
       public boolean  ValidarAnadirCategorias(ArrayList<Categorias>  parrayCategorias , Integer pCodCategoria , String pNombreCategoria  ){           
           
        for(int i=0; i< parrayCategorias.size();i++){            
            if(parrayCategorias.get(i).getCodCategoria()== pCodCategoria ){            
                  return false;   
            }
            if(parrayCategorias.get(i).getNombreCat().equals(pNombreCategoria)){            
                  return false;            
            } 
        }
        return true;    
       }
       public void  AnadirCategorias(Categorias pcat , ArrayList<Categorias>   parrayCategorias ){           
           parrayCategorias.add(pcat);                                 
       }
       public boolean  ValidarModificarCategorias(ArrayList<Categorias>  parrayCategorias , Integer pCodCategoria  ){           
        
       for(int i=0; i< parrayCategorias.size();i++){
                    if(parrayCategorias.get(i).getCodCategoria() == pCodCategoria){                                         
                       return true;
                }
            }
        return false;
       }
       public void  ModificarCategorias( ArrayList<Categorias>   parrayCategorias ,Integer pCodCategoria , String pNombreCategoria ,String pUrlIconoCategoria){           
           for(int i=0; i< parrayCategorias.size();i++){
            if(parrayCategorias.get(i).getCodCategoria() == pCodCategoria ){                   
               parrayCategorias.get(i).setNombreCat(pNombreCategoria);
               parrayCategorias.get(i).setUrlIconoCat(pUrlIconoCategoria);                  
            }
        }                             
       }
       public boolean  ValidarEliminarCategorias(ArrayList<Categorias>  parrayCategorias , Integer pCodCategoria  ){           
        
       for(int i=0; i< parrayCategorias.size();i++){
                    if(parrayCategorias.get(i).getCodCategoria() == pCodCategoria){                                         
                       return true;
                }
            }
        return false;
       }
       public void  EliminarCategorias( ArrayList<Categorias>   parrayCategorias ,Integer pCodCategoria){           
           for(int i=0; i< parrayCategorias.size();i++){
            if(parrayCategorias.get(i).getCodCategoria() == pCodCategoria ){                   
               parrayCategorias.remove(i);               
                }
            }                             
       }
       public int  ObtenerCodCategorias( ArrayList<Categorias>   parrayCategorias ,String pNombreCategoria){           
           for(int i=0; i< parrayCategorias.size();i++){
            if(parrayCategorias.get(i).getNombreCat().equals(pNombreCategoria)){   
               return   parrayCategorias.get(i).getCodCategoria();                
                }
            }  
           return 0;
       }
       
      
}

