package cp01.demo03.service;

import cp01.demo03.matter.IMatter;

public interface IComponent {

    /**
     * 吊顶
     */
    IComponent appendCeiling(IMatter matter);

    /**
     * 涂料
     */
    IComponent appendCoat(IMatter matter);

    /**
     * 地板
     */
    IComponent appendFloor(IMatter matter);

    /**
     * 地砖
     */
    IComponent appendTile(IMatter matter);

    /**
     * 明细
     */
    String getDetail();

}
