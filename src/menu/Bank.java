package menu;

import entity.Amount;
import entity.CardHolder;
import entity.Currency;
import entity.Transaction;
import service.TransactionService;

import java.util.Scanner;

public class Bank {

    private TransactionService service = new TransactionService();
    private Scanner in = new Scanner(System.in);

    public Bank() {
        System.out.println("Привет! Круто ты попал на ТВ-Bong");
        menu();
    }

    private void printMenu() {
        System.out.println("1) Добавить транзакцию");
        System.out.println("2) Вывести транзакцию по ID");
        System.out.println("3) Вывести транзакцию по имени и фамилии держателя карты");
        System.out.println("4) Удалить транзакцию по ID");
        System.out.println("0) Выйти");
    }

    private void menu() {
        printMenu();

        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                Transaction transactionFromConsole = getTransactionFromConsole();
                service.addTransaction(transactionFromConsole);
                break;
            }
            case 2: {
                Long id = getIdFromConsole();
                System.out.println(service.getTransactionById(id));
                break;
            }
            case 3: {
                CardHolder cardHolder = getCardHolderFromConsole();
                System.out.println(service.getTransactionByCardHolder(cardHolder));
                break;
            }
            case 4: {
                Long id = getIdFromConsole();
                service.removeTransactionById(id);
                System.out.println("Удалено :)");
                break;
            }
            case 0: {
                System.exit(0);
            }
        }
        menu();
    }

    private CardHolder getCardHolderFromConsole() {
        CardHolder cardHolder = new CardHolder();
        System.out.println("Введи имя");
        String nameFromConsole = in.next();
        cardHolder.setName(nameFromConsole);
        System.out.println("Введи фамилию");
        String surnameFromConsole = in.next();
        cardHolder.setSurname(surnameFromConsole);
        return cardHolder;
    }

    private Long getIdFromConsole() {
        System.out.println("Чел введи ID транзакции которую хочешь найти :)");
        return in.nextLong();
    }

    private Transaction getTransactionFromConsole() {
        Transaction transactionFromConsole = new Transaction();

        System.out.println("Введи ID");
        transactionFromConsole.setId(in.nextLong());

        transactionFromConsole.setCardHolder(getCardHolderFromConsole());

        Amount amount = new Amount();
        System.out.println("Введи валюту перевода");
        Currency currency = Currency.valueOf(in.next());
        amount.setCurrency(currency);
        System.out.println("Введи сколько денег перевести");
        Double numberAmountFromConsole = in.nextDouble();
        amount.setNumberAmount(numberAmountFromConsole);
        transactionFromConsole.setAmount(amount);

        //добавить сюда добавление времени из консоли
        //погуглите класс Calendar

        return transactionFromConsole;
    }
}
