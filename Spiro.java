public class Spiro {
  public static void main (String args[]) {
    double R = 0.0008, r = 0.0001, a = 0.0004;
    double t = 0;
    double max_t = 16 * Math.PI;
    double x = 0, y = 0;
    while(t <= max_t) {
      x =  -118.289319 + (R + r) * Math.cos((r / R) * t) - a * Math.cos((1 + r / R) * t);
      y =  34.021351 + (R + r) * Math.sin((r / R) * t) - a * Math.sin((1 + r / R) * t);
      System.out.printf("              %.5f,%.5f\n", x, y);
      t += 0.01;
    }
  }
}
