package br.com.jairo.core;

public class Propriedades {	
	
	//Para n�o fechar o browser a cada teste usar "false"
	public static boolean FECHAR_BROWSER = false;	
	
	//Por padr�o o chrome.
	public static Browsers browser = Browsers.CHROME;	
	public enum Browsers{
		CHROME,
		FIREFOX, 
		IE,
	}

}
