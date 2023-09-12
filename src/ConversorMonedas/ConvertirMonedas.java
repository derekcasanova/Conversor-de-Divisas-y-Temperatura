package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirColonesDolares(double valor) {
		double monedaDolar = valor / 535.93;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaDolar + "Dolares");
		
	}
	
	public void ConvertirColonesEuros(double valor) {
		double monedaEuro = valor / 575.92;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaEuro + "Euros");
		
	}
	
	public void ConvertirColonesLibras(double valor) {
		double monedaLibras = valor / 670.67 ;
		monedaLibras = (double)Math.round(monedaLibras * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaLibras + "Libras Esterlinas");
		
	}
	
	public void ConvertirColonesFrancoSuizo(double valor) {
		double monedaFrancoSuizo = valor / 601.32;
		monedaFrancoSuizo = (double)Math.round(monedaFrancoSuizo * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaFrancoSuizo + "Francos Suizos");
		
	}
	
	public void ConvertirColonesYen(double valor) {
		double monedaYen = valor / 3.65;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaYen + "Yenes");
		
	}
	
	public void ConvertirColonesWon(double valor) {
		double monedaWon = valor / 0.40;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Colones" + monedaWon + "Wones");
		
	}
		
	
	//CONVERSION INVERSA
	
	
	public void ConvertirDolaresColones(double valor) {
		double monedaDolar = valor * 535.93;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + "Colones");
		
	}
	
	
	public void ConvertirEurosColones(double valor) {
		double monedaEuro = valor * 575.92;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros" + monedaEuro + "Colones");
	}
	
	
	public void ConvertirLibrasColones(double valor) {
		double monedaLibras = valor * 670.67;
		monedaLibras = (double)Math.round(monedaLibras * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas" + monedaLibras + "Colones");
	}
	
	
	public void ConvertirFrancoSuizoColones(double valor) {
		double monedaFrancoSuizo = valor * 601.32;
		monedaFrancoSuizo = (double)Math.round(monedaFrancoSuizo * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Franco Suizo" + monedaFrancoSuizo + "Colones");
	}
	
	
	public void ConvertirYenColones(double valor) {
		double monedaYen = valor * 3.65;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yenes" + monedaYen + "Colones");
	}
	
	
	public void ConvertirWonColones(double valor) {
		double monedaWon = valor * 0.40;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Wones" + monedaWon + "Colones");
	}
	
	

}
