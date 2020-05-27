package model;

public class SalesDepartmentServ {
    private SalesDepartmentServ(){
    }
    private static SalesDepartmentServ salesDepartmentServ=new SalesDepartmentServ();
    public static SalesDepartmentServ getInstance(){
        return salesDepartmentServ;
    }

    public void save(SalesDepartmentEnti sell) throws Exception{
        try (SalesDepartmentRepo salesDepartmentRepo=new SalesDepartmentRepo()){
            salesDepartmentRepo.insert(sell);
            salesDepartmentRepo.commit();
        }
    }
    public void report(SalesDepartmentEnti sell) throws Exception{
        try (SalesDepartmentRepo salesDepartmentRepo=new SalesDepartmentRepo()){
            salesDepartmentRepo.select(sell);
        }
    }
}
