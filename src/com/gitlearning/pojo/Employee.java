package com.gitlearning.pojo;

public class Employee {
    private String eid;
    private String ename;
    private String ecity;
    private float esal;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcity() {
        return ecity;
    }

    public void setEcity(String ecity) {
        this.ecity = ecity;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }
    public void setEmpDetails()
    {
        setEid("E-111");
        setEname("Mathew");
        setEcity("Colarado");
        setEsal(43900);
    }
    public void getEmpDetails()
    {
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Eid="+eid);
        System.out.println("Ename="+ename);
        System.out.println("Ecity="+ecity);
        System.out.println("Esal="+esal);
    }
    public static void main(String []args)
    {
        Employee emp1=new Employee();
        emp1.setEmpDetails();
        emp1.getEmpDetails();
    }
public static void main(String [] args)
{
    Employee emp1=new Employee();
    emp1.setEmpDetails();
    emp1.getEmpDetails();
}

}
