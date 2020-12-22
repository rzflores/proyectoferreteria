/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaClases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author renzo
 */
public class Pedido {

    /**
     * @return the NroPedido
     */
    public int getNroPedido() {
        return NroPedido;
    }

    /**
     * @return the FechaPedido
     */
    public String getFechaPedido() {
        return FechaPedido;
    }

    /**
     * @param FechaPedido the FechaPedido to set
     */
    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    /**
     * @return the FechaEntrega
     */
    public String getFechaEntrega() {
        return FechaEntrega;
    }

    /**
     * @param FechaEntrega the FechaEntrega to set
     */
    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    /**
     * @return the Subtotal
     */
    public double getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    /**
     * @return the IGV
     */
    public double getIGV() {
        return IGV;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    /**
     * @return the NombreCliente
     */
    public String getNombreCliente() {
        return NombreCliente;
    }

    /**
     * @param NombreCliente the NombreCliente to set
     */
    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    /**
     * @return the CorreoCliente
     */
    public String getCorreoCliente() {
        return CorreoCliente;
    }

    /**
     * @param CorreoCliente the CorreoCliente to set
     */
    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    /**
     * @return the DistritoCliente
     */
    public String getDistritoCliente() {
        return DistritoCliente;
    }

    /**
     * @param DistritoCliente the DistritoCliente to set
     */
    public void setDistritoCliente(String DistritoCliente) {
        this.DistritoCliente = DistritoCliente;
    }

    /**
     * @return the CelularCliente
     */
    public String getCelularCliente() {
        return CelularCliente;
    }

    /**
     * @param CelularCliente the CelularCliente to set
     */
    public void setCelularCliente(String CelularCliente) {
        this.CelularCliente = CelularCliente;
    }

    /**
     * @return the DireccionCliente
     */
    public String getDireccionCliente() {
        return DireccionCliente;
    }

    /**
     * @param DireccionCliente the DireccionCliente to set
     */
    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    /**
     * @return the ListaProducto
     */
    public ArrayList<Productos> getListaProductos() {
        return ListaProductos;
    }

    /**
     * @param ListaProducto the ListaProducto to set
     */
    public void setListaProducto(ArrayList<Productos> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }
       private int NroPedido;
       private String FechaPedido;
       private String FechaEntrega;      
       private double Subtotal;
       private double IGV;
       private double Total;
       private String NombreCliente;
       private String CorreoCliente;
       private String DistritoCliente;
       private String CelularCliente;
       private String DireccionCliente;
       private ArrayList<Productos> ListaProductos;
       
        public Pedido(){};
       public Pedido(int pNroPedido ,  
        String FechaPedido,
        String pFechaEntrega,    
        double pSubtotal,
        double pIGV,
        double pTotal,
        String pNombreCliente,
        String pCorreoCliente,
        String pDistritoCliente,
        String pCelularCliente,
        String pDireccionCliente,
        ArrayList<Productos> pListaProductos ){
       
         this.NroPedido = pNroPedido;
         this.FechaPedido =FechaPedido ;
         this.FechaEntrega = pFechaEntrega;      
         this.Subtotal= pSubtotal;
         this.IGV = pIGV;
         this.Total = pTotal;
         this.NombreCliente = pNombreCliente;
         this.CorreoCliente = pCorreoCliente;
         this.DistritoCliente = pDistritoCliente;
         this.CelularCliente = pCelularCliente;
         this.DireccionCliente = pDireccionCliente;
         this.ListaProductos = pListaProductos;
           
           
           
       }
       
}
