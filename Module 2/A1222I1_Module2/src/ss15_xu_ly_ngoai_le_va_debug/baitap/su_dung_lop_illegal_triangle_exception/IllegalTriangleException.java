package ss15_xu_ly_ngoai_le_va_debug.baitap.su_dung_lop_illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    private String error;

    public IllegalTriangleException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
