package cn.scnj.service;

import cn.scnj.domain.Order;
import cn.scnj.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void queryOrderById(String orderId) {
        Order order = orderMapper.selectOrderByOrderId(orderId);
        Integer orderMoney = order.getOrderMoney();
        String userId = order.getUserId();
        String url="http://user-system/user/update/point?userId="+userId+"&money="+orderMoney;
        restTemplate.getForObject(url,String.class);
    }
}
