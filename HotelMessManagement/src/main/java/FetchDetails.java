import com.xworks.hotel.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class FetchDetails {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em= null;
        try{
           emf=Persistence.createEntityManagerFactory("something");
           em=emf.createEntityManager();
           HotelEntity hotelEntity =em.find(HotelEntity.class,1);
            System.out.println(hotelEntity);
        }catch (PersistenceException e){
            e.printStackTrace();
        }
        finally {
            emf.close();
            em.close();
        }
        }

}
