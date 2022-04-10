package za.ac.cput.factory;

/* ServiceFactory.java
 Entity for the ServiceFactory
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import za.ac.cput.domain.Service;

public class ServiceFactory {

    public static Service createService(String serviceId, String servicePkg, String serviceDesc) {

        Service service = new Service.Builder()
                .setServiceId(serviceId)
                .setServicePkg(servicePkg)
                .setServiceDesc(serviceDesc)
                .build();
        return service;
    }
}
