package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface ZooRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
    List<T> findAllBy(long projectID,long crateId, String routine, Class clazz);
}
