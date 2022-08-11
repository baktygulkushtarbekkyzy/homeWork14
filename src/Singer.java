
    public class Singer extends Person {
        private String bandName;

        public void singing(){

        }
        public  Singer(String bandName,String name,String designation){
            super(name,designation);
            this.bandName=bandName;
        }

        String getBandName(){
            return bandName;
        }

        @Override
        public String toString() {
            return "Singer{" +super.toString()+
                    "bandName='" + bandName + '\'' +
                    '}';
        }
    }


