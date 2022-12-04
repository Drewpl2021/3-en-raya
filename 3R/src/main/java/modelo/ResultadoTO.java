package modelo;

import lombok.Data;

@Data

public class ResultadoTO {
    
    public int id_resultado, punto;
    public String nombre_partida,nombre_jugador1, nombre_jugador2, ganador, estado;
    
}
