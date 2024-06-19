package SOLID.RestaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class OrderSolid implements OrderRepository {
    private List<MenuItemSOLID> menuItemSOLIDs = new ArrayList<>();

    @Override
    public void addItemSolid(MenuItemSOLID menu) {
        // TODO Auto-generated method stub
        menuItemSOLIDs.add(menu);

    }

    @Override
    public double calculateTotalSolid() {
        // TODO Auto-generated method stub
        return menuItemSOLIDs.size();
    }
}
