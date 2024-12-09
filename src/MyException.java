public class MyException extends RuntimeException {

  int id;

  public MyException() {
    System.out.println("Error");
  }

  public MyException(String msg) {
    super(msg);
  }

  public MyException(String msg, Throwable th) {
    super(msg, th);
  }

  public MyException(String msg, int id) {
    super(msg);
    this.id = id;
  }
}
