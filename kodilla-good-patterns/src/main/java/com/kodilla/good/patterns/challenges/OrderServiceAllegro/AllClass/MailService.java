package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass;

import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllInterface.InformationService;

public class MailService implements InformationService {
    public void inform(User user, Order order) {
        System.out.println("Witaj " + user.getLogin() + ",\n\nDziekujemy za zamowienie w naszym sklepie !\n\nWartosc Twojego zamowienia to: " + order.getOrderTotalPrice() + "\n\nTwoje zamowione zostanie spakowane i wyslane na adres:\n\nSzanowny Pan\n" + user.getName() + " " + user.getSurname() + "\n" + user.getAddress() + "\n");
    }
}
