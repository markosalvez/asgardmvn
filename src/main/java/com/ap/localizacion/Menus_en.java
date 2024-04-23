package com.ap.localizacion;

import java.util.*;

/**
 * Clase que contiene la localización al inglés del juego
 * 
 * @author Sergio
 * @version 1.0, 6 Jun 2014
 */
public class Menus_en extends ListResourceBundle
{
    @Override
    public Object[][] getContents()
    {
       return contenido;
    }

    private final Object[][] contenido = {   
       
       //OBJETOS
        { "libreria1", "All these books are about fishing."},
        { "libreria2", "\"Make your own rigging\" hmmm I'm not sure about this......"},
        { "libreria3", "\"Me, my yatch and you, filthy people\", by Pérez Reverte. I'll read this, someday."},
        { "libreria4", "\"Do you stink as a fish? Remove it!\". I shouldn't touch this book."},
        { "libreria5", "\"Funny pics of accidents with fish-hooks\". This seems to be... to be... OMG plz no!"},
        { "libreria6", "\"setup & setup\" .It seems a technical book. Oh wait, I'm reading it in the wrong way..."},
        
        // ... (rest of the content remains unchanged)
    };
}
