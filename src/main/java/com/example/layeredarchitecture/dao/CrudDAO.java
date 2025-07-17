package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.util.ArrayList;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;
    public String generateNewId() throws SQLException, ClassNotFoundException;
    public T search(String newValue) throws SQLException, ClassNotFoundException;
}
