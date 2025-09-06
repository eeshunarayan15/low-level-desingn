package Lesson2.TaskHome;
enum  ProductType{
    ELECTRONICS,
    CLOTHING;
    class  Proudct{
        ProductType type;
        double price;
        double getPrice(){
            return  8.0;
        }
        ProductType getType(){
            return  type;
        }
    }
}
public class DiscountCalculator {
public  double calculate(Product product){
    if(product.getType()==ProductType.ELECTRONICS){
        return  product.getPrice() * 0.2;
    } else if (product.getType()==ProductType.CLOTHING) {
        return  product.getPrice() * 0.1;
    }
    return  0;
}


}
