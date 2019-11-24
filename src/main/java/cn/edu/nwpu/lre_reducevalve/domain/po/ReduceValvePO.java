package cn.edu.nwpu.lre_reducevalve.domain.po;

import javax.persistence.*;

/**
 * @ClassName ReduceValvePO
 * @Author: wkx
 * @Date: 2019/10/24 18:56
 * @Version: v1.0
 * @Description:
 */
@Entity
@Table(name = "tb_reducevalve")
public class ReduceValvePO {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer pkId;
    @Column(name = "reduce_name")
    private String reduceValveName;
    @Column(name = "reduce_c")
    private Double reduceC;
    @Column(name = "reduce_k")
    private Double reduceK;
    @Column(name = "reduce_f")
    private Double reduceF;
    @Column(name = "reduce_m")
    private Double reduceM;
    @Column(name = "reduce_amb")
    private Double reduceAmb;
    @Column(name = "reduce_avc")
    private Double reduceAvc;
    @Column(name = "reduce_v1")
    private Double reduceV1;
    @Column(name = "reduce_v2")
    private Double reduceV2;
    @Column(name = "reduce_xstop")
    private Double reduceXstop;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getReduceValveName() {
        return reduceValveName;
    }

    public void setReduceValveName(String reduceValveName) {
        this.reduceValveName = reduceValveName;
    }

    public Double getReduceC() {
        return reduceC;
    }

    public void setReduceC(Double reduceC) {
        this.reduceC = reduceC;
    }

    public Double getReduceK() {
        return reduceK;
    }

    public void setReduceK(Double reduceK) {
        this.reduceK = reduceK;
    }

    public Double getReduceF() {
        return reduceF;
    }

    public void setReduceF(Double reduceF) {
        this.reduceF = reduceF;
    }

    public Double getReduceM() {
        return reduceM;
    }

    public void setReduceM(Double reduceM) {
        this.reduceM = reduceM;
    }

    public Double getReduceAmb() {
        return reduceAmb;
    }

    public void setReduceAmb(Double reduceAmb) {
        this.reduceAmb = reduceAmb;
    }

    public Double getReduceAvc() {
        return reduceAvc;
    }

    public void setReduceAvc(Double reduceAvc) {
        this.reduceAvc = reduceAvc;
    }

    public Double getReduceV1() {
        return reduceV1;
    }

    public void setReduceV1(Double reduceV1) {
        this.reduceV1 = reduceV1;
    }

    public Double getReduceV2() {
        return reduceV2;
    }

    public void setReduceV2(Double reduceV2) {
        this.reduceV2 = reduceV2;
    }

    public Double getReduceXstop() {
        return reduceXstop;
    }

    public void setReduceXstop(Double reduceXstop) {
        this.reduceXstop = reduceXstop;
    }
}
