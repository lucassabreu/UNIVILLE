package exer.b3.n8.queue.exception;

public class EmptyQueueException extends RuntimeException {

    private static String     errorMessage     = "A fila esta vazia !";

    private static final long serialVersionUID = -8591903460045797530L;

    public EmptyQueueException() {
        super(errorMessage);
    }

    public EmptyQueueException(String message, Throwable cause,
                    boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EmptyQueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyQueueException(String message) {
        super(message);
    }

    public EmptyQueueException(Throwable cause) {
        super(errorMessage, cause);
    }

}
