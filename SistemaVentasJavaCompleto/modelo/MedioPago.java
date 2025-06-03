package modelo;

import java.util.*;
import java.util.Date;

public class MedioPago {
    private String nombre;
    private List<DescuentoRecargo> descuentoRecargo;
    private boolean habilitado;
    private Date fechaHabilitadoDesde;
    private Date fechaHabilitadoHasta;

    public boolean checkFechaFin() { return false; }
    public void deshabilitar() {}
    public void habilitar() {}
    public void checkFechaInicio() {}
}