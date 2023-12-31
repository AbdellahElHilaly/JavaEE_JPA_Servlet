package come.youcode.connection;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            try {
                entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-unit");
            } catch (Exception e) {
                e.printStackTrace();
                if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
                    entityManagerFactory.close();
                }
            }
        }
        return entityManagerFactory;
    }
}
