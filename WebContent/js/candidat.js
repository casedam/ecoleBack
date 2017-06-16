// Fonction permettant de générer une clé d'accès
function cleAccessFunction() {

	var cleAccess;
	var cleAccessNumber = new Array();
	var alphabet = [ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
			'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
			'Y', 'Z' ];

	for (var i = 0; i < 6; i++) {
		cleAccessNumber[i] = Math.floor(Math.random() * 26);
	}

	cleAccess = alphabet[cleAccessNumber[0]] + alphabet[cleAccessNumber[1]]
			+ alphabet[cleAccessNumber[2]] + alphabet[cleAccessNumber[3]]
			+ alphabet[cleAccessNumber[4]] + alphabet[cleAccessNumber[5]];

	$('#texteAInserer').text(cleAccess);
	
	$
	
}

// Surveillance de l'évènement
$('#cleAccess').on('click', cleAccessFunction);