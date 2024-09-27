package fr.doranco.ecommerce.enums;

public enum ProfilEnum {
	
	CLIENT ("client"),
	ADMIN ("admin"),
	MAGASINIER ("magasinier");
	
	private String value;

	private ProfilEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	// Enum des différents profils client possibles
	

}
