package day1;

public class Die {
    private int face;
    private int numFaces;

    public Die() {
        this(4);
    }

    public Die(int numFaces) {
        this.numFaces = numFaces;
        roll();
    }

    public void roll() {
        face = (int) (Math.random() * numFaces) + 1;
    }

    public int getFace() {
        return face;
    }

    public int compareTo(Die other) {
        roll();
        other.roll();

        if (getFace() == other.getFace()) return 0;
        else if (getFace() > other.getFace())
            return 1;
        else 
            return -1;
    }
}