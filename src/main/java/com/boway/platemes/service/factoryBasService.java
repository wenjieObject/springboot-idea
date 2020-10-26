package com.boway.platemes.service;

import com.boway.platemes.entity.FactoryBas;
import com.boway.platemes.repository.factoryBasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class factoryBasService {

    @Autowired
    private factoryBasRepository factoryBasRepository;


    public String Test(){
        List<FactoryBas> all = factoryBasRepository.findAll();

        for (FactoryBas factoryBas:all
             ) {
            String s = factoryBas.toString();
            System.out.println(s);
        }
        return "0";
    }
}
