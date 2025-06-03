package dao;

import java.util.List;
import dtos.ClienteDto;
import singletonSqlConnection.SqlConnection;

public class ClienteDao implements Dao<ClienteDto> {
    private SqlConnection conn;

    public List<ClienteDto> listarTodos() {
        return null;
    }

    public ClienteDto buscar(ClienteDto obj) {
        return null;
    }

    public boolean actualizar(ClienteDto obj) {
        return false;
    }

    public boolean borrar(ClienteDto obj) {
        return false;
    }
}
