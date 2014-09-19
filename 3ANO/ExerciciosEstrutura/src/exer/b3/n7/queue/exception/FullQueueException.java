package exer.b3.n7.queue.exception;

public class FullQueueException extends RuntimeException {

    private static String     errorMessage     = "A fila esta cheia !";

    private static final long serialVersionUID = -8591903460045797530L;

    public FullQueueException() {
        super(errorMessage);
    }

    public FullQueueException(String message, Throwable cause,
                    boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public FullQueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullQueueException(String message) {
        super(message);
    }

    public FullQueueException(Throwable cause) {
        super(errorMessage, cause);
    }

}
