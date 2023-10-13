package come.youcode.servlet;

import come.youcode.connection.HibernateUtil;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.hibernate.SessionFactory;

import java.io.PrintWriter;

@WebServlet(
        name = "MainServlet",
        urlPatterns = {"/MainServlet"},
        initParams = {
                @WebInitParam(name = "paramName", value = "paramValue")
        },
        loadOnStartup = 1
)
public class MainServlet extends HttpServlet {

    private EntityManagerFactory sessionFactory;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize Hibernate session factory
        sessionFactory = HibernateUtil.getEntityManagerFactory();
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Session factory is created in init: " + sessionFactory);
    }


}
