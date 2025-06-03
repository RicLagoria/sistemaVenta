package dao;

import java.util.List;
import dtos.DetalleVentaDto;
import singletonSqlConnection.SqlConnection;

public class DetalleVentaDao implements Dao<DetalleVentaDto> {
    private SqlConnection conn;

    public List<DetalleVentaDto> listarTodos() {
        return null;
    }

    public DetalleVentaDto buscar(DetalleVentaDto obj) {
        return null;
    }

    public boolean actualizar(DetalleVentaDto obj) {
        return false;
    }

    public boolean borrar(DetalleVentaDto obj) {
        return false;
    }
}
