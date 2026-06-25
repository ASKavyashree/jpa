import com.xworks.hotel.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class UpdateDetails {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em= null;
        try{
            emf=Persistence.createEntityManagerFactory("something");
           em= emf.createEntityManager();
           em.getTransaction().begin();
           HotelEntity hotelEntity= em.find(HotelEntity.class,1);
           if(hotelEntity!= null){
               hotelEntity.setName("Nandana");
               hotelEntity.setOwnerName("Anand");
               HotelEntity UpdateHotelEntity=em.merge(hotelEntity);
               System.out.println(UpdateHotelEntity);
               em.getTransaction().commit();
           }
        }catch(PersistenceException e){
            e.printStackTrace();
        }finally
        {
            if(emf!=null){
                emf.close();
            }
            if(em!=null){
                em.close();
            }
        }

    }
}
