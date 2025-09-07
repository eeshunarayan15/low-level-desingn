package Lesson5.Example1.BadCode;

public class Buyer implements  User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProduct() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean approveProducts() {
        return false;
    }
}
