package student;

public class Ravenclaw extends Hogwarts{
    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int full, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.full = full;
        this.creativity = creativity;
    }

    private int smart;
    private int wise;
    private int witty;
    private int full;
    private int creativity;

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFull() {
        return full;
    }

    public int getCreativity() {
        return creativity;
    }
    public int calculateSum () {
        return smart + wise + witty + full + creativity;

    }
    public void compare(Ravenclaw student) {
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
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", full=" + full +
                ", creativity=" + creativity +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
