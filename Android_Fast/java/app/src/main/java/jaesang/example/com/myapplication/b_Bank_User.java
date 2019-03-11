package jaesang.example.com.myapplication;

public class b_Bank_User {

    public static void main(String[] args) {

        b_Bank bank = new b_Bank();

        //int customerMoney = bank.customerMoney;
        //System.out.println(customerMoney);

        //bank.customerMoney = 2000;              // 고객이 임의로 잔고에 있는 돈을 바꾸면
        //System.out.println(bank.customerMoney); // 은행으로선 곤란하기 때문에 public을 private으로 바꿈

        //고객이 값을 사용할 수 없으므로 확인도 불가해져버렸다.
        //그래서 b_Bank에서 public으로 값을 확인할 수 있는 함수를 생성해야 한다.

        int customerMoney = bank.checkCustomerMoney();
        System.out.println(customerMoney);

        bank.transferMoney(500);
    }
}


