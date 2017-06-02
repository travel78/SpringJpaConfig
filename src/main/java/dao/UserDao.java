package dao;


import entity.User;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


@Data
public class UserDao {
    private EntityManagerFactory factory;

    public void save(User user){
        EntityManager entityManager= factory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }


}
