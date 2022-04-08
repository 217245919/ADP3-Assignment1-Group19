package za.ac.cput.domain;

public class Administrator {

    private String adminId;
    private String adminFname;
    private String adminSname;

    private Administrator(Builder builder) {
        this.adminId = builder.adminId;
        this.adminFname = builder.adminFname;
        this.adminSname = builder.adminSname;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminFname() {
        return adminFname;
    }

    public void setAdminFname(String adminFname) {
        this.adminFname = adminFname;
    }

    public String getAdminSname() {
        return adminSname;
    }

    public void setAdminSname(String adminSname) {
        this.adminSname = adminSname;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminId='" + adminId + '\'' +
                ", adminFname='" + adminFname + '\'' +
                ", adminSname='" + adminSname + '\'' +
                '}';
    }

    public static class Builder {

        private String adminId;
        private String adminFname;
        private String adminSname;

        public Administrator.Builder setAdminId(String adminId){
            this.adminId = adminId;
            return this;
        }
        public Administrator.Builder setAdminFName(String adminFname){
            this.adminFname = adminFname;
            return this;
        }
        public Administrator.Builder setAdminSName(String adminSname){
            this.adminSname = adminSname;
            return this;
        }
        public Administrator.Builder copy(Administrator administrator){
            this.adminId = administrator.adminId;
            this.adminFname = administrator.adminFname;
            this.adminSname = administrator.adminSname;
            return this;
        }
        public Administrator build(){
            return new Administrator(this);
        }
    }

}
