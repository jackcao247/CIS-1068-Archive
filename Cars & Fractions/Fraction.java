public class Fraction {
    private int n;
    private int d;

    public Fraction(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("Denominator cannot be equal to 0.");
        }
        this.n = n;
        this.d = d;
        findGCD(this);
    }

    public Fraction() {
        this.n = 0;
        this.d = 1;
    }

    public int getNum() {
        return n;
    }

    public int getDenom() {
        return d;
    }

    public void setNum(int n) {
        this.n = n;
        findGCD(this);
    }

    public void setDenom(int d) {
        if (d == 0) {
            throw new ArithmeticException("Denominator cannot be equal to 0.");
        }
        this.d = d;
        findGCD(this);
    }

    public Fraction add(Fraction a) {
        int newN = this.n * a.d + a.n * this.d;
        int newD = this.d * a.d;
        return new Fraction(newN, newD);
    }

    public boolean equals(Fraction a) {
    	return this.n * a.getDenom() == a.getNum() * this.d;
    }

    public String toString() {
        return n + "/" + d;
    }

    public void findGCD(Fraction x) {
        int r = 1;
        int gcd = 0;
        int a = x.n, b = x.d;
        if (a < b) {
            swap(a, b);
        }
        while (r != 0) {
            r = a % b;
            a = b;
            if (r == 0) {
                gcd = b;
            }
            b = r;
        }
        if (gcd == 0) {
            throw new ArithmeticException("GCD cannot be equal to 0.");
        }
        x.n = x.n / gcd;
        x.d = x.d / gcd;
    }

    public void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
