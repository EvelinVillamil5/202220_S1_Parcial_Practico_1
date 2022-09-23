package co.edu.uniandes.dse.parcialejemplo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class HabitacionDetailDTO extends HabitacionDTO{

    private List<HotelDTO> hoteles = new ArrayList<>();
    
}
