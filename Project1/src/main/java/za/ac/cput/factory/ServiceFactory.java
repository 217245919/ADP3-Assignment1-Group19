package za.ac.cput.factory;

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
