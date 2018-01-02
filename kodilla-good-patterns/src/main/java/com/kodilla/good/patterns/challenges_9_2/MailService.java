package com.kodilla.good.patterns.challenges_9_2;

public class MailService implements InformationService {
    public void inform(User user, Order order) {
        System.out.println("Witaj " + user.getLogin() + ",\n\nDziekujemy za zamowienie w naszym sklepie !\n\nWartosc Twojego zamowienia to: " + order.getOrderTotalPrice() + "\n\nTwoje zamowione zostanie spakowane i wyslane na adres:\n\nSzanowny Pan\n" + user.getName() + " " + user.getSurname() + "\n" + user.getAddress() + "\n");
    }
}
