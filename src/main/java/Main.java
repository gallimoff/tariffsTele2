public class Main {
    public static void main(String[] args) {
        Tariff myOnline = new Tariff();
        myOnline.internet = new Internet();
        myOnline.calls = new Calls();

        myOnline.id = 1;
        myOnline.name = "Мой онлайн";
        myOnline.priceInRublesPerMonth = 290;
        myOnline.payment = " Rubles per month";
        myOnline.internet.internetSizeInMb = 15_000;
        myOnline.internet.unlimitedSocialNetworks = true;
        myOnline.calls.minutes = 400;
        myOnline.calls.unlimitedTele2 = true;
        System.out.println("Id " + myOnline.id);
        System.out.println("Tariff name - " + myOnline.name);
        if (myOnline.payment == " Rubles per month"){
        System.out.println("Tariff price - " + myOnline.priceInRublesPerMonth + myOnline.payment);}
        if( myOnline.internet.internetSizeInMb > myOnline.internet.megabytesInOneGigabytes){
                int gigabyte  = myOnline.internet.internetSizeInMb / myOnline.internet.megabytesInOneGigabytes;
        System.out.println("internet size - " + gigabyte + " gigabytes");}
        if (myOnline.internet.unlimitedSocialNetworks = true){
        System.out.println("Unlimited Social Networks");}
        System.out.println("Minutes " + myOnline.calls.minutes);
        if (myOnline.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff myOnlinePlus = new Tariff();
        myOnlinePlus.internet = new Internet();
        myOnlinePlus.calls = new Calls();

        myOnlinePlus.id = 2;
        myOnlinePlus.name = "Мой онлайн+";
        myOnlinePlus.priceInRublesPerMonth = 350;
        myOnlinePlus.payment = " Rubles per month";
        myOnlinePlus.internet.internetSizeInMb = 20_000;
        myOnlinePlus.internet.unlimitedSocialNetworks = true;
        myOnlinePlus.internet.internetAbroad = true;
        myOnlinePlus.calls.minutes = 600;
        myOnlinePlus.calls.unlimitedTele2 = true;
        System.out.println("Id " + myOnlinePlus.id);
        System.out.println("Tariff name - " + myOnlinePlus.name);
        if (myOnlinePlus.payment == " Rubles per month"){
            System.out.println("Tariff price - " + myOnlinePlus.priceInRublesPerMonth + myOnlinePlus.payment);}
        if (myOnlinePlus.internet.internetSizeInMb > myOnlinePlus.internet.megabytesInOneGigabytes){
            int gigabyte  = myOnlinePlus.internet.internetSizeInMb / myOnlinePlus.internet.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        if(myOnlinePlus.internet.unlimitedSocialNetworks = true){
        System.out.println("Unlimited Social Networks");}
        if (myOnlinePlus.internet.internetAbroad = true){
        System.out.println("Internet Abroad");}
        System.out.println("Minutes " + myOnlinePlus.calls.minutes);
        if (myOnline.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff myConversation = new Tariff();
        myConversation.internet = new Internet();
        myConversation.calls = new Calls();

        myConversation.id = 3;
        myConversation.name = "Мой разговор";
        myConversation.priceInRublesPerMonth = 190;
        myConversation.payment = " Rubles per month";
        myConversation.internet.internetSizeInMb = 3_000;
        myConversation.calls.minutes = 250;
        myConversation.calls.unlimitedTele2 = true;
        System.out.println("Id " + myConversation.id);
        System.out.println("Tariff name - " + myConversation.name);
        if (myConversation.payment == " Rubles per month"){
            System.out.println("Tariff price - " + myConversation.priceInRublesPerMonth + myConversation.payment);}
        if(myConversation.internet.internetSizeInMb > myConversation.internet.megabytesInOneGigabytes){
            int gigabyte  = myConversation.internet.internetSizeInMb / myConversation.internet.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        System.out.println("Minutes " + myConversation.calls.minutes);
        if(myConversation.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2"); }

        System.out.println('\n');


        Tariff myTeleTwo = new Tariff();
        myTeleTwo.internet = new Internet();
        myTeleTwo.calls = new Calls();

        myTeleTwo.id = 4;
        myTeleTwo.name = "Мой Tele2";
        myTeleTwo.priceInRublesPerDay = 7;
        myTeleTwo.payment = " Rubles per day";
        myTeleTwo.internet.internetSizeInMb = 6_000;
        myTeleTwo.calls.unlimitedTele2 = true;
        System.out.println("Id " + myTeleTwo.id);
        System.out.println("Tariff name - " + myTeleTwo.name);
        if (myTeleTwo.payment == " Rubles per day"){
            System.out.println("Tariff price - " + myTeleTwo.priceInRublesPerDay + myTeleTwo.payment);}
        if(myTeleTwo.internet.internetSizeInMb > myTeleTwo.internet.megabytesInOneGigabytes){
            int gigabyte  = myTeleTwo.internet.internetSizeInMb / myTeleTwo.internet.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        if(myTeleTwo.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff unlimited = new Tariff();
        unlimited.internet = new Internet();
        unlimited.calls = new Calls();
        unlimited.sms = new Sms();

        unlimited.id = 5;
        unlimited.name = "Безлимит";
        unlimited.priceInRublesPerMonth = 400;
        unlimited.payment = " Rubles per month";
        unlimited.internet.unlimitedInternet = true;
        unlimited.calls.minutes = 500;
        unlimited.calls.unlimitedTele2 = true;
        unlimited.sms.numberOfSms = 50;
        System.out.println("Id " + unlimited.id);
        System.out.println("Tariff name - " + unlimited.name);
        if (unlimited.payment == " Rubles per month"){
            System.out.println("Tariff price - " + unlimited.priceInRublesPerMonth + unlimited.payment);}
        if (unlimited.internet.unlimitedInternet = true){
        System.out.println("Unlimited Internet");}
        System.out.println("Minutes " + unlimited.calls.minutes);
        if (unlimited.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}
        System.out.println("Sms - " + unlimited.sms.numberOfSms);

        System.out.println('\n');


        Tariff premium = new Tariff();
        premium.internet = new Internet();
        premium.calls = new Calls();
        premium.sms = new Sms();

        premium.id = 6;
        premium.name = "Премиум";
        premium.priceInRublesPerMonth = 1_100;
        premium.payment = " Rubles per month";
        premium.internet.internetSizeInMb = 40_000;
        premium.calls.minutes = 2_000;
        premium.calls.unlimitedTele2 = true;
        premium.sms.numberOfSms = 500;
        System.out.println("Id " + premium.id);
        System.out.println("Tariff name - " + premium.name);
        if (premium.payment ==" Rubles per month"){
            System.out.println("Tariff price - " + premium.priceInRublesPerMonth + premium.payment);}
        if(premium.internet.internetSizeInMb > premium.internet.megabytesInOneGigabytes){
            int gigabyte  = premium.internet.internetSizeInMb / premium.internet.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        System.out.println("Minutes " + premium.calls.minutes);
        if(premium.calls.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}
        System.out.println("Sms - " + premium.sms.numberOfSms);

        System.out.println('\n');


        Tariff classical = new Tariff();

        classical.id = 7;
        classical.name = "Классический";
        classical.noMonthlyFee = true;
        System.out.println("Id " + classical.id);
        System.out.println("Tariff name - " + classical.name);
        if (classical.noMonthlyFee = true){
            System.out.println("No monthly fee");}

        System.out.println('\n');


        Tariff internetForDevices = new Tariff();

        internetForDevices.id = 8;
        internetForDevices.name = "Интернет для устройств";
        internetForDevices.noMonthlyFee = true;
        System.out.println("Id " + internetForDevices.id);
        System.out.println("Tariff name - " + internetForDevices.name);
        if (internetForDevices.noMonthlyFee = true){
        System.out.println("No monthly fee"); }

        System.out.println('\n');


        Tariff  internetForThings = new Tariff();
        internetForThings.internet = new Internet();
        internetForThings.calls = new Calls();
        internetForThings.sms = new Sms();

        internetForThings.id = 9;
        internetForThings.name = "Интернет для вещей";
        internetForThings.priceInRublesPerMonth = 100;
        internetForThings.payment = " Rubles per month";
        internetForThings.internet.internetSizeInMb = 300;
        internetForThings.calls.minutes = 30;
        internetForThings.sms.numberOfSms = 100;
        System.out.println("Id " + internetForThings.id);
        System.out.println("Tariff name - " + internetForThings.name);
        if (internetForThings.payment == " Rubles per month"){
            System.out.println("Tariff price - " + internetForThings.priceInRublesPerMonth + internetForThings.payment);}
        System.out.println("internet size - " + internetForThings.internet.internetSizeInMb + " megabytes");
        System.out.println("Minutes " +  internetForThings.calls.minutes);
        System.out.println("Sms - " + internetForThings.sms.numberOfSms);
    }
}
