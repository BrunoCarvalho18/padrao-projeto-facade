package br.com.dominio.principal;

import br.com.dominio.pc.facade.ComputadorFacade;

public class Principal {
	
	public static void main(String[] args) {
		ComputadorFacade facade = new ComputadorFacade();
		facade.montarPC();
	}

}
