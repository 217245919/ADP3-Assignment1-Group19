package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Upholstery;

public class UpholsteryFactoryTest {

    @Test
    void createUpholstery(){
        Upholstery upholstery = UpholsteryFactory.createUpholstery("2468", "seats", "leather", "brown");
        System.out.println(upholstery);
    }
}
