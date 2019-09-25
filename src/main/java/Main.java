public class Main {
    public static void main(String[] args) {
        Tariff myOnline = new Tariff();
        Internet internetMyOnline = new Internet();
        Calls callsMyOnline = new Calls();

        myOnline.id = 1;
        myOnline.name = "Мой онлайн";
        myOnline.priceInRublesPerMonth = 290;
        myOnline.payment = " Rubles per month";
        internetMyOnline.internetSizeInMb = 15_000;
        internetMyOnline.unlimitedSocialNetworks = true;
        callsMyOnline.minutes = 400;
        callsMyOnline.unlimitedTele2 = true;
        System.out.println("Id " + myOnline.id);
        System.out.println("Tariff name - " + myOnline.name);
        if (myOnline.payment == " Rubles per month"){
        System.out.println("Tariff price - " + myOnline.priceInRublesPerMonth + myOnline.payment);}
        if( internetMyOnline.internetSizeInMb > internetMyOnline.megabytesInOneGigabytes){
                int gigabyte  = internetMyOnline.internetSizeInMb / internetMyOnline.megabytesInOneGigabytes;
        System.out.println("internet size - " + gigabyte + " gigabytes");}
        if (internetMyOnline.unlimitedSocialNetworks = true){
        System.out.println("Unlimited Social Networks");}
        System.out.println("Minutes " + callsMyOnline.minutes);
        if (callsMyOnline.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff myOnlinePlus = new Tariff();
        Internet internetMyOnlinePlus = new Internet();
        Calls callsMyOnlinePlus = new Calls();

        myOnlinePlus.id = 2;
        myOnlinePlus.name = "Мой онлайн+";
        myOnlinePlus.priceInRublesPerMonth = 350;
        myOnlinePlus.payment = " Rubles per month";
        internetMyOnlinePlus.internetSizeInMb = 20_000;
        internetMyOnlinePlus.unlimitedSocialNetworks = true;
        internetMyOnlinePlus.internetAbroad = true;
        callsMyOnlinePlus.minutes = 600;
        callsMyOnlinePlus.unlimitedTele2 = true;
        System.out.println("Id " + myOnlinePlus.id);
        System.out.println("Tariff name - " + myOnlinePlus.name);
        if (myOnlinePlus.payment == " Rubles per month"){
            System.out.println("Tariff price - " + myOnlinePlus.priceInRublesPerMonth + myOnlinePlus.payment);}
        if (internetMyOnlinePlus.internetSizeInMb > internetMyOnlinePlus.megabytesInOneGigabytes){
            int gigabyte  = internetMyOnlinePlus.internetSizeInMb / internetMyOnlinePlus.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        if(internetMyOnlinePlus.unlimitedSocialNetworks = true){
        System.out.println("Unlimited Social Networks");}
        if (internetMyOnlinePlus.internetAbroad = true){
        System.out.println("Internet Abroad");}
        System.out.println("Minutes " + callsMyOnlinePlus.minutes);
        if (callsMyOnlinePlus.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff myConversation = new Tariff();
        Internet internetMyConversations = new Internet();
        Calls callsMyConversation = new Calls();

        myConversation.id = 3;
        myConversation.name = "Мой разговор";
        myConversation.priceInRublesPerMonth = 190;
        myConversation.payment = " Rubles per month";
        internetMyConversations.internetSizeInMb = 3_000;
        callsMyConversation.minutes = 250;
        callsMyConversation.unlimitedTele2 = true;
        System.out.println("Id " + myConversation.id);
        System.out.println("Tariff name - " + myConversation.name);
        if (myConversation.payment == " Rubles per month"){
            System.out.println("Tariff price - " + myConversation.priceInRublesPerMonth + myConversation.payment);}
        if(internetMyConversations.internetSizeInMb > internetMyConversations.megabytesInOneGigabytes){
            int gigabyte  = internetMyConversations.internetSizeInMb / internetMyConversations.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        System.out.println("Minutes " + callsMyConversation.minutes);
        if(callsMyConversation.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2"); }

        System.out.println('\n');


        Tariff myTeleTwo = new Tariff();
        Internet internetMyTeleTwo = new Internet();
        Calls callsMyTeleTwo = new Calls();

        myTeleTwo.id = 4;
        myTeleTwo.name = "Мой Tele2";
        myTeleTwo.priceInRublesPerDay = 7;
        myTeleTwo.payment = " Rubles per day";
        internetMyTeleTwo.internetSizeInMb = 6_000;
        callsMyTeleTwo.unlimitedTele2 = true;
        System.out.println("Id " + myTeleTwo.id);
        System.out.println("Tariff name - " + myTeleTwo.name);
        if (myTeleTwo.payment == " Rubles per day"){
            System.out.println("Tariff price - " + myTeleTwo.priceInRublesPerDay + myTeleTwo.payment);}
        if(internetMyTeleTwo.internetSizeInMb > internetMyTeleTwo.megabytesInOneGigabytes){
            int gigabyte  = internetMyTeleTwo.internetSizeInMb / internetMyTeleTwo.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        if(callsMyTeleTwo.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}

        System.out.println('\n');


        Tariff unlimited = new Tariff();
        Internet internetUnlimited = new Internet();
        Calls callsUnlimited = new Calls();
        Sms smsUnlimited = new Sms();

        unlimited.id = 5;
        unlimited.name = "Безлимит";
        unlimited.priceInRublesPerMonth = 400;
        unlimited.payment = " Rubles per month";
        internetUnlimited.unlimitedInternet = true;
        callsUnlimited.minutes = 500;
        callsUnlimited.unlimitedTele2 = true;
        smsUnlimited.numberOfSms = 50;
        System.out.println("Id " + unlimited.id);
        System.out.println("Tariff name - " + unlimited.name);
        if (unlimited.payment == " Rubles per month"){
            System.out.println("Tariff price - " + unlimited.priceInRublesPerMonth + unlimited.payment);}
        if (internetUnlimited.unlimitedInternet = true){
        System.out.println("Unlimited Internet");}
        System.out.println("Minutes " + callsUnlimited.minutes);
        if (callsUnlimited.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}
        System.out.println("Sms - " + smsUnlimited.numberOfSms);

        System.out.println('\n');


        Tariff premium = new Tariff();
        Internet internetPremium = new Internet();
        Calls callsPremium = new Calls();
        Sms smsPremium = new Sms();

        premium.id = 6;
        premium.name = "Премиум";
        premium.priceInRublesPerMonth = 1_100;
        premium.payment = " Rubles per month";
        internetPremium .internetSizeInMb = 40_000;
        callsPremium.minutes = 2_000;
        callsPremium.unlimitedTele2 = true;
        smsPremium.numberOfSms = 500;
        System.out.println("Id " + premium.id);
        System.out.println("Tariff name - " + premium.name);
        if (premium.payment == " Rubles per month"){
            System.out.println("Tariff price - " + premium.priceInRublesPerMonth + premium.payment);}
        if(internetPremium.internetSizeInMb > internetPremium.megabytesInOneGigabytes){
            int gigabyte  = internetPremium.internetSizeInMb / internetPremium.megabytesInOneGigabytes;
            System.out.println("internet size - " + gigabyte + " gigabytes");}
        System.out.println("Minutes " + callsPremium.minutes);
        if(callsPremium.unlimitedTele2 = true){
        System.out.println("Unlimited calls Tele2");}
        System.out.println("Sms - " + smsPremium.numberOfSms);

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
        Internet internetInternetForThings = new Internet();
        Calls callsInternetForThings = new Calls();
        Sms smsPInternetForThings = new Sms();

        internetForThings.id = 9;
        internetForThings.name = "Интернет для вещей";
        internetForThings.priceInRublesPerMonth = 100;
        internetForThings.payment = " Rubles per month";
        internetInternetForThings.internetSizeInMb = 300;
        callsInternetForThings.minutes = 30;
        smsPInternetForThings.numberOfSms = 100;
        System.out.println("Id " + internetForThings.id);
        System.out.println("Tariff name - " + internetForThings.name);
        if (internetForThings.payment == " Rubles per month"){
            System.out.println("Tariff price - " + internetForThings.priceInRublesPerMonth + internetForThings.payment);}
        System.out.println("internet size - " + internetInternetForThings.internetSizeInMb + " megabytes");
        System.out.println("Minutes " + callsInternetForThings.minutes);
        System.out.println("Sms - " + smsPInternetForThings.numberOfSms);
    }
}
