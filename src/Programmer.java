public class Programmer extends Person{
    private String companyName;

    public Programmer(String companyName,String name,String designation){
        super(name,designation);
        this.companyName=companyName;
    }
    public  void coding(){

    }
    String getCompanyName(){
        return  companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +super.toString()+
                "companyName='" + companyName + '\'' +
                '}';
    }
}
