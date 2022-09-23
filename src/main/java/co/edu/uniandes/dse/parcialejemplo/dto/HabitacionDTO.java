package co.edu.uniandes.dse.parcialejemplo.dto;

import lombok.Data;

@Data
public class HabitacionDTO {

    private Long id;
    private String num_identificacion;
    private Integer num_personas;
    private Integer num_camas;
    private Integer num_baños;

}
