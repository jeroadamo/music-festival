package solvd.sqlmimic.service;

import solvd.sqlmimic.doing.ConcertsDao;
import solvd.sqlmimic.entities.Concert;

import java.sql.SQLException;

public class ConcertDaoService{
    private final ConcertsDao concertsDao = new ConcertsDao();

    public Concert methodCall(){
        try {
            return this.concertsDao.getById(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
    //public void

}