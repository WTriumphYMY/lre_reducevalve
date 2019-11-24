package cn.edu.nwpu.lre_reducevalve.controller;

import cn.edu.nwpu.lre_reducevalve.domain.dto.ReduceValveDTO;
import cn.edu.nwpu.lre_reducevalve.service.ReduceValveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ReduceValveController
 * @Author: wkx
 * @Date: 2019/10/24 18:52
 * @Version: v1.0
 * @Description:
 */
@RestController
public class ReduceValveController {

    @Autowired
    private ReduceValveService reduceValveService;

    @PostMapping("reducevalveSim")
    public Map<String, List<Double>> reduceValveSim(ReduceValveDTO reduceValveDTO){
        return null;
    }

    @PostMapping("saveReduceValve")
    public void saveReduceValve(@RequestBody ReduceValveDTO reduceValveDTO){
        reduceValveService.saveReduceValve(reduceValveDTO);
    }

    @PostMapping("/findReduceValveByName")
    public ReduceValveDTO getReduceValve(@RequestBody String reduceName){
        return reduceValveService.getReduceValve(reduceName);
    }

    @PostMapping("/findAllReduceValve")
    public List<ReduceValveDTO> findAllReduceValve(){
        return reduceValveService.findAllReduceValve();
    }
}
