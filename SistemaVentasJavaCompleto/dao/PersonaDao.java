package dao;

import java.util.List;
import dtos.PersonaDto;
import singletonSqlConnection.SqlConnection;

public class PersonaDao implements Dao<PersonaDto> {
    private SqlConnection conn;

    public List<PersonaDto> listarTodos() {
        return null;
    }

    public PersonaDto buscar(PersonaDto obj) {
        return null;
    }

    public boolean actualizar(PersonaDto obj) {
        return false;
    }

    public boolean borrar(PersonaDto obj) {
        return false;
    }
}
