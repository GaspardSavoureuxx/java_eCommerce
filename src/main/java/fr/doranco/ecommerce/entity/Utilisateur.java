package fr.doranco.ecommerce.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString


public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom", length = 25, nullable = false)
	private String nom;
	
	@Column(name = "prenom", length = 25, nullable = false)
	private String prenom;
	
	@Column(name = "actif", nullable = false)
	private Boolean isActif;
	
	@Column(name = "profil", length = 25, nullable = false)
	private String profil;
	
	@Column(name = "date_naissance")
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Column(name = "email", length = 32, nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", length = 32, nullable = false)
	@Length(min = 12, max = 32, message = "Le password doit être compris entre 12 et 32 caractères !")
	private String password;
	
	@Column(name = "telephone", length = 10, unique = true)
	private String telephone;
	
	
	
	
	
	
	

}
