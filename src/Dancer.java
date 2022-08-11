
    public class Dancer extends  Person{
        private String groupName;


        public  void dancing(){
            System.out.println("I can danc");
        }
        public Dancer(String groupName,String name,String designation){
            super(name,designation);
            this.groupName=groupName;
        }
        String getGroupName(){
            return  groupName;
        }

        @Override
        public String toString() {
            return "Dancer{" +super.toString()+
                    "groupName='" + groupName + '\'' +
                    '}';
        }
    }

