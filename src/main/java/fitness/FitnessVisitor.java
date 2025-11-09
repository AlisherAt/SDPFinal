package fitness;

public interface FitnessVisitor {
    void visit(Running running);
    void visit(Cycling cycling);
    void visit(Swimming swimming);
}