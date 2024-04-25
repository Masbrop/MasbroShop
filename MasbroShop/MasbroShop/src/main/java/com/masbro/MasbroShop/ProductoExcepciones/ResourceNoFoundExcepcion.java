package com.masbro.MasbroShop.ProductoExcepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoFoundExcepcion extends RuntimeException{

    private static final long serialVersionID = 1L;

    public ResourceNoFoundExcepcion(String mensaje){
        super(mensaje);
    }
}
