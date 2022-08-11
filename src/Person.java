
    public class Person {
        private String name;
        private String designation;

        public void learn(){
            System.out.println("Adam okuusu zaryl!");
        }
        public  void walk(){
            System.out.println("Joo basuu den soolukka paida");
        }
        public void eat(){
            System.out.println("Adam tamaksyz 3 kun jashai alat");
        }
        public  Person(String name,String designation){
            this.name=name;
            this.designation=designation;
        }

        String getName(){
            return  name;
        }String getDesignation(){
            return  designation;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    '}';
        }

    }


