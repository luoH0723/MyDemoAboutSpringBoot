package com.lhstudy.dao;

import com.lhstudy.pojo.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp find(String id);

    void update(Emp emp);
}
