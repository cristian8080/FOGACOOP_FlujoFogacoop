package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestEnviarCorreoPlantillaDto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("idPlantilla")
	private java.lang.String idPlantilla;
	@org.kie.api.definition.type.Label("idDominio")
	private java.lang.String idDominio;
	@org.kie.api.definition.type.Label("nit")
	private java.lang.String nit;
	@org.kie.api.definition.type.Label("businessList")
	private java.util.List<java.lang.String> businessList;
	@org.kie.api.definition.type.Label("typeParameter")
	private java.lang.Integer typeParameter;
	@org.kie.api.definition.type.Label("listaAdjuntos")
	private java.util.List<java.lang.String> listaAdjuntos;

	@org.kie.api.definition.type.Label(value = "tokenAutenticatedBusiness")
	private com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness;

	public RequestEnviarCorreoPlantillaDto() {
		this.listaAdjuntos = new java.util.ArrayList<java.lang.String>();
		this.businessList = new java.util.ArrayList<java.lang.String>();
	}

	public java.lang.String getIdPlantilla() {
		return this.idPlantilla;
	}

	public void setIdPlantilla(java.lang.String idPlantilla) {
		this.idPlantilla = idPlantilla;
	}

	public java.lang.String getIdDominio() {
		return this.idDominio;
	}

	public void setIdDominio(java.lang.String idDominio) {
		this.idDominio = idDominio;
	}

	public java.lang.String getNit() {
		return this.nit;
	}

	public void setNit(java.lang.String nit) {
		this.nit = nit;
	}

	public java.util.List<java.lang.String> getBusinessList() {
		return this.businessList;
	}

	public void setBusinessList(java.util.List<java.lang.String> businessList) {
		this.businessList = businessList;
	}

	public java.lang.Integer getTypeParameter() {
		return this.typeParameter;
	}

	public void setTypeParameter(java.lang.Integer typeParameter) {
		this.typeParameter = typeParameter;
	}

	public java.util.List<java.lang.String> getListaAdjuntos() {
		return this.listaAdjuntos;
	}

	public void setListaAdjuntos(java.util.List<java.lang.String> listaAdjuntos) {
		this.listaAdjuntos = listaAdjuntos;
	}

	public com.fogacoop.flujofogacoop.TokenDTO getTokenAutenticatedBusiness() {
		return this.tokenAutenticatedBusiness;
	}

	public void setTokenAutenticatedBusiness(
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

	public RequestEnviarCorreoPlantillaDto(java.lang.String idPlantilla,
			java.lang.String idDominio, java.lang.String nit,
			java.util.List<java.lang.String> businessList,
			java.lang.Integer typeParameter,
			java.util.List<java.lang.String> listaAdjuntos,
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.idPlantilla = idPlantilla;
		this.idDominio = idDominio;
		this.nit = nit;
		this.businessList = businessList;
		this.typeParameter = typeParameter;
		this.listaAdjuntos = listaAdjuntos;
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

}