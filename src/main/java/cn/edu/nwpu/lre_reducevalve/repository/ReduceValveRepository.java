package cn.edu.nwpu.lre_reducevalve.repository;

import cn.edu.nwpu.lre_reducevalve.domain.dto.ReduceValveDTO;
import cn.edu.nwpu.lre_reducevalve.domain.po.ReduceValvePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName ReduceValveRepository
 * @Author: wkx
 * @Date: 2019/10/24 19:02
 * @Version: v1.0
 * @Description:
 */
@Repository
public interface ReduceValveRepository extends JpaRepository<ReduceValvePO,Integer> {
    ReduceValvePO findByReduceValveName(String reduceValveName);

    List<ReduceValvePO> findAll();
}
