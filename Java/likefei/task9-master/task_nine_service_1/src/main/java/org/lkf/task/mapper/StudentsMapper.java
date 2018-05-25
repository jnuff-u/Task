package org.lkf.task.mapper;

import java.util.List;

import org.lkf.task.pojo.Students;

public interface StudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Students record);

    Students selectByPrimaryKey(Integer id);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);

    List<Students> selectByEvaluate();

    Integer countByStatus(Integer status);

    Integer countByProfession(String profession);
}