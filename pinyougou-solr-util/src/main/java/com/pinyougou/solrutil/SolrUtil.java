package com.pinyougou.solrutil;

import com.alibaba.fastjson.JSON;
import com.pinyougou.mapper.TbItemMapper;
import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * solr
 */
@Component
public class SolrUtil {

    @Autowired
    private TbItemMapper itemMapper;

    @Autowired
    private SolrTemplate solrTemplate;

    /**
     * 导入商品数据
     */
    public void importItemData(){
        TbItemExample example=new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1");
        List<TbItem> tbItems = itemMapper.selectByExample(example);
        for (TbItem item:tbItems){
            //将spec字段中的json字符串转换为map
            Map<String,String> specMap= JSON.parseObject(item.getSpec(),Map.class);
            //给带注解的字段赋值
            item.setSpecMap(specMap);
            System.out.println(item.getTitle());
        }

        //将数据同步到索引库
        solrTemplate.saveBeans(tbItems);

        solrTemplate.commit();

        System.out.println("同步数据结束！");
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext*.xml");
        SolrUtil solrUtil = applicationContext.getBean("solrUtil", SolrUtil.class);
        solrUtil.importItemData();
    }
}
