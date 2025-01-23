package Assignment_3_interfaces;

public class Solution_18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Repka", "Repka"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babka"));
        plot.add(new Person("Granddaughter", "Granddaughter"));
        RepkaStory.tell(plot);
    }

    public class Person {
        private String name;
        private String namePadezh;
        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNamePadezh() {
            return namePadezh;
        }
        public void setNamePadezh(String namePadezh) {
            this.namePadezh = namePadezh;
        }
    }

    public interface RepkaItem {
        Public String getNamePadezh();
    }

    public class RepkaStory {
        static void tell(List<Person> items) {
            Person first;
            Person two;
            for (int i = items.size() - 1; i > 0; i--) {
                first = items.get(i - 1);
                second = items.get(i);
                first.pull(second);
            }
        }
    }
}
