package jaesang.example.com.myapplication;

public class b_Bank {

    //public int customerMoney = 1000;
    private int customerMoney = 1000;

    public int checkCustomerMoney() {
        return customerMoney;
    }

    public void transferMoney(int customerMoney) {
        if (certificate() == true) {
            if (OTP() == true) {
                System.out.println("송금");
            }
        }
    }
/*
    public boolean certificate() {  // 본인 인증 기능, 그러나 함수가 public으로 되어 있으므로 외부 접근 가능
        return true;
    }

    public boolean OTP() { // 본인 인증 기능, 그러나 함수가 public으로 되어 있으므로 외부 접근 가능
        return true;
    }
}
*/
    private boolean certificate() {
        return true;
    }
    private boolean OTP() {
        return true;
    }
}