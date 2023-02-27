package pro.sky.java.course2.lesson1.Exceptions;

public class DiagnosticFailedException extends Exception {
    public DiagnosticFailedException() {
        super("Необходимо указать тип прав");
    }
}
