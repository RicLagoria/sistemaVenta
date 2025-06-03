package dao;

import java.util.List;
import dtos.MedioPagoDto;
import singletonSqlConnection.SqlConnection;

public class MedioPagoDao implements Dao<MedioPagoDto> {
    private SqlConnection conn;

    public List<MedioPagoDto> listarTodos() {
        return null;
    }

    public MedioPagoDto buscar(MedioPagoDto obj) {
        return null;
    }

    public boolean actualizar(MedioPagoDto obj) {
        return false;
    }

    public boolean borrar(MedioPagoDto obj) {
        return false;
    }
}
