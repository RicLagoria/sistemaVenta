package dtos;

import java.util.*;
import java.util.Date;
public class MedioPagoDto {
    private String nombre;
    private List<DescuentoRecargoDto> descuentoRecargo;
    private boolean habilitado;
    private Date fechaHabilitadoDesde;
    private Date fechaHabilitadoHasta;
}