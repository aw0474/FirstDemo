package pojogroup;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**
 * 商品组合实体类
 * tb_goods：商品spu
 * tb_goods_desc：商品信息扩展
 * tb_item：商品SKU
 */
public class Goods implements Serializable {

    private TbGoods goods;//商品SPU
    private TbGoodsDesc goodsDesc;//商品信息扩展
    private List<TbItem> itemList;//商品SKU

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }

    public TbGoods getGoods() {
        return goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public List<TbItem> getItemList() {
        return itemList;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods=" + goods +
                ", goodsDesc=" + goodsDesc +
                ", itemList=" + itemList +
                '}';
    }
}
