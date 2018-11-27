package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_device")
public class Device {
    /**
     * 设备ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取设备ID
     *
     * @return ID - 设备ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置设备ID
     *
     * @param id 设备ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取设备名称
     *
     * @return NAME - 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称
     *
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}