package sportshop;

import java.util.Objects;

public class SportEquipment {
    private Category category;
    private String title;
    private int price;
    
    public SportEquipment(String category, String title, int price){
        this.category = new Category(category);
        this.title = title;
        this.price = price;
    }

    public void setCategory(String str){
        category = new Category(str);
    }
    public void setTitle(String str){
        this.title = str;
    }
    public void setPrice(int x){
        this.price = x;
    }
    
    public Category getCategory(){
        return this.category;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPrice(){
        return this.price;
    }
     
    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash + price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SportEquipment other = (SportEquipment) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return (category.getCategory()+ " " + title + " " + price+"$ ");
    }
}
