package com.example.competences.services;

import com.example.competences.DAO.IEtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {
    @Autowired
    private IEtudiantRepository etudiantRepository;

}
