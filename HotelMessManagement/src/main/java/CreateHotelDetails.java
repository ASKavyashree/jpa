import com.xworks.hotel.entity.HotelEntity;

import javax.persistence.*;

public class CreateHotelDetails {
    public static void main(String[] args) {
        HotelEntity hotelEntity= new HotelEntity();
        hotelEntity.setName("A2B");
        hotelEntity.setOwnerName("Arun");
        hotelEntity.setMobileNumber(1234567897);
        hotelEntity.setAddress("BTM");

        EntityManagerFactory emf=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            emf = Persistence.createEntityManagerFactory("something");
            em = emf.createEntityManager();
            et = em.getTransaction();//DML,DQL
            et.begin();//set autocommit
            em.persist(hotelEntity);
            System.out.println("data Saved");
            et.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
            if(et!=null) {
                et.rollback();
            }
        }
        finally {
            emf.close();
            em.close();
        }

    }
}
