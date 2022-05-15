package com.CoreClass;
import java.beans.*;
public class JavaBeangs {
    public static void main(String[] args) throws Exception{
        BeanInfo info = Introspector.getBeanInfo(testJavaBean.class);
        for(PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" "+ pd.getReadMethod());
            System.out.println(" "+ pd.getWriteMethod());
        }
    }

}


//JavaBean创建:选中属性，右键，选择Generate
class testJavaBean{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;
}
