package com.company.technique;

public class ServiceCas5 {

	/*
	SELECT client.nom, client.prenom
	FROM `client` client
	order by client.nom


	SELECT client.nom, client.prenom, sum(commande.quantite), sum(produit.prixUni*commande.quantite)
	FROM `client` client
	INNER JOIN `commande` commande   ON client.idClient = commande.idClient
	INNER JOIN `produit` produit   ON produit.idProduit = commande.idProduit
	group by client.nom, client.prenom
	*/

}
