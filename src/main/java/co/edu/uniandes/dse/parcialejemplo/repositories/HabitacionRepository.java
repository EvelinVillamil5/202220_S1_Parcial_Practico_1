package co.edu.uniandes.dse.parcialejemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;

import java.util.List;

@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionEntity, Long>{

    List<HabitacionEntity> findByNombre(String nombre);

}
