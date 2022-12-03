package cn.scnj.mapper;

import cn.scnj.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    Order selectOrderByOrderId(String orderId);
}
