package equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isQuadratic() {
        return a != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (a != 0) {
            sb.append(a).append("x^2");
        }
        if (b != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(b).append("x");
        }
        if (c != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(c);
        }
        sb.append(" = 0");
        return sb.toString();
    }
}



