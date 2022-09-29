package za.ac.cput.factory;

import za.ac.cput.domain.Upholstery;

public class UpholsteryFactory {

    public static Upholstery createUpholstery(String upholsteryId, String upholstItem, String upholstMaterial, String upholstColour){

        Upholstery upholstery = new Upholstery.Builder()
                .setUpholsteryId(upholsteryId)
                .setUpholstItem(upholstItem)
                .setUpholstMaterial(upholstMaterial)
                .setUpholstColour(upholstColour)
                .build();
        return upholstery;
    }
}
