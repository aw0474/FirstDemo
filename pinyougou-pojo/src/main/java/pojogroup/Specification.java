package pojogroup;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 规格实体+规格选项实体
 */
public class Specification implements Serializable {
    //规格
    private TbSpecification specification;
    //规格选项
    private List<TbSpecificationOption> specificationOptionList;

    public Specification() {
    }

    public Specification(TbSpecification specification, List<TbSpecificationOption> specificationOptionList) {
        this.specification = specification;
        this.specificationOptionList = specificationOptionList;
    }

    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }

    public TbSpecification getSpecification() {
        return specification;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "specification=" + specification +
                ", specificationOptionList=" + specificationOptionList +
                '}';
    }
}
