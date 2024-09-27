package fr.doranco.ecommerce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CartePaiement {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom_proprietaire", length = 32, nullable = false)
	private String nomProprietaire;
	
	@Column(name = "prenom_proprietaire", length = 32, nullable = false)
	private String prenomProprietaire;
	
	@Column(length = 16, nullable = false)
	private String numero;
	
	@Column(name = "date_expiration", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateExpiration;
	
	@Column(length = 3, nullable = false)
	private String crypto;

}
