public class Person {
    protected String lastName;
    protected String name;
    protected int numberTickets;

    public Person(String lastName, String name, int numberTickets) {
        this.lastName = lastName;
        this.name = name;
        this.numberTickets = numberTickets;
    }


    public String toString() {
        return lastName + " " + name + " " + "прокатился на карусели" + " " +
                "билетов осталось :" + (numberTickets);
    }

    public void reduceTickets() {
        if (numberTickets > 0) {
            numberTickets--;
        }
    }
}
