package co.edu.uniandes.dse.parcialejemplo.services;

import co.edu.uniandes.dse.parcialejemplo.entities.HotelEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.EntityNotFoundException;
//import co.edu.uniandes.dse.parcialejemplo.exceptions.ErrorMessage;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    /**
     * Crea un nuevo hotel
     *
     * @param  hotel  la entidad del hotel que se va a crear
     * @return La entidad del hotel creada
     * @throws IllegalOperationException Si el hotel ya existe
     */

    @Transactional
    public HotelEntity createHotel(HotelEntity hotel) throws IllegalOperationException{
        log.info("Iniciando el proceso de crear un hotel");
        if (!hotelRepository.findByNombre(hotel.getNombre()).isEmpty()){
            throw new IllegalOperationException("El nombre del hotel ya existe");
        }
        log.info("Terminando el proceso de crear un hotel");
        return hotelRepository.save(hotel);
    }
    
}
