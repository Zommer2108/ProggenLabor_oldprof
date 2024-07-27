package blatt10;

public class ValueObjectProject {
public static class IntegerValueObject {
    private int i;

    private IntegerValueObject(int input) {
        this.i = input;
    }

    /**
     * Adding values together
     *
     * @param j second summand
     * @return this.i + j as new Value-Object
     */
    public IntegerValueObject add(int j) {
        return new IntegerValueObject(this.i + j);
    }

    /**
     * Multiplying values together
     *
     * @param j multiplier
     * @return this.i * j as new Value-Object
     */
    public IntegerValueObject mul(int j) {
        ;
        return new IntegerValueObject(this.i * j);
    }

    @Override
    public String toString() {
        return Integer.toString(this.i);
    }
}

    public static void main(String[] args) {
        System.out.println((new IntegerValueObject(2).mul(3).add(4).mul(5)));
    }
}
