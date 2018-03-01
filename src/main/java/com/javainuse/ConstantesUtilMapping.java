package com.javainuse;

import java.io.Serializable;

/**
 * Clase que permite el manejo de constantes para el modulo de emision
 * @author Mperezu
 */
public class ConstantesUtilMapping implements Serializable {
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3769059598070739933L;

	/**
	 * @author Mperezu
	 */
	public static final class Mappings{
		/**
		 * ===================================== 
		 * URL's REST CONTROLLER
		 * =====================================
		 */
	    public static final String API 												= "/api";
	    public static final String CROSS_ORIGIN 									= "*";
	    public static final String APPLICATION_PDF 									= "application/pdf";
	    public static final String APPLICATION_JSON 								= "application/json";
	    public static final String CONTENT_DISPOSITION 								= "Content-Disposition:";
	    public static final String INLINE_FILENAME 									= "inline; filename=\"";
		/** Autenticacion */
		public static final String AUTENTICACION 									= "/login/autenticateOld";
		public static final String INFORMACION_USUARIO 								= "/usuario/localizacionSucursal";
		/** Results SQL */
		public static final String SQL_RESULT_ASEGURADOS_CE 						= "AseguradosCEResult"				;
		public static final String SQL_RESULT_PRIMAS_ASEGURADO 						= "PrimasAseguradosResult"			;
		public static final String SQL_RESULT_PRIMAS_DEPENDIENTES 					= "PrimasDependientesResult"		;
		public static final String SQL_RESULT_PRIMAS_PLAN_POLIZA 					= "PrimasPlanPolizaResult"			;
		public static final String SQL_RESULT_DETALLES_PRIMAS_PLAN_ASEGURADO 		= "PrimasDetallePlanResult"  		;
		public static final String SQL_RESULT_CONSULTA_HISTORICOS_RADICACACION 		= "ConsultaHistoricosRadicacion"	;
		/** Radicacion */		
		public static final String RADICADO_SAVE 									= "/radicacion/save";
		public static final String CATALOGOS_HUMANO 								= "/catalogos/humano";
		public static final String CATALOGOS_EMISION 								= "/catalogos/emisionAfiliacion";
		public static final String CATALOGO_EMISION 								= "/catalogos/emisionParametroAfiliacion";
		public static final String TIPOS_GERENTES 									= "/remitente/tiposGerente";
		public static final String BUSQUEDA_CLIENTE 								= "/cliente/busqueda";
		public static final String BUSQUEDA_AVANZADA_CLIENTE 						= "/cliente/busquedaAvanzada";
		public static final String DATOS_BASICOS_CLIENTE 							= "/cliente/datosBasicos";
		public static final String BUSQUEDA_REMITENTES 								= "/remitente/busqueda";
		public static final String PARAMETROS 										= "/radicacion/parametros";
		public static final String IMPRESION_TIRILLA 								= "/radicacion/imprimirTirilla";
		public static final String IMPRESION_TIRILLA_NO_PDF 						= "/radicacion/imprimirTirillaNoPDF";
		public static final String IMPRESION_DEVOLUCION_RADICADO 					= "/radicacion/imprimirDevolucionRadicado";
		public static final String PARAMETROS_GENERALES 							= "/parametros/generales";
		public static final String BUSQUEDA_ENTREGADO_POR 							= "/radicacion/entregadoPor";		/** Emision */
		public static final String CONTACTO_SUCURSAL 								= "/sucursal/contactoSucursal";
		public static final String CONSULTA_INFORMACION_USUARIO_HUMANO 				= "/obtenerInformacionDeUsuarioDesdeElLogin";
		public static final String TIPOS_DOCUMENTO 									= "/tiposDocumento/obtenerTiposDeDocumento";
		public static final String CONSULTA_RADICADO 								= "/radicacion/consulta";
		public static final String CONSULTA_RADICADO_FILTROS 						= "/radicacion/consultaRadicadosPorFiltros";
		public static final String GENERAR_NUMERO_EMISION_COMPLETO 					= "/radicacion/generarNumeroEmisionCompleto";
		public static final String GUARDAR_HISTORICO_ESTADO_RADICADO 				= "/radicacion/guardarHistoricoEstadoRadicado";
		public static final String LISTADO_MONEDAS 									= "/emision/listadoMonedas";
		public static final String LISTADO_ESTADO_PROCESO_EMISION 					= "/emision/listadoEstadoProcesoEmision";
		public static final String INSTITUCION_CONSULTA 							= "/institucion/educativa";
		public static final String CONSULTA_ASEGURADORAS 							= "/emision/consultaAseguradoras";
		public static final String CONSULTA_ASEGURADORAS_POR_NOMBRE 				= "/emision/consultaAseguradorasPorNombre";
		public static final String CONSULTA_PARENTESCOS 							= "/emision/consultaParentescos";
		public static final String OBTENER_DISCAPACIDAD 							= "/emision/obtenerDiscapacidad";
		public static final String CONSULTAR_HISTORIAL_DISCAPACIDAD 				= "/emision/consultarHistorialDiscapacidad";
		public static final String CONSULTA_BENEFICIOS 								= "/emision/consultarBeneficios";
		public static final String CONSULTA_BENEFICIOS_PLAN 						= "/emision/consultarBeneficiosPlan";
		public static final String CONSULTA_BENEFICIOS_II 							= "/emision/consultaBeneficiosII";
		public static final String CONSULTA_MAESTRO_BENEFICIOS 						= "/emision/consultarMaestroBeneficios";
		public static final String CONSULTA_BENEFICIOS_COBERTURAS 					= "/emision/consultarBeneficiosCoberturas";
		public static final String CONSULTA_ARBOL_BENEFICIOS_PLAN_POLIZA 			= "/emision/consultaBeneficiosPlanPoliza";
		public static final String CONSULTA_ARBOL_BENEFICIOS_COMPLETO_PLAN 			= "/emision/consultaArbolBeneficiosCompletoPlan";
		public static final String CONSULTA_RAMOS 									= "/parametros/consultaRamos";
		public static final String CONSULTA_SUBRAMOS 								= "/parametros/consultaSubramos";
		public static final String CONSULTA_COMPANIAS 								= "/parametros/consultaCompanias";
		public static final String PLANES_ACTIVOS 									= "/planes/activos";
		public static final String PRESTADORES_PLANES 								= "/planes/prestadores";
		public static final String PRESTADORES_DETALLE_PLANES 						= "/planes/prestadores/detalle";
		public static final String TIPO_EFECTIVIDAD 								= "TIPO_EFECTIVIDAD";
		public static final String TIPO_MOVIMIENTO 									= "TIPO_MOVIMIENTO";
		public static final String TIPO_POLIZA 										= "TIPO_POLIZA";
		public static final String TIPO_PRODUCTO 									= "TIPO_PRODUCTO";
		public static final String MOVIMIENTO 										= "MOVIMIENTO";
		public static final String CANALES 											= "CANALES";
		public static final String TIPO_PERSONA 									= "TIPO_PERSONA";
		public static final String CONSULTA_POLIZAS_AFILIADOS 						= "/emision/consultaPolizasAfiliado";
		public static final String CONSULTAR_AFILIADOS_POLIZA 						= "/emision/consultarAfiliadosPoliza";
		public static final String ACTUALIZAR_ESTADOS_POLIZA 						= "/emision/actualizarEstadosPoliza";
		public static final String ACTUALIZAR_PRIMA_ASEGURADO 						= "/emision/actualizarPrimaAsegurado";
		public static final String CONSULTA_DETALLE_BENEFICIOS 						= "/emision/obtenerDetalleBeneficios";
		public static final String DETALLE_ESTRUCTURA_COBERTURA 					= "/planes/obtenerDetalleEstructuraCobertura";		
		public static final String CONSULTA_CS_CAMBIO_POLIZA 						= "/emision/obtenerDetalleCSCambioPoliza";
		public static final String CONSULTA_POLIZA 									= "/emision/consultaPoliza";
		public static final String CONSULTA_DATOS_BASICOS_POLIZA 					= "/emision/consultaDatosBasicosPoliza";
		public static final String CONSULTA_DATOS_BASICOS_COASEGURO 				= "/emision/consultaDatosBasicosCoaseguro";
		public static final String CONSULTA_DATOS_BASICOS_PLANES 					= "/emision/consultaDatosBasicosPlanes";
		public static final String CONSULTA_DATOS_BASICOS_TITULARES 				= "/emision/consultaDatosBasicosTitulares";
		public static final String CONSULTA_DATOS_BASICOS_DEUDORES 					= "/emision/consultaDatosBasicosDeudores";
		public static final String CONSULTA_DETALLE_TITULAR 						= "/emision/consultaDetalleTitular";
		public static final String CONSULTA_SUCURSALES_HUMANO 						= "/emision/consultaSucursalesHumano";
		public static final String CONSULTA_DETALLE_DEUDOR 							= "/emision/consultaDetalleDeudor";
		public static final String CONSULTA_DETALLE_CODEUDOR 						= "/emision/consultaDetalleCodeudor";
		public static final String CONSULTA_DETALLE_DEPENDIENTE 					= "/emision/consultaDetalleDependiente";
        public static final String CONSULTA_DETALLE_BENEFICIARIO 					= "/emision/consultaDetalleBeneficiario";
        public static final String CONSULTA_PLANES_MODALIDAD 						= "/emision/consultaPlanesModalidad";
        public static final String CONSULTA_DETALLE_FACTURACION 					= "/emision/consultaDetalleFacturacion";
        public static final String CONSULTA_DATOS_BASICOS_CE 						= "/emision/consultaDatosBasicosCE";
        public static final String CONSULTA_DETALLE_CE 								= "/emision/consultaDetalleCE";
        public static final String CONSULTA_LISTA_ESTADOS 							= "/emision/consultaListaEstados";
		public static final String CONSULTA_DATOS_BASICOS_CONDICIONES_PARTICULARES 	= "/emision/consultaCondicionesParticulares";
		public static final String CONSULTA_DETALLE_CP_MODIFICACION_BENEFICIOS 		= "/emision/consultaDetalleCPModificacionBeneficios";
		public static final String CONSULTA_DETALLE_CP_ELEGIBILIDAD_PLAN 			= "/emision/consultaDetalleCPElegibilidadPlan";
		public static final String CONSULTA_ELEGIBILIDAD_PERMANENCIA 				= "/emision/consultaElegibilidadYPermanencia";
		public static final String CONSULTA_ELEGIBILIDAD_CE_BY_ID 					= "/emision/consultarCEelegibilidadById";
		public static final String CONSULTA_TIEMPO_ESPERA_CE_BY_ID 					= "/emision/consultarCETiempoEsperaById";
		public static final String CONSULTA_DETALLE_CE_MODIFICACION_BENEFICIOS 		= "/emision/consultaDetalleCEModificacionBeneficios";
		public static final String CONSULTA_CAMBIO_ASEGURADORA_CE_BY_ID 			= "/emision/consultarCECambioAseguradoraById";
		public static final String CONSULTA_CAMBIO_ASEGURADORA_CE_DETALLE_BY_ID 	= "/emision/consultarCECambioAseguradoraDetalleById";
		public static final String CONSULTA_ASEGURADOS_CAMBIO_ASEGURADORA 			= "/emision/consultarAseguradosCambioAseguradoras";
		public static final String CONSULTA_ASEGURADOS_FILTROS_CE 					= "/emision/consultaAseguradosFiltrosCE";
		public static final String CONSULTAR_DOCUMENTOS_RADICACION 					= "/radicacion/consultarDocumentosRadicacion";
		public static final String CONSULTAR_TIPOS_DOCUMENTOS_RADICACION 			= "/radicacion/consultarTiposDocumentosRadicacion";
		public static final String CONSULTAR_CLASIFICACIONES_RADICACION 			= "/radicacion/consultarClasificacionesRadicacion";
		public static final String CONSULTAR_MOVIMIENTOS_RADICACION 				= "/radicacion/consultarMovimientosRadicacion";
		public static final String CONSULTAR_TIPOS_MOVIMIENTOS_RADICACION 			= "/radicacion/consultarTiposMovimientosRadicacion";
		public static final String CONSULTAR_HISTORICO_RADICADO 					= "/radicacion/consultarHistoricoRadicado";
		public static final String CONSULTAR_DETALLE_PRIMAS_ASEGURADOS 				= "/emision/detallePrimasAsegurados";
		public static final String CONSULTAR_TOTALES_PRIMAS_PLAN 					= "/emision/totalesPrimasPlan";
		public static final String CONSULTAR_TOTALES_PRIMAS_TITULAR 				= "/emision/totalesPrimasTitular";
		public static final String CONSULTAR_TOTALES_PRIMAS_DEPENDIENTES 			= "/emision/totalesPrimasDependientes";
		public static final String CONSULTAR_TOTALES_PRIMAS_NUCLEO 					= "/emision/totalesPrimasNucleo";
		public static final String CONSULTAR_GRUPO_EMPRESARIAL_POR_NOMBRE 			= "/emision/consultarGrupoEmpresarialPorNombre";
		public static final String CONSULTAR_GERENTE_POR_INTERMEDIARIO 				= "/emision/consultarGerentePorIntermediario";
		public static final String CONSULTAR_ASEGURADO_CE_O_CP 						= "/emision/consultarCondicionesAsegurado";
		public static final String CONSULTAR_MODIFICA_RADICADO 						= "/radicacion/consultarRadicado";
		public static final String CONSULTA_DISTRIBUCION_POLITICA 					= "/emision/consultaDistribucionPolitica";
		public static final String CONSULTAR_CLASIFICACION_DOC_FISICO 				= "/radicacion/consultarClasificacionDocFisicos";
		public static final String CONSULTAR_ENCABEZADO_DETALLE_RADICACION 			= "/radicacion/consultarEncabezadoDetalle";
		public static final String DATOS_PRIMAS_ASEGURADOS 							= "/emision/consultarPrimasTitularesPoliza";
		public static final String DATOS_PRIMAS_DEPENDIENTES_TITULAR 				= "/emision/consultarPrimasDependientesTitular"; 
		public static final String DATOS_DETALLE_PRIMAS_PLAN_ASEGURADO 				= "/emision/consultarDetallePrimasPlanAsegurado";
		public static final String GUARDAR_TAB_CONDICIONES_ESPECIALES 				= "/emision/guardarTabCondicionesEspeciales";
		public static final String GUARDAR_EMISION 									= "/emision/guardar";
		public static final String GUARDAR_TAB_EMISION 								= "/emision/guardarTabEmision";	
		public static final String GUARDAR_TAB_PLANES 								= "/emision/guardarTabPlanes";
		public static final String ACTUALIZAR_TAB_PLANES 							= "/emision/actualizarTabPlanes";
		public static final String GUARDAR_DESCUENTOS_RECARGOS_PRIMAS_UNICAS 		= "/planes/guardarDescuentosRecargosPrimasUnica";
		public static final String ACTUALIZAR_DESCUENTOS_RECARGOS_AUTORIZADOR 		= "/planes/actualizarDescuentosRecargosAutorizador";	
		public static final String ROLES_APROBADOR_DESCUENTOS_RECARGOS 				= "/planes/rolesAprobador";
		public static final String APROBADORES_ROL_DESCUENTOS_RECARGOS 				= "/planes/rolesAprobadores";		
		public static final String GUARDAR_COASEGURADORA_EMISION 					= "/emision/guardarTabCoaseguro";		
		public static final String GUARDAR_DEUDOR_EMISION 							= "/emision/guardarTabDeudor";	
		public static final String GUARDAR_EMISION_TITULAR							= "/emision/guardarTabTitular";	
		public static final String GUARDAR_CE_CAMBIO_PRIMA 							= "/emision/guardarCECambioPrima";
		public static final String GUARDAR_ELEGIBILIDAD_CP 							= "/emision/guardarCPelegibilidad";	
        public static final String GUARDAR_CAMBIO_POLIZA_CE		 					= "/emision/guardarCECambioPoliza";        
        public static final String GUARDAR_EMISION_CONDICION_PARTICULAR 			= "/emision/guardarCondicionParticular";
        public static final String GUARDAR_EMISION_CP_MODIFICACION_BENEFICIO 		= "/emision/guardarCPModIficacionBeneficio";
        public static final String GUARDAR_ELEGIBILIDAD_CE 							= "/emision/guardarCEelegibilidad";        
        public static final String GUARDAR_EMISION_CE_MODIFICACION_BENEFICIO	 	= "/emision/guardarCEModIficacionBeneficio";
        public static final String GUARDAR_CE_TIEMPO_ESPERA 						= "/emision/guardarCEtiempoEspera";
        public static final String GUARDAR_CE_CAMBIO_ASEGURADORA 					= "/emision/guardarCECambioAseguradora";        
        public static final String GUARDAR_HISTORICO_PRIMA 							= "/emision/guardarHistoricoPrima";
        public static final String LISTADO_SUBESTADO_PROCESO_EMISION 				= "/emision/listadoSubEstadoProcesoEmision";        
        public static final String DELETE_TAB_CONDICIONES_ESPECIALES 				= "/emision/eliminarTabCondicionesEspeciales";
        public static final String DELETE_EMISION_CONDICION_PARTICULAR 				= "/emision/deleteCondicionParticular";
        public static final String DELETE_EMISION_CP_MODIFICACION_BENEFICIO 		= "/emision/deleteCPModificacionBeneficio";
        public static final String DELETE_EMISION_CE_MODIFICACION_BENEFICIO 		= "/emision/deleteCEModificacionBeneficio";
        public static final String DELETE_ELEGIBILIDAD_CP 							= "/emision/deleteCPelegibilidad";
        public static final String DELETE_ELEGIBILIDAD_CE 							= "/emision/deleteCEelegibilidad";
        public static final String DELETE_CAMBIO_POLIZA_CE 							= "/emision/deleteCEcambioPoliza";
        public static final String DELETE_CAMBIOPOLIZA 								= "/emision/deleteCambioPolizaUniqueByCE";
        public static final String DELETE_CE_TIEMPO_ESPERA 							= "/emision/deleteCETiempoEspera";
        public static final String DELETE_CE_CAMBIO_ASEGURADORA_BY_ID 				= "/emision/deleteCECambioAseguradoraById";
        public static final String DELETE_CAMBIO_ASEGURADORA_CE 					= "/emision/deleteCECambioAseguradora";
        public static final String DELETE_CAMBIOAASEGURADORA 						= "/emision/deleteCambioAseguradoraUniqueByCE";
        public static final String ELIMINAR_CE_CAMBIO_PRIMA 						= "/emision/elminarCECambioPrima";
		public static final String ELIMINAR_CE_LISTA_CAMBIO_PRIMA 					= "/emision/elminarCEListaCambioPrima";
		public static final String ELIMINAR_TAB_PLANES 								= "/emision/eliminarTabPlanes";
		public static final String ELIMINAR_TITULAR 								= "/emision/deleteTitular";
		public static final String ELIMINAR_DEPENDIENTE 							= "/emision/deleteDependiente";
		public static final String ELIMINAR_BENEFICIARIOS_TD 						= "/emision/deleteBeneficiariosTD";
		public static final String ELIMINAR_DEUDOR 									= "/emision/deleteDeudor";
		public static final String ELIMINAR_CODEUDOR 								= "/emision/deleteCodeudor";
		public static final String ELIMINAR_BENEFICIARIOS_DC 						= "/emision/deleteBeneficiariosDC";
		public static final String ELIMINAR_HISTORICO_PRIMA 						= "/emision/eliminarHistoricoPrima";
		public static final String EMITIR_POLIZA 									= "/emision/emitirPoliza";
		public static final String NOTIFICAR_DICAPACIDAD_INCAPACIDAD 				= "/emision/notificarDiscapacidadIncapacidad";
		public static final String CALCULAR_PRIMAS 									= "/emision/calcularPrimas";
		public static final String DEDUCIBLES_PRIMAS 								= "/emision/deducibles";
		public static final String GRUPO_ETAREO_PRIMAS 								= "/emision/grupoEtareo";
		public static final String GRUPO_FAMILIAR_PRIMAS 							= "/emision/grupoFamiliar";
		public static final String FACTOR_PLAN_PRIMAS 								= "/emision/factorPlan";
		public static final String CALCULAR_PRIMA_NEGOCIADA 						= "/emision/primaNegociada/calcular";
		public static final String RECALCULAR_PRIMA_NEGOCIADA 						= "/emision/primaNegociada/recalcular";
		public static final String CALCULAR_PRIMA_COMPLEMENTARIA 					= "/emision/primaComplementaria/calcular";
		public static final String RECALCULAR_PRIMA_COMPLEMENTARIA 					= "/emision/primaComplementaria/recalcular";
		public static final String OBTENER_DEDUCIBLES_DE_UN_PLAN 					= "/emision/obtenerDeduciblesDeUnPlan";
		public static final String OBTENER_DEDUCIBLE_DE_UN_PLAN 					= "/emision/obtenerDeducibleDeUnPlan";
		public static final String OBTENER_BENEFICIOS_ADICIONALES_DE_UN_PLAN 		= "/emision/ObtenerBeneficiosAdicionalesDeUnPlan";
		public static final String OBTENER_COBERTURAS_PAGINADAS 					= "/emision/obtenerCoberturasPaginadas";   
		public static final String DATOS_PRIMAS_PLANES_POLIZA 						= "/emision/consultarPrimasPlanesPoliza";
		

	    private Mappings(){
	    }
	}
	
}
