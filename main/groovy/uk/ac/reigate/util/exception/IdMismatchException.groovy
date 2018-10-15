package uk.ac.reigate.util.exception


class IdMismatchException extends RuntimeException {
    
    IdMismatchException() {
        super("ID mismatch exception thrown.")
    }
    
    IdMismatchException(String msg) {
        super(msg)
    }
}
