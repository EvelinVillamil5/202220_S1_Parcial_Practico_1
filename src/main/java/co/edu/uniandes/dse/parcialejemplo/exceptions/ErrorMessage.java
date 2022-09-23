package co.edu.uniandes.dse.parcialejemplo.exceptions;

public class ErrorMessage {

    // Mensajes de Error, cuando no se encuentra el objeto con ese ID

    public static final String HOTEL_NOT_FOUND = "El hotel con el id dado no fue encontrado";
    public static final String HABITACION_NOT_FOUND = "La habitación con el id dado no fue encontrada";
    
    private ErrorMessage() {
        throw new IllegalStateException("Utility class");
    }
    
}
