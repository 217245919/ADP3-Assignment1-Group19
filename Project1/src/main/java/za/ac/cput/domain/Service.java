package za.ac.cput.domain;

public class Service {

    private String serviceId;
    private String servicePkg;
    private String serviceDesc;

    private Service(Service.Builder builder) {
        this.serviceId = builder.serviceId;
        this.servicePkg = builder.servicePkg;
        this.serviceDesc = builder.serviceDesc;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServicePkg() {
        return servicePkg;
    }

    public void setServicePkg(String servicePkg) {
        this.servicePkg = servicePkg;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId='" + serviceId + '\'' +
                ", servicePkg='" + servicePkg + '\'' +
                ", serviceDesc='" + serviceDesc + '\'' +
                '}';
    }

    public static class Builder {

        private String serviceId;
        private String servicePkg;
        private String serviceDesc;

        public Service.Builder setServiceId(String serviceId){
            this.serviceId = serviceId;
            return this;
        }
        public Service.Builder setServicePkg(String servicePkg){
            this.servicePkg = servicePkg;
            return this;
        }
        public Service.Builder setServiceDesc(String serviceDesc){
            this.serviceDesc = serviceDesc;
            return this;
        }
        public Service.Builder copy(Service service){
            this.serviceId = service.serviceId;
            this.servicePkg = service.servicePkg;
            this.serviceDesc = service.serviceDesc;
            return this;
        }
        public Service build(){
            return new Service(this);
        }
    }

}
