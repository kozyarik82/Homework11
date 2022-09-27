public class Main {
    public static void main(String[] args) {
        checkYear(2022);
        getDeviceLink(0, 2013);
        int deliveryDays = calculateDeliveryDays(150);
        System.out.println(" Потребуется дней: " + deliveryDays);



    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " високосный год ");
        }else{
            System.out.println(year + " не високосный год ");
        }
    }

    public static void getDeviceLink(int clientOS,int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }

    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40 + 1);
        }
    }


}