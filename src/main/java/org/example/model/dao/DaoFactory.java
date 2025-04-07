package org.example.model.dao;

import db.DB;
import org.example.model.dao.impl.DepartmentDaoJDBC;
import org.example.model.dao.impl.SellerDaoJDBC;

import java.sql.SQLException;


public class DaoFactory {

    public static SellerDao createSellerDao()  {
        try {
            return new SellerDaoJDBC(DB.getConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static DepartmentDao createDepartmentDao(){
//        return new DepartmentDaoJDBC();
//    }

}
