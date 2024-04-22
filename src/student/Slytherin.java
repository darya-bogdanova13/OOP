package student;

public class Slytherin extends Hogwarts{
    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public int calculateSum () {
        return cunning + determination + ambition + resourcefulness + lustForPower;

    }
    public void compare(Slytherin student) {
        int sum1 = calculateSum();
        int sum2 = student.calculateSum();

        if (sum1 > sum2) {
            System.out.println(name + " > " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " < " + student.name);
        } else {
            System.out.println(name + " = " + student.name);
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
