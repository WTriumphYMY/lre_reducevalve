package cn.edu.nwpu.lre_reducevalve.service;

import cn.edu.nwpu.lre_reducevalve.domain.dto.ReduceValveDTO;
import cn.edu.nwpu.lre_reducevalve.domain.po.ReduceValvePO;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName ReduceValveService
 * @Author: wkx
 * @Date: 2019/10/24 18:54
 * @Version: v1.0
 * @Description:
 */
public interface ReduceValveService {
    Map<String, List<Double>> reduceValveSim(ReduceValveDTO reduceValveDTO);

    void saveReduceValve(ReduceValveDTO reduceValveDTO);

    ReduceValveDTO getReduceValve(String reduceName);

    List<ReduceValveDTO> findAllReduceValve();
}
