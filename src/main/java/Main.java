import com.fasterxml.jackson.databind.ObjectMapper;
import com.jkeough.config.Config;
import com.jkeough.models.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Debts debts = new Debts();
        Payments payments = new Payments();
        PaymentPlans paymentPlans = new PaymentPlans();
        debts.setDebts(getDebts());
        payments.setPayments(getPayments());
        paymentPlans.setPaymentPlans(getPaymentPlans());
        debts = setDebtFields(debts, payments, paymentPlans);
        outputDebtData(debts);
    }

    public static ArrayList<Payment> testResponse() throws IOException {
        URL url = new URL(Config.getPaymentsURL());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        Scanner sc = new Scanner(url.openStream());
        StringBuilder inline = new StringBuilder();
        while(sc.hasNext())
        {
            inline.append(sc.nextLine());
        }
        sc.close();
        ObjectMapper mapper = new ObjectMapper();
        Payment[] payments = mapper.readValue(inline.toString(),Payment[].class);
        return new ArrayList<>(Arrays.asList(payments));
    }

    public static void outputDebtData(Debts debts) {
        for (Debt debt : debts.getDebts()) {
            System.out.println(debt.toString());
        }
    }

    public static Debts setDebtFields(Debts debts, Payments payments, PaymentPlans paymentPlans) {
        ArrayList<Debt> tempDebts = debts.getDebts();
        ArrayList<Payment> tempPayments = payments.getPayments();
        ArrayList<PaymentPlan> tempPaymentPlans = paymentPlans.getPaymentPlans();

        for (Debt debt : tempDebts) {
            ArrayList<Payment> debtPayments = new ArrayList<>();
            debt.setRemainingAmount(debt.getAmount());
            debt.setIsInPaymentPlan(false);
            for (PaymentPlan paymentPlan : tempPaymentPlans) {
                if (paymentPlan.getDebtId() == debt.getId()) {
                    debt.setPaymentPlan(paymentPlan);
                    debt.setIsInPaymentPlan(true);
                    debt.setRemainingAmount(paymentPlan.getAmountToPay());
                    break;
                }
            }
            if (debt.isIsInPaymentPlan()) {
                for (Payment payment : tempPayments) {
                    if (payment.getPaymentPlanId() == debt.getPaymentPlan().getId()) {
                        debtPayments.add(payment);
                        debt.setRemainingAmount((debt.getRemainingAmount() - payment.getAmount()));
                    }
                }
                debt.setPayments(debtPayments);
                if (debt.getRemainingAmount() != 0.00) {
                    debt.setNextPaymentDueDate(calculateNextPaymentDate(debt));
                }
            }
        }
        return debts;
    }

    public static String calculateNextPaymentDate(Debt debt) {
        LocalDate startDate = LocalDate.parse(debt.getPaymentPlan().getStartDate());
        LocalDate today = LocalDate.now();
        LocalDate nextDueDate = LocalDate.parse(debt.getPaymentPlan().getStartDate());

        if (today.isAfter(startDate)) {
            if (debt.getPaymentPlan().getInstallmentFrequency().equals("WEEKLY")) {
                while (today.isAfter(nextDueDate)) {
                    nextDueDate = nextDueDate.plusDays(7);
                }
            } else if (debt.getPaymentPlan().getInstallmentFrequency().equals("BI_WEEKLY")) {
                while (today.isAfter(nextDueDate)) {
                    nextDueDate = nextDueDate.plusDays(14);
                }
            } else nextDueDate = startDate;
        }
        return nextDueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static ArrayList<PaymentPlan> getPaymentPlans() throws IOException {
        URL url = new URL(Config.getPaymentPlansURL());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        Scanner sc = new Scanner(url.openStream());
        StringBuilder inline = new StringBuilder();
        while(sc.hasNext())
        {
            inline.append(sc.nextLine());
        }
        sc.close();
        ObjectMapper mapper = new ObjectMapper();
        PaymentPlan[] paymentPlans = mapper.readValue(inline.toString(),PaymentPlan[].class);
        return new ArrayList<PaymentPlan>(Arrays.asList(paymentPlans));
    }

    public static ArrayList<Payment> getPayments() throws IOException {
        URL url = new URL(Config.getPaymentsURL());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        Scanner sc = new Scanner(url.openStream());
        StringBuilder inline = new StringBuilder();
        while(sc.hasNext())
        {
            inline.append(sc.nextLine());
        }
        sc.close();
        ObjectMapper mapper = new ObjectMapper();
        Payment[] payments = mapper.readValue(inline.toString(),Payment[].class);
        return new ArrayList<Payment>(Arrays.asList(payments));
    }

    public static ArrayList<Debt> getDebts() throws IOException {
        URL url = new URL(Config.getDebtsURL());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();
        Scanner sc = new Scanner(url.openStream());
        StringBuilder inline = new StringBuilder();
        while(sc.hasNext())
        {
            inline.append(sc.nextLine());
        }
        sc.close();
        ObjectMapper mapper = new ObjectMapper();
        Debt[] debts = mapper.readValue(inline.toString(),Debt[].class);
        return new ArrayList<Debt>(Arrays.asList(debts));
    }

}
