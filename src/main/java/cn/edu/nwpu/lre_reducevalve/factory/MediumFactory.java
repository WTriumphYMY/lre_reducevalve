package cn.edu.nwpu.lre_reducevalve.factory;


import cn.edu.nwpu.lre_reducevalve.domain.DO.GasData;
import cn.edu.nwpu.lre_reducevalve.domain.DO.HeGasData;
import cn.edu.nwpu.lre_reducevalve.domain.DO.N2GasData;

/**
 * @ClassName MediumFactory
 * @Author: wkx
 * @Date: 2019/7/20 20:14
 * @Version: v1.0
 * @Description: 气体与液体介质工具类
 */
public class MediumFactory {
    private static HeGasData heGasData = new HeGasData();
    private static N2GasData n2GasData = new N2GasData();


    public static GasData getGasData(String gasStr){
        switch (gasStr){
            case "N2": return n2GasData;
            case "He": return heGasData;
            default: return null;
        }
    }


}
