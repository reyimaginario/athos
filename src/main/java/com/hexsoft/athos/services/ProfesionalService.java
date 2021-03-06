package com.hexsoft.athos.services;

import com.hexsoft.athos.dtos.ProfesionalDTO;
import com.hexsoft.athos.dtos.SujetoDTO;
import com.hexsoft.athos.entities.ProfesionalDAO;
import com.hexsoft.athos.exceptions.NoExisteElProfesionalException;
import com.hexsoft.athos.repositories.IProfesionalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesionalService {

    @Autowired
    private IProfesionalRepo profesionalRepo;

    @Autowired
    private SujetoService sujetoService;


    public ProfesionalDTO guardarProfesional(ProfesionalDTO profesionalDTO) {
        ProfesionalDAO profesionalDAO = profesionalDTO.toDAO();
        return new ProfesionalDTO(profesionalRepo.save(profesionalDAO));
    }

    public ProfesionalDAO guardarProfesional(ProfesionalDAO profesionalDAO) {
        return profesionalRepo.save(profesionalDAO);
    }

    public ProfesionalDTO obtenerProfesional(String dni) throws NoExisteElProfesionalException {
        return new ProfesionalDTO(obtenerProfesionalDAO(dni));
    }

    public ProfesionalDAO obtenerProfesionalDAO(String dni) throws NoExisteElProfesionalException {
        ProfesionalDAO profesionalDAO = null;
        Optional<ProfesionalDAO> profesionalOptional = profesionalRepo.findById(dni);
        if (profesionalOptional.isPresent()){
            profesionalDAO = profesionalOptional.get();
        }
        else {
            throw new NoExisteElProfesionalException("El profesional no existe en la base de datos");
        }
        return profesionalDAO;
    }


    public List<ProfesionalDTO> obtenerTodosLosProfesionales() {
        List<ProfesionalDAO> listaProfesionalesDAO = profesionalRepo.findAll();
        List<ProfesionalDTO> listaProfesionalesDTO = new ArrayList<>();
        for (ProfesionalDAO profesionalDAO : listaProfesionalesDAO) {
            ProfesionalDTO profesionalDTO = new ProfesionalDTO(profesionalDAO);
            listaProfesionalesDTO.add(profesionalDTO);
        }
        return listaProfesionalesDTO;
    }

    public List<SujetoDTO> listarSujetosPorProfesional(String dni) throws NoExisteElProfesionalException {
        ProfesionalDTO profesionalDTO = obtenerProfesional(dni);
        return profesionalDTO.getListaSujetosDTO();
    }
}
