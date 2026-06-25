import com.xworks.hotel.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class DeleteDetails {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em=null;

        try{
            emf=Persistence.createEntityManagerFactory("something");
            em=emf.createEntityManager();
            em.getTransaction().begin();
            HotelEntity  hotelEntity=em.find(HotelEntity.class,1);
            if(hotelEntity!=null){
                em.remove(hotelEntity);
            }
            em.getTransaction().commit();
        }catch(PersistenceException e){
            e.printStackTrace();
        }

    }
}
