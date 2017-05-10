package sportshop;

public class Runner {

    public static void main(String[] args) {
        
        Shop shop = new Shop();
        RentUnit rUnit = new RentUnit();

        System.out.println(shop);
        System.out.println(rUnit);

        SportEquipment r = new SportEquipment("Обувь", "кеды Адидас2", 100);
        SportEquipment r1 = new SportEquipment("Инвентарь", "гири Атлет", 10);
        SportEquipment r2 = new SportEquipment("Майки", "майка синяя", 10);

        SportEquipment arrSE[] = {r, r2, r1};
        rUnit.getRentUnit(shop, arrSE);

        System.out.println(rUnit);
        System.out.println(shop); 
    }
}
