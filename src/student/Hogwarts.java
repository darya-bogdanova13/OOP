package student;

public abstract class Hogwarts{
    protected String name;
    protected int powerOfMagic;
    protected int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public int calculateBaseSum() {
        return powerOfMagic + transgressionDistance;
    }
    public void databaseСomparison(Hogwarts hogwarts) {
        int sum1 = calculateBaseSum();
        int sum2 = hogwarts.calculateBaseSum();

    if (sum1 > sum2) {
        System.out.println(name + " > " + hogwarts.name);
    } else if (sum1 < sum2) {
        System.out.println(name + " < " + hogwarts.name);
    } else {
        System.out.println(name + " = " + hogwarts.name);
    }
}

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
