package org.example.model.dao;

import org.example.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department department);

    void update(Department department);

    void deleteById(int id);

    Department findById(int id);

    List<Department> findAll();
}
