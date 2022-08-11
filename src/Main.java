public class Main {
    public static void main(String[] args) {
        Person person=new Person("Baktygul","Adam");
        Singer singer=new Singer("Aman","baku","Yrdait");
        Dancer dancer=new Dancer("Ak Shoola","Aisuluu","Biyleyt");
        Programmer programmer=new Programmer("Peaksoft","Esen","Kod jazat");
        System.out.println(programmer.toString());
        System.out.println(dancer.toString());
        System.out.println(singer.toString());
}
}
