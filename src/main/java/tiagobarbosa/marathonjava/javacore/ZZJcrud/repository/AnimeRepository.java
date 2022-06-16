package tiagobarbosa.marathonjava.javacore.ZZJcrud.repository;


import lombok.extern.log4j.Log4j2;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.conn.ConnectionFactory;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.domain.Anime;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Animes by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPrepareStatementFindByName(conn, name);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("producer_name"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return animes;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Animes by ID '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPrepareStatementFindById(conn, id);
             ResultSet rs = stmt.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();
            Anime anime = Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                    SELECT
                           a.id,
                           a.name,
                           a.episodes,
                           a.producer_id,
                           p.name as producer_name
                      FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON p.id = a.producer_id
                     WHERE a.id = ?;
                    """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                    SELECT
                           a.id,
                           a.name,
                           a.episodes,
                           a.producer_id,
                           p.name as producer_name
                      FROM anime_store.anime a
                INNER JOIN anime_store.producer p ON p.id = a.producer_id
                     WHERE a.name like ?;
                    """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(connection, id)) {
            ps.execute();
            log.info("Deleted anime with id '{}' from database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime with id '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.anime WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Anime '{}'", anime.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(connection, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = """
                INSERT INTO anime_store.anime (name, episodes, producer_id)
                     VALUES (?, ? ,?);
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating anime '{}'", anime);
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(connection, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = """
                UPDATE anime_store.anime
                   SET name = ?,
                       episodes = ?
                 WHERE id = ?
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
