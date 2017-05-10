package sportshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Shop {

    private Map<SportEquipment, Integer> goods = new HashMap<>();

    public Shop() {
        String[] arr;
        String str;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    new FileInputStream("data/test.txt"), "Windows-1251"));

            while ((str = in.readLine()) != null) {
                arr = str.split(",");
                goods.put(new SportEquipment(arr[0], arr[1], Integer.parseInt(arr[2])),
                          new Integer(arr[3]));
            }

            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File didn't find");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Map<SportEquipment, Integer> getGoods() {
        return this.goods;
    }

    @Override
    public String toString(){

        StringBuilder str = new StringBuilder("На данный момент для проката свободны \n") ;
        
        for (Entry entry : goods.entrySet()) {
            str.append(entry.getKey().toString() + entry.getValue() + " штук \n");
        }
        return str.toString();
    }
}
