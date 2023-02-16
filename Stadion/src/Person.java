public abstract class Person {
    private String name;
    private int alter;

    public Person(String vorname, int alter) {
        this.name = vorname;
        this.alter = alter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
