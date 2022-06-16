package tiagobarbosa.marathonjava.javacore.ZZJcrud.repository;


import lombok.extern.log4j.Log4j2;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.conn.ConnectionFactory;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.domain.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding Producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPrepareStatementFindByName(conn, name);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producers by ID '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPrepareStatementFindById(conn, id);
             ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(connection, id)) {
            ps.execute();
            log.info("Deleted producer with id '{}' from database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer with id '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producer '{}'", producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(connection, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer);
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(connection, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store.producer SET name = ? WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
