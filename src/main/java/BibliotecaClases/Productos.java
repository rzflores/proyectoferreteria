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
public class Productos {

    /**
     * @return the CodProducto
     */
    public int getCodProducto() {
        return CodProducto;
    }

    /**
     * @return the TituloPro
     */
    public String getTituloPro() {
        return TituloPro;
    }

    /**
     * @param TituloPro the TituloPro to set
     */
    public void setTituloPro(String TituloPro) {
        this.TituloPro = TituloPro;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Disponibilidad
     */
    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    /**
     * @param Disponibilidad the Disponibilidad to set
     */
    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    
    public String getUrlImagen() {
        return UrlImagen;
    }

    /**
     * @param UrlImagen the UrlImagen to set
     */
    public void setUrlImagen(String UrlImagen) {
        this.UrlImagen = UrlImagen;
    }
    /**
     * @return the UrlImagen
     */
    public String getBanner() {
        return Banner;
    }

    /**
     * @param UrlImagen the UrlImagen to set
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * @return the categoriaProducto
     */
    public Categorias getCategoriaProducto() {
        return categoriaProducto;
    }

    
    /**
     * @param categoriaProducto the categoriaProducto to set
     */
    public void setCategoriaProducto(Categorias categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    /**
     * @return the seleccion
     */
    public boolean isSeleccion() {
        return seleccion;
    }

    /**
     * @param seleccion the seleccion to set
     */
    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }
    private int CodProducto;
    private String TituloPro;
    private String Marca;
    private String Descripcion;
    private double Precio;
    private boolean Disponibilidad;
    private String UrlImagen;    
    private String Banner;
    private Categorias categoriaProducto;   
    private boolean seleccion; 
    
    
    public Productos(){}
    public Productos(int pCodProducto , String pTituloPro, String pMarca ,String pDescripcion , double pPrecio ,boolean pDisponibilidad ,String pUrlImagen ,String pBanner,Categorias pcategoriaProducto,boolean pseleccion){
    this.CodProducto = pCodProducto;
    this.TituloPro = pTituloPro;
    this.Marca = pMarca;
    this.Descripcion = pDescripcion;
    this.Precio = pPrecio;
    this.Disponibilidad = pDisponibilidad;
    this.UrlImagen = pUrlImagen;
    this.Banner = pBanner;
    this.categoriaProducto = pcategoriaProducto;
    this.seleccion= pseleccion;
    
    }
    public boolean  ValidarAnadirProductos(ArrayList<Productos>  parrayProductos , Integer pCodProducto  ){           
           
        for(int i=0; i< parrayProductos.size();i++){            
            if(parrayProductos.get(i).getCodProducto()== pCodProducto ){            
                  return false;   
            }           
        }
        return true;    
    }
    public void  AnadirProductos(Productos pproducto  , ArrayList<Productos>   parrayProductos ){           
           parrayProductos.add(pproducto);                                 
    }
    public boolean  ValidarModificarProductos(ArrayList<Productos>  parrayProductos , Integer pCodProducto  ){           
        
       for(int i=0; i< parrayProductos.size();i++){
                    if(parrayProductos.get(i).getCodProducto() == pCodProducto){                                         
                       return true;
                }
            }
        return false;
       }
     public void  ModificarProductos( ArrayList<Productos>   parrayProductos ,Integer pCodProducto , String pTituloProducto ,String pMarca , String pDescripcion , double pPrecio, boolean pDisponibilidad , Categorias pCategoria , String pUrlImagenProducto , String pBanner){
             for(int i=0; i< parrayProductos.size();i++){
            if(parrayProductos.get(i).getCodProducto() == pCodProducto ){                   
               parrayProductos.get(i).setTituloPro(pTituloProducto);
               parrayProductos.get(i).setMarca(pMarca);                  
               parrayProductos.get(i).setDescripcion(pDescripcion);                  
               parrayProductos.get(i).setPrecio(pPrecio);                  
               parrayProductos.get(i).setDisponibilidad(pDisponibilidad);                  
               parrayProductos.get(i).setCategoriaProducto(pCategoria);                  
               parrayProductos.get(i).setUrlImagen(pUrlImagenProducto);       
               parrayProductos.get(i).setBanner(pBanner);       
               
               
               
            }
         }                             
       }
     public boolean  ValidarEliminarProductos(ArrayList<Productos>  parrayProductos , Integer pCodProducto  ){           
        
       for(int i=0; i< parrayProductos.size();i++){
                    if(parrayProductos.get(i).getCodProducto()== pCodProducto){                                         
                       return true;
                }
            }
        return false;
     }
     public void  EliminarProductos( ArrayList<Productos>   parrayProductos ,Integer pCodProducto){           
           for(int i=0; i< parrayProductos.size();i++){
            if(parrayProductos.get(i).getCodProducto() == pCodProducto ){                   
               parrayProductos.remove(i);               
                }
            }                             
     }
     
}
