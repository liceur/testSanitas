package com.mycorp.services.impl;

import org.springframework.stereotype.Component;
import portalclientesweb.ejb.interfaces.PortalClientesWebEJBRemote;
import portalclientesweb.ejb.vo.DatosRetorno;
import util.datos.*;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("portalclientesWebEJB")
public class PortalClientesWebEJBRemoteImpl implements PortalClientesWebEJBRemote {

    public PortalClientesWebEJBRemoteImpl() {
    }

    @Override
    public List recuperarEstados(Map map) {
        return null;
    }

    @Override
    public List recuperarMunicipios(Map map) {
        return null;
    }

    @Override
    public List recuperarProvincias(Map map) {
        return null;
    }

    @Override
    public List recuperarComunidades(Map map) {
        return null;
    }

    @Override
    public List recuperarGeneTablas(int i, int i1) {
        return null;
    }

    @Override
    public DatosPersonales recuperarDatosCliente(String s) {
        return null;
    }

    @Override
    public DetallePoliza recuperarDatosPoliza(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public List recuperarCoberturasCapitales(Map map) {
        return null;
    }

    @Override
    public Map recuperarPolizaCorreoTelefono(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public DetallePoliza recuperarPolizaDireccion(DetallePoliza detallePoliza) {
        return null;
    }

    @Override
    public List recuperarPrimasAseg(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public List listaBeneficiariosBasica(PolizaBasico polizaBasico, String s, String s1) {
        return null;
    }

    @Override
    public List listaBeneficiariosDetalle(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public String calcularPerfilCliente(String s, PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Map alta(UsuarioAlta usuarioAlta) {
        return null;
    }

    @Override
    public Integer modificarDatosUsuario(Map map) {
        return null;
    }

    @Override
    public Usuario recuperarContraseniaRecordatorio(Map map) {
        return null;
    }

    @Override
    public Map validarAccesoUsuario(Map map) {
        return null;
    }

    @Override
    public Map validarAccesoIdCliente(String s) {
        return null;
    }

    @Override
    public Map listaPolizas(Map map) {
        return null;
    }

    @Override
    public int bajaUsuarioWeb(Map map) {
        return 0;
    }

    @Override
    public Map buscarActosPoliza(PolizaBasico polizaBasico, ActoMedicoConsulta actoMedicoConsulta, int i, int i1) {
        return null;
    }

    @Override
    public CopagoBean buscarCopagosPoliza(PolizaBasico polizaBasico, String s, String s1, int i, int i1, int i2) {
        return null;
    }

    @Override
    public List buscarPeriodosCopago(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Integer calcularFechaPeriodo(Integer integer) {
        return null;
    }

    @Override
    public Map buscarRecibos(PolizaBasico polizaBasico, ReciboConsulta reciboConsulta, int i, int i1, List list) {
        return null;
    }

    @Override
    public Map detalleRecibos(ReciboConsulta reciboConsulta, ReciboDetalle reciboDetalle) {
        return null;
    }

    @Override
    public List buscarLimites(Map map) throws Exception {
        return null;
    }

    @Override
    public Map recuperarAliasUsuario(Map map) {
        return null;
    }

    @Override
    public Map buscarReembolsos(PolizaBasico polizaBasico, ReembolsoConsulta reembolsoConsulta, int i, int i1, List list) {
        return null;
    }

    @Override
    public ReembolsoConsulta detalleReembolsos(ReembolsoConsulta reembolsoConsulta) {
        return null;
    }

    @Override
    public List getListaDetallesReembolsos(ReembolsoConsulta reembolsoConsulta) {
        return null;
    }

    @Override
    public Map recuperarNumTarjetaCliente(String s, PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Map recuperarVersionTarjetaCliente(String s, PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Map recuperarNombreSucursal(String s, String s1, Formulario formulario) {
        return null;
    }

    @Override
    public Formulario recuperarCCC(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Map buscarPrestadores(PrestadorBasico prestadorBasico) {
        return null;
    }

    @Override
    public PrestadorDetalle detallePrestadores(String s) {
        return null;
    }

    @Override
    public ClaveOperativa buscarClaveOperativa(String s) {
        return null;
    }

    @Override
    public Map buscarPrestadorListaID(List list) {
        return null;
    }

    @Override
    public Map validaPeticionUsuario(Map map) {
        return null;
    }

    @Override
    public Map grabaPeticionUsuario(Map map) {
        return null;
    }

    @Override
    public Map fechaUltimaPeticion(Map map) {
        return null;
    }

    @Override
    public DetallePoliza recuperarEmpresaDepartamento(DetallePoliza detallePoliza) {
        return null;
    }

    @Override
    public Map grabarDatos(Map map) {
        return null;
    }

    @Override
    public List listaMotivosSolictudTarjeta() {
        return null;
    }

    @Override
    public Integer actualizaEstadoPeticion(Integer integer, boolean b) {
        return null;
    }

    @Override
    public List listaPaises(Long aLong) {
        return null;
    }

    @Override
    public int validarTarjeta(long l, String s) {
        return 0;
    }

    @Override
    public Usuario validarUsuarioWP(String s, String s1) {
        return null;
    }

    @Override
    public Usuario validarDatosRegistro(UsuarioAlta usuarioAlta) {
        return null;
    }

    @Override
    public int confirmarRegistro(String s) {
        return 0;
    }

    @Override
    public List buscarCuestionarioSalud(int i, int i1) {
        return null;
    }

    @Override
    public List buscarCuestionarioDetalle(int i, int i1) {
        return null;
    }

    @Override
    public UsuarioAlta ejecutarRecordatorioContrasenia(UsuarioAlta usuarioAlta) {
        return null;
    }

    @Override
    public Integer setExtractoCopago(Long aLong, Long aLong1, Long aLong2, String s) {
        return null;
    }

    @Override
    public String getExtractoCopago(Long aLong, Long aLong1, Long aLong2) {
        return null;
    }

    @Override
    public Map recuperarDatosTarjeta(String s) {
        return null;
    }

    @Override
    public List guardarNuevoCliente(DatosClientes datosClientes) {
        return null;
    }

    @Override
    public long getSecuencia(String s, String s1) {
        return 0;
    }

    @Override
    public List recuperaVentajas(Long aLong, Long aLong1, Long aLong2, Boolean aBoolean, Boolean aBoolean1, Timestamp timestamp, String s) {
        return null;
    }

    @Override
    public List recuperaVentajas(Long aLong, Long aLong1, Long aLong2, Boolean aBoolean, Boolean aBoolean1, Timestamp timestamp, String s, Long aLong3) {
        return null;
    }

    @Override
    public byte[] recuperaMaxNumEnvio(String s, String s1, String s2) throws Exception {
        return new byte[0];
    }

    @Override
    public HashMap recuperarDatosClienteXDNI(Long aLong, String s) {
        return null;
    }

    @Override
    public HashMap recuperarListaDatosClienteXDNI(Long aLong, String s, int i) {
        return null;
    }

    @Override
    public HashMap recuperarDatosClienteRecupContXDNI(String s) {
        return null;
    }

    @Override
    public List obtenerPreexistencias(PolizaBasico polizaBasico) {
        return null;
    }

    @Override
    public Map validaAccesoUsuarioDNIAlias(String s, String s1, Boolean aBoolean) {
        return null;
    }

    @Override
    public Map grabaPeticionUsuarioDupli(Map map) {
        return null;
    }

    @Override
    public DatosRetorno altaCliente(String s, Long aLong, Long aLong1, Timestamp timestamp, Integer integer, String s1, String s2, String s3, String s4, String s5, String s6) {
        return null;
    }

    @Override
    public DatosRetorno altaClienteProspect(String s, String s1, String s2, String s3, Timestamp timestamp, Integer integer, String s4, String s5, String s6, String s7, String s8) {
        return null;
    }

    @Override
    public DatosRetorno recordatorioContrasenya(String s, Long aLong, Long aLong1, Integer integer, String s1, Timestamp timestamp) {
        return null;
    }

    @Override
    public DatosRetorno login(String s, String s1, Boolean aBoolean) {
        return null;
    }

    @Override
    public Map solicitudDuplicadoDocumentacion(Map map) {
        return null;
    }

    @Override
    public List recuperaVentajas(Long aLong, Long aLong1, Long aLong2, Boolean aBoolean, Boolean aBoolean1, Boolean aBoolean2, Timestamp timestamp, String s, Long aLong3) {
        return null;
    }
}
