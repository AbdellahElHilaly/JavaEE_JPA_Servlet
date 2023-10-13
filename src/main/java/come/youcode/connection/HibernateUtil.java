package come.youcode.connection;


import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateServletContextListener {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Load configuration from hibernate.cfg.xml
                StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();

                // Create the MetadataSources for the SessionFactory
                MetadataSources metadataSources = new MetadataSources(serviceRegistry);
                // Build the SessionFactory

                sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
                if (sessionFactory != null) {
                    sessionFactory.close();
                }
            }
        }
        return sessionFactory;
    }


}
