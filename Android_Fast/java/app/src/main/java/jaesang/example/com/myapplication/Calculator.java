package jaesang.example.com.myapplication;

public class Calculator {

    int result;

    public Calculator(int result) {
        this.result = result;
    }
    public int add(int input) {
        return result = result + input;
    }
    public int min(int input) {
        result -= input;
        if(result < 0)
            return result = 0;
        else
            return result;
    }
    public int mul(int input) {
        return result = result * input;
    }
    public int per(int input) {
        return result = result % input;
    }
    public void getResult() {
        System.out.println(result);
    }
}
