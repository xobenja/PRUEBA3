
package cl.laplaza.neg;
import cl.laplaza.model.Personal;
import cl.laplaza.dao.DAOPersonal;
/*import cl.laplaza.model.Comuna;
import cl.laplaza.dao.DAOComuna;
import cl.laplaza.model.Departamento;
import cl.laplaza.dao.DAODepartamento;
import cl.laplaza.model.Edificio;
import cl.laplaza.dao.DAOEdificio;
import cl.laplaza.model.EstadoPago;
import cl.laplaza.dao.DAOEstadoPago;
import cl.laplaza.model.EstadoPeriodo;
import cl.laplaza.dao.DAOEstadoPeriodo;
import cl.laplaza.model.FormaPago;
import cl.laplaza.dao.DAOFormaPago;
import cl.laplaza.model.GastoComun;
import cl.laplaza.dao.DAOGastoComun;
import cl.laplaza.model.GastoComunPagoCero;
import cl.laplaza.dao.DAOGastoComunPagoCero;
import cl.laplaza.model.MultaAtraso;
import cl.laplaza.dao.DAOMultaAtraso;
import cl.laplaza.model.PagoGastoComun;
import cl.laplaza.dao.DAOPagoGastoComun;
import cl.laplaza.model.PeriodoCobroGastoComun;
import cl.laplaza.dao.DAOPeriodoCobroGastoComun;
import cl.laplaza.model.ResponsablePagoGastoComun;
import cl.laplaza.dao.DAOResponsablePagoGastoComun;
import cl.laplaza.model.TipoPersona;
import cl.laplaza.dao.DAOTipoPersona;*/

public class Negocio {
//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static Personal buscarByPkPersonal(Personal registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOPersonal.buscarByPk(registro);
    }
    public static int crearPersonal(Personal registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    Personal registro = DAOPersonal.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOPersonal.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOPersonal.agregar(registro);
    }
    public static int agregarPersonal(Personal registro){
        int respuesta = DAOPersonal.agregar(registro);
        return respuesta;
    }
    public static int actualizarPersonal(Personal registro ){
        int respuesta = DAOPersonal.actualizar(registro);
        return respuesta;
    }
    public static int eliminarPersonal(Personal registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOPersonal.eliminar(registro);
        return respuesta;
    }
/*
//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static Comuna buscarByPkComuna(Comuna registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOComuna.buscarByPk(registro);
    }
    public static int crearComuna(Comuna registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    Comuna registro = DAOComuna.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOComuna.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOComuna.agregar(registro);
    }
    public static int agregarComuna(Comuna registro){
        int respuesta = DAOComuna.agregar(registro);
        return respuesta;
    }
    public static int actualizarComuna(Comuna registro ){
        int respuesta = DAOComuna.actualizar(registro);
        return respuesta;
    }
    public static int eliminarComuna(Comuna registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOComuna.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static Departamento buscarByPkDepartamento(Departamento registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAODepartamento.buscarByPk(registro);
    }
    public static int crearDepartamento(Departamento registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    Departamento registro = DAODepartamento.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAODepartamento.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAODepartamento.agregar(registro);
    }
    public static int agregarDepartamento(Departamento registro){
        int respuesta = DAODepartamento.agregar(registro);
        return respuesta;
    }
    public static int actualizarDepartamento(Departamento registro ){
        int respuesta = DAODepartamento.actualizar(registro);
        return respuesta;
    }
    public static int eliminarDepartamento(Departamento registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAODepartamento.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static Edificio buscarByPkEdificio(Edificio registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOEdificio.buscarByPk(registro);
    }
    public static int crearEdificio(Edificio registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    Edificio registro = DAOEdificio.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOEdificio.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOEdificio.agregar(registro);
    }
    public static int agregarEdificio(Edificio registro){
        int respuesta = DAOEdificio.agregar(registro);
        return respuesta;
    }
    public static int actualizarEdificio(Edificio registro ){
        int respuesta = DAOEdificio.actualizar(registro);
        return respuesta;
    }
    public static int eliminarEdificio(Edificio registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOEdificio.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static EstadoPago buscarByPkEstadoPago(EstadoPago registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOEstadoPago.buscarByPk(registro);
    }
    public static int crearEstadoPago(EstadoPago registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    EstadoPago registro = DAOEstadoPago.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOEstadoPago.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOEstadoPago.agregar(registro);
    }
    public static int agregarEstadoPago(EstadoPago registro){
        int respuesta = DAOEstadoPago.agregar(registro);
        return respuesta;
    }
    public static int actualizarEstadoPago(EstadoPago registro ){
        int respuesta = DAOEstadoPago.actualizar(registro);
        return respuesta;
    }
    public static int eliminarEstadoPago(EstadoPago registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOEstadoPago.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static EstadoPeriodo buscarByPkEstadoPeriodo(EstadoPeriodo registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOEstadoPeriodo.buscarByPk(registro);
    }
    public static int crearEstadoPeriodo(EstadoPeriodo registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    EstadoPeriodo registro = DAOEstadoPeriodo.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOEstadoPeriodo.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOEstadoPeriodo.agregar(registro);
    }
    public static int agregarEstadoPeriodo(EstadoPeriodo registro){
        int respuesta = DAOEstadoPeriodo.agregar(registro);
        return respuesta;
    }
    public static int actualizarEstadoPeriodo(EstadoPeriodo registro ){
        int respuesta = DAOEstadoPeriodo.actualizar(registro);
        return respuesta;
    }
    public static int eliminarEstadoPeriodo(EstadoPeriodo registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOEstadoPeriodo.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static FormaPago buscarByPkFormaPago(FormaPago registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOFormaPago.buscarByPk(registro);
    }
    public static int crearFormaPago(FormaPago registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    FormaPago registro = DAOFormaPago.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOFormaPago.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOFormaPago.agregar(registro);
    }
    public static int agregarFormaPago(FormaPago registro){
        int respuesta = DAOFormaPago.agregar(registro);
        return respuesta;
    }
    public static int actualizarFormaPago(FormaPago registro ){
        int respuesta = DAOFormaPago.actualizar(registro);
        return respuesta;
    }
    public static int eliminarFormaPago(FormaPago registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOFormaPago.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static GastoComun buscarByPkGastoComun(GastoComun registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOGastoComun.buscarByPk(registro);
    }
    public static int crearGastoComun(GastoComun registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    GastoComun registro = DAOGastoComun.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOGastoComun.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOGastoComun.agregar(registro);
    }
    public static int agregarGastoComun(GastoComun registro){
        int respuesta = DAOGastoComun.agregar(registro);
        return respuesta;
    }
    public static int actualizarGastoComun(GastoComun registro ){
        int respuesta = DAOGastoComun.actualizar(registro);
        return respuesta;
    }
    public static int eliminarGastoComun(GastoComun registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOGastoComun.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static GastoComunPagoCero buscarByPkGastoComunPagoCero(GastoComunPagoCero registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOGastoComunPagoCero.buscarByPk(registro);
    }
    public static int crearGastoComunPagoCero(GastoComunPagoCero registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    GastoComunPagoCero registro = DAOGastoComunPagoCero.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOGastoComunPagoCero.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOGastoComunPagoCero.agregar(registro);
    }
    public static int agregarGastoComunPagoCero(GastoComunPagoCero registro){
        int respuesta = DAOGastoComunPagoCero.agregar(registro);
        return respuesta;
    }
    public static int actualizarGastoComunPagoCero(GastoComunPagoCero registro ){
        int respuesta = DAOGastoComunPagoCero.actualizar(registro);
        return respuesta;
    }
    public static int eliminarGastoComunPagoCero(GastoComunPagoCero registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOGastoComunPagoCero.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static MultaAtraso buscarByPkMultaAtraso(MultaAtraso registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOMultaAtraso.buscarByPk(registro);
    }
    public static int crearMultaAtraso(MultaAtraso registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    MultaAtraso registro = DAOMultaAtraso.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOMultaAtraso.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOMultaAtraso.agregar(registro);
    }
    public static int agregarMultaAtraso(MultaAtraso registro){
        int respuesta = DAOMultaAtraso.agregar(registro);
        return respuesta;
    }
    public static int actualizarMultaAtraso(MultaAtraso registro ){
        int respuesta = DAOMultaAtraso.actualizar(registro);
        return respuesta;
    }
    public static int eliminarMultaAtraso(MultaAtraso registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOMultaAtraso.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static PagoGastoComun buscarByPkPagoGastoComun(PagoGastoComun registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOPagoGastoComun.buscarByPk(registro);
    }
    public static int crearPagoGastoComun(PagoGastoComun registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    PagoGastoComun registro = DAOPagoGastoComun.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOPagoGastoComun.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOPagoGastoComun.agregar(registro);
    }
    public static int agregarPagoGastoComun(PagoGastoComun registro){
        int respuesta = DAOPagoGastoComun.agregar(registro);
        return respuesta;
    }
    public static int actualizarPagoGastoComun(PagoGastoComun registro ){
        int respuesta = DAOPagoGastoComun.actualizar(registro);
        return respuesta;
    }
    public static int eliminarPagoGastoComun(PagoGastoComun registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOPagoGastoComun.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static PeriodoCobroGastoComun buscarByPkPeriodoCobroGastoComun(PeriodoCobroGastoComun registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOPeriodoCobroGastoComun.buscarByPk(registro);
    }
    public static int crearPeriodoCobroGastoComun(PeriodoCobroGastoComun registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    PeriodoCobroGastoComun registro = DAOPeriodoCobroGastoComun.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOPeriodoCobroGastoComun.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOPeriodoCobroGastoComun.agregar(registro);
    }
    public static int agregarPeriodoCobroGastoComun(PeriodoCobroGastoComun registro){
        int respuesta = DAOPeriodoCobroGastoComun.agregar(registro);
        return respuesta;
    }
    public static int actualizarPeriodoCobroGastoComun(PeriodoCobroGastoComun registro ){
        int respuesta = DAOPeriodoCobroGastoComun.actualizar(registro);
        return respuesta;
    }
    public static int eliminarPeriodoCobroGastoComun(PeriodoCobroGastoComun registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOPeriodoCobroGastoComun.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static ResponsablePagoGastoComun buscarByPkResponsablePagoGastoComun(ResponsablePagoGastoComun registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOResponsablePagoGastoComun.buscarByPk(registro);
    }
    public static int crearResponsablePagoGastoComun(ResponsablePagoGastoComun registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    ResponsablePagoGastoComun registro = DAOResponsablePagoGastoComun.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOResponsablePagoGastoComun.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOResponsablePagoGastoComun.agregar(registro);
    }
    public static int agregarResponsablePagoGastoComun(ResponsablePagoGastoComun registro){
        int respuesta = DAOResponsablePagoGastoComun.agregar(registro);
        return respuesta;
    }
    public static int actualizarResponsablePagoGastoComun(ResponsablePagoGastoComun registro ){
        int respuesta = DAOResponsablePagoGastoComun.actualizar(registro);
        return respuesta;
    }
    public static int eliminarResponsablePagoGastoComun(ResponsablePagoGastoComun registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOResponsablePagoGastoComun.eliminar(registro);
        return respuesta;
    }

//*********************************************************************
// Lo ideal es que el formulario llame a los métodos del negocio
//   y el negocio llame a las DAO's que correspondan
    public static TipoPersona buscarByPkTipoPersona(TipoPersona registro){
    //Recuerde que solo estamos pasando la dirección, no todos los campos
         return  DAOTipoPersona.buscarByPk(registro);
    }
    public static int crearTipoPersona(TipoPersona registro){
    //Podríamos eliminar los métodos agregar y actualizar y dejar este método
    // Este método es más inteligente.    TipoPersona registro = DAOTipoPersona.buscarByPk(registro);
    if (registro != null)
        // Si existe actualizamos el registro
         return DAOTipoPersona.actualizar(registro);
    else
        // Si NOOOO existe agregamos el registro
         return DAOTipoPersona.agregar(registro);
    }
    public static int agregarTipoPersona(TipoPersona registro){
        int respuesta = DAOTipoPersona.agregar(registro);
        return respuesta;
    }
    public static int actualizarTipoPersona(TipoPersona registro ){
        int respuesta = DAOTipoPersona.actualizar(registro);
        return respuesta;
    }
    public static int eliminarTipoPersona(TipoPersona registro){
        // Cada vez que elimine, debiera eliminar todos los registros hijos (FK de la PK)
        // ***********   ===> Recuerde que en una base de datos, jamás se debiera eliminar
        int respuesta = DAOTipoPersona.eliminar(registro);
        return respuesta;
    }*/
}