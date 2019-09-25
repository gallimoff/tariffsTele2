public class Main {
    public static void main(String[] args) {
        Tariff tariff = new Tariff();
        Internet internet = new Internet();
        Calls calls = new Calls();
        Sms sms = new Sms();

        tariff.id = 1;
        tariff.name = "Мой онлайн";
        tariff.priceInRublesPerMonth = 290;
        internet.internetSizeInMb = 15_000;
        internet.unlimitedSocialNetworks = true;
        calls.minutes = 400;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");

        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Unlimited Social Networks - " + internet.unlimitedSocialNetworks );
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 2;
        tariff.name = "Мой онлайн+";
        tariff.priceInRublesPerMonth = 350;
        internet.internetSizeInMb = 20_000;
        internet.unlimitedSocialNetworks = true;
        internet.internetAbroad = true;
        calls.minutes = 600;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Unlimited Social Networks - " + internet.unlimitedSocialNetworks );
        System.out.println("Internet Abroad - " + internet.internetAbroad );
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 3;
        tariff.name = "Мой разговор";
        tariff.priceInRublesPerMonth = 190;
        internet.internetSizeInMb = 3_000;
        calls.minutes = 250;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 4;
        tariff.name = "Мой Tele2";
        tariff.getPriceInRublesPerDay = 7;
        internet.internetSizeInMb = 6_000;
        calls.unlimitedTele2 = true;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.getPriceInRublesPerDay + " rubles per day");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);

        System.out.println('\n');

        tariff.id = 5;
        tariff.name = "Безлимит";
        tariff.priceInRublesPerMonth = 400;
        internet.internetSizeInMb = 15_000;
        internet.unlimitedInternet = true;
        calls.minutes = 500;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 50;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Unlimited Internet - " + internet.unlimitedInternet);
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);
        System.out.println("Sms - " + sms.numberOfSms);

        System.out.println('\n');

        tariff.id = 6;
        tariff.name = "Безлимит";
        tariff.priceInRublesPerMonth = 400;
        internet.unlimitedInternet = true;
        calls.minutes = 500;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 50;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("Unlimited Internet - " + internet.unlimitedInternet);
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Unlimited calls Tele2 - " + calls.unlimitedTele2);
        System.out.println("Sms - " + sms.numberOfSms);

        System.out.println('\n');

        tariff.id = 7;
        tariff.name = "Премиум";
        tariff.priceInRublesPerMonth = 1_100;
        internet.internetSizeInMb = 40_000;
        calls.minutes = 2_000;
        calls.unlimitedTele2 = true;
        sms.numberOfSms = 500;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
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
        tariff.priceInRublesPerMonth = 100;
        internet.internetSizeInMb = 300;
        calls.minutes = 30;
        sms.numberOfSms = 100;
        System.out.println("Id " + tariff.id);
        System.out.println("Tariff name - " + tariff.name);
        System.out.println("Tariff price - " + tariff.priceInRublesPerMonth + " rubles per month");
        System.out.println("internet size - " + internet.internetSizeInMb + " megabytes");
        System.out.println("Minutes " + calls.minutes);
        System.out.println("Sms - " + sms.numberOfSms);
    }
}
