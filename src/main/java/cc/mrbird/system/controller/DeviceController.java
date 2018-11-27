package cc.mrbird.system.controller;

import cc.mrbird.system.domain.Dept;
import cc.mrbird.system.domain.Device;
import cc.mrbird.system.service.DeviceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeviceController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DeviceService deviceService;

    @RequestMapping("device/list")
//    @RequiresPermissions("device:list1")
    @ResponseBody
    public List<Device> deviceList(Device device) {
        try {
            log.info("aaa111111111221111ssssssss113");
            List<Device> list=new ArrayList<Device>();
            Device d=new Device();
            d.setName("aaa");
            list.add(d);

            return list;
        } catch (Exception e) {
            log.error("获取设备列表失败", e);
            return new ArrayList<>();
        }
    }
}
