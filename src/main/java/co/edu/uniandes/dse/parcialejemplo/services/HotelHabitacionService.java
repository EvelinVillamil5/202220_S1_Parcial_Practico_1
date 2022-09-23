package co.edu.uniandes.dse.parcialejemplo.services;

import co.edu.uniandes.dse.parcialejemplo.entities.HotelEntity;
import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;
import co.edu.uniandes.dse.parcialejemplo.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.parcialejemplo.exceptions.ErrorMessage;
import co.edu.uniandes.dse.parcialejemplo.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialejemplo.repositories.HotelRepository;
import co.edu.uniandes.dse.parcialejemplo.repositories.HabitacionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class HotelHabitacionService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Transactional
    public HabitacionEntity addHabitacion(Long hotelId, Long habitacionId) throws EntityNotFoundException {
        log.info("Inicia el proceso de agregar una habitacion a un hotel con id = {}", hotelId);

        Optional<HotelEntity> hotelEntity = hotelRepository.findById(hotelId);
        if (hotelEntity.isEmpty())
            throw new EntityNotFoundException(ErrorMessage.HOTEL_NOT_FOUND);

        Optional<HabitacionEntity> habitacionEntity = habitacionRepository.findById(habitacionId);
        if (habitacionEntity.isEmpty())
            throw new EntityNotFoundException(ErrorMessage.HABITACION_NOT_FOUND);

        habitacionEntity.get().setHotel(hotelEntity.get());
        log.info("Termina el proceso de agregar una habitacion a un hotel con id = {}", hotelId);
        return habitacionEntity.get();
    }
}
