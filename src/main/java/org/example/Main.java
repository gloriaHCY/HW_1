package org.example;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {

        Payment tuition[] = new Payment[6];
        tuition[0] = new GraduateStudent("子偉", "林", "ID-001", 4);
        tuition[1] = new GraduateStudent("進德", "張", "ID-002", 3);
        tuition[2] = new UndergraduateStudent("俊麟", "郭", "ID-003");
        tuition[3] = new GraduateStudent("智為", "胡", "ID-004", 5);
        tuition[4] = new UndergraduateStudent("維中", "王", "ID-005");
        tuition[5] = new EveningProgramStudent("偉殷", "陳", "ID-006");

        double totalPay = 0;
        DecimalFormat df = new DecimalFormat("#,###");
        for (int i = 0; i < tuition.length; i++) {

            System.out.println(tuition[i].toString());

            if (tuition[i] instanceof GraduateStudent) {
                totalPay += tuition[i].getPaymentAmount() * 0.9;
                System.out.println(
                        String.format("原來學費是=%s，調降學費 10%%，%n學費=%s",
                                df.format(tuition[i].getPaymentAmount()),
                                df.format(tuition[i].getPaymentAmount() * 0.9)));
            } else {
                totalPay += tuition[i].getPaymentAmount();
                System.out.println("學費=" + df.format(tuition[i].getPaymentAmount()));
            }
        }
        System.out.println(String.format("%n總學費收入為 " + df.format(totalPay)));

    }
}

