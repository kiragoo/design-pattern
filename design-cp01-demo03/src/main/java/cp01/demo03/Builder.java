package cp01.demo03;

import cp01.demo03.matter.celling.LevelOneCelling;
import cp01.demo03.matter.celling.LevelTwoCelling;
import cp01.demo03.matter.coat.DuluxCoat;
import cp01.demo03.matter.coat.LiBangCoat;
import cp01.demo03.matter.floor.ShengXiangFloor;
import cp01.demo03.matter.tile.DongPengTile;
import cp01.demo03.matter.tile.MarcoPoloTile;
import cp01.demo03.service.IComponent;
import cp01.demo03.service.impl.Component;

public class Builder {

    public IComponent levelOne(Double area) {
        return new Component(area, "豪华欧式")
                .appendCeiling(new LevelOneCelling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IComponent levelTwo(Double area){
        return new Component(area, "轻奢田园")
                .appendCeiling(new LevelTwoCelling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IComponent levelThree(Double area){
        return new Component(area, "现代简约")
                .appendCeiling(new LevelOneCelling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
