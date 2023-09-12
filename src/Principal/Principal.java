package Principal;

import javax.swing.*;
 import ConversorMonedas.*;
import	ConversorTemperatura.*;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesDeConversionMonedas conversion = new OpcionesDeConversionMonedas();
		OpcionesDeConversionTemperatura conversionT = new OpcionesDeConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversion que desea realizar", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar mas Conversiónes?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el digito a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar mas Conversiónes?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
		}
		break;
	}
	
}
	
}
