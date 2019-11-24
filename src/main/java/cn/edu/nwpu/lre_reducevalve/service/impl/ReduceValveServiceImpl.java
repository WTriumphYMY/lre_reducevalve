package cn.edu.nwpu.lre_reducevalve.service.impl;

import cn.edu.nwpu.lre_reducevalve.algorithm.ReducingValveCalc;
import cn.edu.nwpu.lre_reducevalve.domain.DO.ReducingValveDO;
import cn.edu.nwpu.lre_reducevalve.domain.dto.ReduceValveDTO;
import cn.edu.nwpu.lre_reducevalve.domain.po.ReduceValvePO;
import cn.edu.nwpu.lre_reducevalve.factory.MediumFactory;
import cn.edu.nwpu.lre_reducevalve.repository.ReduceValveRepository;
import cn.edu.nwpu.lre_reducevalve.service.ReduceValveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ReduceValveServiceImpl
 * @Author: wkx
 * @Date: 2019/10/24 18:55
 * @Version: v1.0
 * @Description:
 */
@Service
public class ReduceValveServiceImpl implements ReduceValveService {

    @Autowired
    private ReduceValveRepository reduceValveRepository;

    @Override
    public Map<String, List<Double>> reduceValveSim(ReduceValveDTO reduceValveDTO) {
        ReduceValvePO reduceValvePO = new ReduceValvePO();
        ReducingValveDO reducingValveDO = new ReducingValveDO(MediumFactory.getGasData("N2"));
        ReducingValveCalc reducingValveCalc = new ReducingValveCalc(reducingValveDO);
        return null;
    }

    @Override
    public void saveReduceValve(ReduceValveDTO reduceValveDTO) {
        ReduceValvePO reduceValvePO = transformDTOtoPO(reduceValveDTO);
        reduceValveRepository.save(reduceValvePO);
    }

    @Override
    public ReduceValveDTO getReduceValve(String reduceName) {
        ReduceValvePO reduceValvePO = reduceValveRepository.findByReduceValveName(reduceName);
        ReduceValveDTO reduceValveDTO = transformPOtoDTO(reduceValvePO);
        return reduceValveDTO;
    }

    private ReduceValveDTO transformPOtoDTO(ReduceValvePO reduceValvePO) {
        ReduceValveDTO reduceValveDTO = new ReduceValveDTO();
        reduceValveDTO.setComponentName(reduceValvePO.getReduceValveName());
        reduceValveDTO.setReduceC(String.valueOf(reduceValvePO.getReduceC()));
        reduceValveDTO.setReduceK(String.valueOf(reduceValvePO.getReduceK()));
        reduceValveDTO.setReduceF(String.valueOf(reduceValvePO.getReduceF()));
        reduceValveDTO.setReduceM(String.valueOf(reduceValvePO.getReduceM()));
        reduceValveDTO.setReduceAmb(String.valueOf(reduceValvePO.getReduceAmb()));
        reduceValveDTO.setReduceAvc(String.valueOf(reduceValvePO.getReduceAvc()));
        reduceValveDTO.setReduceV1(String.valueOf(reduceValvePO.getReduceV1()));
        reduceValveDTO.setReduceV2(String.valueOf(reduceValvePO.getReduceV2()));
        reduceValveDTO.setReduceXstop(String.valueOf(reduceValvePO.getReduceXstop()));
        return reduceValveDTO;
    }

    @Override
    public List<ReduceValveDTO> findAllReduceValve() {
        List<ReduceValvePO> reduceValvePOList = reduceValveRepository.findAll();
        List<ReduceValveDTO> reduceValveDTOList = new ArrayList<>();
        for (ReduceValvePO reduceValvePO : reduceValvePOList) {
            reduceValveDTOList.add(transformPOtoDTO(reduceValvePO));
        }
        return reduceValveDTOList;
    }

    private ReduceValvePO transformDTOtoPO(ReduceValveDTO reduceValveDTO){
        ReduceValvePO reduceValvePO = new ReduceValvePO();
        reduceValvePO.setReduceValveName(reduceValveDTO.getComponentName());
        reduceValvePO.setReduceC(Double.parseDouble(reduceValveDTO.getReduceC()));
        reduceValvePO.setReduceK(Double.parseDouble(reduceValveDTO.getReduceK()));
        reduceValvePO.setReduceF(Double.parseDouble(reduceValveDTO.getReduceF()));
        reduceValvePO.setReduceM(Double.parseDouble(reduceValveDTO.getReduceM()));
        reduceValvePO.setReduceAmb(Double.parseDouble(reduceValveDTO.getReduceAmb()));
        reduceValvePO.setReduceAvc(Double.parseDouble(reduceValveDTO.getReduceAvc()));
        reduceValvePO.setReduceV1(Double.parseDouble(reduceValveDTO.getReduceV1()));
        reduceValvePO.setReduceV2(Double.parseDouble(reduceValveDTO.getReduceV2()));
        reduceValvePO.setReduceXstop(Double.parseDouble(reduceValveDTO.getReduceXstop()));
        return reduceValvePO;
    }
    private ReducingValveDO transformDTOtoDO(ReduceValveDTO reduceValveDTO){
        ReducingValveDO reducingValveDO = new ReducingValveDO(MediumFactory.getGasData(reduceValveDTO.getBottleGas()));
        reducingValveDO.setC(Double.parseDouble(reduceValveDTO.getReduceC()));
        reducingValveDO.setStiffness(Double.parseDouble(reduceValveDTO.getReduceK()));
        reducingValveDO.setF(Double.parseDouble(reduceValveDTO.getReduceF()));
        reducingValveDO.setM(Double.parseDouble(reduceValveDTO.getReduceM()));
        reducingValveDO.setAmb(Double.parseDouble(reduceValveDTO.getReduceAmb()));
        reducingValveDO.setAvc(Double.parseDouble(reduceValveDTO.getReduceAvc()));
        reducingValveDO.setV1(Double.parseDouble(reduceValveDTO.getReduceV1()));
        reducingValveDO.setV2(Double.parseDouble(reduceValveDTO.getReduceV2()));
        reducingValveDO.setXstop(Double.parseDouble(reduceValveDTO.getReduceXstop()));
        return reducingValveDO;
    }
}
