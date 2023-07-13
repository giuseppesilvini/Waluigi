package com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta;

abstract class NfeStatusServico2CallbackHandler {

    protected final Object clientData;
	
	protected NfeStatusServico2CallbackHandler(final Object clientData) {
		this.clientData = clientData;
	}
	
	protected NfeStatusServico2CallbackHandler() {
		this.clientData = null;
	}
	
	public Object getClientData() {
		return this.clientData;
	}
	
	public void receiveResultnfeStatusServicoNF2(final NfeStatusServico2Stub.NfeStatusServicoNF2Result result) {
	}
	
	public void receiveErrornfeStatusServicoNF2(final Exception e) {
	}
}