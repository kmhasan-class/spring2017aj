package bd.ac.seu.hibernatefx;

import bd.ac.seu.hibernatefx.model.Phone;
import bd.ac.seu.hibernatefx.model.Student;
import bd.ac.seu.hibernatefx.util.HibernateUtil;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.collections.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FXMLController implements Initializable {

    @FXML
    private ListView<Student> listView;
    private ObservableList<Student> studentsList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentsList = FXCollections.observableArrayList();
        listView.setItems(studentsList);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        studentsList.addAll(session.createCriteria(Student.class).list());
        session.close();
        /*
        session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transaction = session.beginTransaction();
        Phone p1 = new Phone(880, 2, "23454");
        Phone p2 = new Phone(880, 2, "34456");
        session.save(p1);
        session.save(p2);
        transaction.commit();
        session.close();
        */
    }    
}
