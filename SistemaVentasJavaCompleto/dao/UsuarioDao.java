package dao;

import java.util.List;
import dtos.UsuarioDto;
import singletonSqlConnection.SqlConnection;

public class UsuarioDao implements Dao<UsuarioDto> {
    private SqlConnection conn;

    public List<UsuarioDto> listarTodos() {
        return null;
    }

    public UsuarioDto buscar(UsuarioDto obj) {
        return null;
    }

    public boolean actualizar(UsuarioDto obj) {
        return false;
    }

    public boolean borrar(UsuarioDto obj) {
        return false;
    }
}
