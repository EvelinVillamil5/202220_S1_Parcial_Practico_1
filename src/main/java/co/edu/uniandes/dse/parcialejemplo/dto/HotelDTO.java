package co.edu.uniandes.dse.parcialejemplo.dto;

import lombok.Data;

@Data
public class HotelDTO {
    
    private Long id;
    private String nombre;
    private String direccion;
    private Integer num_estrellas;

}
