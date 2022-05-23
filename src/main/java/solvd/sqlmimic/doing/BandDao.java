package solvd.sqlmimic.doing;

import solvd.sqlmimic.entities.Band;
import solvd.sqlmimic.interfaces.IBandDao;

import javax.sound.midi.MidiChannel;
import java.sql.*;
import java.util.List;

public class BandDao implements IBandDao {
    @Override
    public Band getById(int idBands) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://52.59.193.212:3306/jeronimo_adamo", "root", "devintern");
        try (PreparedStatement ps = connection.prepareStatement("select * from Concerts where idBands = ?")) {
            ps.setInt(1, 2);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            return new Band(resultSet.getInt("idBands"), resultSet.getInt("idConcerts"), resultSet.getString("name"));
        }
    }
    @Override
    public void save(Band band) throws SQLException {
    }
    @Override
    public void update(Band band, String[] params) {
    }
    @Override
    public void delete(Band band) throws SQLException {
    }
    @Override
    public List<Band> selectAll() throws SQLException {
        return null;
    }
}
