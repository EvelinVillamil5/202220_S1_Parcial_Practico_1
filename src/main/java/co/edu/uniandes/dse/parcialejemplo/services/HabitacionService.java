package co.edu.uniandes.dse.parcialejemplo.services;

import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.EntityNotFoundException;
//import co.edu.uniandes.dse.parcialejemplo.exceptions.ErrorMessage;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HabitacionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class HabitacionService {

    @Autowired
    HabitacionRepository habitacionRepository;

    /**
     * Crea una nueva habitacion
     *
     * @param  habitacion  la entidad de la habitacion que se va a crear
     * @return La entidad de la habitacion creada
     * @throws IllegalOperationException Si la habitacion ya existe
     */

    @Transactional
    public HabitacionEntity createHotel(HabitacionEntity habitacion) throws IllegalOperationException{
        log.info("Iniciando el proceso de crear una habitacion");
        if (!habitacionRepository.findById(habitacion.getId()).isEmpty()){
            throw new IllegalOperationException("La identificacion de la habitacion ya existe");
        }
        if (habitacionRepository.finByBaños(habitacion.getBaño()) <= habitacionRepository.finByCamas(habitacion.getCama())){
            log.info("Terminando el proceso de crear una habitacion");
            return habitacionRepository.save(habitacion);
        }
    }
    
}
