package dtos;

import java.util.*;
import java.util.Date;
public class VentaDto {
    private EmpleadoDto vendedor;
    private Date fecha;
    private String estado;
    private float montoPagado;
    private MedioPagoDto medioPago;
    private ClienteDto cliente;
    private List<DetalleVentaDto> detalleVenta;
}