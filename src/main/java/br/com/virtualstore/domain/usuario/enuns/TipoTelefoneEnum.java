/**
 * 
 */
package br.com.virtualstore.domain.usuario.enuns;

/**
 * @author MARCIO
 *
 */
public enum TipoTelefoneEnum {

	FAX("Fax"),
	CONTATO("Contato"),
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial"),
	CELULAR("Celular");
	
	private String tipoTelefone;

	private TipoTelefoneEnum(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
