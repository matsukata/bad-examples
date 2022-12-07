package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.io.Serializable;
import java.util.List;

public class ZooRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T,ID> implements ZooRepository<T,ID> {
   private final EntityManager entityManager;

   public ZooRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
       super(entityInformation, entityManager);
       this.entityManager = entityManager;
   }

   public List<T> findAllBy(long projectId, long cageId, String routine, Class clazz){
       Query query = entityManager.createQuery(routine, clazz);
       query.setParameter(1, projectId);
       query.setParameter(2, cageId);

       return query.getResultList();
   }
}