package italo.pacman.nucleo.logica;

import italo.pacman.nucleo.to.Fase;
import italo.pacman.nucleo.to.Personagem;

public class FaseManager {
   	
	public boolean isDesabilitarDirecao( Personagem personagem, Fase fase ) {
		int cw = fase.getCelulaLargura();
		int ch = fase.getCelulaAltura();
		
		int[][] paredes = fase.getParedes();	
        
        int quantCelH = paredes[0].length;
        int quantCelV = paredes.length;
		
		int x = personagem.getX();
		int y = personagem.getY();
		
		return x - (cw/2) < cw ||
				y - (ch/2) < ch ||
				x + (cw/2) > ( (quantCelH-1) * cw ) ||
				y + (ch/2) > ( (quantCelV-1) * ch );
				
	}
	
    public boolean isPosicaoCelula( Personagem personagem, Fase fase ) {
        boolean ehPosH = this.isPosicaoHorizontal( personagem, fase );
        boolean ehPosV = this.isPosicaoVertical( personagem, fase );        
        return ( ehPosH && ehPosV );
    }
    
    public boolean isPosicaoHorizontal( Personagem personagem, Fase fase ) {
        int cw = fase.getCelulaLargura();        
        int x = personagem.getX() - (cw/2);        
        return ( x % cw == 0 );
    }
    
    public boolean isPosicaoVertical( Personagem personagem, Fase fase ) {
        int ch = fase.getCelulaAltura();        
        int y = personagem.getY() - (ch/2);        
        return ( y % ch == 0 );
    }
    
}
