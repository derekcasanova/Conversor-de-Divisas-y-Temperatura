package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionMonedas {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Selecciona al tipo de moneda que desea hacer la conversion",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Colones a Dólar", "De Colones a Euro", "De Colones a Libras Esterlinas","De Colones a Franco Suizo", "De Colones a Yen Japonés", "De Colones a Won sub-coreano", "De Dólar a Colones", "De Euro a Colones", "De Libras Esterlinas a Colones","De Franco Suizo a Colones", "De Yen Japonés a Colones", "De Won Surcoreano a Colones"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Colones a Dólar": 
		monedas.ConvertirColonesDolares(valor);
		break;
	
	case "De Colones a Euro": 
		monedas.ConvertirColonesEuros(valor);
		break;
		
	case "De Colones a Libras Esterlinas":
		monedas.ConvertirColonesLibras(valor);
		break;
		
	case "De Colones a Francos Suizos":
		monedas.ConvertirColonesFrancoSuizo(valor);
		break;
			
		
	case "De Colones a Yen Japonés":
		monedas.ConvertirColonesYen(valor);
		break;
		
	case "De Colones a Won sub-coreano":
		monedas.ConvertirColonesWon(valor);
		break;
	
	case "De Dólar a Colones":
		monedas.ConvertirDolaresColones(valor);
		break;
		
	case "De Euro a Colones":
		monedas.ConvertirEurosColones(valor);
		break;
		
	case "De Libras Esterlinas a Colones":
		monedas.ConvertirLibrasColones(valor);
		break;
		
	case "De Francos Suizos a Colones":
		monedas.ConvertirFrancoSuizoColones(valor);
		break;
		
		
	 
	case "De Yen Japonés a Colones":
		monedas.ConvertirYenColones(valor);
		break;
		
	case "De Won sub-coreano a Colones":
		monedas.ConvertirWonColones(valor);
		break;
	}
	}

}