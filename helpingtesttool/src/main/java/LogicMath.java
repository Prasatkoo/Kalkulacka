public class LogicMath {
    private double a;
    private double b;
    private int fac;


    public LogicMath() {
        this.a = a;
        this.b = b;
    }

    public double plus(double a, double b){
     return (a + b);
   }
   public double minus(double a, double b){
        return (a - b);
   }
   public double times(double a, double b){
        return (a * b);
   }
    public double divide(double a, double b){
        return (a / b);
    }
    public double power(double a, double b){
       return (Math.pow(a, b));
    }
    public int factorial(int fac){
        if (fac == 0){
            return 1;
        }
        return fac * factorial(fac - 1);
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getFac() {
        return fac;
    }

    public void setFac(int fac) {
        this.fac = fac;
    }
}



