package com.example.ProjectMagazinVar2.mapper;

import com.example.ProjectMagazinVar2.DTO.OrderDTO;
import com.example.ProjectMagazinVar2.model.Orderer;
import org.springframework.stereotype.Component;

@Component

public class OrderMapper {

    public static OrderDTO mapOrderToOrderDTO(Orderer order)
    {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setId(Math.toIntExact(order.getId()));
        return orderDTO;
    }

    public static Orderer mapDTOToOrder(OrderDTO order)
    {
        Orderer orderDTO=new Orderer();
        orderDTO.setId((long) order.getId());
        return orderDTO;
    }
}
