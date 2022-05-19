package br.com.juliano.application;

import br.com.juliano.domain.Televisao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tv 14
		Televisao tv14 = new Televisao();
		tv14.setTamanhoTela(14);
		tv14.setMarca("Panasonic");
		tv14.setModelo("XYX Led");
		tv14.setVoltagem(110);
		
		
		Integer tamanhoTela = tv14.getTamanhoTela();
		
		System.out.println("Tamanho da tela: "+tamanhoTela);
		System.out.println("Voltagem: "+tv14.getVoltagem());
		System.out.println(tv14);
		
		//Tv 32
//		Televisao tv32 = new Televisao();
//		tv32.setMarca("Sony");
//		

		
	
		

	}

}
