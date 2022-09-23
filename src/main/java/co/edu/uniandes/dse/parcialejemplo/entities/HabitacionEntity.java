package co.edu.uniandes.dse.parcialejemplo.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

/**
 * Clase que representa una habitacion en la persistencia
 * 
 * @habitacion Evelin Villamil
 */

@Getter
@Setter
@Entity
public class HabitacionEntity {

    // Relación con hotel
    @PodamExclude
    @OneToOne
    private List<HotelEntity> hoteles = new ArrayList<>();

    private String num_identificacion;
    private Integer num_personas;
    private Integer num_camas;
    private Integer num_baños;
    
    @Override
    public boolean equals(Object o){
        return super.equals(o);
    }

    @Override
    public int hashCode(){
        return  super.hashCode();
    }

}
