package com.javainuse;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

/**
 * Clase que permite el manejo de constantes para el modulo de emision
 * @author Mperezu
 */
public class ConstantesUtil implements Serializable {

	private static final long serialVersionUID = 5748855167834329625L;	
	/**
	 * @author Mperezu
	 * @param Codigo<T>  Generic definido por la implementacion de la interfaz
	 * @return Codigo asociado al objeto que implementa la interfaz
	 */
	@FunctionalInterface
	static interface Codigo<T> {
		/**
		 * @return
		 */
		public T getCodigo();
	}	
	/**
	 * Obtiene el codigo de la interfaz dada, a traves de un metodo de clase.
	 * @param <T> Generic definido por la implementacion de la interfaz
	 * @param codigo Instancia de objeto que implementa la interfaz
	 * @return Codigo asociado al objeto que implementa la interfaz
	 */
	public static <T> T getEnumCodigo(Codigo<T> codigo) {
		return codigo.getCodigo();
	}
	/**
	 * Obtiene el codigo de la interfaz dada, a traves de un metodo de objeto.
	 * @param <T> Generic definido por la implementacion de la interfaz
	 * @param codigo Instancia de objeto que implementa la interfaz
	 * @return Codigo asociado al objeto que implementa la interfaz
	 */
	public <T> T getCodigo(Codigo<T> codigo) {
		return codigo.getCodigo();
	}
	
	/**
	 * @author Mperezu
	 */
	public enum CARACTERES_SIMBOLOS implements Codigo<String> {
		PREGUNTA("?"),AMPERSAND("&"),IGUAL("="),PORCENTAJE("%"),BACK_SLASH("\\"),COMILLA("\""),COMA(","),GUION("-"),
		SI("S"),NO("N"),ABRIR_CORCHETE("["),CERRAR_CORCHETE("]"),ENTER("\r\n"),SLASH("/"),GUION_PISO("_"),
		CLASS_POJO("ClassPojo "),TAB("\t"),DISPLAY_NONE("display:none"),EMPTY(""),SI_COMPLETO("SI"),;
		private String codigo;
		CARACTERES_SIMBOLOS(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum FORMATO_FECHAS implements Codigo<String> {
		FORMATO_FECHA_DD_MM_YYYY_HH_MM_A("dd/MM/yyyy hh:mm a"),
		FORMATO_FECHA_DD_MM_YYYY("dd/MM/yyyy"), 
		FORMATO_FECHA_YYYY_DD_MM("yyyy-dd-MM"),;		
		private String codigo;		
		FORMATO_FECHAS(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum GENERALES implements Codigo<String> {
		SALTO_LINEA("\r\n"),
		CADENA_VACIA(""),
		ESPACIO_BLANCO(" ");
		private String codigo;
		GENERALES(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum JSON_MESSAGES implements Codigo<String> {
		MSG_ERROR("Ocurrio un error"),MSG_INFO("Ocurrio un evento."),MESSAGE_INFO("No se encontro valor del dato {} en el JSON"),
		MSG_PLANES_ACTIVOS(" Response Planes Activos {} en el servicio JSON "),
		MSG_PLAN_ACTIVO(" Request Planes Activos {} en el servicio JSON "),RESPUESTA_CODIGO("$.respuesta.codigo"),;
		private String codigo;
		JSON_MESSAGES(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	
	/**
	 * @author Mperezu
	 */
	public enum EMISION implements Codigo<String> {
		NUMERO_RADICACION_ID("N\u00famero de radicaci\u00f3n id"),ESTADO_POLIZA_ID("Estado poliza id"),FRECUENCIA_PAGO_ID("Frecuencia pago id"),
		FORMA_PAGO_ID("Forma pago id"), GENERAR_FACTURACION("Generar facturaci\u00f3n"),FECHA_TRANSACCION("Fecha transacci\u00f3n"),
		TIPO_MOVIMIENTO_ID("Tipo movimiento id"),USUARIO_EMISION("Usuario emisi\u00f3n"),FECHA_EMISION("Fecha emisi\u00f3n"),FECHA_VIGENCIA_INICIO("Fecha vigencia inicio"),
		FECHA_VIGENCIA_FIN("Fecha vigencia fin"),DIESTRA("Diestra"),HEREDERO_LEGAL("Heredero legal"),ESTUDIANTE("Estudiante"),NOMBRE_COMPLETO("nombreCompleto"),
		NOMBRE("nombre"),PERSONA("persona"),DATOS_PERSONA_FISICA("datosPersonaFisica"),DATOS_PERSONA_JURIDICA("datosPersonaJuridica"),TELEFONOS("telefonos"),
		TIPO("tipo"),EXTENSION("extension"),TELEFONO("telefono"),DESCUENTO_RECARGO_N("N"),DESCUENTO_RECARGO_D("D"),DESCUENTO_RECARGO_R("R"),CODIGO_HUMANO("CODIGO_HUMANO"),
		CODIGO_RAMO("codigoRamo"),CODIGO_SUB_RAMO("codigoSubRamo"),CODIGO_PLAN("codigoPlan"),NOMBRE_PLAN("nombrePlan"),USUARIO_LIDER_COASEGURADORA("HUMANO"),
		USUARIO_MINORITARIO_COASEGURADORA("SUAR"),CODIGO_USUARIO_LIDER_COASEGURADORA("4037438"),TIPO_IDENTIFICACION_ID("CC"),ESPOSO_A("ESPOSO(A)"),HIJO_A("HIJO(A)"),
		HIJASTRO_A("HIJASTRO(A)"),COMPANERO_A("COMPA\u00d1ERO(A) DE VIDA"),CONYUGUE("CONYUGUE"),CENTRO("Centro"),PRESTADOR("Prestador"),
		CENTRO_MEDICO("Centro M\u00e9dico Manuel P\u00e9rez"),MEDICO("M\u00e9dico"),ODONTOLOGO("Odont\u00f3logo"),ESTADO_VIGENTE("Vigente"),PARAMETRO_NOMBRE_ROL("nombreRol"),
		CONDICIONES_ESPECIALES("Condiciones especiales"),ESPACIO(" "),TIPO_POLIZA_ID(" Tipo Poliza Id"), MONEDA(" Moneda "),CLASE_PRODUCTO_ID("Clase Producto Id"), 
		VIA_NEGOCIO_ID("Via Negocio Id"),IDIOMA_DOCUMENTACION("Idioma Documentacion"),USUARIO_POLIZA(" Usuario Poliza "), FECHA_APP_FAC_MOV(" Fecha Aplicacion Facturacion Modificacion Movimiento"),;		
		private String codigo;		
		EMISION(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum EMISION_TEST implements Codigo<String> {
		NUMERO_IDENTIFICACION_TEST("22345876"),PRIMER_NOMBRE_TEST("Juan"),PRIMER_APELLIDO_TEST("Valdez"),PARENTESCO_TEST("1"),
		ESTADO_DEPENDIENTE_ID_TEST("1410"),TIPO_PARENTESCO_ID_TEST("2"),NUMERO_RADICACION_ID_TEST("1"),ESTADO_POLIZA_ID_TEST("1"),
		FRECUENCIA_PAGO_ID_TEST("1"),FORMA_PAGO_ID_TEST("1"),PORCENTAJE_CERO_TEST("0.0"),PORCENTAJE_MAYOR_CERO_TEST("0.5"),
		PORCENTAJE_CIENTO_UNO_TEST("101.0"),	MONTO_FIJO_DOS_OCHO_TEST("2.8"),MONTO_FIJO_MENOS_UNO_TEST("-1"),
		USUARIO_EMISION_TEST("intergrupo_user1"),TIPO_MOVIMIENTO_ID_TEST("1"),UNO_TEST("1"),
		USUARIO_CONFIGURACION_TEST("integrupo_user3"),MOTIVO_CANTIDAD_TEST("Pendiente de Completar"),SUB_ESTADO_ID("1"),SUCURSAL("Unicentro"),;		
		private String codigo;		
		EMISION_TEST(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * 
	 * @author Mperezu
	 *
	 */
	public enum EMISION_INTEGER implements Codigo<Integer> {
		ESTADO_INICIAL_COASEGUDORA(1),CODIGO_RESPUESTA_OK(0),CODIGO_NO_SE_ENCONTRARON_DATOS(2001),CODIGO_RADICACION_UTILIZADA(2002),
		CODIGO_ERROR_CONSUMO_SERVICIO(5000),CODIGO_ERROR_DATOS_INCOMPLETOS(7000),CODIGO_ERROR_GUARDADO(8000),CODIGO_ERROR_URL(4000),
		CODIGO_ERROR_LOAD(9000),DEFAULT_CERO(0),AWAIT_SAVE(100),ESTADO_INICIAL_PROCESO_CONDICION_ESPECIAL(1),ESTADO_FINAL_PROCESO_CONDICION_ESPECIAL(2),
		UNO(1),CODIGO_MENSAJE_FALLIDO_DATOS_INCORRECTOS(2007),CODIGO_DATOS_ASOCIADOS(2003),CODIGO_EJECUCION_CON_ERRORES(8001), 
		CODIGO_POLIZA_NO_EMITIDA(2004),CODIGO_ERROR_CAMBIO_ESTADO(2005), CODIGO_PENDIENTE_EVALUACION(2006),CODIGO_ERROR_ELIMINAR_PLAN(2007),
        CODIGO_ERROR_CALCULO_PRIMA_NEGOCIADA(9001),CODIGO_ERROR_VALOR_PRIMA_NEGOCIADA_DESCUENTO(9002), CODIGO_ERROR_VALOR_PRIMA_NEGOCIADA_RECARGO(9003),
        CODIGO_ERROR_VALOR_PORCENTAJE_DESCUENTO(9004), CODIGO_ERROR_VALOR_PORCENTAJE_RECARGO(9005),CODIGO_ERROR_VALOR_RECALCULO_PRIMA(9006),
        CODIGO_ERROR_CONSULTA(10000), CODIGO_ERROR_DESCUENTO_RECARGO(9007), CODIGO_ERROR_PRIMA_NEG_IGUAL_A_CERO(9008), ;			
		private Integer codigo;		
		EMISION_INTEGER(Integer codigo) {
			this.codigo = codigo;
		}
		@Override
		public Integer getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum DESCUENTO_EMISION implements Codigo<String> {
		PORCENTAJE_INVALIDO("Porcentaje entre 1 - 100"),FECHA_APLICACION("Fecha aplicacion descuento"),
		PORCENTAJE_MONTO_FIJO("Ingrese Porcentaje o Monto fijo"),MONTO_FIJO_CON_PORCENTAJE("No puede ingresar Monto fijo y Porcentaje "),
		MONTO_FIJO("Monto fijo mayor 0"),DESCUENTO_RECARGO("Descuento recargo"),FECHA_INICIO("Fecha Inicio Descuento"),
		FECHA_HASTA("Fecha Hasta Descuento"),FRECUENCIA("Frecuencia Descuento"),;		
		private String codigo;		
		DESCUENTO_EMISION(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum TITULAR implements Codigo<String> {
		MSG_TITULAR_OBLIGATORIO("Adicione al menos un titular"),DEPENDIENTE_TITULAR("Dependiente"),NIVEL_ESTUDIO("Nivel estudio titular"),	
		INSTITUCION_EDUCATIVA("Instituci\u00f3n educativa titular"),CODIGO_CARNET("C\u00f3digo carnet titular"),PESO_LIBRA_MAYOR_CERO("Peso libra mayor que 0 titular"),
		PESO_PIES_MAYOR_CERO("Peso pies mayor que 0 titular"),PLAN("Plan titular"),PLAN_ID("Plan id titular"),TIPO_ASEGURADO_ID_INVALIDO("Tipo asegurado id inv\u00e1lido titular"),
		TIPO_REGISTRO_ID("Tipo registro id titular"),CLIENTE_ID("Cliente id titular"),ESTADO_ID("Estado id titular"),EDAD_MAYOR_CERO("Edad mayor 0 titular"),
		FECHA_INGRESO("Fecha ingreso titular"),VERSION(" Versi\u00f3n "),TIENE_BENEFICIARIOS(" Tiene Beneficiarios Titular "),PLANES(" Ingrese Planes titular "),
		ID_PLAN(" Id Plan Titular Null"),TIPO_VENTA("Tipo Venta Titular Null"),;		
		private String codigo;		
		TITULAR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum BENEFICIARIO implements Codigo<String> {
		PRIMER_NOMBRE("Primer nombre beneficiario"),PRIMER_APELLIDO("Primer apellido beneficiario"),
		FECHA_TRANSACCION("Fecha transacci\u00f3n beneficiario"),FECHA_EFECTIVIDAD("Fecha efectividad beneficiario"),
		TIPO_ASEGURADO_ID("Tipo asegurado id beneficiario"),PARENTESCO("Parentesco beneficiario"),
		PORCENTAJE_DISTRIBUCCION("Porcentaje distribucci\u00f3n beneficiario"),NIVEL("Nivel"),
		NOMBRE_BENEFICIARIO("Beneficiario"),;
		private String codigo;		
		BENEFICIARIO(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum DEPENDIENTE implements Codigo<String> {
		CODIGO_CLIENTE_ID("C\u00f3digo cliente dependiente"),TIPO_IDENTIFICACION_ID("Tipo identificaci\u00f3n id dependiente"),
		NUMERO_IDENTIFICACION("N\u00famero identificaci\u00f3n dependiente"),ESTADO_DEPENDIENTE_ID("Estado dependiente id"),
		TIPO_ASEGURADO("Tipo asegurado id dependiente"),TIPO_REGISTRO_ID("Tipo registro id dependiente"),
		TIPO_PARENTESCO_ID("Tipo parentesco id dependiente"),PARENTESCO("Parentesco dependiente"),
		EDAD_MAYOR_CERO("Edad mayor 0 dependiente"),ESTATURA_PIES_MAYOR_CERO("Estatura pies mayor 0 dependiente"),
		PESO_LIBRAS_MAYOR_CERO("Peso libras mayor 0 dependiente"),PLANES(" Ingrese planes dependiente"),ID_PLAN(" Id Plan Dependiente Null"),
		TIPO_VENTA("Tipo Venta Dependiente Null"),;
		private String codigo;		
		DEPENDIENTE(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum DISCAPACIDAD implements Codigo<String> {
		CLASE_ID("Clase id discapacidad / incapacidad "),GRUPO_ID("Grupo id discapacidad / incapacidad"),
		SUB_GRUPO_ID("Sub Grupo id discapacidad / incapacidad"),ESTADO_DISCAPACIDAD_ID("Estado discapacidad idd"),
		TIPO_DISCAPACIDAD_ID("Tipo discapacidad id"),FECHA_DIAGNOSTICO("Fecha diagn\u00f3stico"),PORCENTAJE("Porcentaje entre 1 - 100"),;
		private String codigo;		
		DISCAPACIDAD(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum COASEGURADORA implements Codigo<String> {
		SUM_PORCENTAJES("La suma de los Porcentajes de la Coaseguradora debe ser igual a 100.00"),
		DESCRIPCION_COASEGURADORA("Descripci\u00f3n coaseguradora"),COASEGURADORA_ID("Coaseguradora id "),
		PORCENTAJE_INVALIDO("Porcentaje Coaseguradora entre 1 - 100"),
		TIPO_COASEGURADORA_ID("Tipo coaseguradora id"),FECHA_CONFIGURACION("Fecha Configuraci\u00f3n coaseguradora"),
		USUARIO_CONFIGURACION("Usuario Configuraci\u00f3n coaseguradora");
		private String codigo;
		COASEGURADORA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum DEUDOR implements Codigo<String> {
		MSG_DEUDOR_OBLIGATORIO("Adicione al menos un deudor"),
		NIVEL_ESTUDIO("Nivel estudio deudor"),
		INSTITUCION_EDUCATIVA("Instituci\u00f3n educativa deudor"),CODIGO_CARNET("C\u00f3digo carnet deudor"),
		PESO_LIBRA_MAYOR_CERO("Peso libra mayor que 0 deudor"),
		PESO_PIES_MAYOR_CERO("Peso pies mayor que 0 deudor"),PLAN("Plan deudor"),
		PLAN_ID("Plan id deudor"),TIPO_ASEGURADO_ID_INVALIDO("Tipo asegurado id inv\u00e1lido deudor"),
		TIPO_REGISTRO_ID("Tipo registro id deudor"),CLIENTE_ID("Cliente id deudor"),
		ESTADO_ID("Estado id deudor"),EDAD_MAYOR_CERO("Edad mayor 0 deudor"),
		FECHA_INGRESO("Fecha ingreso deudor"),NUMERO_PRESTAMO("n\u00famero pr\u00e9stamo deudor"),
		FECHA_INICIO_VIGENCIA("Fecha inicio vigencia"),FECHA_FIN_VIGENCIA("Fecha fin vigencia deudor"),
		PLAZO_PRESTAMO("Plazo pr\u00e9stamo deudor"),CO_DEUDORES(" Codeudores "),;
		private String codigo;
		DEUDOR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum CO_DEUDOR implements Codigo<String> {
		MSG_DEUDOR_OBLIGATORIO("Adicione al menos un codeudor"),
		BENEFICIARIO("Beneficiario"),NIVEL_ESTUDIO("Nivel estudio codeudor"),
		INSTITUCION_EDUCATIVA("Instituci\u00f3n educativa deudor"),CODIGO_CARNET("C\u00f3digo carnet codeudor"),
		PESO_LIBRA_MAYOR_CERO("Peso libra mayor que 0 codeudor"),
		PESO_PIES_MAYOR_CERO("Peso pies mayor que 0 codeudor"),PLAN("Plan codeudor"),
		PLAN_ID("Plan id codeudor"),TIPO_ASEGURADO_ID_INVALIDO("Tipo asegurado id inv\u00e1lido codeudor"),
		TIPO_REGISTRO_ID("Tipo registro id codeudor"),CLIENTE_ID("Cliente id codeudor"),
		ESTADO_ID("Estado id codeudor"),EDAD_MAYOR_CERO("Edad mayor 0 codeudor"),
		FECHA_INGRESO("Fecha ingreso codeudor"),NUMERO_PRESTAMO("n\u00famero pr\u00e9stamo codeudor"),
		TIPO_DOCUMENTO_ID("Tipo documento id"),NUMERO_DOCUMENTO("n\u00famero documento codeudor"),
		FECHA_INICIO_VIGENCIA("Fecha inicio vigencia codeudor"),FECHA_FIN_VIGENCIA("Fecha fin vigencia codeudor"),
		PLAZO_PRESTAMO("Plazo pr\u00e9stamo codeudor"),TIPO_RELACION("Tipo relaci\u00f3n"),;
		private String codigo;
		CO_DEUDOR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum MESSAGES implements Codigo<String> {
		RESPONSE("response"), SUCCESS("success"), ERROR("error"), INFO("info"), RADICADO("numero_radicado"), 
		DETAIL("detalle"),NUMERO_POLIZA("numero_poliza"),CODIGO("codigo"),DESCRIPCION("descripcion"),
		MENSAJE_OK("OK"),NO_SE_ENCONTRARON_DATOS("No se encontraron datos"),
		MENSAJE_ERROR_CONSUMO_SERVICIO("Error al consumir el servicio"),MENSAJE_ERROR_DATOS_INCOMPLETOS("Datos Incompletos o Inv\u00e1lidos."),
		MENSAJE_ERROR_GUARDADO("Error al guardar"),MENSAJE_RADICACION_UTILIZADA("El n\u00famero de radicaci\u00f3n ya fue utilizado en una emisi\u00f3n"),
		MENSAJE_EJECUCION_CON_ERRORES("El proceso se ejecut\u00f3 con errores"),
		MENSAJE_ERROR_URL("Error al consumir el servicio, la url no existe o es invalida"),RESPUESTA("respuesta"),
		MENSAJE_ERROR_GUARDADO_POLIZA("Error al guardar la informaci\u00f3n de la poliza"),
		MENSAJE_ERROR_GUARDADO_PLAN("Error al guardar la informaci\u00f3n del plan"),
		MENSAJE_ERROR_LOAD_PLAN("Error al cargar la informaci\u00f3n del plan"),NUM_POLIZA("numeroPoliza"), CODIGO_ASEGURADO("codigoAsegurado"),
        MENSAJE_GUARDADO(" Guardado Emision Poliza "),MENSAJE_INICIAL_GUARDADO(" Guardado Encabezado Emision Poliza "),
		MENSAJE_GUARDADO_PLANES(" Guardado Planes  "),
		MENSAJE_GUARDADO_CONDICIONES_ESPECIALES(" Guardado Cond. Esp.  "), MENSAJE_GUARDADO_CONDICIONES_PARTICULARES(" Guardado Cond. Part.  "),
		MENSAJE_EXISTEN_CP_PARTICULARES("Existen Condiciones Particulares"), MENSAJE_EXISTEN_TITULARES_ASOCIADOS("Existen Titulares Asociados al plan"),
		TASK_INTERRUPTED("task interrupted"), MENSAJE_GUARDADO_TITULARES(" Guardado Titulares "),
		MESSAGE_DEUDOR(" Deudores "), MESSAGE_TITULAR(" Titulares "),MESSAGE_DEPENDIENTE(" Dependientes "),
		MESSAGE_CODEUDOR(" Codeudores "),MESSAGE_ERROR_CONSULTA_POLIZA("Error en la consulta de poliza a traves del servicio."),
		CONDICION_ESPECIAL_ID("condicionEspecial"),MENSAJE_GUARDADO_ASEGURADOS(" Guardado Asegurados "),
		MENSAJE_FALLIDO_DATOS_INCORRECTOS("Por favor validar los datos ingresados para realizar la operaci?n"),
		POLIZA_ID("polizaId"),TITULAR_ID("titularId"),DEPENDIENTE_ID("dependienteId"),DEUDOR_ID("deudorId"),CO_DEUDOR_ID("codeudorId"),
		EDAD_MINIMA("edadMinima"), EDAD_MAXIMA("edadMaxima"),CODIGO_PLAN("codigoPlan"), USUARIO("Usuario"),CONDICION_PARTICULAR_ID("CondicionParticularID"),
		MENSAJE_ERROR_GUARDADO_CONDICION_PARTICULAR(" Error al Guardar la Condicion Particular"),
		MENSAJE_CONDICION_PARTICULAR_ASOCIADAS("Existen Condiciones Particulares Asociadas "), BOOLEAN_CONDICION_ESPECIAL("BooleanCondicionEspecial"), 
		MENSAJE_POLIZA_NO_EMITIDA("La p\u00f3liza no fue emitida"), MENSAJE_ERROR_CAMBIO_ESTADO("Error actualizando el estado de la p\u00f3liza"),SI("Si"),
		MENSAJE_ERROR_CONSULTA_ASEGURADOS_CONDICION_ESPECIAL("Error en la consulta de asegurados de la condici\u00f3n especial"),
		MENSAJE_ERROR_DESCUENTORECARGO("El Plan est\u00e1 asociado en la configuraci\u00f3n descuentos y recargos, no puede ser eliminado"),
		NO("No"),MENSAJE_ASEGURADO_PENDIENTE_EVALUACION_X_PRIMA("Pendiente de evaluaci\u00f3n t\u00e9cnica por falta de Prima"),
		RESPONSE_COMPLETED("respuesta.codigo"),CODIGO_ERROR_CONSULTA_APROBADORES(" Error al Consultar los Nombres de los Aprobadores"),
		MENSAJE_GUARDADO_HISTORICO_EXITOSO("El guardado del hist\u00f3rico del radicado fue exitoso"),
		MENSAJE_GUARDADO_HISTORICO_FALLIDO("El guardado del hist\u00f3rico del radicado fall\u00f3"),
		MENSAJE_CONSULTA_DISTRIBUCION_POLITICA_FALLIDA("La consulta de la distribuci\u00f3n pol\u00edtica no logr\u00f3 obtener datos"),
		MENSAJE_VALIDACION_INTERMEDIARIO("'Intermediario principal no coincide con el intermediario ingresado en el Radicado, Desea continuar con la modificaci\u00f3n del Intermediario "),
		CODIGO_EXITOSO("0"),CODIGO_FALLIDO("1000"),CODIGO_ERROR_CONSULTA(" Error al Consultar "),;
		private String codigo;
		MESSAGES(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum CODIGOS_MESSAGES implements Codigo<Integer> {
		CODIGO_RESPUESTA_OK(0),CODIGO_NO_SE_ENCONTRARON_DATOS(2001),CODIGO_RADICACION_UTILIZADA(2002),CODIGO_ERROR_CONSUMO_SERVICIO(5000),
		CODIGO_ERROR_DATOS_INCOMPLETOS(7000),CODIGO_ERROR_GUARDADO(8000),CODIGO_ERROR_URL(4000),;	
		private Integer codigo;		
		CODIGOS_MESSAGES(Integer codigo) {
			this.codigo = codigo;
		}
		@Override
		public Integer getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum TiposRemitente implements Codigo<String> {
		EJECUTIVO("E"), INTERMEDIARIO("I"), CLIENTE("C"),
		;
		
		private String codigo;
		
		TiposRemitente(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum EMISION_NOTIFICACION implements Codigo<String> {
		LOGO_PLANTILLA("$LOGO"),
		TIPO_REGISTRO_ENCABEZADO_PLANTILLA("$TIPO_REGISTRO_ENCABEZADO"),COMPANIA_PLANTILLA("$COMPANIA"),
		NUMERO_POLIZA_PLANTILLA("$NUMERO_POLIZA"),CODIGO_CLIENTE_PLANTILLA("$CODIGO_CLIENTE"),
		NOMBRE_CLIENTE_PLANTILLA("$NOMBRE_CLIENTE"),TIPO_PRODUCTO_PLANTILLA("$TIPO_PRODUCTO"),
		MOVIMIENTO_PLANTILLA("$MOVIMIENTO"),CODIGO_RAMO_PLANTILLA("$CODIGO_RAMO"),RAMO_PLANTILLA("$RAMO"),
		CODIGO_SUBRAMO_PLANTILLA("$CODIGO_SUBRAMO"),SUBRAMO_PLANTILLA("$SUBRAMO"),TIPO_REGISTRO_PLANTILLA("$TIPO_REGISTRO"),
		CODIGO_PLAN_PLANTILLA("$CODIGO_PLAN"),PLAN_PLANTILLA("$PLAN"),TIPO_ID_AFILIADO_PLANTILLA("$TIPO_ID_AFILIADO"),
		NUMERO_ID_AFILIADO_PLANTILLA("$NUMERO_ID_AFILIADO"),TIPO_AFILIADO_PLANTILLA("$TIPO_AFILIADO"),
		NOMBRE_AFILIADO_PLANTILLA("$NOMBRE_AFILIADO"),PARENTESCO_PLANTILLA("$PARENTESCO"),EDAD_PLANTILLA("$EDAD"),
		MOSTRAR_PARENTESCO_PLANTILLA("$MOSTRAR_PARENTESCO"),INDISC_NUMERO_PLANTILLA("$INDISC_NUMERO"),
		INCDISC_TIPO_REGISTRO_TITULO_PLANTILLA("$INCDISC_TIPO_REGISTRO_TITULO"),
		INCDISC_TIPO_REGISTRO_PLANTILLA("$INCDISC_TIPO_REGISTRO"),INCDISC_TIPO_PLANTILLA("$INCDISC_TIPO"),
		INCDISC_DETALLE_PLANTILLA("$INCDISC_DETALLE"),INCDISC_SUBGRUPO_PLANTILLA("$INCDISC_SUBGRUPO"),
		INCDISC_GRUPO_PLANTILLA("$INCDISC_GRUPO"),INCDISC_FECHA_REPORTE_PLANTILLA("$INCDISC_FECHA_REPORTE"),
		GENERO_PLANTILLA("$GENERO"),ROL_INTERGRUPO_PLANTILLA("Intergrupo"),TITULAR_PLANTILLA("Titular"),
		DEPENDIENTE_PLANTILLA("Dependiente"),DEUDOR_PLANTILLA("Deudor"),CODEUDOR_PLANTILLA("Codeudor"),;
		private String codigo;
		EMISION_NOTIFICACION(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum PLAN_POLIZA implements Codigo<String> {
		ID_PLAN(" id plan "),NOMBRE_PLAN(" Nombre plan"),VERSION_PLAN(" Versi\u00f3n plan"),
		CONFIGURACION_PLAN(" Plan requerido"),CONFIGURACION_PLAN_ID("plan id "),
		CODIGO_PLAN(" C\u00f3digo plan"),NOMBRE_PLAN_DEUDOR(" Deudor "),NOMBRE_PLAN_CO_DEUDOR(" CoDeudor "),
		NOMBRE_PLAN_TITULAR(" Titular "),NOMBRE_PLAN_DEPENDIENTE(" Dependiente "),CODIGO_DEFECTO("99"),
		PLANES_VACIO(" Debe ingresar al menos un plan "),ID(" Id Plan "), PLAN_ID(" Plan Id "),
		CODIGO(" Codigo "),TIPO_VENTA(" Tipo Venta "),INDIVIDUAL("INDIVIDUAL"),OPCIONAL("OPCIONAL"),TIPO_PRIMA_ID("Tipo Prima Id"),
		AMBOS("INDIVIDUAL,OPCIONAL"),INDIVIDUAL_OBLIGATORIO(" Ingrese un plan Individual "),MSG_PRINCIPAL("Ingrese un Plan Principal"),
		PRIMA_RECALCULADA(" Prima Recalculada "),FRECUENCIA_PAGO(" Frecuencia Pago "),FACTOR_FINANCIACION("Factor Financiacion"),
		MODALIDAD_PLAN(" Modalidad Plan "),;
		private String codigo;
		PLAN_POLIZA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum PRIMA_NEGOCIADA implements Codigo<String> {
		PRIMA_RECALCULADA(" Prima Recalculada "),TIPO(" Tipo "), DESCUENTO("D"),RECARGO("R"),MONTO(" Monto "),
		PORCENTAJE(" Porcentaje "), PRIMA_NEGOCIADA(" Prima Negociada "), MSG_PRIMA_NEGOCIADA(" Ingrese Prima Negociada "),
		CREADO_POR(" Creado Por "),MODIFICADO_POR(" Modificado Por "),PRIMA_ANUALIZADA(" Prima Anualizada "),
		PRIMA_PERIODO(" Prima Periodo "), PRIMA_MENSUAL(" Prima Mensual "),DESCUENTO_MSG_ERROR(" Debe la Prima Negociada"), 
		RECARGO_MSG_ERROR(" Deber venir el Monto o el Porcentaje"),TIPO_PRIMA_ID(" Tipo Prima Id "),
		UNICA(" Prima Negociada: Debe ingresar Tipo, Monto, Porcentaje, Prima Negociada "),
		ETARIO_FAMILIAR("Prima Negociada Prima Etario / Familiar: Si Ingreso Tipo debe ingresar Monto, Porcentaje, Prima Negociada "),;
		private String codigo;
		PRIMA_NEGOCIADA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	
	/**
	 * @author Mperezu
	 */
	public enum PRIMA_COMPLEMENTARIA implements Codigo<String> {
		
		UNICA(" Prima Complementaria: Debe ingresar Descuento SN, Monto, Porcentaje, Prima Complementaria "),
		ETARIO_FAMILIAR("Prima Complentaria : Si Ingreso Descuento SN debe ingresar Monto, Porcentaje, Prima Negociada "),
		DESCUENTO_SN( " Descuento SN "),;
		private String codigo;
		PRIMA_COMPLEMENTARIA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	
	/**
	 * @author Mperezu
	 */
	public enum BENEFICIO_CONDICION_PARTICULAR implements Codigo<String> {
		OPERACION("Cond. Part. OperaciC\u00f3n "),ID_BENEFICIO_PLANES("Cond. Part. idBeneficioPlanes "), 
		CODIGO_BENEFICIO_CONDICION("Cond. Part. C\u00f3digo Beneficio "),NOMBRE_BENEFICIO("Cond. Part. Nombre Beneficio"),
		TIPO_BENEFICIO("Cond. Part. Tipo Beneficio "),PATH("Cond. Part. Path "), MONTO_LIMITE("Cond. Part. Monto Limite"),
		MONTO("Cond. Part. Monto "),PORCENTAJE_COASEGURO("Cond. Part. Porcentaje Coaseguro "),
		PORCENTAJE_DEFINITIVO("Cond. Part. Porcentaje Definitivo"),	TIEMPO_ESPERA("Cond. Part. Tiempo Espera "),
		EDAD_MINIMA("Cond. Part. Edad Minima"),EDAD_MAXIMA("Cond. Part. Edad Maxima"), 
		SUM_MONTO("Cond. Part. El valor del monto de los hijos no puede ser mayor que el del padre "),THREAD_NRO(" No. "),
		GUARDADO_BENEFICIO_CONDICIONES_PARTICULARES(" Inicio Guardado Beneficio Condiciones Particulares"),
		ELEGIBILIDAD_PLAN( " Elegibilidad Plan. "), MODIFICACION_BENEFICIOS( " Modif. Beneficios. "),
		CODIGO_PLAN("Cond. Particular C\u00f3digo Plan"),
		EDAD_MINIMA_INVALIDA("Cond. Particular Edad Minima no puede ser mayor a la Edad Maxima"),
		ID(" Poliza Id "),ID_CONDICION_PARTICULAR(" Id Condicion Particular "),USUARIO(" Usuario "),;
		private String codigo;
		BENEFICIO_CONDICION_PARTICULAR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum MODIFICACION_BENEFICIO_CONDICION_PARTICULAR implements Codigo<String> {
		ID(" Poliza Id  Modicacion Beneficio Condicion Particular "),
		USUARIO(" Usuario Modicacion Beneficio Condicion Particular "),	;
		private String codigo;
		MODIFICACION_BENEFICIO_CONDICION_PARTICULAR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum MODIFICACION_BENEFICIO_CONDICION_ESPECIAL implements Codigo<String> {
		ID(" Poliza Id  Modicacion Beneficio Condicion Especial "),USUARIO(" Usuario Modicacion Beneficio Condicion Especial "),
		ID_CONDICION_ESPECIAL(" Id Condicion Especial Modicacion Beneficio "),;
		private String codigo;
		MODIFICACION_BENEFICIO_CONDICION_ESPECIAL(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum CONDICION_ESPECIAL implements Codigo<String> {
		THREADS_NRO(" No. "),GUARDADO_CONDICIONES_ESPECIALES(" Inicio Guardado Condiciones Especiales"),
		TIPO_PARAMETRIZACION("Cond. Especial Tipo Parametrizaci\u00f3n"),
		TIPO_CONFIGURACION("Cond. Especial Tipo Configuraci\u00f3n"),ID("Cond. Especial id"),
		USUARIO("Cond. Especial Usuario"),ASEGURADOS_LIST("Cond. Especial Asegurados "), 
		ID_ASEGURADORA("Cond. Especial Id Aseguradora"),MONTO_LIMITE_COND_ESP("Cond. Especial Monto Limite "),
		FECHA_ULTIMA_FACTURACION("Cond. Especial Fecha Ultima Facturacion"),FECHA_CONTINUIDAD("Cond. Especial Fecha Continuidad"),
		COBERTURA_ORIGEN_LIST("Cond. Especial Debe existir al menos una cobertura origen "),
		COBERTURA_DESTINO_LIST("Cond. Especial Debe existir al menos una cobertura destino "),
		ASEGURADO_LIST("Cond. Especial Debe existir al menos un asegurado "),		
		NOMBRE_ORIGEN("Cond. Especial Nombre Origen Cobertura "),SUMA_ASEGURADA("Cond. Especial Suma Asegurada "),
		EDAD_MINIMA("Cond. Especial Edad Minima "), EDAD_MAXIMA("Cond. Especial Edad Maxima "),EDAD_PERMANENCIA("Cond. Especial Edad Permanencia"),
		EDAD_MINIMA_INVALIDA("Cond. Especial Edad Minima no puede ser mayor a la Edad Maxima"),
		CODIGO_PLAN("Cond. Especial C\u00f3digo Plan"),CODIGO_CATEGORIA("Cond. Especial C\u00f3digo Categoria"),
		CODIGO_GRUPO_COBERTURA("Cond. Especial C\u00f3digo Grupo Cobertura"),CODIGO_SERVICIO("Cond. Especial C\u00f3digo Servicio"),
		CODIGO_TIPO_COBERTURA("Cond. Especial C\u00f3digo Tipo Cobertura"),CODIGO_COBERTURA("Cond. Especial C\u00f3digo Cobertura"),
		OPERACION_ELIMINACION("Cond. Especial Operaci\u00f3n Eliminaci\u00f3n "),PLAN_ID("Cond. Especial Plan Id "),
		OPERACION_MODIFICACION("Cond. Especial Operaci\u00f3n Modificaci\u00f3n "),
		CODIGO_MODIFICACION("Cond. Especial C\u00f3digo Modificaci\u00f3n"),NOMBRE_MODIFICACION("Cond. Especial Nombre Modificaci\u00f3n"),
		TIPO_MODIFICACION("Cond. Especial Tipo Modificaci\u00f3n"),CODIGO_POR_DEFECTO("001"),
		CERO_ELEGIBILIDAD_PLAN("0"),UNO_ELEGIBILIDAD_PLAN("1"),ID_CONDICION_ESPECIAL("Id Condicion Especial "),	
		PATH("Cond. Especial. Path "), MONTO_LIMITE("Cond. Especial. Monto Limite"),MONTO("Cond. Part. Monto "),
		PORCENTAJE_COASEGURO("Cond. Especial. Porcentaje Coaseguro "),PORCENTAJE_DEFINITIVO("Cond. Especial. Porcentaje Definitivo"),
		TIEMPO_ESPERA("Cond. Especial. Tiempo Espera "), SUM_MONTO("Cond. Especial. El valor del monto de los hijos no puede ser mayor que el del padre "),
		DESTINO(" Destino "), ELIMININACION_TIEMPO_ESPERA_BENEFICIO( " Elim. Tiempo Espera Beneficio."),
		TIPO_CAMBIO_POLIZA(" Tipo Cambio Poliza"), NUMERO_POLIZA_ORIGEN(" Numero Poliza Origen"),
		CODIGO_PLAN_CONTINUIDAD_POLIZA(" Cont. Cambio Poliza C\u00f3digo Plan"), 
		TIPO_ASEGURADO_CONTINUIDAD_POLIZA("  Cont. Cambio Poliza Tipo Asegurado "),
		FECHA_VIGENCIA_INICIO(" Cambio Prima Fecha Vigencia Inicio "),FECHA_VIGENCIA_FIN(" Fecha Vigencia Fin"),
		CAMBIO_PRIMA_CODIGO_PLAN("Cambio Prima C\u00f3digo Plan "), CAMBIO_PRIMA_TIPO_MOVIMIENTO(" Cambio Prima Tipo Movimiento"),
		CAMBIO_PRIMA_MOTIVO(" Cambio Prima Motivo "),CAMBIO_PRIMA_VALOR( "Cambio Prima Ingrese Prima Actualiza / Valor Prima Actualizada "),
		CONTINUIDAD_CAMBIO_POLIZA_ASEGURADOS(" Cont. Cambio Poliza Ingrese al menos un asegurado "),
		CONTINUIDAD_CAMBIO_POLIZA_PLANES(" Cont. Cambio Poliza Ingrese la menos un plan "),
		NOMBRE_ASEGURADORA(" Nombre Aseguradora "),NOMBRE_BENEFICIO_COBERTURA_DESTINO("Cond. Esp. Nombre Beneficio Cobertura Destino "),
		ID_ASEGURADO("Id Asegurado "),CODIGO_CLIENTE_ASEGURADO("Codigo Cliente Asegurado"),ID_TIPO_ASEGURADO("Id Tipo Asegurado "),;
		private String codigo;		
		CONDICION_ESPECIAL(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum CONFIGURACION_FACTURACION implements Codigo<String> {
		FECHA_CORTE(" Cond. Fact. Fecha Corte "),
		FECHA_FACTURACION(" Cond. Fact. Fecha Facturaci\u00f3n"),
		FECHA_ENVIO_FACTURA(" Cond. Fact. Fecha Envio Factura "),
		RECEPTORES("Cond. Fact. Debe adicionar al menos un receptor "),
		TIPO_RECEPTOR(" Cond. Fact. Tipo Receptor "), NUMERO_FACTURAS(" Cond. Fact. Numero Facturas "),
		EMAILS(" Cond. Fact. Debe ingresar al menos un email "),
		EMAIL(" Cond. Fact. Email Invalido "),
		MODO_ENVIOS(" Cond. Fact. Debe ingresar al menos un modo de envio "),
		MODO_ENVIO(" Cond. Fact. Modo de envio "),
		FORMATO_ENVIOS(" Cond. Fact. Debe ingresar al menos un formato de envio "),
		FORMATO_ENVIO(" Cond. Fact. Formato de envio "),;		
		private String codigo;		
		CONFIGURACION_FACTURACION(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum TIPO implements Codigo<String> {
		LOCAL("L", "Local"),INTERNACIONAL("I", "Internacional"),;
		private String codigo;
		private String descripcion;		
		TIPO(String codigo, String descripcion) {
			this.codigo = codigo;
			this.descripcion = descripcion;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		/**
		 * @param codigo
		 * @return
		 */
		public static String getDescripcionByCodigo(String codigo) {
			if (StringUtils.isEmpty(codigo)) {
				return null;
			}
			String descripcion = null;
			for (TIPO tipo: TIPO.values()) {
				if (tipo.codigo.equals(codigo)) {
					descripcion = tipo.getDescripcion();
					break;
				}
			}
			return descripcion;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum MONEDA implements Codigo<String> {
		MONEDA_NO_DEFINIDA("XXX"),CERO("0");
		
		private String codigo;		
		MONEDA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum MONEDA_INTEGER implements Codigo<Integer> {
		POSICION_INICIAL_MONEDA(6),POSICION_FINAL_MONEDA(9),
		TAMANO_TOTAL_SECUENCIA(11),;
		
		private Integer codigo;		
		MONEDA_INTEGER(Integer codigo) {
			this.codigo = codigo;
		}
		@Override
		public Integer getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum MONEDA_LONG implements Codigo<Long> {
		PROCESO_EMISION(1l);
		
		private Long codigo;		
		MONEDA_LONG(Long codigo) {
			this.codigo = codigo;
		}
		@Override
		public Long getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum EMISION_REPOSITORY_QUERY_BUILDER implements Codigo<String> {
		SELECT("select "), SELECT_DISTINCT("select distinct "), FROM("from  "),WHERE("where "),
		RR_NUMERO_RADICADO("rr.numeroRadicado = ep.radicacionRadicado and "),
		EMISION_PLAN_ASEGURADO_PLAN_POLIZA_EMISION_POLIZA("PlanEmisionAsegurado asegurado, EmisionPlanPoliza plan, EmisionPoliza poliza "),
		DATOS_BASICOS_TITULAR("select new com.humano.innova.cronos.model.dto.emision.consulta.DatosBasicosTitular( "),
		DATOS_BASICOS_COASEGUROS("select new com.humano.innova.cronos.model.dto.emision.consulta.DatosBasicosCoaseguro( "),
		DETALLE_TITULAR("select new com.humano.innova.cronos.model.dto.emision.consulta.DetalleTitular( "),
		DATOS_BASICOS_DEPENDIENTE("select new com.humano.innova.cronos.model.dto.emision.consulta.DatosBasicosDependiente( "),
		DATOS_BASICOS_BENEFICIARIO("select new com.humano.innova.cronos.model.dto.emision.consulta.DatosBasicosBeneficiario( "),
		DATOS_BASICOS_CONDICION_PARTICULAR("new com.humano.innova.cronos.model.dto.emision.consulta.DatosBasicosCondicionParticular("),
		ASEGURADO_PLAN("asegurado.emisionPlanPoliza.id  =  plan.id  and "),POLIZA_ID_IGUAL_PLAN_EMISION_POLIZA_ID("poliza.id  =  plan.emisionPoliza.id  and "), 
		POLIZA_NUMERO_POLIZA_IGUAL_NUMERO_POLIZA("poliza.numeroPoliza = :numeroPoliza"),POLIZA_NUMERO_POLIZA_IGUAL_NUMERO_POLIZA_AND("poliza.numeroPoliza = :numeroPoliza and "),
		TITULAR_CODIGO_CLIENTE_PERSONA_NOMBRE_COMPLETO("titular.codigoCliente, persona.nombreCompleto, "),
		DEUDOR_CODIGO_CLIENTE_PERSONA_NOMBRE_COMPLETO("deudor.codigoCliente, persona.nombreCompleto, "),
		CONCAT_TITULAR_TITULAR_ESTADO_ID("concat(titular.titularEstadoId, '')"),EMISION_MODIFICACION_BENEFICIO("EmisionModifiBeneficio cpModificacionBeneficio "), 
		CP_MODIFICACION_BENEFICIOS_EMISION_POLIZA_NUMERO_POLIZA("cpModificacionBeneficio.emisionCondicionParticular.emisionPoliza.numeroPoliza = :numeroPoliza "),
		SELECT_CP_MODIFICACION_BENEFICIO("select cpModificacionBeneficio "),
		PLAN_CODIGO_PLAN_PLAN_NOMBRE_CANTIDAD_DEPENDIENTES(", plan.codigoPlan, plan.planNombre, plan.planId, titular.cantidadBeneficiarios, titular.cantidadDependientes, titular.tipoAseguradoId, titular.id) "),
		PLAN_CODIGO_PLAN_PLAN_NOMBRE_CANTIDAD_CODEUDORES(", plan.codigoPlan, plan.planNombre, plan.planId, deudor.cantidadBeneficiarios, deudor.cantidadCodeudores, deudor.numeroPrestamo, deudor.tipoAseguradoId) "),
		PLAN_CODIGO_PLAN_PLAN_NOMBRE_PLAN_ID_DEPENDIENTE(", plan.codigoPlan, plan.planNombre, plan.planId, dependiente.tipoParentescoId, dependiente.tipoAseguradoId, dependiente.id) "),
		SELECT_DETALLE_DEPENDIENTE("select new com.humano.innova.cronos.model.dto.emision.consulta.DetalleDependiente( "),		
		SELECT_DETALLE_DEUDOR("select new com.humano.innova.cronos.model.dto.emision.consulta.DetalleDeudor( "),
		EMISION_TITULAR_EMISION_DATO_PERSONA("EmisionTitular titular, EmisionDatoPersona persona, "),
		EMISION_DEPENDIENTE_EMISION_TITULAR_EMISION_PERSONA("EmisionDependiente dependiente, EmisionTitular titular, EmisionDatoPersona persona, "),
		DEPENDIENTE_TITULAR("dependiente.emisionTitularDependiente.id =  titular.id and "),
		DEPENDIENTE_PERSONA("dependiente.emisionDatoPersonaDependiente.id =  persona.id and "),
		ASEGURADO_DEPENDIENTE("asegurado.emisionDependiente.id  =  dependiente.id  and "),
		CODEUDOR_DEUDOR("codeudor.emisionDeudorPoliza.id = deudor.id and "),ASEGURADO_CODEUDOR("asegurado.emisionCodeudorPoliza.id = codeudor.id and "),
		EMISION_CODEUDOR_POLIZA_EMISION_DEUDOR_POLIZA_DEUDOR("EmisionCodeudorPoliza codeudor, EmisionDeudorPoliza deudor,  "),
		ASEGURADO_DEUDOR("asegurado.emisionDeudorPoliza.id  =  deudor.id  and "),DEUDOR_CODIGO_CODEUDOR("deudor.codigoCliente = :codigoDeudor"),
		TITULAR_CODIGO_TITULAR("titular.codigoCliente = :codigoTitular"),TITULAR_CODIGO_TITULAR_AND("titular.codigoCliente = :codigoTitular and "), 
		EMISION_MODIFICACION_BENEFICIO_CODIGO_PLAN("cpModificacionBeneficio.codigoPlan = :codigoPlan and "),
		CP_MODIFICACION_BENEFICIO_EMISION_CONDICION_ESPECIAL("cpModificacionBeneficio.emisionCondicionEspecial.id = :idCondicionEspecial and "),
		AND_CP_MODIFICACION_BENEFICIO_TIPO("and cpModificacionBeneficio.tipo != '"), EMISION_ELEGIBILIDAD_PLAN("EmisionElegibilidadPlan cpElegibilidadPlan "),
		EMISION_PLAN_POLIZA("EmisionPlanPoliza planPoliza "),
		PLANES_DEDUCIBLES_TITULARES("select new com.humano.innova.cronos.model.dto.emision.consulta.ConsultaPlanesDeduciblesDto("
				+ "plan.codigoPlan, plan.planNombre, plan.planId, plan.version, prima.deducible, asegurado.emisionTitularAsegurado.id) "),
		PLANES_DEDUCIBLES_DEPENDIENTES("select new com.humano.innova.cronos.model.dto.emision.consulta.ConsultaPlanesDeduciblesDto("
				+ "plan.codigoPlan, plan.planNombre, plan.planId, plan.version, prima.deducible, asegurado.emisionDependiente.id) "),;
		
		private String codigo;		
		EMISION_REPOSITORY_QUERY_BUILDER(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum EMISION_CE_REPOSITORY_QUERY_BUILDER implements Codigo<String> {
		FROM("from  "),WHERE("where "), PLAN_ESTADO("plan.estado = 1 and "),;		
		private String codigo;		
		EMISION_CE_REPOSITORY_QUERY_BUILDER(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * @author Mperezu
	 */
	public enum DATO_PERSONA implements Codigo<String> {
		VACIO(" Debe ingresar los datos persona "),;
		private String codigo;		
		DATO_PERSONA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	/**
	 * Operaciones de persistencia sobre datos
	 * @author Jevargasm
	 */
	public enum OPERACION implements Codigo<String> {
		AGREGAR("A"), ELIMINAR("D"), MODIFICAR("E"),;		
		private String codigo;		
		OPERACION(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum ESTADOS implements Codigo<Long> {
		ACTIVO(1l),INACTIVO(0L);
		
		private Long codigo;		
		ESTADOS(Long codigo) {
			this.codigo = codigo;
		}
		@Override
		public Long getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum PLAN_EMISION_ASEGURADO implements Codigo<String> {
		ACTIVO("7001"),;
		
		private String codigo;		
		PLAN_EMISION_ASEGURADO(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}	
	/**
	 * @author Mperezu
	 */
	public enum AUTORIZADOR implements Codigo<String> {
		ID_POLIZA(" Id Poliza "), MODIFICADO_POR(" Modificado Por "),ID_APROBADOR(" Id Aprobador"),
		ID_ROL_APROBADOR( " Id Rol Aprobador "),ID_MOTIVO(" Id Motivo"),AUTORIZADOR_NULL(" Ingrese Autorizador ");
		
		private String codigo;		
		AUTORIZADOR(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
	}
	
	/**
	 * @author Mperezu
	 */
	public enum CLIENTE_BUSQUEDA_AVANZADA implements Codigo<String> {
		
		TIPO_CLIENTE(" Tipo Cliente "),VALOR_BUSQUEDA(" Valor Busqueda "),CRITERIO_BUSQUEDA(" Criterio Busqueda"),
		TIPO_BUSQUEDA( " Tipo Busqueda "),;
		
		private String codigo;		
		CLIENTE_BUSQUEDA_AVANZADA(String codigo) {
			this.codigo = codigo;
		}
		@Override
		public String getCodigo() {
			return codigo;
		}
			
	}
}
