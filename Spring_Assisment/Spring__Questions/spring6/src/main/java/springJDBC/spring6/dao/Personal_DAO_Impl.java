package springJDBC.spring6.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class Personal_DAO_Impl implements Personal_DAO {

    private final JdbcTemplate jdbcTemplate;

   
    public Personal_DAO_Impl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    private final RowMapper<Personal> rowMapper = (rs, rowNum) -> new Personal(
        rs.getInt("id"),
        rs.getInt("age"),
        rs.getString("firstName"),
        rs.getString("lastName")
    );

    @Override
    public void insert(Personal person) {
        String sql = "INSERT INTO person (id, age, firstName, lastName) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, person.getId(), person.getAge(), person.getFirstName(), person.getLastName());
    }

    @Override
    public Personal get(int id) {
        String sql = "SELECT * FROM person WHERE id = ?";
        List<Personal> results = jdbcTemplate.query(sql, rowMapper, id);
        return results.isEmpty() ? null : results.get(0);
    }

    @Override
    public List<Personal> list() {
        String sql = "SELECT * FROM person";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void update(Personal person) {
        String sql = "UPDATE person SET age = ?, firstName = ?, lastName = ? WHERE id = ?";
        jdbcTemplate.update(sql, person.getAge(), person.getFirstName(), person.getLastName(), person.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM person WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
