/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Store;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anfeg
 */
public class StoreDAO {

    private Connection connection;

    public StoreDAO(String database) throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection(database);
    }

    public Boolean createStore(Store store) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into store(dato) values (?)");
        preparedStatement.setString(1, store.getDato());
        preparedStatement.executeUpdate();
        return true;
    }

    public Store readStore(String dato) throws SQLException, URISyntaxException {
        Store store = null;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from store where dato='" +dato+"'");
        while (rs.next()) {
            store=new Store();
            store.setStore_id(rs.getInt("store_id"));
            store.setStore_id(rs.getInt("dato"));
        }
        return store;
    }

    public Boolean updateStore(Store store) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update store set dato=? where store_id=?");
        preparedStatement.setString(1, store.getDato());
        preparedStatement.setInt(2, store.getStore_id());
        preparedStatement.executeUpdate();
        return true;
    }

    public Boolean deleteStore(int store_id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update store set dato=? where store_id='" +store_id+"'");
        preparedStatement.executeUpdate();
        return true;
    }

    
}
