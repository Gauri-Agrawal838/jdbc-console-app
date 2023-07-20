package org.example;

public class Product {
    private int pid;
    private String pname;
    private String pdesc;
    private String pemail;

    public Product(int pid, String pname, String pdesc, String pemail) {
        this.pid = pid;
        this.pname = pname;
        this.pdesc = pdesc;
        this.pemail = pemail;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", pemail='" + pemail + '\'' +
                '}';
    }
}



