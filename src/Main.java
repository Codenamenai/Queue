import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> queue = new LinkedList<>();
        queue = (Deque<Person>) generateClients();
        while (!queue.isEmpty()) {
            Person s = queue.getFirst();
            s.reduceTickets();
            if (s.numberTickets == 0) {
                queue.pollFirst();
            }
            if (s.numberTickets > 0) {
                queue.add(s);
                queue.pollFirst();
            }
            System.out.println(s);


        }


    }


    public static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Vlasov", "Georgi", 2));
        personList.add(new Person("Voronov", "Filipp", 1));
        personList.add(new Person("Anvartdinov", "Timur", 3));
        personList.add(new Person("Selutin", "Alexander", 4));
        personList.add(new Person("Vodolazshski", "Maxim", 5));
        return (personList);


    }


}


