public abstract class Person implements Payable, Comparable<Person>{
    private int id;
    private String name;
    private String surname;
    private static int id_gen;
    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + ' ' + surname;
    }

    public abstract String getPosition();

    @Override
    public abstract double getPaymentAmount();

    @Override
    public int compareTo(Person o) {
        if (o.getPaymentAmount() > this.getPaymentAmount()){
            return -1;
        }
        else if(o.getPaymentAmount() == this.getPaymentAmount()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
