package cp01.demo03.service.impl;

import cp01.demo03.matter.IMatter;
import cp01.demo03.service.IComponent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Component implements IComponent {
    private List<IMatter> list = new ArrayList<IMatter>();  // 装修清单
    private BigDecimal price = BigDecimal.ZERO;      // 装修价格

    private BigDecimal area;  // 面积
    private String grade;     // 装修等级；豪华欧式、轻奢田园、现代简约

    private Component() {
    }

    public Component(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    public IComponent appendCeiling(IMatter Imatter) {
        list.add(Imatter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(Imatter.price()));
        return this;
    }

    public IComponent appendCoat(IMatter Imatter) {
        list.add(Imatter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(Imatter.price()));
        return this;
    }

    public IComponent appendFloor(IMatter Imatter) {
        list.add(Imatter);
        price = price.add(area.multiply(Imatter.price()));
        return this;
    }

    public IComponent appendTile(IMatter Imatter) {
        list.add(Imatter);
        price = price.add(area.multiply(Imatter.price()));
        return this;
    }

    public String getDetail() {

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (IMatter IMatter: list) {
            detail.append(IMatter.scene()).append("：").append(IMatter.brand()).append("、").append(IMatter.model()).append("、平米价格：").append(IMatter.price()).append(" 元。\n");
        }

        return detail.toString();
    }

}
