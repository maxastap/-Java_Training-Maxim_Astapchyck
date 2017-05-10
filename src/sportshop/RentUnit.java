package sportshop;

public class RentUnit {

    private SportEquipment[] units = new SportEquipment[3];

    public boolean getRentUnit(Shop shop, SportEquipment[] rentUnit) {
        int x;
        if (rentUnit.length <= 3) {
            for (int i = 0, j = 0; i < 3; i++) {  
                if (shop.getGoods().containsKey(rentUnit[i])) {
                    x = shop.getGoods().get(rentUnit[i]);
                    if (x >= 1) {
                        shop.getGoods().replace(rentUnit[i], x - 1);
                        units[j]=rentUnit[i];
                        j++;
                    } else {
                        System.out.println("Недостаточно товара на складе");
                        return false;
                    }
                } else {
                    System.out.println("товара нет");
                }
            }
            return false;
        }
        System.out.println("Вы не можете заказать более 3-х вещей");
        return false;
    }

   @Override
    public String toString(){
        int x =0;
        StringBuilder str = new StringBuilder("На данный момент в прокате ") ;

        for (SportEquipment unit : units) {
            
            if(unit!=null){
               x++;
               str.append("\n" + unit.toString());
           }
        }
        if (x==0){
            str.append("0");
        }
        return str.append("\n").toString();
    }
}
