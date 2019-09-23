public class Main {
    public static void main(String[] args) {
        Tariff tariff = new Tariff();
        Internet internet = new Internet();
        Calls calls = new Calls();
        Sms sms = new Sms();

        tariff.id = 1;
        tariff.name = "Мой онлайн";
        tariff.priceInRubles = 290;
        tariff.pricePerMonth = true;
        internet.internetSize = 15;
        internet.unlimitedSocialNetworks = true;
        calls.minutes = 400;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Unlimited Social Networks - " + internet.unlimitedSocialNetworks );
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 2;
        tariff.name = "Мой онлайн+";
        tariff.priceInRubles = 350;
        tariff.pricePerMonth = true;
        internet.internetSize = 20;
        internet.unlimitedSocialNetworks = true;
        internet.internetAbroad = true;
        calls.minutes = 600;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Unlimited Social Networks - " + internet.unlimitedSocialNetworks );
        System.out.println("Internet Abroad - " + internet.internetAbroad );
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 3;
        tariff.name = "Мой разговор";
        tariff.priceInRubles = 190;
        tariff.pricePerMonth = true;
        internet.internetSize = 3;
        calls.minutes = 250;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 4;
        tariff.name = "Мой Tele2";
        tariff.priceInRubles = 7;
        tariff.pricePerDay = true;
        internet.internetSize = 6;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price per day - " + tariff.pricePerDay);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 5;
        tariff.name = "Безлимит";
        tariff.priceInRubles = 400;
        tariff.pricePerMonth = true;
        internet.internetSize = 15;
        internet.unlimitedInternet = true;
        calls.minutes = 500;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 50;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Unlimited Internet - " + internet.unlimitedInternet);
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);
        System.out.println("Sms - " + sms.numberOfSms);

        System.out.println('\n');

        tariff.id = 6;
        tariff.name = "Безлимит";
        tariff.priceInRubles = 400;
        tariff.pricePerMonth = true;
        internet.unlimitedInternet = true;
        calls.minutes = 500;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 50;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("Unlimited Internet - " + internet.unlimitedInternet);
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);
        System.out.println("Sms - " + sms.numberOfSms);

        System.out.println('\n');

        tariff.id = 7;
        tariff.name = "Премиум";
        tariff.priceInRubles = 1_100;
        tariff.pricePerMonth = true;
        internet.internetSize = 40;
        calls.minutes = 2_000;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 500;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " gigabytes");
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);
        System.out.println("Sms - " + sms.numberOfSms);

        System.out.println('\n');

        tariff.id = 8;
        tariff.name = "Классический";
        tariff.noMonthlyFee = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("No monthly fee - " + tariff.noMonthlyFee);

        System.out.println('\n');

        tariff.id = 9;
        tariff.name = "Интернет для устройств";
        tariff.noMonthlyFee = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("No monthly fee - " + tariff.noMonthlyFee);

        System.out.println('\n');

        tariff.id = 10;
        tariff.name = "Интернет для вещей";
        tariff.priceInRubles = 100;
        tariff.pricePerMonth = true;
        internet.internetSize = 300;
        calls.minutes = 30;
        sms.numberOfSms = 100;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRubles + " rubles");
        System.out.println("Price Per Month - " + tariff.pricePerMonth);
        System.out.println("internet size - " + internet.internetSize + " megabytes");
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Sms - " + sms.numberOfSms);
    }
}
