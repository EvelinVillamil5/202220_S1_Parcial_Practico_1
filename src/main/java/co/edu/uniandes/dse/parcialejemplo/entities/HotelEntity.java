package co.edu.uniandes.dse.parcialejemplo.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

/**
 * Clase que representa un hotel en la persistencia
 * 
 * @hotel Evelin Villamil
 */

@Getter
@Setter
@Entity
public class HotelEntity {

    // Relación con habitación
    @PodamExclude
    @OneToMany
    private List<HabitacionEntity> habitaciones = new ArrayList<>();

    private String nombre;
    private String direccion;
    private Integer num_estrellas;
    
    @Override
    public boolean equals(Object o){
        return super.equals(o);
    }

    @Override
    public int hashCode(){
        return  super.hashCode();
    }

}
