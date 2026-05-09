package italo.pacman.controller.truque;

import italo.pacman.SistemaAplic;
import italo.pacman.nucleo.to.TruqueListener;

public class VidasTruqueController implements TruqueListener {

    private final SistemaAplic aplic;

    public VidasTruqueController(SistemaAplic aplic) {
        this.aplic = aplic;
    }
    
    @Override
    public void executa( char[] truque ) {                        
        String quantVidasStr = "";
        
        boolean ehNumero = true;
        for( int i = truque.length-1; ehNumero && i >= 0; i-- ) {       
            char ch = truque[ i ];
            if ( Character.isDigit( ch ) ) {
                quantVidasStr = ch + quantVidasStr;
            } else {
                ehNumero = false;
            }
        }        
                
        if ( !quantVidasStr.isEmpty() ) {        	                      
        	int vidas = Integer.parseInt( quantVidasStr );        
        	aplic.getJogo().setNVidas( vidas );
       
        }
    }
    
}
