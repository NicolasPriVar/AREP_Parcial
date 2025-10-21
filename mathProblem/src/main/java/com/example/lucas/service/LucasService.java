package com.example.lucas.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LucasService {
    public List<Integer> getSecuencia(int value){
        List<Integer> secuencia = new ArrayList<>();
        if (value<0){
            throw new RuntimeException("El número no puede ser menor a 0");
        }
        secuencia.add(2);
        if (value==0){
            return secuencia;
        }
        secuencia.add(1);
        if(value==1){
            return secuencia;
        }

        for(int i = 2; i < value; i++) {
            int siguiente = secuencia.get(i-1) + secuencia.get(i-2);
            secuencia.add(siguiente);
        }
        return secuencia;
    }
}
